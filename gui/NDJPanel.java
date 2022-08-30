
package com.mycompany.gui;

import com.mycompany.entyti.Diem;
import com.mycompany.entyti.GiaoVien;
import com.mycompany.entyti.SinhVien;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author LUU THE TRUNG
 */
public class NDJPanel extends javax.swing.JPanel {
    Diem d;
    ArrayList<Diem> listDiem = new ArrayList<>();
    public NDJPanel() {
        initComponents();
        try {
            File file = new File("DanhsachDiem.csv");
            Scanner reader = new Scanner(file);
            
            while(reader.hasNext()){
     
                String line = reader.nextLine();
                String[] lineSplit = line.split(";");
                String ms = lineSplit[0].trim();
                String dhs = lineSplit[1].trim();
                String dhc = lineSplit[2].trim();
                d = new Diem(ms,dhs,dhc);
                this.listDiem.add(d);

            }
            reader.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        } 
        
        taoBangDiem();
    }

    public void taoBangDiem()
    {
        DefaultTableModel m = (DefaultTableModel)DiemjTable.getModel();
        m.getDataVector().removeAllElements();
        m.fireTableDataChanged();
        TableRowSorter sorter = new TableRowSorter(m); 
        DiemjTable.setRowSorter(sorter);  
        for(Diem i:listDiem)
        {
            m.addRow(i.toArray());
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        DiemjTable = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        MSVjTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        DHSjTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        DHCjTextField = new javax.swing.JTextField();
        NhapDiemjButton = new javax.swing.JButton();
        LuuDiemjButton = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("QUẢN LÝ SINH VIÊN");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("NHẬP ĐIỂM");

        DiemjTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "MSSV", "Điểm hệ số", "Điểm hệ chữ"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(DiemjTable);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("MSSV");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Điểm hệ số");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Điểm hệ chữ");

        NhapDiemjButton.setBackground(new java.awt.Color(255, 51, 51));
        NhapDiemjButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        NhapDiemjButton.setText("OK");
        NhapDiemjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NhapDiemjButtonActionPerformed(evt);
            }
        });

        LuuDiemjButton.setBackground(new java.awt.Color(255, 0, 51));
        LuuDiemjButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        LuuDiemjButton.setText("LƯU");
        LuuDiemjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LuuDiemjButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1000, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(564, 564, 564)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(358, 358, 358)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(MSVjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(90, 90, 90)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(DHSjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(85, 85, 85)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(DHCjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(486, 486, 486)
                        .addComponent(NhapDiemjButton)
                        .addGap(161, 161, 161)
                        .addComponent(LuuDiemjButton)))
                .addContainerGap(125, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(MSVjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(DHSjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(DHCjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(96, 96, 96)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NhapDiemjButton)
                    .addComponent(LuuDiemjButton))
                .addContainerGap(157, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    
    private void NhapDiemjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NhapDiemjButtonActionPerformed
        String ms = this.MSVjTextField.getText();
        String dhs = this.DHSjTextField.getText();
        String dhc = this.DHCjTextField.getText();
        d = new Diem(ms, dhs, dhc);
        this.listDiem.add(d);
        DefaultTableModel model =  (DefaultTableModel) DiemjTable.getModel();
        String noi = ms +";" + dhs +";"+ dhc;
        model.addRow(noi.split(";"));
    }//GEN-LAST:event_NhapDiemjButtonActionPerformed

    private void LuuDiemjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LuuDiemjButtonActionPerformed
        try{

            File file =new File("DanhsachDiem.csv");
            if(!file.exists()){
                file.createNewFile();
            }

            FileWriter fw = new FileWriter("DanhsachDiem.csv");

            for(Diem  WList : listDiem){
                fw.write(WList.toString()+"\n");
            }

            fw.close();

        }
        catch(IOException e){
            System.out.println("Exception occurred:");
            e.printStackTrace();

        }
        try {
            File file = new File("DanhsachDiem.csv");
            Scanner reader = new Scanner(file);
            
            while(reader.hasNext()){
                
                String line = reader.nextLine();
                String[] lineSplit = line.split(";");
                String ms = lineSplit[0].trim();
                String dhs = lineSplit[1].trim();
                String dhc = lineSplit[2].trim();
                

            }
            reader.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        } 
    }//GEN-LAST:event_LuuDiemjButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField DHCjTextField;
    private javax.swing.JTextField DHSjTextField;
    private javax.swing.JTable DiemjTable;
    private javax.swing.JButton LuuDiemjButton;
    private javax.swing.JTextField MSVjTextField;
    private javax.swing.JButton NhapDiemjButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
