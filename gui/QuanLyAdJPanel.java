
package com.mycompany.gui;

import com.mycompany.entyti.Admin;
import com.mycompany.entyti.GiaoVien;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author LUU THE TRUNG
 */
public class QuanLyAdJPanel extends javax.swing.JPanel {

    Admin ad;
    ArrayList<Admin> ListAd = new ArrayList<>();
    
    public QuanLyAdJPanel() {
        initComponents();
        try {
            File file = new File("DanhsachAd.csv");
            Scanner reader = new Scanner(file);
            while(reader.hasNext()){
                String line = reader.nextLine();
                String[] lineSplit = line.split(";");
                String tk = lineSplit[0].trim();
                String mk = lineSplit[1].trim();
                ad = new Admin(tk,mk);
                this.ListAd.add(ad);

            }
            reader.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        taoBangAd();
    }

    public void taoBangAd()
    {
        DefaultTableModel m = (DefaultTableModel)ADjTable.getModel();
        m.getDataVector().removeAllElements();
        m.fireTableDataChanged();
        TableRowSorter sorter = new TableRowSorter(m); 
        ADjTable.setRowSorter(sorter);  
        for(Admin i:ListAd)
        {
            m.addRow(i.toArray());
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ADjTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        TkAdjTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        MkAdjTextField = new javax.swing.JTextField();
        ThemAdjButton = new javax.swing.JButton();
        LuuAdjButton = new javax.swing.JButton();
        XoaAdjButton = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("TÀI KHOẢN ADMIN");

        ADjTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tài khoản", "Mật khẩu"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        ADjTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ADjTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(ADjTable);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Tài khoản");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Mật khẩu");

        ThemAdjButton.setBackground(new java.awt.Color(255, 0, 51));
        ThemAdjButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ThemAdjButton.setText("Thêm");
        ThemAdjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ThemAdjButtonActionPerformed(evt);
            }
        });

        LuuAdjButton.setBackground(new java.awt.Color(255, 0, 51));
        LuuAdjButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        LuuAdjButton.setText("Lưu");
        LuuAdjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LuuAdjButtonActionPerformed(evt);
            }
        });

        XoaAdjButton.setBackground(new java.awt.Color(255, 0, 51));
        XoaAdjButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        XoaAdjButton.setText("Xóa");
        XoaAdjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                XoaAdjButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(494, 494, 494)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TkAdjTextField)
                            .addComponent(MkAdjTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(527, 527, 527)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(594, 594, 594)
                                .addComponent(LuuAdjButton))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(446, 446, 446)
                                .addComponent(ThemAdjButton)))
                        .addGap(89, 89, 89)
                        .addComponent(XoaAdjButton)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 321, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 616, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(310, 310, 310))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel1)
                .addGap(33, 33, 33)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TkAdjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MkAdjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ThemAdjButton)
                    .addComponent(LuuAdjButton)
                    .addComponent(XoaAdjButton))
                .addGap(56, 56, 56))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void ThemAdjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ThemAdjButtonActionPerformed
        String tk = this.TkAdjTextField.getText();
        String mk = this.MkAdjTextField.getText();
        ad = new Admin(tk, mk);
        this.ListAd.add(ad);
        DefaultTableModel model = (DefaultTableModel) ADjTable.getModel();
        String noi = tk + ";" + mk;
        model.addRow(noi.split(";"));
    }//GEN-LAST:event_ThemAdjButtonActionPerformed

    private void LuuAdjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LuuAdjButtonActionPerformed
        try{           
            File file =new File("DanhsachAd.csv");
           if(!file.exists()){
            file.createNewFile();
            }

            FileWriter fw = new FileWriter("DanhsachAd.csv");
            
            for(Admin  WList : ListAd){
                fw.write(WList.toString()+"\n");            }

            fw.close();

        }
        catch(IOException ioe){
            System.out.println("Exception occurred:");
            
        }
        try {
            File file = new File("DanhsachAd.csv");
            Scanner reader = new Scanner(file);
            while(reader.hasNext()){
                String line = reader.nextLine();
                String[] lineSplit = line.split(";");
                String tk = lineSplit[0].trim();
                String mk = lineSplit[1].trim();
                

            }
            reader.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_LuuAdjButtonActionPerformed

    private void ADjTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ADjTableMouseClicked
//        DefaultTableModel model = (DefaultTableModel) ADjTable.getModel();
//        TkAdjTextField.setText(model.getValueAt(ADjTable.getSelectedRow(), 0).toString());
//        MkAdjTextField.setText(model.getValueAt(ADjTable.getSelectedRow(), 1).toString());
    }//GEN-LAST:event_ADjTableMouseClicked

    private void XoaAdjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_XoaAdjButtonActionPerformed
        this.ListAd.remove(ADjTable.getSelectedRow());
        taoBangAd();
    }//GEN-LAST:event_XoaAdjButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable ADjTable;
    private javax.swing.JButton LuuAdjButton;
    private javax.swing.JTextField MkAdjTextField;
    private javax.swing.JButton ThemAdjButton;
    private javax.swing.JTextField TkAdjTextField;
    private javax.swing.JButton XoaAdjButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
