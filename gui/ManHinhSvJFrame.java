
package com.mycompany.gui;

import com.mycompany.utills.XImage;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.Timer;



public class ManHinhSvJFrame extends javax.swing.JFrame {

    static int a;
    public ManHinhSvJFrame() {
        initComponents();
        init();
        a = DNJFrame.t;
    }

    void init() {
        
        setIconImage(XImage.getAppIcon());
        setLocationRelativeTo(null);
        setTitle("HỆ THỐNG QUẢN LÝ ĐÀO TẠO");
        new Timer(1000, new ActionListener() {
            SimpleDateFormat format = new SimpleDateFormat("hh:mm:ss a");      
            @Override
            public void actionPerformed(ActionEvent e) {
                GiojLabel.setText(format.format(new Date()));
            }
        }).start();
        
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        GiojLabel = new javax.swing.JLabel();
        TrangChujTabbedPane = new javax.swing.JTabbedPane();
        jLabel3 = new javax.swing.JLabel();
        jToolBar1 = new javax.swing.JToolBar();
        DoimkjButton = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        DangXuatjButton = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        ThoatjButton = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JToolBar.Separator();
        ThongTinjButton = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JToolBar.Separator();
        DKHocjButton = new javax.swing.JButton();
        jSeparator5 = new javax.swing.JToolBar.Separator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/icon/Accept.png"))); // NOI18N
        jLabel2.setText("HỆ QUẢN LÝ DÀO TẠO");

        GiojLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        GiojLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/icon/donghone.png"))); // NOI18N
        GiojLabel.setText("12:12:12 AM");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(GiojLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(GiojLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        TrangChujTabbedPane.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/icon/cacban.jpg"))); // NOI18N
        TrangChujTabbedPane.addTab("TRANG CHỦ", jLabel3);

        jToolBar1.setRollover(true);

        DoimkjButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        DoimkjButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/icon/Lock.png"))); // NOI18N
        DoimkjButton.setText("Đổi mật khẩu");
        DoimkjButton.setFocusable(false);
        DoimkjButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        DoimkjButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        DoimkjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DoimkjButtonActionPerformed(evt);
            }
        });
        jToolBar1.add(DoimkjButton);
        jToolBar1.add(jSeparator1);

        DangXuatjButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        DangXuatjButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/icon/Refresh.png"))); // NOI18N
        DangXuatjButton.setText("Đăng xuất");
        DangXuatjButton.setFocusable(false);
        DangXuatjButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        DangXuatjButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        DangXuatjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DangXuatjButtonActionPerformed(evt);
            }
        });
        jToolBar1.add(DangXuatjButton);
        jToolBar1.add(jSeparator2);

        ThoatjButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ThoatjButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/icon/Stop.png"))); // NOI18N
        ThoatjButton.setText("Thoát");
        ThoatjButton.setFocusable(false);
        ThoatjButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ThoatjButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        ThoatjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ThoatjButtonActionPerformed(evt);
            }
        });
        jToolBar1.add(ThoatjButton);
        jToolBar1.add(jSeparator4);

        ThongTinjButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ThongTinjButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/icon/Users.png"))); // NOI18N
        ThongTinjButton.setText("Thông tin");
        ThongTinjButton.setFocusable(false);
        ThongTinjButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ThongTinjButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        ThongTinjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ThongTinjButtonActionPerformed(evt);
            }
        });
        jToolBar1.add(ThongTinjButton);
        jToolBar1.add(jSeparator3);

        DKHocjButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        DKHocjButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/icon/Notes.png"))); // NOI18N
        DKHocjButton.setText("Đăng ký học");
        DKHocjButton.setFocusable(false);
        DKHocjButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        DKHocjButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        DKHocjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DKHocjButtonActionPerformed(evt);
            }
        });
        jToolBar1.add(DKHocjButton);
        jToolBar1.add(jSeparator5);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TrangChujTabbedPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1274, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 11, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TrangChujTabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 568, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    ThongTinSVJPanel sv;
    private void ThongTinjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ThongTinjButtonActionPerformed
        TrangChujTabbedPane.removeAll();
        if(sv == null) {
            sv = new ThongTinSVJPanel();
        }
        TrangChujTabbedPane.addTab("TTSV", sv);
        TrangChujTabbedPane.setSelectedComponent(sv);
    }//GEN-LAST:event_ThongTinjButtonActionPerformed

    private void DKHocjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DKHocjButtonActionPerformed
        TrangChujTabbedPane.removeAll();
        if(dk == null) {
            dk = new DKHJPanel();
        }
        TrangChujTabbedPane.addTab("DKH", dk);
        TrangChujTabbedPane.setSelectedComponent(dk);
    }//GEN-LAST:event_DKHocjButtonActionPerformed

    private void ThoatjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ThoatjButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_ThoatjButtonActionPerformed

    private void DangXuatjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DangXuatjButtonActionPerformed

        this.dispose();
        new DNJFrame().setVisible(true);
    }//GEN-LAST:event_DangXuatjButtonActionPerformed

    private void DoimkjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DoimkjButtonActionPerformed
        new DoiMKJFrame().setVisible(true);
    }//GEN-LAST:event_DoimkjButtonActionPerformed
    DKHJPanel dk;    ThongTinSVJPanel xd;        
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
            java.util.logging.Logger.getLogger(ManHinhSvJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManHinhSvJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManHinhSvJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManHinhSvJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManHinhSvJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DKHocjButton;
    private javax.swing.JButton DangXuatjButton;
    private javax.swing.JButton DoimkjButton;
    private javax.swing.JLabel GiojLabel;
    private javax.swing.JButton ThoatjButton;
    private javax.swing.JButton ThongTinjButton;
    private javax.swing.JTabbedPane TrangChujTabbedPane;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JToolBar.Separator jSeparator3;
    private javax.swing.JToolBar.Separator jSeparator4;
    private javax.swing.JToolBar.Separator jSeparator5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JToolBar jToolBar1;
    // End of variables declaration//GEN-END:variables
}
