/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.gui;

import com.mycompany.entyti.SinhVien;
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
public class QuanLySVJPanel extends javax.swing.JPanel {

    ArrayList<SinhVien> listSV = new ArrayList<>();
   

    
    
    public QuanLySVJPanel() {
        
        initComponents();
        try {
            File file = new File("Danhsachsv.csv");
            Scanner reader = new Scanner(file);
            while(reader.hasNext()){
                String line = reader.nextLine();
                String[] lineSplit = line.split(";");
                String ms = lineSplit[0].trim();
                String ten = lineSplit[1].trim();
                String gt = lineSplit[2].trim();
                String ns = lineSplit[3].trim();
                String k = lineSplit[4].trim();
                String dc = lineSplit[5].trim();
                String sdt = lineSplit[6].trim();
                String mk = lineSplit[7].trim();
                s = new SinhVien(ms, ten,  gt, ns, k,  dc,  sdt, mk);
                this.listSV.add(s);
            }
            reader.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        } 
        
/*        try {
            listSV=new fileSV().docSV();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(QuanLySVJPanel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(QuanLySVJPanel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(QuanLySVJPanel.class.getName()).log(Level.SEVERE, null, ex);
        }*/
        taoBangSV();
        
        
        
        
    }
    
    public void taoBangSV()
    {
        DefaultTableModel m = (DefaultTableModel)QLSVjTable.getModel();
        m.getDataVector().removeAllElements();
        m.fireTableDataChanged();
        TableRowSorter sorter = new TableRowSorter(m); 
        QLSVjTable.setRowSorter(sorter);  
        for(SinhVien i:listSV)
        {
            m.addRow(i.toArray());
        }
    }
    boolean ktraTrungMaSv(String a)
    {
        boolean ok = true;
        for(SinhVien i:listSV)
        {
            if(i.getMaSV().equalsIgnoreCase(a))
                ok = false;
        }
        return ok;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        MSVjTextField = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        TenSV = new javax.swing.JTextField();
        GTSV = new javax.swing.JLabel();
        GTSVjComboBox1 = new javax.swing.JComboBox<>();
        jLabel18 = new javax.swing.JLabel();
        NSjTextField = new javax.swing.JTextField();
        KhoaSVjTextField = new javax.swing.JTextField();
        DCSVjTextField = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        XoaSVjButton1 = new javax.swing.JButton();
        LuuSVjButton1 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        SDTSVjTextField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        QLSVjTable = new javax.swing.JTable();
        ThemSVjButton = new javax.swing.JButton();
        jLabel = new javax.swing.JLabel();
        MKjTextField = new javax.swing.JTextField();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("QUẢN LÝ SINH VIÊN");

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setText("THÊM SINH VIÊN");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel11.setText("MSSV");

        MSVjTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MSVjTextFieldMouseClicked(evt);
            }
        });
        MSVjTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MSVjTextFieldActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel12.setText("Họ và tên");

        TenSV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TenSVMouseClicked(evt);
            }
        });
        TenSV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TenSVActionPerformed(evt);
            }
        });

        GTSV.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        GTSV.setText("Giới tính");

        GTSVjComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nam", "Nu" }));

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel18.setText("Ngày sinh");

        NSjTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NSjTextFieldMouseClicked(evt);
            }
        });
        NSjTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NSjTextFieldActionPerformed(evt);
            }
        });

        KhoaSVjTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                KhoaSVjTextFieldMouseClicked(evt);
            }
        });
        KhoaSVjTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KhoaSVjTextFieldActionPerformed(evt);
            }
        });

        DCSVjTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DCSVjTextFieldMouseClicked(evt);
            }
        });
        DCSVjTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DCSVjTextFieldActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel16.setText("SDT");

        XoaSVjButton1.setBackground(new java.awt.Color(255, 51, 51));
        XoaSVjButton1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        XoaSVjButton1.setText("XÓA");
        XoaSVjButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                XoaSVjButton1ActionPerformed(evt);
            }
        });

        LuuSVjButton1.setBackground(new java.awt.Color(255, 51, 51));
        LuuSVjButton1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        LuuSVjButton1.setText("LƯU");
        LuuSVjButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LuuSVjButton1ActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel15.setText("Khoa");

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel19.setText("Địa chỉ");

        SDTSVjTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SDTSVjTextFieldMouseClicked(evt);
            }
        });
        SDTSVjTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SDTSVjTextFieldActionPerformed(evt);
            }
        });

        QLSVjTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "MSSV", "Họ và tên", "Giới Tính", "Ngày sinh", "Khoa", "Địa chỉ", "SDT", "Mật khẩu"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        QLSVjTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                QLSVjTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(QLSVjTable);

        ThemSVjButton.setBackground(new java.awt.Color(255, 51, 51));
        ThemSVjButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ThemSVjButton.setText("OK");
        ThemSVjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ThemSVjButtonActionPerformed(evt);
            }
        });

        jLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel.setText("Mật khẩu");

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
                        .addGap(520, 520, 520)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(215, 215, 215)
                        .addComponent(jLabel17)
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel15)
                            .addComponent(jLabel11)
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16)
                            .addComponent(jLabel))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(MSVjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TenSV, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(19, 19, 19)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(GTSV)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(GTSVjComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(XoaSVjButton1))
                                .addGap(16, 16, 16)
                                .addComponent(jLabel18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(NSjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(DCSVjTextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                                    .addComponent(SDTSVjTextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                                    .addComponent(KhoaSVjTextField, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(MKjTextField, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap(252, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 950, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(429, 429, 429)
                        .addComponent(ThemSVjButton)
                        .addGap(105, 105, 105)
                        .addComponent(LuuSVjButton1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(MSVjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(TenSV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(GTSV)
                    .addComponent(GTSVjComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NSjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(KhoaSVjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(DCSVjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(SDTSVjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel)
                    .addComponent(MKjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ThemSVjButton)
                    .addComponent(LuuSVjButton1)
                    .addComponent(XoaSVjButton1))
                .addContainerGap(127, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void MSVjTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MSVjTextFieldActionPerformed
        
    }//GEN-LAST:event_MSVjTextFieldActionPerformed

    SinhVien s;
    private void XoaSVjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_XoaSVjButton1ActionPerformed

        this.listSV.remove(QLSVjTable.getSelectedRow());
        taoBangSV();
        
    }//GEN-LAST:event_XoaSVjButton1ActionPerformed

    private void LuuSVjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LuuSVjButton1ActionPerformed
        try{

            File file =new File("Danhsachsv.csv");
            if(!file.exists()){
                file.createNewFile();
            }

            FileWriter fw = new FileWriter("Danhsachsv.csv");

            for(SinhVien  WList : listSV){
                fw.write(WList.toString()+"\n");
            }

            fw.close();

        }
        catch(IOException e){
            System.out.println("Exception occurred:");
            e.printStackTrace();

        }
        try {
            File file = new File("Danhsachsv.csv");
            Scanner reader = new Scanner(file);
            while(reader.hasNext()){
                String line = reader.nextLine();
                String[] lineSplit = line.split(";");
                String ms = lineSplit[0].trim();
                String ten = lineSplit[1].trim();
                String gt = lineSplit[2].trim();
                String ns = lineSplit[3].trim();
                String k = lineSplit[4].trim();
                String dc = lineSplit[5].trim();
                String sdt = lineSplit[6].trim();
                String mk = lineSplit[7].trim();

            }
            reader.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        } 
/*        try{
            if(MSVjTextField.getText().equals("")|| TenSV.getText().equals("") || NSjTextField.getText().equals("")|| KhoaSVjTextField.getText().equals("") ||
                   DCSVjTextField.getText().equals("") || SDTSVjTextField.getText().equals("") )
            {
                JButton a = new JButton();
                JOptionPane.showMessageDialog(a, "Cần nhập đủ thông tin");
            }
            else{
                if(ktraTrungMaSv(MSVjTextField.getText()))
                {
                   SinhVien a = new SinhVien(MSVjTextField.getText(), TenSV.getText(),GTSVjComboBox1.getSelectedItem().toString(),NSjTextField.getText(),KhoaSVjTextField.getText(),DCSVjTextField.getText()
                        ,SDTSVjTextField.getText() );
                   listSV.add(a);
                   new fileSV().ghiSV(listSV);
                   taoBangSV(); 
                }
                else{
                    JButton a = new JButton();
                    JOptionPane.showMessageDialog(a, "Mã sinh viên này đã tồn tại");
                }
            }
        }
        catch(Exception e){
            JButton a = new JButton();
            JOptionPane.showMessageDialog(a, e.getMessage());
        }*/
        
    }//GEN-LAST:event_LuuSVjButton1ActionPerformed

    private void QLSVjTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_QLSVjTableMouseClicked
//        DefaultTableModel model = (DefaultTableModel) QLSVjTable.getModel();
//        MSVjTextField.setText(model.getValueAt(QLSVjTable.getSelectedRow(), 0).toString());
//        TenSV.setText(model.getValueAt(QLSVjTable.getSelectedRow(), 1).toString());
//        GTSVjComboBox1.setSelectedItem(model.getValueAt(QLSVjTable.getSelectedRow(), 2).toString());
//        NSjTextField.setText(model.getValueAt(QLSVjTable.getSelectedRow(), 3).toString());
//        KhoaSVjTextField.setText(model.getValueAt(QLSVjTable.getSelectedRow(), 4).toString());
//        DCSVjTextField.setText(model.getValueAt(QLSVjTable.getSelectedRow(), 5).toString());
//        SDTSVjTextField.setText(model.getValueAt(QLSVjTable.getSelectedRow(), 6).toString());
    }//GEN-LAST:event_QLSVjTableMouseClicked

    private void TenSVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TenSVActionPerformed
        
    }//GEN-LAST:event_TenSVActionPerformed

    private void NSjTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NSjTextFieldActionPerformed
        
    }//GEN-LAST:event_NSjTextFieldActionPerformed

    private void KhoaSVjTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KhoaSVjTextFieldActionPerformed
        
    }//GEN-LAST:event_KhoaSVjTextFieldActionPerformed

    private void DCSVjTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DCSVjTextFieldActionPerformed
        
    }//GEN-LAST:event_DCSVjTextFieldActionPerformed

    private void SDTSVjTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SDTSVjTextFieldActionPerformed
        
    }//GEN-LAST:event_SDTSVjTextFieldActionPerformed

    private void ThemSVjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ThemSVjButtonActionPerformed
        // TODO add your handling code here:
        String msv = this.MSVjTextField.getText();
        String ten = this.TenSV.getText();
        String gt = this.GTSVjComboBox1.getSelectedItem().toString();
        String ns = this.NSjTextField.getText();
        String k = this.KhoaSVjTextField.getText();
        String dc = this.DCSVjTextField.getText();
        String sdt = this.SDTSVjTextField.getText();
        String mk = this.MKjTextField.getText();
        if(msv.equals("")|| ten.equals("") || ns.equals("")|| k.equals("") || dc.equals("") || sdt.equals("") || mk.equals("") )
            {
                JButton a = new JButton();
                JOptionPane.showMessageDialog(a, "Cần nhập đủ thông tin");
            }
        else{
            if(ktraTrungMaSv(msv)) {
                s = new SinhVien(msv, ten,  gt, ns, k,  dc,  sdt, mk);
                this.listSV.add(s);
                DefaultTableModel model =  (DefaultTableModel) QLSVjTable.getModel();
                String noi = msv +";" + ten +";"+ gt +";" + ns + ";" + k +";" + dc +";" + sdt+ ";"+mk;
                model.addRow(noi.split(";"));
            }
            else{
                JButton a = new JButton();
                JOptionPane.showMessageDialog(a, "Mã sinh viên này đã tồn tại");
            }
        }
    }//GEN-LAST:event_ThemSVjButtonActionPerformed

    private void MSVjTextFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MSVjTextFieldMouseClicked
        MSVjTextField.setText("");
    }//GEN-LAST:event_MSVjTextFieldMouseClicked

    private void TenSVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TenSVMouseClicked
        TenSV.setText("");
    }//GEN-LAST:event_TenSVMouseClicked

    private void NSjTextFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NSjTextFieldMouseClicked
        NSjTextField.setText("");
    }//GEN-LAST:event_NSjTextFieldMouseClicked

    private void KhoaSVjTextFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_KhoaSVjTextFieldMouseClicked
        KhoaSVjTextField.setText("");
    }//GEN-LAST:event_KhoaSVjTextFieldMouseClicked

    private void DCSVjTextFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DCSVjTextFieldMouseClicked
        DCSVjTextField.setText("");
    }//GEN-LAST:event_DCSVjTextFieldMouseClicked

    private void SDTSVjTextFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SDTSVjTextFieldMouseClicked
        SDTSVjTextField.setText("");
    }//GEN-LAST:event_SDTSVjTextFieldMouseClicked

    private void MKjTextFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MKjTextFieldMouseClicked
        MKjTextField.setText("");
    }//GEN-LAST:event_MKjTextFieldMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField DCSVjTextField;
    private javax.swing.JLabel GTSV;
    private javax.swing.JComboBox<String> GTSVjComboBox1;
    private javax.swing.JTextField KhoaSVjTextField;
    private javax.swing.JButton LuuSVjButton1;
    private javax.swing.JTextField MKjTextField;
    private javax.swing.JTextField MSVjTextField;
    private javax.swing.JTextField NSjTextField;
    private javax.swing.JTable QLSVjTable;
    private javax.swing.JTextField SDTSVjTextField;
    private javax.swing.JTextField TenSV;
    private javax.swing.JButton ThemSVjButton;
    private javax.swing.JButton XoaSVjButton1;
    private javax.swing.JLabel jLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
