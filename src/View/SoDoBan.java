package View;

import Controller.MySqlConnection;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JButton;

public class SoDoBan extends javax.swing.JFrame {
    // Khai báo các biến toàn cục
    Connection con; // Lưu kết nối với Database khi form mở và các thao tác trên form
    
    public SoDoBan() {
        initComponents();
        pack(); // Đặt kích thước form vừa đủ với nội dung
        setResizable(false); // Không cho phép thay đổi kích thước của form.
        setLocationRelativeTo(null); // Đặt vị trí form xuất hiện về giữa màn hình khi sau khi nhấn run 
        btnSoDoBan.setForeground(Color.red);
        /* Gọi phương thức getMySqlConnection trong Class MySqlConnection để tạo kết nối Database 
        và lưu vào biến toàn cục (không cần kết nối nhiều lần)*/
        con = MySqlConnection.getMySqlConnection("QLNHAHANG_NHOM3");
        btnDatCho.setForeground(Color.red);
        btnDatMon.setForeground(Color.gray);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        btnThoat1 = new javax.swing.JButton();
        btnDanhMuc = new javax.swing.JButton();
        btnSoDoBan = new javax.swing.JButton();
        btnDatMon = new javax.swing.JButton();
        btnHuongDan = new javax.swing.JButton();
        lblTinhTrang = new javax.swing.JLabel();
        btnBan1 = new javax.swing.JButton();
        btnBan2 = new javax.swing.JButton();
        btnBan3 = new javax.swing.JButton();
        btnBan6 = new javax.swing.JButton();
        btnBan4 = new javax.swing.JButton();
        btnBan5 = new javax.swing.JButton();
        btnBan10 = new javax.swing.JButton();
        btnBan11 = new javax.swing.JButton();
        btnBan12 = new javax.swing.JButton();
        btnBan13 = new javax.swing.JButton();
        btnBan7 = new javax.swing.JButton();
        btnBan8 = new javax.swing.JButton();
        btnBan9 = new javax.swing.JButton();
        btnBan14 = new javax.swing.JButton();
        btnBan17 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        btnBan19 = new javax.swing.JButton();
        btnBan20 = new javax.swing.JButton();
        btnBan15 = new javax.swing.JButton();
        btnBan16 = new javax.swing.JButton();
        btnTrong = new javax.swing.JButton();
        btnDatCho = new javax.swing.JButton();
        btnDaDat = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));
        jPanel1.setForeground(new java.awt.Color(255, 255, 51));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 51, 51));
        jLabel3.setText("Thoát");

        btnThoat1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnThoat1.setForeground(new java.awt.Color(0, 204, 255));
        btnThoat1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Button-exit-icon.png"))); // NOI18N
        btnThoat1.setBorder(null);
        btnThoat1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoat1ActionPerformed(evt);
            }
        });

        btnDanhMuc.setBackground(new java.awt.Color(255, 204, 0));
        btnDanhMuc.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnDanhMuc.setForeground(new java.awt.Color(0, 204, 255));
        btnDanhMuc.setText("Danh Mục");
        btnDanhMuc.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 102), 5));
        btnDanhMuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDanhMucActionPerformed(evt);
            }
        });

        btnSoDoBan.setBackground(new java.awt.Color(255, 204, 0));
        btnSoDoBan.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnSoDoBan.setForeground(new java.awt.Color(0, 204, 255));
        btnSoDoBan.setText("Sơ Đồ Bàn");
        btnSoDoBan.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 102), 5));

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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnDanhMuc, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnHuongDan, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDatMon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSoDoBan, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnThoat1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addGap(23, 23, 23))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(btnDanhMuc, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSoDoBan, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnDatMon, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnHuongDan, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnThoat1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        lblTinhTrang.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        lblTinhTrang.setForeground(new java.awt.Color(153, 0, 0));
        lblTinhTrang.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTinhTrang.setText("Hiện Tại Nhà Hàng Còn 20 Bàn");

        btnBan1.setBackground(new java.awt.Color(255, 255, 255));
        btnBan1.setText("Bàn 1");
        btnBan1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBan1MouseClicked(evt);
            }
        });

        btnBan2.setText("Bàn 2");
        btnBan2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBan2MouseClicked(evt);
            }
        });

        btnBan3.setText("Bàn 3");
        btnBan3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBan3MouseClicked(evt);
            }
        });

        btnBan6.setText("Bàn 6");

        btnBan4.setText("Bàn 4");
        btnBan4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBan4MouseClicked(evt);
            }
        });

        btnBan5.setText("Bàn 5");
        btnBan5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBan5MouseClicked(evt);
            }
        });

        btnBan10.setText("Bàn 10");

        btnBan11.setText("Bàn 11");

        btnBan12.setText("Bàn 12");

        btnBan13.setText("Bàn 13");

        btnBan7.setText("Bàn 7");

        btnBan8.setText("Bàn 8");

        btnBan9.setText("Bàn 9");

        btnBan14.setText("Bàn 14");

        btnBan17.setText("Bàn 17");

        jButton15.setText("Bàn 18");

        btnBan19.setText("Bàn 19");

        btnBan20.setText("Bàn 20");

        btnBan15.setText("Bàn 15");

        btnBan16.setText("Bàn 16");

        btnTrong.setText("Còn Trống");

        btnDatCho.setText("Đã Đặt Chỗ");

        btnDaDat.setBackground(new java.awt.Color(204, 204, 204));
        btnDaDat.setText("Đã Đặt Món");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblTinhTrang, javax.swing.GroupLayout.PREFERRED_SIZE, 883, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 18, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnTrong, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnDatCho, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnDaDat, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(btnBan1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnBan2, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnBan3, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnBan4, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnBan5, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(btnBan16, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnBan17, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnBan19, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnBan20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(btnBan6, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnBan7, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnBan8, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnBan9, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnBan10, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(btnBan11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnBan12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnBan13, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnBan14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnBan15, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE))))
                        .addGap(19, 19, 19))))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnBan1, btnBan10, btnBan11, btnBan12, btnBan13, btnBan14, btnBan15, btnBan16, btnBan17, btnBan19, btnBan2, btnBan20, btnBan3, btnBan4, btnBan5, btnBan6, btnBan7, btnBan8, btnBan9, jButton15});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnDaDat, btnDatCho, btnTrong});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnDatCho, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnDaDat, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnTrong, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lblTinhTrang, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                    .addComponent(btnBan1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBan2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBan3, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBan4, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBan5, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBan6, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBan10, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBan7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBan8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBan9, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnBan11, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnBan12, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnBan13, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnBan14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBan15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnBan17, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
                    .addComponent(jButton15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBan19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBan20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBan16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnBan1, btnBan10, btnBan11, btnBan12, btnBan13, btnBan14, btnBan15, btnBan16, btnBan17, btnBan19, btnBan2, btnBan20, btnBan3, btnBan4, btnBan5, btnBan6, btnBan7, btnBan8, btnBan9, jButton15});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnDaDat, btnDatCho, btnTrong});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 6, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnThoat1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoat1ActionPerformed
        new HuongDan().setVisible(true);
    }//GEN-LAST:event_btnThoat1ActionPerformed

    private void btnDanhMucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDanhMucActionPerformed
        new DanhMuc_ThuNgan().setVisible(true);
    }//GEN-LAST:event_btnDanhMucActionPerformed

    private void btnDatMonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDatMonActionPerformed
        new DatMon().setVisible(true);
    }//GEN-LAST:event_btnDatMonActionPerformed

    private void btnBan1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBan1MouseClicked
        datMon(btnBan1);
    }//GEN-LAST:event_btnBan1MouseClicked

    private void btnBan2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBan2MouseClicked
        datMon(btnBan2);
    }//GEN-LAST:event_btnBan2MouseClicked

    private void btnBan3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBan3MouseClicked
        datMon(btnBan3);
    }//GEN-LAST:event_btnBan3MouseClicked

    private void btnBan4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBan4MouseClicked
        datMon(btnBan4);
    }//GEN-LAST:event_btnBan4MouseClicked

    private void btnBan5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBan5MouseClicked
        datMon(btnBan5);
    }//GEN-LAST:event_btnBan5MouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SoDoBan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBan1;
    private javax.swing.JButton btnBan10;
    private javax.swing.JButton btnBan11;
    private javax.swing.JButton btnBan12;
    private javax.swing.JButton btnBan13;
    private javax.swing.JButton btnBan14;
    private javax.swing.JButton btnBan15;
    private javax.swing.JButton btnBan16;
    private javax.swing.JButton btnBan17;
    private javax.swing.JButton btnBan19;
    private javax.swing.JButton btnBan2;
    private javax.swing.JButton btnBan20;
    private javax.swing.JButton btnBan3;
    private javax.swing.JButton btnBan4;
    private javax.swing.JButton btnBan5;
    private javax.swing.JButton btnBan6;
    private javax.swing.JButton btnBan7;
    private javax.swing.JButton btnBan8;
    private javax.swing.JButton btnBan9;
    private javax.swing.JButton btnDaDat;
    private javax.swing.JButton btnDanhMuc;
    private javax.swing.JButton btnDatCho;
    private javax.swing.JButton btnDatMon;
    private javax.swing.JButton btnHuongDan;
    private javax.swing.JButton btnSoDoBan;
    private javax.swing.JButton btnThoat1;
    private javax.swing.JButton btnTrong;
    private javax.swing.JButton jButton15;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblTinhTrang;
    // End of variables declaration//GEN-END:variables

    public PreparedStatement prepareStatement(String sql, Object... args) throws SQLException {
        PreparedStatement st = con.prepareStatement(sql); // Biên dịch câu lệnh SQL trước
        for (int i = 0; i < args.length; i++) {
            st.setObject(i + 1, args[i]);
        }
//        System.out.println(st.toString());
        return st;
    }

    public ResultSet executeQuery(String sql, Object... args) {
        try {
            PreparedStatement stmt = prepareStatement(sql, args);
            return stmt.executeQuery();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    int tinhTrang = 20;
    private void datMon(JButton btn) {
        // Khi đặt món đã thanh toán thì chuyển btn trở về rỗng, màu đen
        if(btn.getForeground() == Color.red){
            System.out.println("Vào if");
            btn.setForeground(Color.gray);
            new DatMon().setVisible(true);
            
        }
        else{
            System.out.println("Vào else");
            btn.setForeground(Color.red);
            btn.setBackground(Color.blue);
            tinhTrang--;
            lblTinhTrang.setText("Hiện Tại Nhà Hàng Còn "+ tinhTrang +" Bàn");
        }  
    }
    
    
}
