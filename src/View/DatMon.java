package View;

import Controller.CheckInput;
import DAO.HoaDonDAO;
import DAO.KhachHangDAO;
import DAO.MainDAO;
import VIEW.HuongDan;
import VIEW.SoDoBan;
import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class DatMon extends javax.swing.JFrame implements Runnable {

    // Khai báo các biến toàn cục
    DefaultTableModel tblModel_HD, tblModel_TD; // Biến dùng để chưa Model của bảng
    HashMap<JButton, String> listButtonName;
    int index = -1; // Biến lưu vị trí hiện tại của dữ liệu đang thao tác trên JTabel

    // Khai báo Hằng biểu thức để bắt lỗi nhập vào sai quy định
    final String REGEX_SODT = "0\\d{9}";

    public DatMon() {
        initComponents();
        pack(); // Đặt kích thước form vừa đủ với nội dung
        setResizable(false); // Không cho phép thay đổi kích thước của form.
        setLocationRelativeTo(null); // Đặt vị trí form xuất hiện về giữa màn hình khi sau khi nhấn run 
        btnDatMon.setForeground(Color.red);
        createListBtn();

        /* Gọi các phương thức cần thiết run khi form mở */
        setColsForHoaDon();
        setColsForThucDon();
        hoaDonTuDong();

        loadDataToTable(btnKhaiVi);
        /* Mặc định thực đơn khi vừa mở chương trình là Khai Vị */
        tblModel_HD.setRowCount(0);
        /* Khi mở chương trình, hóa đơn luôn rỗng */

        Thread t1 = new Thread(this);
        t1.start();/* Chạy ngày giờ*/

 /* Disabled khi khi vừa mở lên */
        btnXoaMon.setEnabled(false);
        btnTang.setEnabled(false);
        btnGiam.setEnabled(false);

        /* Đã và đang code sẽ màu đỏ */
        btnFindKH.setForeground(Color.red);
        btnSave.setForeground(Color.red);
        btnFindHD.setForeground(Color.red);

        /* Những tính năng nào chưa code sẽ disabled */
        btnFindHD.setEnabled(false);
        btnIn.setEnabled(false);
        btnThanhToan.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnSoDoBan = new javax.swing.JButton();
        btnDatMon = new javax.swing.JButton();
        btnHuongDan = new javax.swing.JButton();
        btnThoat = new javax.swing.JButton();
        btnDanhMuc = new javax.swing.JButton();
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
        jPanel6 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtKhachHang = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtSDT = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        lblClock = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtDiaChi = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        txtPhiDichVu = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        txtThue = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        txtTongTien = new javax.swing.JTextField();
        lblNhanVien = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblHoaDon = new javax.swing.JTable();
        lblDate = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        cboPay = new javax.swing.JComboBox<>();
        txtHoaDon = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblThucDon = new javax.swing.JTable();
        btnThemMon = new javax.swing.JButton();
        btnTang = new javax.swing.JButton();
        btnGiam = new javax.swing.JButton();
        btnXoaMon = new javax.swing.JButton();
        btnIn = new javax.swing.JButton();
        btnNew = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnFindKH = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        btnThanhToan = new javax.swing.JButton();
        btnFindHD = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));
        jPanel1.setForeground(new java.awt.Color(255, 255, 51));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

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

        btnThoat.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnThoat.setForeground(new java.awt.Color(0, 204, 255));
        btnThoat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Button-exit-icon.png"))); // NOI18N
        btnThoat.setText("THOÁT");

        btnDanhMuc.setBackground(new java.awt.Color(255, 204, 0));
        btnDanhMuc.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnDanhMuc.setForeground(new java.awt.Color(0, 204, 255));
        btnDanhMuc.setText("Danh Mục");
        btnDanhMuc.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 102), 5));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnDanhMuc, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSoDoBan, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnDatMon, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnHuongDan, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(btnThoat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnDanhMuc, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSoDoBan, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnDatMon, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnHuongDan, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 201, Short.MAX_VALUE)
                .addComponent(btnThoat)
                .addContainerGap())
        );

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

        btnMonSup.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/soup-icon.png"))); // NOI18N
        btnMonSup.setText("Món Súp");
        btnMonSup.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnMonSup.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnMonSup.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnMonSup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMonSupActionPerformed(evt);
            }
        });

        btnHaiSan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Crab-icon.png"))); // NOI18N
        btnHaiSan.setText("Hải Sản");
        btnHaiSan.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnHaiSan.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnHaiSan.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnHaiSan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHaiSanActionPerformed(evt);
            }
        });

        btnMonHeo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Food-pork-chop-icon.png"))); // NOI18N
        btnMonHeo.setText("Món Heo");
        btnMonHeo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnMonHeo.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnMonHeo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnMonHeo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMonHeoActionPerformed(evt);
            }
        });

        btnMonGa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/recipe-chicken-icon.png"))); // NOI18N
        btnMonGa.setText("Món Gà");
        btnMonGa.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnMonGa.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnMonGa.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnMonGa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMonGaActionPerformed(evt);
            }
        });

        btnMonBo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Steak-icon.png"))); // NOI18N
        btnMonBo.setText("Món Bò");
        btnMonBo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnMonBo.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnMonBo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnMonBo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMonBoActionPerformed(evt);
            }
        });

        btnMonRau.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Fruits-Vegetables-icon.png"))); // NOI18N
        btnMonRau.setText("Món Rau");
        btnMonRau.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnMonRau.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnMonRau.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnMonRau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMonRauActionPerformed(evt);
            }
        });

        btnGoi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Salad-icon.png"))); // NOI18N
        btnGoi.setText("Gỏi & Salad");
        btnGoi.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnGoi.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnGoi.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnGoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGoiActionPerformed(evt);
            }
        });

        btnMonLau.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/soup-icon.png"))); // NOI18N
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

        jPanel3Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnGoi, btnHaiSan, btnMonGa, btnMonHeo, btnMonLau, btnMonRau, btnMonSup});

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
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnGoi, btnHaiSan, btnKhaiVi, btnMonBo, btnMonGa, btnMonHeo, btnMonLau, btnMonRau, btnMonSup});

        jTabbedPane1.addTab("Món Ăn", jPanel3);

        jPanel5.setBackground(new java.awt.Color(255, 204, 102));

        btnSinhTo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Mai-Tai-icon.png"))); // NOI18N
        btnSinhTo.setText("Sinh Tố");
        btnSinhTo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSinhTo.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnSinhTo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnSinhTo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSinhToActionPerformed(evt);
            }
        });

        btnBia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Beer-2-icon.png"))); // NOI18N
        btnBia.setText("Các Loại Bia");
        btnBia.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnBia.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnBia.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnBia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBiaActionPerformed(evt);
            }
        });

        btnNuocNgot.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/7up-icon.png"))); // NOI18N
        btnNuocNgot.setText("Nước Ngọt");
        btnNuocNgot.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnNuocNgot.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnNuocNgot.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnNuocNgot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuocNgotActionPerformed(evt);
            }
        });

        btnNuocEp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Orange-Juice-icon.png"))); // NOI18N
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
                .addContainerGap(120, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Thức Uống", jPanel5);

        jPanel6.setBackground(new java.awt.Color(255, 204, 102));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Hóa Đơn", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 24))); // NOI18N

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setText("Số Hóa Đơn: ");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setText("Khách Hàng:");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setText("Số Điện Thoại:");

        txtSDT.setText("0385665555");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel15.setText("Số Bàn:");

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel16.setText("Giờ:");

        lblClock.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblClock.setText("00:00:00");

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel18.setText("Địa Chỉ:");

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel19.setText("Ngày:");

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel20.setText("Phí DV:");

        txtPhiDichVu.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtPhiDichVu.setText("0.0");

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel21.setText("Thuế VAT");

        txtThue.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtThue.setText("0.0");

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel22.setText("Tổng Tiền");

        txtTongTien.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtTongTien.setText("0.0");

        lblNhanVien.setText("Huỳnh Nhật Cường");

        tblHoaDon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ));
        jScrollPane2.setViewportView(tblHoaDon);

        lblDate.setText("12/01/2022");

        jLabel31.setText("Nhân Viên:");

        cboPay.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tiền Mặt", "Chuyển Khoản", "Cà Thẻ" }));

        txtHoaDon.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addComponent(cboPay, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel31)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNhanVien))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel21, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtPhiDichVu)
                            .addComponent(txtThue)
                            .addComponent(txtTongTien, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSDT, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                            .addComponent(txtDiaChi)
                            .addComponent(txtKhachHang))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addGap(22, 22, 22)
                                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(lblDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lblClock, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(9, 9, 9)))))
                        .addGap(8, 8, 8)))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16)
                    .addComponent(lblClock))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19)
                    .addComponent(lblDate))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPhiDichVu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtThue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTongTien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblNhanVien)
                        .addComponent(jLabel31))
                    .addComponent(cboPay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(17, 17, 17))
        );

        btnThemMon.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnThemMon.setText("THÊM MÓN");
        btnThemMon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemMonActionPerformed(evt);
            }
        });

        btnTang.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnTang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Glyph-Add-icon.png"))); // NOI18N
        btnTang.setText("TĂNG SỐ LƯỢNG");
        btnTang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTangActionPerformed(evt);
            }
        });

        btnGiam.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnGiam.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/math-minus-icon.png"))); // NOI18N
        btnGiam.setText("GIẢM SỐ LƯỢNG");
        btnGiam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGiamActionPerformed(evt);
            }
        });

        btnXoaMon.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnXoaMon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/delete-1-icon.png"))); // NOI18N
        btnXoaMon.setText(" XÓA MÓN");
        btnXoaMon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaMonActionPerformed(evt);
            }
        });

        btnIn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnIn.setText("IN HÓA ĐƠN");
        btnIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInActionPerformed(evt);
            }
        });

        btnNew.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnNew.setText("LÀM MỚI HÓA ĐƠN");
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });

        btnSave.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnSave.setText("LƯU HÓA ĐƠN");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnFindKH.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnFindKH.setText("TÌM KHÁCH HÀNG");
        btnFindKH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindKHActionPerformed(evt);
            }
        });

        btnThanhToan.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnThanhToan.setText("THANH TOÁN");
        btnThanhToan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThanhToanActionPerformed(evt);
            }
        });

        btnFindHD.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnFindHD.setText("TÌM HÓA ĐƠN");
        btnFindHD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindHDActionPerformed(evt);
            }
        });

        btnUpdate.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnUpdate.setText("CẬP NHẬP HÓA ĐƠN");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnFindHD, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                            .addComponent(btnFindKH, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                            .addComponent(btnSave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnThemMon, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                            .addComponent(btnIn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnThanhToan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(btnNew, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 153, Short.MAX_VALUE)
                            .addComponent(btnTang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnXoaMon, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                            .addComponent(btnGiam, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jSeparator2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnFindHD, btnFindKH, btnIn, btnNew, btnSave, btnThanhToan, btnThemMon, btnXoaMon});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btnFindKH)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnSave)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnFindHD)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnNew)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnUpdate))
                                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btnThemMon, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnXoaMon, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnTang, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnGiam)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnThanhToan, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnIn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnFindHD, btnFindKH, btnIn, btnNew, btnSave, btnThanhToan, btnThemMon, btnUpdate, btnXoaMon});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSoDoBanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSoDoBanActionPerformed
        new SoDoBan().setVisible(true);
    }//GEN-LAST:event_btnSoDoBanActionPerformed

    private void btnHuongDanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHuongDanActionPerformed
        new HuongDan().setVisible(true);
    }//GEN-LAST:event_btnHuongDanActionPerformed

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

    private void btnFindKHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindKHActionPerformed
        tblHoaDon.clearSelection(); // Xóa focus vào bảng
        /* Cho người dùng nhập SDT cần tìm vào InputDialog và lưu vào biến soDT 
           Nếu không hợp lệ, yêu cầu nhập lại. */
