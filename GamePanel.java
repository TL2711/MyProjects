
package snake;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.util.Random;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JButton;
import javax.swing.Timer;

public class GamePanel extends JPanel implements ActionListener  {
    static final int SCREEN_WIDTH = 600;
    static final int SCREEN_HEIGHT = 600;
    static final int UNIT_SIZE = 25;
    static final int GAME_UNITS = (SCREEN_WIDTH * SCREEN_HEIGHT) / (UNIT_SIZE * UNIT_SIZE);
    static final int DELAY = 150;
    final int x[] = new int[GAME_UNITS];
    final int y[] = new int[GAME_UNITS];
    int bodyParts = 5;
    int appleEaten;
    int appleX;
    int appleY;
    char direction = 'R';
    boolean running = false;
    Timer timer;
    Random random;
    
    public GamePanel() {
        this.setPreferredSize(new Dimension(SCREEN_WIDTH, SCREEN_HEIGHT));
        this.setBackground(Color.black);
        this.setFocusable(true);
        this.addKeyListener(new MyKeyAdapter());
        random = new Random();
        
        startGame();
    }
    
    public void startGame() {
        createApple();
        bodyParts=5;
        appleEaten=0;
        running = true;
        direction = 'R';
        for (int i = 0;i <bodyParts; i++) {
            x[i] = 75 - i * 25;
            y[i] = 25;
        }       
        if (this.timer != null) {
            this.timer.removeActionListener(this);
        }
        timer = new Timer(DELAY, this);
        timer.start();
    }
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        draw(g);
    }
    
    private void draw(Graphics g) {
        if(running) {
            g.setColor(Color.gray);
            for(int i=0;i < SCREEN_HEIGHT/UNIT_SIZE;i++) {
                g.drawLine(i*UNIT_SIZE, 0, i*UNIT_SIZE, SCREEN_HEIGHT);
            }
            for(int i=0;i < SCREEN_WIDTH/UNIT_SIZE;i++) {
                g.drawLine(0, i*UNIT_SIZE, SCREEN_WIDTH, i*UNIT_SIZE);
            }
        
            //draw apple
            g.setColor(Color.red);
            g.fillOval(appleX, appleY, UNIT_SIZE, UNIT_SIZE);
        
            //draw snake
            for(int i=0;i<bodyParts;i++) {
                if(i==0) {
                    g.setColor(new Color(0,153,153));
                    g.fillRect(x[i], y[i], UNIT_SIZE, UNIT_SIZE);
                }
                else {
                    g.setColor(new Color(51,255,255));
                    g.fillRect(x[i], y[i], UNIT_SIZE - 1, UNIT_SIZE - 1);
                }
            }
        }
        else {
            gameOver(g);
            
        }
    }
    
    public void createApple() {
        
        appleX = random.nextInt((int) SCREEN_WIDTH/UNIT_SIZE)*UNIT_SIZE;
        appleY = random.nextInt((int) SCREEN_HEIGHT/UNIT_SIZE)*UNIT_SIZE;
        
    }
    
    public void move() {
        for(int i=bodyParts; i>0; i--) {
            x[i] = x[i-1];
            y[i] = y[i-1];
        }
        switch(direction) {
            case 'U':
                y[0] -= UNIT_SIZE;
                break;
            case 'D':
                y[0] += UNIT_SIZE;
                break;
            case 'L':
                x[0] -= UNIT_SIZE;
                break;
            case 'R':
                x[0] += UNIT_SIZE;
                break;
        }
    }
    
    public void checkApple() {
        if((x[0]==appleX)&&(y[0]==appleY)) {
            bodyParts++;
            appleEaten++;
            createApple();
        }
    }
    
    public void checkCollisions() {
        // check if head colides with the body
        for(int i = bodyParts; i > 0; i--){
            if((x[0] == x[i]) && (y[0] == y[i])){
                running = false;
                break;
            }
        }
        // check head touch boders
        if(x[0] < 0) running = false;
        if(x[0] > SCREEN_WIDTH) running = false;
        if(y[0] < 0) running = false;
        if(y[0] > SCREEN_HEIGHT) running = false; 
        
        if(!running) timer.stop();
    }
    
    JButton btnClear = new JButton("Chơi lại");

    public void gameOver(Graphics g) {
		
	g.setColor(Color.red);
	g.setFont( new Font("Ink Free",Font.BOLD, 40));
	FontMetrics metrics1 = getFontMetrics(g.getFont());
	g.drawString("Diem cua ban: "+appleEaten, (SCREEN_WIDTH - metrics1.stringWidth("Diem cua ban: "+appleEaten))/2, g.getFont().getSize());
		
	g.setColor(Color.red);
	g.setFont( new Font("Ink Free",Font.BOLD, 75));
        FontMetrics metrics2 = getFontMetrics(g.getFont());
	g.drawString("Ban da thua", (SCREEN_WIDTH - metrics2.stringWidth("Ban da thua"))/2, SCREEN_HEIGHT/2);
                  
        btnClear.setSize(100, 30);
        btnClear.setBackground(Color.black);
        btnClear.setForeground(Color.red);
        btnClear.setFocusable(false);
        btnClear.setLocation(250,400);
        btnClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnClearClick(e);
            }
            });
        add(btnClear);
        this.btnClear.setVisible(true);
         
    }
    private void btnClearClick(java.awt.event.ActionEvent a) {
        btnClear.setVisible(false);
        startGame();
        repaint();   
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(running){
            move();
            checkApple();
            checkCollisions();
        }
        repaint();

    }
    
    public class MyKeyAdapter extends KeyAdapter {

        @Override
        public void keyPressed(KeyEvent e) {
            switch(e.getKeyCode()){
                case KeyEvent.VK_LEFT:
                    if(direction != 'R') direction = 'L';
                    break;
                
                case KeyEvent.VK_RIGHT:
                    if(direction != 'L') direction = 'R';
                    break;
                    
                case KeyEvent.VK_UP:
                    if(direction != 'D') direction = 'U';
                    break;
                    
                case KeyEvent.VK_DOWN:
                    if(direction != 'U') direction = 'D';
                    break;    
            }
        }
        
    }
}
