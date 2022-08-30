
package com.mycompany.gui;

import com.mycompany.entyti.Khoa;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;


public class QuanLyKhoaJPanel extends javax.swing.JPanel {

    ArrayList<Khoa> listKhoa = new ArrayList<>();
    Khoa k;
    
    public QuanLyKhoaJPanel() {
        initComponents();
        try {
            File file = new File("DanhsachKhoa.csv");
            Scanner reader = new Scanner(file);
            while(reader.hasNext()){
                String line = reader.nextLine();
                String[] lineSplit = line.split(";");
                String maK = lineSplit[0].trim();
                String tenK = lineSplit[1].trim();
                String sdt = lineSplit[2].trim();
                k = new Khoa(maK,tenK,sdt);
                this.listKhoa.add(k);

            }
            reader.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        taoBangKhoa();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        QLKjTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        MaKjTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        TenKjTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        SDTjTextField = new javax.swing.JTextField();
        ThemjButton = new javax.swing.JButton();
        LuujButton = new javax.swing.JButton();
        XoajButton = new javax.swing.JButton();

        QLKjTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã khoa", "Khoa", "SDT"
            }
        ));
        jScrollPane1.setViewportView(QLKjTable);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("QUẢN LÝ KHOA");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Mã khoa");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Tên khoa");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("SDT");

        ThemjButton.setBackground(new java.awt.Color(255, 0, 51));
        ThemjButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ThemjButton.setText("THÊM");
        ThemjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ThemjButtonActionPerformed(evt);
            }
        });

        LuujButton.setBackground(new java.awt.Color(255, 0, 0));
        LuujButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        LuujButton.setText("LƯU");
        LuujButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LuujButtonActionPerformed(evt);
            }
        });

        XoajButton.setBackground(new java.awt.Color(255, 0, 0));
        XoajButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        XoajButton.setText("XÓA");
        XoajButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                XoajButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(437, 437, 437)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4))
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(ThemjButton)
                                .addGap(113, 113, 113)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(MaKjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TenKjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SDTjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(LuujButton)
                                .addGap(99, 99, 99)
                                .addComponent(XoajButton))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1031, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(509, 509, 509)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(116, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MaKjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(TenKjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SDTjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(73, 73, 73)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LuujButton)
                    .addComponent(XoajButton)
                    .addComponent(ThemjButton))
                .addContainerGap(146, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void ThemjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ThemjButtonActionPerformed
        String maK = this.MaKjTextField.getText();
        String tenK = this.TenKjTextField.getText();
        String sdt = this.SDTjTextField.getText();
        k = new Khoa(maK,tenK,sdt);
        this.listKhoa.add(k);
        DefaultTableModel model = (DefaultTableModel) QLKjTable.getModel();
        String noi = maK + ";" + tenK + ";" +sdt;
        model.addRow(noi.split(";"));
    }//GEN-LAST:event_ThemjButtonActionPerformed

    private void LuujButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LuujButtonActionPerformed
        try{           
            File file =new File("DanhsachKhoa.csv");
           if(!file.exists()){
            file.createNewFile();
            }

            FileWriter fw = new FileWriter("DanhsachKhoa.csv");
            
            for(Khoa  WList : listKhoa){
                fw.write(WList.toString()+"\n");            }

            fw.close();

        }
        catch(IOException ioe){
            System.out.println("Exception occurred:");
            
        }
        try {
            File file = new File("DanhsachKhoa.csv");
            Scanner reader = new Scanner(file);
            while(reader.hasNext()){
                String line = reader.nextLine();
                String[] lineSplit = line.split(";");
                String maK = lineSplit[0].trim();
                String tenK = lineSplit[1].trim();
                String sdt = lineSplit[2].trim();

            }
            reader.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_LuujButtonActionPerformed

    private void XoajButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_XoajButtonActionPerformed
        this.listKhoa.remove(QLKjTable.getSelectedRow());
        taoBangKhoa();
    }//GEN-LAST:event_XoajButtonActionPerformed
    public void taoBangKhoa()
    {
        DefaultTableModel m = (DefaultTableModel)QLKjTable.getModel();
        m.getDataVector().removeAllElements();
        m.fireTableDataChanged();
        TableRowSorter sorter = new TableRowSorter(m); 
        QLKjTable.setRowSorter(sorter);  
        for(Khoa i:listKhoa)
        {
            m.addRow(i.toArray());
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LuujButton;
    private javax.swing.JTextField MaKjTextField;
    private javax.swing.JTable QLKjTable;
    private javax.swing.JTextField SDTjTextField;
    private javax.swing.JTextField TenKjTextField;
    private javax.swing.JButton ThemjButton;
    private javax.swing.JButton XoajButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