//        try {
            String soDT = "";
            do {
                soDT = JOptionPane.showInputDialog(this, "Nhập số điện thoại cần tìm tại đây:");
                if(soDT == null) return; // Cancel thì soDT = null
                /* Nếu đã nhập SỐ ĐIỆN THOẠI thì kiểm tra quy tắc nhập */
                if (!CheckInput.checkEmpty(soDT, "Bạn chưa nhập SỐ ĐIỆN THOẠI cần tìm!")) {
                    if (!CheckInput.checkRegex(soDT, REGEX_SODT, "SỐ ĐIỆN THOẠI bạn nhập không hợp lệ!")) {
                        break;
                    }
                }
            } while (true);

            /* Nếu SỐ ĐIỆN THOẠI đã có trong database khách hàng thì checkDuplicate() trả về true, 
            câu lệnh bên trong if được thực thi và thoát khỏi vòng lặp */
//            String[] colsWhere = {"SoDT"};
//            if (new KhachHangDAO().checkDuplicate(colsWhere, soDT)) {
//                findCustomById(soDT);
//                System.out.println(soDT);
//            } else {
//                JOptionPane.showMessageDialog(this, "Khách hàng này là KHÁCH HÀNG MỚI!", "Lỗi",
//                        JOptionPane.WARNING_MESSAGE);
//                return;
//            }
            if(!findCustomById(soDT)) {
                JOptionPane.showMessageDialog(this, "Khách hàng này là KHÁCH HÀNG MỚI!", "Lỗi",
                        JOptionPane.WARNING_MESSAGE);
                return;
            }

