package View;

import Dao.ThucDonDAO;
import java.sql.*;
import java.util.List;
import javax.swing.table.*;      
import javax.swing.JOptionPane;
import Helper.ConnectDatabase;
import java.util.ArrayList;

public class ThucDon extends javax.swing.JFrame {

    /**
     * Creates new form ThucDon
     */
    private ThucDonDAO dao = new ThucDonDAO();

    public ThucDon() {
        initComponents();
        setLocationRelativeTo(null);
        FillToTable_ThucDon();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        btnKhaiVi = new javax.swing.JButton();
        btnMonSup = new javax.swing.JButton();
        btnHaiSan = new javax.swing.JButton();
        btnMonHeo = new javax.swing.JButton();
        btnMonGa = new javax.swing.JButton();
        btnMonBo = new javax.swing.JButton();
        btnMonRau = new javax.swing.JButton();
        btnGoi = new javax.swing.JButton();
        btnMonLau = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        btnSinhTo = new javax.swing.JButton();
        btnBia = new javax.swing.JButton();
        btnNuocNgot = new javax.swing.JButton();
        btnNuocEp = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblThucDon = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTabbedPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel3.setBackground(new java.awt.Color(255, 204, 102));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnKhaiVi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Potatos-icon.png"))); // NOI18N
        btnKhaiVi.setText("Khai Vị");
        btnKhaiVi.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnKhaiVi.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnKhaiVi.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnKhaiVi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKhaiViActionPerformed(evt);
            }
        });

        btnMonSup.setText("Món Súp");
        btnMonSup.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnMonSup.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnMonSup.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnMonSup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMonSupActionPerformed(evt);
            }
        });

        btnHaiSan.setText("Hải Sản");
        btnHaiSan.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnHaiSan.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnHaiSan.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnHaiSan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHaiSanActionPerformed(evt);
            }
        });

        btnMonHeo.setText("Món Heo");
        btnMonHeo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnMonHeo.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnMonHeo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnMonHeo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMonHeoActionPerformed(evt);
            }
        });

        btnMonGa.setText("Món Gà");
        btnMonGa.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnMonGa.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnMonGa.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnMonGa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMonGaActionPerformed(evt);
            }
        });

        btnMonBo.setText("Món Bò");
        btnMonBo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnMonBo.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnMonBo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnMonBo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMonBoActionPerformed(evt);
            }
        });

        btnMonRau.setText("Món Rau");
        btnMonRau.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnMonRau.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnMonRau.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnMonRau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMonRauActionPerformed(evt);
            }
        });

        btnGoi.setText("Gỏi & Salad");
        btnGoi.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnGoi.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnGoi.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnGoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGoiActionPerformed(evt);
            }
        });

        btnMonLau.setText("Món Lẫu");
        btnMonLau.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnMonLau.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnMonLau.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnMonLau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMonLauActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnKhaiVi, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addComponent(btnMonSup)
                        .addGap(18, 18, 18)
                        .addComponent(btnHaiSan))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnMonRau, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnGoi, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnMonLau, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnMonBo, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(btnMonGa)
                        .addGap(18, 18, 18)
                        .addComponent(btnMonHeo, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnMonSup)
                    .addComponent(btnKhaiVi)
                    .addComponent(btnHaiSan, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnMonGa)
                    .addComponent(btnMonHeo, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMonBo))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnMonLau)
                    .addComponent(btnMonRau)
                    .addComponent(btnGoi))
                .addContainerGap(76, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Món Ăn", jPanel3);

        jPanel5.setBackground(new java.awt.Color(255, 204, 102));

        btnSinhTo.setText("Sinh Tố");
        btnSinhTo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSinhTo.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnSinhTo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnSinhTo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSinhToActionPerformed(evt);
            }
        });

        btnBia.setText("Các Loại Bia");
        btnBia.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnBia.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnBia.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnBia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBiaActionPerformed(evt);
            }
        });

        btnNuocNgot.setText("Nước Ngọt");
        btnNuocNgot.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnNuocNgot.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnNuocNgot.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnNuocNgot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuocNgotActionPerformed(evt);
            }
        });

        btnNuocEp.setText("Nước Ép");
        btnNuocEp.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnNuocEp.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnNuocEp.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnNuocEp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuocEpActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBia)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnNuocNgot)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(btnSinhTo)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(btnNuocEp, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBia)
                    .addComponent(btnNuocNgot)
                    .addComponent(btnNuocEp))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSinhTo)
                .addContainerGap(186, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Thức Uống", jPanel5);

        jPanel7.setBackground(new java.awt.Color(255, 204, 102));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thực Đơn", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        tblThucDon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "", "", ""
            }
        ));
        jScrollPane1.setViewportView(tblThucDon);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(17, 17, 17))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(142, 142, 142))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTabbedPane1))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 571, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnKhaiViActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKhaiViActionPerformed
        loadDataToTable(btnKhaiVi);
    }//GEN-LAST:event_btnKhaiViActionPerformed

    private void btnMonSupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMonSupActionPerformed
        loadDataToTable(btnMonSup);
    }//GEN-LAST:event_btnMonSupActionPerformed

    private void btnHaiSanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHaiSanActionPerformed
        loadDataToTable(btnHaiSan);
    }//GEN-LAST:event_btnHaiSanActionPerformed

    private void btnMonHeoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMonHeoActionPerformed
        loadDataToTable(btnMonHeo);
    }//GEN-LAST:event_btnMonHeoActionPerformed

    private void btnMonGaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMonGaActionPerformed
        loadDataToTable(btnMonGa);
    }//GEN-LAST:event_btnMonGaActionPerformed

    private void btnMonBoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMonBoActionPerformed
        loadDataToTable(btnMonBo);
    }//GEN-LAST:event_btnMonBoActionPerformed

    private void btnMonRauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMonRauActionPerformed
        loadDataToTable(btnMonRau);
    }//GEN-LAST:event_btnMonRauActionPerformed

    private void btnGoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGoiActionPerformed
        loadDataToTable(btnGoi);
    }//GEN-LAST:event_btnGoiActionPerformed

    private void btnMonLauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMonLauActionPerformed
        loadDataToTable(btnMonLau);
    }//GEN-LAST:event_btnMonLauActionPerformed

    private void btnSinhToActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSinhToActionPerformed
        loadDataToTable(btnSinhTo);
    }//GEN-LAST:event_btnSinhToActionPerformed

    private void btnBiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBiaActionPerformed
        loadDataToTable(btnBia);
    }//GEN-LAST:event_btnBiaActionPerformed

    private void btnNuocNgotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuocNgotActionPerformed
        loadDataToTable(btnNuocNgot);
    }//GEN-LAST:event_btnNuocNgotActionPerformed

    private void btnNuocEpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuocEpActionPerformed
        loadDataToTable(btnNuocEp);
    }//GEN-LAST:event_btnNuocEpActionPerformed

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
            java.util.logging.Logger.getLogger(ThucDon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ThucDon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ThucDon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ThucDon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ThucDon().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBia;
    private javax.swing.JButton btnGoi;
    private javax.swing.JButton btnHaiSan;
    private javax.swing.JButton btnKhaiVi;
    private javax.swing.JButton btnMonBo;
    private javax.swing.JButton btnMonGa;
    private javax.swing.JButton btnMonHeo;
    private javax.swing.JButton btnMonLau;
    private javax.swing.JButton btnMonRau;
    private javax.swing.JButton btnMonSup;
    private javax.swing.JButton btnNuocEp;
    private javax.swing.JButton btnNuocNgot;
    private javax.swing.JButton btnSinhTo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tblThucDon;
    // End of variables declaration//GEN-END:variables
    
    public final void FillToTable_ThucDon()
    {
        DefaultTableModel model = (DefaultTableModel) tblThucDon.getModel();
        model.setRowCount(0);
        try {
            List<Model.ThucDon> list = dao.selectAll();
            for (Model.ThucDon td : list) {
                Object[] row = {
                    td.getTenMon(),
                    td.getGia()
                };
                model.addRow(row);
            }
        } 
        catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Lỗi Truy Vấn Dữ Liệu !!");
        }
    }   
    public void fillanytable(String a)
    {
        DefaultTableModel model = (DefaultTableModel) tblThucDon.getModel();
        model.setRowCount(0);
        List<Model.ThucDon> thucdon =  dao.selectThitHeo(a);
        for(int i = 0;i<thucdon.size();i++)
        {
            Object[] row = {
                    thucdon.get(i).getTenMon(),
                    thucdon.get(i).getGia()
                };
            model.addRow(row);
        }
    }
    
}