/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.gui;


import com.mycompany.utills.XImage;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.Timer;

/**
 *
 * @author LUU THE TRUNG
 */
public class ManhinhAdJFrame extends javax.swing.JFrame {

    static int c;
    public ManhinhAdJFrame() {
        initComponents();
        init();
        c = DNJFrame.t;
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

        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        GiojLabel = new javax.swing.JLabel();
        TrangChujTabbedPane = new javax.swing.JTabbedPane();
        jLabel3 = new javax.swing.JLabel();
        jMenuBar3 = new javax.swing.JMenuBar();
        jMenu4 = new javax.swing.JMenu();
        DoimkjMenuItem = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        DangXuatjMenuItem = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        ThoatjMenuItem = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        QLKjMenuItem = new javax.swing.JMenuItem();
        jSeparator7 = new javax.swing.JPopupMenu.Separator();
        QLLjMenuItem = new javax.swing.JMenuItem();
        jMenu8 = new javax.swing.JMenu();
        QLGVjMenuItem = new javax.swing.JMenuItem();
        jSeparator6 = new javax.swing.JPopupMenu.Separator();
        QLSVjMenuItem = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        QLADjMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 989, Short.MAX_VALUE)
                .addComponent(GiojLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(GiojLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        TrangChujTabbedPane.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/icon/cacban.jpg"))); // NOI18N
        TrangChujTabbedPane.addTab("TRANG CHỦ", jLabel3);

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/icon/taikhoan.png"))); // NOI18N
        jMenu4.setText("Tài khoản");
        jMenu4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        DoimkjMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        DoimkjMenuItem.setText("Đổi mật khẩu");
        DoimkjMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DoimkjMenuItemActionPerformed(evt);
            }
        });
        jMenu4.add(DoimkjMenuItem);
        jMenu4.add(jSeparator3);

        DangXuatjMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        DangXuatjMenuItem.setText("Đăng xuất");
        DangXuatjMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DangXuatjMenuItemActionPerformed(evt);
            }
        });
        jMenu4.add(DangXuatjMenuItem);
        jMenu4.add(jSeparator4);

        ThoatjMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        ThoatjMenuItem.setText("Thoát");
        ThoatjMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ThoatjMenuItemActionPerformed(evt);
            }
        });
        jMenu4.add(ThoatjMenuItem);

        jMenuBar3.add(jMenu4);

        jMenu7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/icon/quanlydaotao .png"))); // NOI18N
        jMenu7.setText("Quản lý đào tạo");
        jMenu7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        QLKjMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_K, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        QLKjMenuItem.setText("Quản lý khoa");
        QLKjMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QLKjMenuItemActionPerformed(evt);
            }
        });
        jMenu7.add(QLKjMenuItem);
        jMenu7.add(jSeparator7);

        QLLjMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        QLLjMenuItem.setText("Quản lý lớp");
        QLLjMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QLLjMenuItemActionPerformed(evt);
            }
        });
        jMenu7.add(QLLjMenuItem);

        jMenuBar3.add(jMenu7);

        jMenu8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/icon/quanlycoban.png"))); // NOI18N
        jMenu8.setText("Quản lý nhân sự");
        jMenu8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        QLGVjMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        QLGVjMenuItem.setText("Quản lý giáo viên");
        QLGVjMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QLGVjMenuItemActionPerformed(evt);
            }
        });
        jMenu8.add(QLGVjMenuItem);
        jMenu8.add(jSeparator6);

        QLSVjMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        QLSVjMenuItem.setText("Quản lý sinh viên");
        QLSVjMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QLSVjMenuItemActionPerformed(evt);
            }
        });
        jMenu8.add(QLSVjMenuItem);
        jMenu8.add(jSeparator2);

        QLADjMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        QLADjMenuItem.setText(" Quản lý admin");
        QLADjMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QLADjMenuItemActionPerformed(evt);
            }
        });
        jMenu8.add(QLADjMenuItem);

        jMenuBar3.add(jMenu8);

        setJMenuBar(jMenuBar3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(TrangChujTabbedPane, javax.swing.GroupLayout.DEFAULT_SIZE, 1291, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(TrangChujTabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 593, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DoimkjMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DoimkjMenuItemActionPerformed

        new DoiMKJFrame().setVisible(true);
    }//GEN-LAST:event_DoimkjMenuItemActionPerformed

    private void DangXuatjMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DangXuatjMenuItemActionPerformed
        this.dispose();
        new DNJFrame().setVisible(true);
    }//GEN-LAST:event_DangXuatjMenuItemActionPerformed

    private void ThoatjMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ThoatjMenuItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_ThoatjMenuItemActionPerformed
    QuanLyKhoaJPanel k;
    private void QLKjMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QLKjMenuItemActionPerformed
        TrangChujTabbedPane.removeAll();
        if(k == null) {
            k = new QuanLyKhoaJPanel();
        }
        TrangChujTabbedPane.addTab("QLK", k);
        TrangChujTabbedPane.setSelectedComponent(k);
    }//GEN-LAST:event_QLKjMenuItemActionPerformed
    QuanLyLopJPanel l;
    private void QLLjMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QLLjMenuItemActionPerformed
        TrangChujTabbedPane.removeAll();
        if(l == null) {
            l = new QuanLyLopJPanel();
        }
        TrangChujTabbedPane.addTab("QLL", l);
        TrangChujTabbedPane.setSelectedComponent(l);
    }//GEN-LAST:event_QLLjMenuItemActionPerformed
    QuanLyGVJPanel gv;
    private void QLGVjMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QLGVjMenuItemActionPerformed
        TrangChujTabbedPane.removeAll();
        if(gv == null) {
            gv = new QuanLyGVJPanel();
        }
        TrangChujTabbedPane.addTab("QLGV", gv);
        TrangChujTabbedPane.setSelectedComponent(gv);
    }//GEN-LAST:event_QLGVjMenuItemActionPerformed
    QuanLySVJPanel sv;
    private void QLSVjMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QLSVjMenuItemActionPerformed
        TrangChujTabbedPane.removeAll();
        
        if(sv == null) {
            sv = new QuanLySVJPanel();
        }
        TrangChujTabbedPane.addTab("QLSV", sv);
        TrangChujTabbedPane.setSelectedComponent(sv);
    }//GEN-LAST:event_QLSVjMenuItemActionPerformed
    QuanLyAdJPanel ad;
    private void QLADjMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QLADjMenuItemActionPerformed
        TrangChujTabbedPane.removeAll();
        
        if(ad == null) {
            ad = new QuanLyAdJPanel();
        }
        TrangChujTabbedPane.addTab("QLAD", ad);
        TrangChujTabbedPane.setSelectedComponent(ad);
    }//GEN-LAST:event_QLADjMenuItemActionPerformed

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
            java.util.logging.Logger.getLogger(ManhinhAdJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManhinhAdJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManhinhAdJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManhinhAdJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManhinhAdJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem DangXuatjMenuItem;
    private javax.swing.JMenuItem DoimkjMenuItem;
    private javax.swing.JLabel GiojLabel;
    private javax.swing.JMenuItem QLADjMenuItem;
    private javax.swing.JMenuItem QLGVjMenuItem;
    private javax.swing.JMenuItem QLKjMenuItem;
    private javax.swing.JMenuItem QLLjMenuItem;
    private javax.swing.JMenuItem QLSVjMenuItem;
    private javax.swing.JMenuItem ThoatjMenuItem;
    private javax.swing.JTabbedPane TrangChujTabbedPane;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator6;
    private javax.swing.JPopupMenu.Separator jSeparator7;
    // End of variables declaration//GEN-END:variables
}