//        } catch (SQLException ex) {
//            System.out.println("Lỗi: " + ex);
//        }

    }//GEN-LAST:event_btnFindKHActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnFindHDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindHDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnFindHDActionPerformed

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNewActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnThemMonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemMonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnThemMonActionPerformed

    private void btnXoaMonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaMonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnXoaMonActionPerformed

    private void btnTangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTangActionPerformed

    private void btnGiamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGiamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGiamActionPerformed

    private void btnThanhToanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThanhToanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnThanhToanActionPerformed

    private void btnInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnInActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DatMon().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBia;
    private javax.swing.JButton btnDanhMuc;
    private javax.swing.JButton btnDatMon;
    private javax.swing.JButton btnFindHD;
    private javax.swing.JButton btnFindKH;
    private javax.swing.JButton btnGiam;
    private javax.swing.JButton btnGoi;
    private javax.swing.JButton btnHaiSan;
    private javax.swing.JButton btnHuongDan;
    private javax.swing.JButton btnIn;
    private javax.swing.JButton btnKhaiVi;
    private javax.swing.JButton btnMonBo;
    private javax.swing.JButton btnMonGa;
    private javax.swing.JButton btnMonHeo;
    private javax.swing.JButton btnMonLau;
    private javax.swing.JButton btnMonRau;
    private javax.swing.JButton btnMonSup;
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnNuocEp;
    private javax.swing.JButton btnNuocNgot;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSinhTo;
    private javax.swing.JButton btnSoDoBan;
    private javax.swing.JButton btnTang;
    private javax.swing.JButton btnThanhToan;
    private javax.swing.JButton btnThemMon;
    private javax.swing.JButton btnThoat;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnXoaMon;
    private javax.swing.JComboBox<String> cboPay;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblClock;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblNhanVien;
    private javax.swing.JTable tblHoaDon;
    private javax.swing.JTable tblThucDon;
    private javax.swing.JTextField txtDiaChi;
    private javax.swing.JTextField txtHoaDon;
    private javax.swing.JTextField txtKhachHang;
    private javax.swing.JTextField txtPhiDichVu;
    private javax.swing.JTextField txtSDT;
    private javax.swing.JTextField txtThue;
    private javax.swing.JTextField txtTongTien;
    // End of variables declaration//GEN-END:variables

    @Override
    public void run() {
        while (true) {
            try {
                Date now = new Date();
                SimpleDateFormat formatterDate = new SimpleDateFormat();
                formatterDate.applyPattern("dd/MM/yyyy");
                String dateNow = formatterDate.format(now);
                lblDate.setText(dateNow);
                SimpleDateFormat formatterTime = new SimpleDateFormat();
                formatterTime.applyPattern("hh:mm:ss aa");
                String time = formatterTime.format(now);
                lblClock.setText(time);
                Thread.sleep(1000);
            } catch (Exception e) {
                break;
            }
        }
    }

    /* Định nghĩa phương thức setCols và gọi nó tại hàm tạo */
    private void setColsForHoaDon() {
        // Lấy Model của bảng được tạo bằng Swing gán vào biến toàn cục tblModel
        tblModel_HD = (DefaultTableModel) tblHoaDon.getModel();
        // Đặt tên các cột cho bảng
        String[] cols = {"Tên Món", "Số Lượng", "ĐV", "Đơn Giá", "Thành Tiền"};
        tblModel_HD.setColumnIdentifiers(cols);
        // Điều chỉnh lại chiều rộng của các cột cho bảng
        tblHoaDon.getColumn("Tên Món").setPreferredWidth(220);
        tblHoaDon.getColumn("Số Lượng").setPreferredWidth(50);
        tblHoaDon.getColumn("ĐV").setPreferredWidth(30);
        tblHoaDon.getColumn("Đơn Giá").setPreferredWidth(100);
        tblHoaDon.getColumn("Thành Tiền").setPreferredWidth(120);
    }

    /* Định nghĩa phương thức setCols và gọi nó tại hàm tạo */
    private void setColsForThucDon() {
        // Lấy Model của bảng được tạo bằng Swing gán vào biến toàn cục tblModel
        tblModel_TD = (DefaultTableModel) tblThucDon.getModel();
        // Đặt tên các cột cho bảng
        String[] cols = {"Tên Món", "ĐV", "Đơn Giá"};
        tblModel_TD.setColumnIdentifiers(cols);
        // Điều chỉnh lại chiều rộng của các cột cho bảng
        tblThucDon.getColumn("Tên Món").setPreferredWidth(220);
        tblThucDon.getColumn("ĐV").setPreferredWidth(30);
        tblThucDon.getColumn("Đơn Giá").setPreferredWidth(100);
    }

    private void createListBtn() {
        listButtonName = new HashMap<>();
        listButtonName.put(btnKhaiVi, "Khai Vị");
        listButtonName.put(btnMonSup, "Súp các loại");
        listButtonName.put(btnMonRau, "Rau theo mùa");
        listButtonName.put(btnGoi, "Gỏi & Salad");
        listButtonName.put(btnMonHeo, "Món Thịt Heo");
        listButtonName.put(btnMonBo, "Món Thịt Bò");
        listButtonName.put(btnMonGa, "Món Gà");
        listButtonName.put(btnHaiSan, "Hải Sản");
        listButtonName.put(btnMonLau, "Món Nước");
        listButtonName.put(btnBia, "Các loại bia và rượu");
        listButtonName.put(btnNuocNgot, "Các loại nước ngọt");
        listButtonName.put(btnNuocEp, "Nước ép");
        listButtonName.put(btnSinhTo, "Sinh tố");
    }

    private void loadDataToTable(JButton btn) {
        tblModel_TD.setRowCount(0);
        MainDAO monAn_LoaiMon = new MainDAO(); // Khi khai báo, chương trình đã kết nối
        String colsSelected[] = {"TenMon", "DonViHoaDon", "DonGia"};
        String colsWhere[] = {"TenLoaiMon"};
        monAn_LoaiMon.setTable("MonAn a inner join LoaiMon b on a.MaLoaiMon = b.MaLoaiMon");

        List<Object[]> list = monAn_LoaiMon.selectByItems(colsSelected, colsWhere, listButtonName.get(btn));
        for (Object[] mon : list) {
            Object[] rows = new Object[mon.length];
            for (int i = 0; i < mon.length; i++) {
                rows[i] = mon[i];
            }
            tblModel_TD.addRow(rows);
        }
    }

    private void hoaDonTuDong() {
//        /* Số hóa đơn tự động */
        HoaDonDAO hoaDon = new HoaDonDAO();
        String colsSelected[] = {"Max(MaHoaDon)"};
        String colsWhere[] = {""};
        hoaDon.setTable("HoaDon");

        List<Object[]> list = hoaDon.selectAll(colsSelected);
        for (Object[] hd : list) {
            int soHD = 0;
            for (int i = 0; i < hd.length; i++) {
                soHD = (int) hd[i] + 1;
            }
            txtHoaDon.setText(String.valueOf(soHD));
        }
        txtHoaDon.setEnabled(false);
    }

    private int findIndex(String tenMon, DefaultTableModel tblModel) {
        int idx = 0;
        Vector all = tblModel.getDataVector();
        while (idx < all.size()) {
            Vector sv = (Vector) all.elementAt(idx);
            if (sv.elementAt(0).toString().equals(tenMon)) {
                return idx;
            }
            idx++;
        }
        if (idx == all.size()) {
            JOptionPane.showMessageDialog(this, "Không tìm thấy thông tin cần tìm!");
//            this.clearJTextField();
            return 0;
        }
        return 0;
    }

    private boolean findCustomById(String soDT) {
        tblHoaDon.clearSelection();
        KhachHangDAO khachHang = new KhachHangDAO();
        String colsWhere[] = {"SoDT"};
        List<Object[]> list = khachHang.selectByItems(khachHang.getColsKhachHang(), colsWhere, soDT);
        if(list == null) return false;
        for (Object[] kh : list) {
            System.out.println(kh);
            txtKhachHang.setText((String) kh[0]);
            txtSDT.setText((String) kh[1]);
            txtDiaChi.setText((String) kh[2]);
            return true;
        }
        return false;
    }

    private boolean checkBeforeSaving() {
        // Lấy dữ liệu từ các JTextField lưu vào biến
        String hoTen = txtKhachHang.getText();
        String soDT = txtSDT.getText();
        String diaChi = txtDiaChi.getText();
        /* Nếu chưa nhập HỌ TÊN thì checkEmpty() trả về true, 
        câu lệnh bên trong if được thực thi và return khỏi phương thức */
 /* Họ Tên không cần kiểm tra biểu thức chính quy và dữ liệu trùng lặp */
        if (CheckInput.checkEmpty(hoTen, "Bạn chưa nhập HỌ TÊN cần thêm!")) {
            return true;
        }
        /* Nếu chưa nhập SỐ ĐIỆN THOẠI thì checkEmpty() trả về true, 
        câu lệnh bên trong if được thực thi và return khỏi phương thức */
        if (CheckInput.checkEmpty(soDT, "Bạn chưa nhập SỐ ĐIỆN THOẠI cần thêm!")) {
            return true;
        }
        /* Nếu SỐ ĐIỆN THOẠI không khớp với biểu thức quy định thì checkRegex() trả về true, 
        câu lệnh bên trong if được thực thi và return khỏi phương thức */
        if (CheckInput.checkRegex(soDT, REGEX_SODT, "SỐ ĐIỆN THOẠI bạn nhập không hợp lệ!")) {
            return true;
        }
        // Nếu không rơi vào trường hợp if nào hết, phương thức sẽ return false
        return false;
    }

