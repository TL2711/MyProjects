

package com.mycompany.gui;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author LUU THE TRUNG
 */
public class DKHJPanel extends javax.swing.JPanel {

    /**
     * Creates new form DKHJPanel
     */
    public DKHJPanel() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        MonjTable = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        DKHjTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Môn đã đăng ký");

        MonjTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã môn", "Tên môn", "Thứ", "Tiết", "Phòng học", "Hủy đăng ký"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Boolean.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        MonjTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MonjTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(MonjTable);

        DKHjTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"M001", "Lập tình hướng đối tượng", "2", "1-2", "208", null},
                {"M002", "Phương pháp số", "6", "4-5", "102", null},
                {"M003", "Xác suất thống kê", "4", "6-8", "101", null},
                {"M004", "Điện và từ", "3", "9-10", "405", null}
            },
            new String [] {
                "Mã môn", "Tên môn", "Thứ", "Tiết", "Phòng học", "Đăng ký"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Boolean.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        DKHjTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DKHjTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(DKHjTable);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("ĐĂNG KÝ MÔN HỌC");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(169, 169, 169)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 900, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 900, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(513, 513, 513)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(538, 538, 538)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(178, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(96, 96, 96))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void DKHjTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DKHjTableMouseClicked
        DefaultTableModel model =  (DefaultTableModel) DKHjTable.getModel();
        DefaultTableModel model1 =  (DefaultTableModel) MonjTable.getModel();
        int a = DKHjTable.getSelectedRow();
        boolean check = (boolean) model.getValueAt(a,5);
        if(check) {
            String b = model.getValueAt(a,0) + ";" +model.getValueAt(a,1)+ ";" +model.getValueAt(a,2)+ ";" +model.getValueAt(a,3)+ ";" +model.getValueAt(a,4);
            model1.addRow(b.split(";"));
        }
    }//GEN-LAST:event_DKHjTableMouseClicked

    private void MonjTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MonjTableMouseClicked
        DefaultTableModel model1 =  (DefaultTableModel) MonjTable.getModel();
        int a = MonjTable.getSelectedRow();
        boolean check = (boolean) model1.getValueAt(a,5);
        if(check) {
            model1.removeRow(a);
        }
    }//GEN-LAST:event_MonjTableMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable DKHjTable;
    private javax.swing.JTable MonjTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
