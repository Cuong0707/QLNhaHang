package View;

import java.awt.Color;
import javax.swing.JOptionPane;

public class DanhMuc_ThuNgan extends javax.swing.JFrame {

    public DanhMuc_ThuNgan() {
        initComponents();
        pack(); // Đặt kích thước form vừa đủ với nội dung
        setResizable(false); // Không cho phép thay đổi kích thước của form.
        setLocationRelativeTo(null); // Đặt vị trí form xuất hiện về giữa màn hình khi sau khi nhấn run 
        btnDanhMuc.setForeground(Color.red);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnDanhMuc = new javax.swing.JButton();
        btnSoDoBan = new javax.swing.JButton();
        btnDatMon = new javax.swing.JButton();
        btnHuongDan = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        btnThoat1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnSoDoBan1 = new javax.swing.JButton();
        btnDatMon1 = new javax.swing.JButton();
        btnHoaDon = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnCaTruc = new javax.swing.JButton();
        btnCaNhan = new javax.swing.JButton();
        btnHuongDan1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));
        jPanel1.setForeground(new java.awt.Color(255, 255, 51));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        btnDanhMuc.setBackground(new java.awt.Color(255, 204, 0));
        btnDanhMuc.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnDanhMuc.setForeground(new java.awt.Color(0, 204, 255));
        btnDanhMuc.setText("Danh Mục");
        btnDanhMuc.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 102), 5));

        btnSoDoBan.setBackground(new java.awt.Color(255, 204, 0));
        btnSoDoBan.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnSoDoBan.setForeground(new java.awt.Color(0, 204, 255));
        btnSoDoBan.setText("Sơ Đồ Bàn");
        btnSoDoBan.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 102), 5));
        btnSoDoBan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSoDoBanActionPerformed(evt);
            }
        });

        btnDatMon.setBackground(new java.awt.Color(255, 204, 0));
        btnDatMon.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnDatMon.setForeground(new java.awt.Color(0, 204, 255));
        btnDatMon.setText("Đặt Món");
        btnDatMon.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 102), 5));
        btnDatMon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDatMonActionPerformed(evt);
            }
        });

        btnHuongDan.setBackground(new java.awt.Color(255, 204, 0));
        btnHuongDan.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnHuongDan.setForeground(new java.awt.Color(0, 204, 255));
        btnHuongDan.setText("Hướng Dẫn");
        btnHuongDan.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 102), 5));
        btnHuongDan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHuongDanActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 51, 51));
        jLabel9.setText("Thoát");

        btnThoat1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnThoat1.setForeground(new java.awt.Color(0, 204, 255));
        btnThoat1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Button-exit-icon.png"))); // NOI18N
        btnThoat1.setBorder(null);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(btnThoat1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnDanhMuc, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnHuongDan, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDatMon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSoDoBan, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(btnDanhMuc, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSoDoBan, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnDatMon, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnHuongDan, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnThoat1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );

        jLabel2.setFont(new java.awt.Font("Times New Roman", 3, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("CHÀO MỪNG BẠN ĐẾN VỚI NHÀ HÀNG ĐẸP VÀ ĐỘC");

        btnSoDoBan1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/SkyBlue-Seat-icon.png"))); // NOI18N
        btnSoDoBan1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSoDoBan1ActionPerformed(evt);
            }
        });

        btnDatMon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Food-Dome-icon.png"))); // NOI18N
        btnDatMon1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDatMon1ActionPerformed(evt);
            }
        });

        btnHoaDon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Windows-View-Detail-icon.png"))); // NOI18N
        btnHoaDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHoaDonActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Sơ Đồ Bàn");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Đặt Món");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Hóa Đơn");

        btnCaTruc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Slideshare-icon.png"))); // NOI18N
        btnCaTruc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCaTrucActionPerformed(evt);
            }
        });

        btnCaNhan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/personal-information-icon.png"))); // NOI18N
        btnCaNhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCaNhanActionPerformed(evt);
            }
        });

        btnHuongDan1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Blue-Utilities-icon.png"))); // NOI18N
        btnHuongDan1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHuongDan1ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Ca Trực");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Cá Nhân");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Hướng Dẫn");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 546, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCaTruc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCaNhan, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnHuongDan1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnSoDoBan1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btnDatMon1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnCaNhan, btnCaTruc, btnDatMon1, btnHoaDon, btnHuongDan1, btnSoDoBan1});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnDatMon1)
                    .addComponent(btnHoaDon)
                    .addComponent(btnSoDoBan1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnCaNhan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCaTruc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnHuongDan1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnCaNhan, btnCaTruc, btnDatMon1, btnHoaDon, btnHuongDan1, btnSoDoBan1});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDatMon1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDatMon1ActionPerformed
        new DatMon().setVisible(true);
    }//GEN-LAST:event_btnDatMon1ActionPerformed

    private void btnSoDoBan1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSoDoBan1ActionPerformed
        new SoDoBan().setVisible(true);
    }//GEN-LAST:event_btnSoDoBan1ActionPerformed

    private void btnHoaDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHoaDonActionPerformed
        JOptionPane.showMessageDialog(null, "Hệ thống đang phát triển!");
    }//GEN-LAST:event_btnHoaDonActionPerformed

    private void btnCaTrucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCaTrucActionPerformed
        JOptionPane.showMessageDialog(null, "Hệ thống đang phát triển!");
    }//GEN-LAST:event_btnCaTrucActionPerformed

    private void btnCaNhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCaNhanActionPerformed
        JOptionPane.showMessageDialog(null, "Hệ thống đang phát triển!");
    }//GEN-LAST:event_btnCaNhanActionPerformed

    private void btnHuongDan1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHuongDan1ActionPerformed
        new HuongDan().setVisible(true);
    }//GEN-LAST:event_btnHuongDan1ActionPerformed

    private void btnHuongDanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHuongDanActionPerformed
        new HuongDan().setVisible(true);
    }//GEN-LAST:event_btnHuongDanActionPerformed

    private void btnSoDoBanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSoDoBanActionPerformed
        new SoDoBan().setVisible(true);
    }//GEN-LAST:event_btnSoDoBanActionPerformed

    private void btnDatMonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDatMonActionPerformed
        new DatMon().setVisible(true);
    }//GEN-LAST:event_btnDatMonActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DanhMuc_ThuNgan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCaNhan;
    private javax.swing.JButton btnCaTruc;
    private javax.swing.JButton btnDanhMuc;
    private javax.swing.JButton btnDatMon;
    private javax.swing.JButton btnDatMon1;
    private javax.swing.JButton btnHoaDon;
    private javax.swing.JButton btnHuongDan;
    private javax.swing.JButton btnHuongDan1;
    private javax.swing.JButton btnSoDoBan;
    private javax.swing.JButton btnSoDoBan1;
    private javax.swing.JButton btnThoat1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