//    private void saveData() {
//        // Tạo các biến chứa các dữ liệu được người dùng nhập vào các JTextField
//        String hoTen = txtKhachHang.getText();
//        String soDT = txtSDT.getText();
//        String diaChi = txtDiaChi.getText();
//        String maHoaDon = txtHoaDon.getText();
//
//        String ngay = lblDate.getText();
//        Date utilDate;
//        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
//
//        try {
//            utilDate = formatter.parse(ngay);
//        } catch (ParseException ex) {
//            Logger.getLogger(DatMon.class.getName()).log(Level.SEVERE, null, ex);
//            utilDate = new java.util.Date();
//        }
//        java.sql.Date ngayLapHD = new java.sql.Date(utilDate.getTime());
//
//        String hinhThucTT = (String) cboPay.getSelectedItem();
//
//        // Lưu thông tin khách hàng vào bảng khách hàng
//        // Cần thêm phần kiểm tra khách hàng đã có chưa, nếu có rồi thì không cần lưu, nếu chưa thì lưu mới vào bảng khách hàng
//        try {
//            /* Nếu SỐ ĐIỆN THOẠI đã có trong database khách hàng thì checkDuplicate() trả về true, 
//        câu lệnh bên trong if được thực thi và return khỏi phương thức */
//            if (CheckInput.checkDuplicate(soDT, con, "KhachHang", "soDT")) {
//                JOptionPane.showConfirmDialog(this, "Khách hàng cũ!");
//            } else {
//                String sql = "Insert into KhachHang values (?,?,?)";
//                Object args[] = {hoTen, soDT, diaChi};
//                int rs = prepareStatement(sql, args).executeUpdate();
//                if (!(rs > 0)) { // Nếu không có kết quả, sẽ hiện thông báo chưa được lưu
//                    JOptionPane.showMessageDialog(this, "Hóa Đơn" + txtKhachHang.getText() + " chưa được lưu!");
//                    return;
//                }
//                prepareStatement(sql, args).close();
//            }
//
//            // Lưu vào HoaDon
//            String tenNV = lblNhanVien.getText();
//            String sqlMaNV = "Select MaNV From NhanVien Where HoTenNV = ?";
//            ResultSet rs = executeQuery(sqlMaNV, tenNV);
//            String maNV = "";
//            if (rs.next()) {
//                maNV = rs.getString(1);
//            }
////            System.out.println("maNV = " + maNV);
//
//            String sqlHD = "Insert into HoaDon (NgayLapHD, HinhThucTT, MaNV, MaKH) values (?,?,?,?)";
//            Object argsHD[] = {ngayLapHD, hinhThucTT, maNV, soDT};
//            int rsHD = prepareStatement(sqlHD, argsHD).executeUpdate();
//            if (!(rsHD > 0)) {
//                JOptionPane.showMessageDialog(this, "Hóa Đơn" + txtKhachHang.getText() + " chưa được lưu!");
//                return;
//            }
//
//            // Lưu vào HoaDonChiTiet
//            String sqlHDCT = "Insert into HoaDonCT (MaHoaDon, MaMon, SoLuong, DonViTinh) values ";
//            int len = tblHoaDon.getRowCount();
//            if (len == 0) {
//                JOptionPane.showMessageDialog(this, "Hóa Đơn chưa có thông tin. Lưu thất bại!");
//                return;
//            }
//            for (int i = 0; i < len; i++) {
//                String tenMon = (String) tblHoaDon.getValueAt(i, 0);
//                String sqlMaMon = "Select MaMon From MonAn Where TenMon = ?";
//
//                ResultSet rsMaMon = executeQuery(sqlMaMon, tenMon);
//                String maMon = "";
//                if (rsMaMon.next()) {
//                    maMon = rsMaMon.getString(1);
//                }
//                System.out.println("maMon = " + maMon);
//
//                int soLuong = (int) tblHoaDon.getValueAt(i, 1);
//                String donViTinh = (String) tblHoaDon.getValueAt(i, 2);
//                sqlHDCT += String.format("('%s', '%s', %d, '%s')%c", maHoaDon, maMon, soLuong, donViTinh, (i == len - 1) ? ';' : ',');
//            }
//            int rsHDCT = prepareStatement(sqlHDCT).executeUpdate();
//
//            if ((rsHDCT > 0)) {
//                JOptionPane.showMessageDialog(this, "Hóa Đơn " + txtKhachHang.getText() + " đã được lưu!");
//            }
//            prepareStatement(sqlHD, argsHD).close();
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(this, "Lỗi:" + ex);
//            System.exit(0);
//        }
//
//        /* Kiểm tra rỗng, kiểm tra biểu thức chính quy, kiểm tra trùng lặp Mã Sinh Viên */
//        if (checkBeforeSaving()) {
//            return;
//        }
//        /* Lưu dữ liệu vào bảng “” lấy từ các JTextField 
//        và đồng thời thêm dữ liệu đó vào JTable khi form mở */
////        saveData();
//        clearJTextField();
//        hoaDonTuDong();
////    }

    

