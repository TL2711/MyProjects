/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.gui;

import com.mycompany.entyti.GiaoVien;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author LUU THE TRUNG
 */
public class QuanLyGVJPanel extends javax.swing.JPanel {

    ArrayList<GiaoVien> listGV = new ArrayList<>();
    
    public QuanLyGVJPanel() {
        initComponents();
        try {
            File file = new File("Danhsachgv.csv");
            Scanner reader = new Scanner(file);
            while(reader.hasNext()){
                String line = reader.nextLine();
                String[] lineSplit = line.split(";");
                String ms = lineSplit[0].trim();
                String ten = lineSplit[1].trim();
                String gt = lineSplit[2].trim();
                String k = lineSplit[3].trim();
                String dc = lineSplit[4].trim();
                String sdt = lineSplit[5].trim();
                String mk = lineSplit[6].trim();
                g = new GiaoVien(ms, ten,  gt,  k,  dc,  sdt, mk);
                this.listGV.add(g);
            }
            reader.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
      /*  try {
            listGV=new fileGV().docGV();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(QuanLySVJPanel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(QuanLySVJPanel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(QuanLySVJPanel.class.getName()).log(Level.SEVERE, null, ex);
        }*/
        taoBangGV();
    }

    public void taoBangGV()
    {
        DefaultTableModel m = (DefaultTableModel)QLGVjTable.getModel();
        m.getDataVector().removeAllElements();
        m.fireTableDataChanged();
        TableRowSorter sorter = new TableRowSorter(m); 
        QLGVjTable.setRowSorter(sorter);  
        for(GiaoVien i:listGV)
        {
            m.addRow(i.toArray());
        }
    }
    
    boolean ktraTrungMaGv(String a)
    {
        boolean ok = true;
        for(GiaoVien i:listGV)
        {
            if(i.getMaGV().equalsIgnoreCase(a))
                ok = false;
        }
        return ok;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        QLGVjTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        MGVjTextField = new javax.swing.JTextField();
        XoaGVjButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        TenGVjTextField = new javax.swing.JTextField();
        GTGVjComboBox = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        KhoaGVjTextField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        DCGVjTextField = new javax.swing.JTextField();
        SDTGVjTextField = new javax.swing.JTextField();
        LuuGVjButton = new javax.swing.JButton();
        ThemGVjButton = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        MKjTextField = new javax.swing.JTextField();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("QUẢN LÝ GIÁO VIÊN");

        QLGVjTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "MSGV", "Họ và tên", "Giới tính", "Khoa", "Địa chỉ", "SDT", "Mật khẩu"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        QLGVjTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                QLGVjTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(QLGVjTable);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("THÊM GIÁO VIÊN");

        jLabel3.setText("MSGV");

        MGVjTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MGVjTextFieldMouseClicked(evt);
            }
        });

        XoaGVjButton.setBackground(new java.awt.Color(255, 51, 51));
        XoaGVjButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        XoaGVjButton.setText("XÓA");
        XoaGVjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                XoaGVjButtonActionPerformed(evt);
            }
        });

        jLabel4.setText("HỌ VÀ TÊN");

        jLabel5.setText(" ");

        TenGVjTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TenGVjTextFieldMouseClicked(evt);
            }
        });

        GTGVjComboBox.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        GTGVjComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nam", "Nu" }));

        jLabel6.setText("KHOA");

        KhoaGVjTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                KhoaGVjTextFieldMouseClicked(evt);
            }
        });

        jLabel7.setText("GIỚI TÍNH");

        jLabel8.setText("SDT ");

        jLabel9.setText("ĐỊA CHỈ");

        DCGVjTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DCGVjTextFieldMouseClicked(evt);
            }
        });

        SDTGVjTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SDTGVjTextFieldMouseClicked(evt);
            }
        });
        SDTGVjTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SDTGVjTextFieldActionPerformed(evt);
            }
        });

        LuuGVjButton.setBackground(new java.awt.Color(255, 51, 51));
        LuuGVjButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        LuuGVjButton.setText("LƯU");
        LuuGVjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LuuGVjButtonActionPerformed(evt);
            }
        });

        ThemGVjButton.setBackground(new java.awt.Color(255, 51, 51));
        ThemGVjButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ThemGVjButton.setText("OK");
        ThemGVjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ThemGVjButtonActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setText("Mật khẩu");

        MKjTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MKjTextFieldMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(555, 1234, Short.MAX_VALUE)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(422, 422, 422)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel9)
                            .addComponent(jLabel8)
                            .addComponent(jLabel6)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(SDTGVjTextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                            .addComponent(DCGVjTextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                            .addComponent(KhoaGVjTextField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(MKjTextField, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(331, 626, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(85, 85, 85)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1066, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(470, 470, 470)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(261, 261, 261)
                                        .addComponent(jLabel2)
                                        .addGap(95, 95, 95)
                                        .addComponent(MGVjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(36, 36, 36)
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(ThemGVjButton)
                                        .addGap(111, 111, 111)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(LuuGVjButton)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(XoaGVjButton))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(TenGVjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(31, 31, 31)
                                        .addComponent(jLabel7)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(GTGVjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MGVjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TenGVjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(GTGVjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(KhoaGVjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DCGVjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SDTGVjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(MKjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(XoaGVjButton)
                    .addComponent(LuuGVjButton)
                    .addComponent(ThemGVjButton))
                .addContainerGap(145, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    
    private void XoaGVjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_XoaGVjButtonActionPerformed
        this.listGV.remove(QLGVjTable.getSelectedRow());
        taoBangGV();
    }//GEN-LAST:event_XoaGVjButtonActionPerformed

    private void LuuGVjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LuuGVjButtonActionPerformed
        try{           
            File file =new File("Danhsachgv.csv");
           if(!file.exists()){
            file.createNewFile();
            }

            FileWriter fw = new FileWriter("Danhsachgv.csv");
            
            for(GiaoVien  WList : listGV){
                fw.write(WList.toString()+"\n");            }

            fw.close();

        }
        catch(IOException ioe){
            System.out.println("Exception occurred:");
            
        }
        try {
            File file = new File("Danhsachgv.csv");
            Scanner reader = new Scanner(file);
            while(reader.hasNext()){
                String line = reader.nextLine();
                String[] lineSplit = line.split(";");
                String ms = lineSplit[0].trim();
                String ten = lineSplit[1].trim();
                String gt = lineSplit[2].trim();
                String k = lineSplit[3].trim();
                String dc = lineSplit[4].trim();
                String sdt = lineSplit[5].trim();
                String mk = lineSplit[6].trim();

            }
            reader.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    /*    try{
            if(MGVjTextField.getText().equals("")|| TenGVjTextField.getText().equals("") || KhoaGVjTextField.getText().equals("") ||
                   DCGVjTextField.getText().equals("") || SDTGVjTextField.getText().equals("") )
            {
                JButton a = new JButton();
                JOptionPane.showMessageDialog(a, "Cần nhập đủ thông tin");
            }
            else{
                if(ktraTrungMaGv(MGVjTextField.getText()))
                {
                   GiaoVien a = new GiaoVien(MGVjTextField.getText(), TenGVjTextField.getText(),GTGVjComboBox.getSelectedItem().toString(),KhoaGVjTextField.getText(),DCGVjTextField.getText()
                        ,SDTGVjTextField.getText() );
                   listGV.add(a);
                   new fileGV().ghiGV(listGV);
                   taoBangGV(); 
                }
                else{
                    JButton a = new JButton();
                    JOptionPane.showMessageDialog(a, "Mã giáo viên này đã tồn tại");
                }
            }
        }
        catch(Exception e){
            JButton a = new JButton();
            JOptionPane.showMessageDialog(a, e.getMessage());
        }*/
    }//GEN-LAST:event_LuuGVjButtonActionPerformed

    private void SDTGVjTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SDTGVjTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SDTGVjTextFieldActionPerformed

    private void QLGVjTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_QLGVjTableMouseClicked
//        DefaultTableModel model = (DefaultTableModel) QLGVjTable.getModel();
//        MGVjTextField.setText(model.getValueAt(QLGVjTable.getSelectedRow(), 0).toString());
//        TenGVjTextField.setText(model.getValueAt(QLGVjTable.getSelectedRow(), 1).toString());
//        GTGVjComboBox.setSelectedItem(model.getValueAt(QLGVjTable.getSelectedRow(), 2).toString());
//        KhoaGVjTextField.setText(model.getValueAt(QLGVjTable.getSelectedRow(), 3).toString());
//        DCGVjTextField.setText(model.getValueAt(QLGVjTable.getSelectedRow(), 4).toString());
//        SDTGVjTextField.setText(model.getValueAt(QLGVjTable.getSelectedRow(), 5).toString());
    }//GEN-LAST:event_QLGVjTableMouseClicked
    GiaoVien g;
    private void ThemGVjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ThemGVjButtonActionPerformed
        String mgv = this.MGVjTextField.getText();
        String ten = this.TenGVjTextField.getText();
        String gt = this.GTGVjComboBox.getSelectedItem().toString();
        String k = this.KhoaGVjTextField.getText();
        String dc = this.DCGVjTextField.getText();
        String sdt = this.SDTGVjTextField.getText();
        String mk = this.MKjTextField.getText();
        if(mgv.equals("")|| ten.equals("") || k.equals("") || dc.equals("") || sdt.equals("") || mk.equals("") )
            {
                JButton a = new JButton();
                JOptionPane.showMessageDialog(a, "Cần nhập đủ thông tin");
            }
        else{
            if(ktraTrungMaGv(mgv)) {
                g = new GiaoVien(mgv, ten,  gt,  k,  dc,  sdt, mk);
                this.listGV.add(g);
                DefaultTableModel model =  (DefaultTableModel) QLGVjTable.getModel();
                String noi = mgv +";" + ten +";"+ gt +";" + k +";" + dc +";" + sdt +";" + mk;
                model.addRow(noi.split(";"));
            }
            else{
                JButton a = new JButton();
                JOptionPane.showMessageDialog(a, "Mã giáo viên này đã tồn tại");
            }
        }
    }//GEN-LAST:event_ThemGVjButtonActionPerformed

    private void MGVjTextFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MGVjTextFieldMouseClicked
        MGVjTextField.setText("");
    }//GEN-LAST:event_MGVjTextFieldMouseClicked

    private void TenGVjTextFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TenGVjTextFieldMouseClicked
        TenGVjTextField.setText("");
    }//GEN-LAST:event_TenGVjTextFieldMouseClicked

    private void KhoaGVjTextFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_KhoaGVjTextFieldMouseClicked
        KhoaGVjTextField.setText("");
    }//GEN-LAST:event_KhoaGVjTextFieldMouseClicked

    private void DCGVjTextFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DCGVjTextFieldMouseClicked
        DCGVjTextField.setText("");
    }//GEN-LAST:event_DCGVjTextFieldMouseClicked

    private void SDTGVjTextFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SDTGVjTextFieldMouseClicked
        SDTGVjTextField.setText("");
    }//GEN-LAST:event_SDTGVjTextFieldMouseClicked

    private void MKjTextFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MKjTextFieldMouseClicked
        MKjTextField.setText("");
    }//GEN-LAST:event_MKjTextFieldMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField DCGVjTextField;
    private javax.swing.JComboBox<String> GTGVjComboBox;
    private javax.swing.JTextField KhoaGVjTextField;
    private javax.swing.JButton LuuGVjButton;
    private javax.swing.JTextField MGVjTextField;
    private javax.swing.JTextField MKjTextField;
    private javax.swing.JTable QLGVjTable;
    private javax.swing.JTextField SDTGVjTextField;
    private javax.swing.JTextField TenGVjTextField;
    private javax.swing.JButton ThemGVjButton;
    private javax.swing.JButton XoaGVjButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
