
package com.mycompany.gui;

import com.mycompany.utills.XImage;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class DNJFrame extends javax.swing.JFrame {

    /**
     * Creates new form DNJFrame
     */
    public DNJFrame() {
        initComponents();
        init();
    }

    void init() {
        setIconImage(XImage.getAppIcon());
        setLocationRelativeTo(null);
        setTitle("ĐĂNG NHẬP HỆ THỐNG");
        new ChaoJDialog(this, true).setVisible(true);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        DangnhapjButton = new javax.swing.JButton();
        ThoatjButton = new javax.swing.JButton();
        AccjTextField = new javax.swing.JTextField();
        PassjPasswordField = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(0, 51, 153));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Tên đăng nhập:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Mật khẩu:");

        DangnhapjButton.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        DangnhapjButton.setForeground(new java.awt.Color(0, 51, 153));
        DangnhapjButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/icon/Open door.png"))); // NOI18N
        DangnhapjButton.setText("Đăng nhập");
        DangnhapjButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        DangnhapjButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        DangnhapjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DangnhapjButtonActionPerformed(evt);
            }
        });

        ThoatjButton.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        ThoatjButton.setForeground(new java.awt.Color(0, 51, 153));
        ThoatjButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/icon/Exit.png"))); // NOI18N
        ThoatjButton.setText("Thoát");
        ThoatjButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ThoatjButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        ThoatjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ThoatjButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(DangnhapjButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 115, Short.MAX_VALUE)
                .addComponent(ThoatjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(AccjTextField)
                    .addComponent(PassjPasswordField, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE))
                .addGap(75, 75, 75))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AccjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PassjPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ThoatjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DangnhapjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    static int t;
    private void DangnhapjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DangnhapjButtonActionPerformed
        String check = this.AccjTextField.getText() + ";" + this.PassjPasswordField.getText();
        try{
            File giaoVien =new File("Danhsachgv.csv");
            File sinhVien = new File("Danhsachsv.csv");
            File Admin = new File("DanhsachAd.csv");
            Scanner myReader1 = new Scanner(giaoVien);
            Scanner myReader = new Scanner(sinhVien);
            Scanner myReader2 = new Scanner(Admin);
            t = -1;
            while(myReader.hasNext()){
                t = t+1;
                String data = myReader.nextLine();
                String[] lineSplit = data.split(";");
                String ms = lineSplit[0].trim();
                String mk = lineSplit[7].trim();
                if(check.equals(ms+ ";" +mk)){
                    this.dispose();
                    ManHinhSvJFrame sv = new ManHinhSvJFrame();
                    sv.setTitle("SINH VIÊN");
                    sv.setVisible(true);

                }

            }
            myReader.close();
            t = -1;
            while (myReader1.hasNextLine()){
                t = t+1;
                String data = myReader1.nextLine();
                String[] lineSplit = data.split(";");
                String ms = lineSplit[0].trim();
                String mk = lineSplit[6].trim();
                if(check.equals(ms+ ";" +mk)){
                    this.dispose();
                    ManHinhGvJFrame gv = new ManHinhGvJFrame();
                    gv.setTitle("GIÁO VIÊN");
                    gv.setVisible(true);
                }

            }
            myReader1.close();
            t = -1;
            while(myReader2.hasNextLine()) {
                t = t+1;
                String data = myReader2.nextLine();
                String[] lineSplit = data.split(";");
                String tk = lineSplit[0].trim();
                String mk = lineSplit[1].trim();
                if(check.equals(tk+";"+mk)) {
                    this.dispose();
                    ManhinhAdJFrame ad = new ManhinhAdJFrame();
                    ad.setTitle("ADMIN");
                    ad.setVisible(true);
                }
            }
        }

        catch (IOException e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_DangnhapjButtonActionPerformed

    private void ThoatjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ThoatjButtonActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_ThoatjButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DNJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DNJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DNJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DNJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DNJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AccjTextField;
    private javax.swing.JButton DangnhapjButton;
    private javax.swing.JPasswordField PassjPasswordField;
    private javax.swing.JButton ThoatjButton;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