//    private void clearJTextField() {
//        // Set tất cả các TextField và table rỗng
//        tblModel_HD.setRowCount(0);
//        txtKhachHang.setText("");
//        txtSDT.setText("");
//        txtDiaChi.setText("");
////        rdoSoBan.setText("");
//        txtPhiDichVu.setText("");
//        txtThue.setText("");
//        txtTongTien.setText("");
//        txtSDT.requestFocus(); // Focus về nhập MaSV đầu tiên
//    }

    private boolean checkBeforeUpdating() {
        return false; // Nếu không rơi vào trường hợp if nào hết, phương thức sẽ return false
    }

    private void addMon() {
        index = tblThucDon.getSelectedRow(); // Trả về vị trí được chọn trong bảng
        if (index < 0) {
            JOptionPane.showMessageDialog(this, "Chưa chọn món để thêm vào!");
            return;
        }
        int soLuong = 1;
        String tenMon = tblThucDon.getValueAt(index, 0).toString();
        String donVi = tblThucDon.getValueAt(index, 1).toString();
        float donGia = (float) tblThucDon.getValueAt(index, 2);
        float thanhTien = (float) donGia * soLuong;

        for (int i = 0; i < tblHoaDon.getRowCount(); i++) {
            String testMon = (String) tblHoaDon.getValueAt(i, 0);
            if (tenMon.equals(testMon)) {
                tangSoLuong();
                return;
            }
        }
        /* Dùng addRow() để thêm dữ liệu vào JTable trên form */
        Object[] rows = {tenMon, soLuong, donVi, donGia, thanhTien};
        tblModel_HD.addRow(rows);
        int idx = findIndex(tenMon, tblModel_HD);
        tblHoaDon.setRowSelectionInterval(idx, idx);
        btnXoaMon.setEnabled(true);
        btnTang.setEnabled(true);
        btnGiam.setEnabled(true);
        btnThanhToan.setEnabled(true);
        tongHoaDon();
    }

    private void xoaMon() {
        int idx = tblHoaDon.getSelectedRow();
        System.out.println("First: " + idx);
        if (idx >= 0) {
            tblModel_HD.removeRow(idx); // Xóa khỏi JTable trên form
            if (idx >= 0) {
                --idx;
            }
            if (idx >= 0) {
                System.out.println("kq" + idx);
                tblHoaDon.setRowSelectionInterval(idx, idx);
            } else {
                btnXoaMon.setEnabled(false);
                btnTang.setEnabled(false);
                btnGiam.setEnabled(false);
            }
        }
        tongHoaDon();
    }

    private void tongHoaDon() {
        float sum = 0;
        for (int i = 0; i < tblHoaDon.getRowCount(); i++) {
            sum = sum + (float) tblHoaDon.getValueAt(i, 4);
        }
        txtPhiDichVu.setText(String.valueOf(sum * 0.05));
        txtThue.setText(String.valueOf(sum * 0.1));
        txtTongTien.setText(String.valueOf(sum * 0.05 + sum * 0.1 + sum));
    }

    private void tangSoLuong() {
        int i = tblHoaDon.getSelectedRow();
        int soLuong = (int) tblHoaDon.getValueAt(i, 1) + 1;
        tblHoaDon.setValueAt(soLuong, i, 1);

        float donGia = (float) tblHoaDon.getValueAt(i, 3);
        float thanhTien = (float) donGia * soLuong;
        tblHoaDon.setValueAt(thanhTien, i, 4);
        tongHoaDon();
    }

    private void giamSoLuong() {
        int i = tblHoaDon.getSelectedRow();
        int soLuong = (int) tblHoaDon.getValueAt(i, 1);
        if (soLuong > 1) {
            soLuong = soLuong - 1;
        }
        tblHoaDon.setValueAt(soLuong, i, 1);

        float donGia = (float) tblHoaDon.getValueAt(i, 3);
        float thanhTien = (float) donGia * soLuong;
        tblHoaDon.setValueAt(thanhTien, i, 4);

        tongHoaDon();
    }

    private void exitForm() {
//
//        // LÀM PHẦN KHÁCH HÀNG TRƯỚC - SẼ THAY DỔI THÀNH HÓA ĐƠN SAU
//        int save = 0, thoat = 0;
//        // Nếu txtMaKH không có dữ liệu, Đưa ra câu hỏi yêu cầu người dùng xác nhận có chắc chắn thoát hay không? 
//        if (txtSDT.getText().equals("")) {
//            thoat = (JOptionPane.showConfirmDialog(this, "Bạn có chắc chắn muốn thoát?", "Xác nhận", JOptionPane.YES_NO_OPTION));
//            // Nếu người dụng chọn Yes, gọi phương thức exit(0) để thoát chương trình
//            if (thoat == JOptionPane.YES_OPTION) {
//                backToLogin();
//            }
//        } else {
//            // Ngược lại, nếu txtMaKH có dữ liệu, hỏi người dùng có cần lưu lại không? 
//            save = (JOptionPane.showConfirmDialog(this, "Bạn chưa lưu dữ liệu, bạn có muốn lưu lại và thoát?",
//                    "Xác nhận", JOptionPane.YES_NO_OPTION));
//
//            /* Nếu người dùng chọn Yes thì gọi phương thức kiểm tra trùng lặp, nếu trùng lặp thì update, 
//               nếu không thì lưu thông tin khách hàng mới và thoát chương trình */
//            if (save == JOptionPane.YES_OPTION) {
//                if (CheckInput.checkDuplicate(txtSDT.getText(), con, "KhachHang", "MaKH")) {
////                    this.update();
//                } else {
//                    this.saveData();
//                }
//                backToLogin();
//            }
//        }
    }

    private void backToLogin() {
        // Đóng QuanLySinhVien => Mở LogIn
//        Login_Form login = new Login_Form();
//        login.setVisible(true);
        this.dispose();
    }

}
