package View;

import CT.CheckInput;
import Dao.CaTrucDAO;
import Dao.ChucVuDAO;
import Dao.LoaiNguyenLieuDAO;
import Dao.NguyenlieuDAO;
import Dao.NhanVienDAO;
import Helper.MsgBox;
import Model.CaTruc;
import Model.ChucVu;
import Model.LoaiNgLieu;
import Model.NguyenLieu;
import Model.NhanVien;
import java.awt.Color;
import java.awt.HeadlessException;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class ThemMoi extends javax.swing.JFrame {

    public ThemMoi() {
        initComponents();
        this.setLocationRelativeTo(null);
        mnThemmoi.setForeground(Color.red);
        mnThemmoi.setBackground(Color.yellow);
        init();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        tabpnlQuanLy = new javax.swing.JTabbedPane();
        pnlNhanvien = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtmanhanvien = new javax.swing.JTextField();
        txthovaten = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        rdonam = new javax.swing.JRadioButton();
        rdonu = new javax.swing.JRadioButton();
        txtsodienthoai = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtdiachi = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        cbochucvu = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        cbocatruc = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        txtluong = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtpassword = new javax.swing.JTextField();
        jPanel9 = new javax.swing.JPanel();
        btnlammoinhanvien = new javax.swing.JButton();
        btnchinhsuanhanvien = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        btndoimoinhanvien = new javax.swing.JButton();
        btnxoanhanvien = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        txttimkiem = new javax.swing.JTextField();
        btntimkiemnhanvien = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtmanguyenlieu = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txttennguyenlieu = new javax.swing.JTextField();
        txtsoluong = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtdonvitinh = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        CboLoaiNguyenLieu = new javax.swing.JComboBox<>();
        jPanel11 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        btnlammoinguyenlieu = new javax.swing.JButton();
        btndoimoinguyenlieu = new javax.swing.JButton();
        btnxoanguyenlieu = new javax.swing.JButton();
        btnchinhsuanguyenlieu = new javax.swing.JButton();
        jPanel12 = new javax.swing.JPanel();
        txttimkiemnguyenlieu = new javax.swing.JTextField();
        btntimkiemnguyenlieu = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnDanhmuc = new javax.swing.JMenu();
        mnThemmoi = new javax.swing.JMenu();
        mnThongke = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Quản Lý Nhà Hàng");
        setName(""); // NOI18N
        setResizable(false);
        setSize(new java.awt.Dimension(721, 406));

        tabpnlQuanLy.setBackground(new java.awt.Color(255, 220, 126));
        tabpnlQuanLy.setMaximumSize(new java.awt.Dimension(546, 332));
        tabpnlQuanLy.setMinimumSize(new java.awt.Dimension(546, 332));

        pnlNhanvien.setBackground(new java.awt.Color(255, 220, 126));

        jPanel8.setBackground(new java.awt.Color(255, 220, 126));

        jLabel5.setText("Mã nhân viên");

        jLabel9.setText("Họ và tên");

        buttonGroup1.add(rdonam);
        rdonam.setSelected(true);
        rdonam.setText("Nam");

        buttonGroup1.add(rdonu);
        rdonu.setText("Nữ");

        jLabel12.setText("Số điện thoại");

        jLabel13.setText("Địa chỉ");

        jLabel14.setText("Mã chức vụ");

        cbochucvu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbochucvuActionPerformed(evt);
            }
        });

        jLabel15.setText("Mã ca trực");

        cbocatruc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbocatrucActionPerformed(evt);
            }
        });

        jLabel16.setText("Lương");

        jLabel17.setText("Password");

        jPanel9.setBackground(new java.awt.Color(255, 220, 126));

        btnlammoinhanvien.setBackground(new java.awt.Color(51, 153, 255));
        btnlammoinhanvien.setText("Làm mới");
        btnlammoinhanvien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlammoinhanvienActionPerformed(evt);
            }
        });

        btnchinhsuanhanvien.setBackground(new java.awt.Color(51, 153, 255));
        btnchinhsuanhanvien.setText("Chỉnh sửa");
        btnchinhsuanhanvien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnchinhsuanhanvienActionPerformed(evt);
            }
        });

        jLabel18.setText("Hình ảnh");

        btndoimoinhanvien.setBackground(new java.awt.Color(51, 153, 255));
        btndoimoinhanvien.setText("Đổi mới");
        btndoimoinhanvien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndoimoinhanvienActionPerformed(evt);
            }
        });

        btnxoanhanvien.setBackground(new java.awt.Color(51, 153, 255));
        btnxoanhanvien.setText("Xóa");
        btnxoanhanvien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnxoanhanvienActionPerformed(evt);
            }
        });

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 185, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addComponent(jLabel18)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(btnlammoinhanvien, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addComponent(btndoimoinhanvien, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(btnchinhsuanhanvien, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnxoanhanvien, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel18)
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnlammoinhanvien)
                    .addComponent(btndoimoinhanvien))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnxoanhanvien)
                    .addComponent(btnchinhsuanhanvien)))
        );

        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btntimkiemnhanvien.setText("Tìm Kiếm");
        btntimkiemnhanvien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntimkiemnhanvienActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(btntimkiemnhanvien, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txttimkiem, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(btntimkiemnhanvien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txttimkiem, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel15))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtdiachi, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbocatruc, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbochucvu, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtmanhanvien, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txthovaten, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel8Layout.createSequentialGroup()
                                        .addComponent(rdonam)
                                        .addGap(39, 39, 39)
                                        .addComponent(rdonu))))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtsodienthoai, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtluong, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(159, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtmanhanvien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txthovaten, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rdonam)
                            .addComponent(rdonu))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(txtsodienthoai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtdiachi, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbochucvu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbocatruc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15)))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel16)
                        .addComponent(txtluong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(txtpassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(232, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlNhanvienLayout = new javax.swing.GroupLayout(pnlNhanvien);
        pnlNhanvien.setLayout(pnlNhanvienLayout);
        pnlNhanvienLayout.setHorizontalGroup(
            pnlNhanvienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNhanvienLayout.createSequentialGroup()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 28, Short.MAX_VALUE))
        );
        pnlNhanvienLayout.setVerticalGroup(
            pnlNhanvienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlNhanvienLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        tabpnlQuanLy.addTab("Nhân Viên", pnlNhanvien);

        jPanel3.setBackground(new java.awt.Color(255, 220, 126));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 837, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 685, Short.MAX_VALUE)
        );

        tabpnlQuanLy.addTab("Món Ăn", jPanel3);

        jPanel4.setBackground(new java.awt.Color(255, 220, 126));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 837, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 685, Short.MAX_VALUE)
        );

        tabpnlQuanLy.addTab("Công Thức", jPanel4);

        jPanel5.setBackground(new java.awt.Color(255, 220, 126));

        jPanel10.setBackground(new java.awt.Color(255, 220, 126));

        jLabel1.setText("Mã Nguyên Liệu");

        jLabel2.setText("Tên Nguyên Liệu");

        jLabel3.setText("Đơn Vị Tính");

        jLabel6.setText("Số Lượng");

        jLabel7.setText("Loại Nguyên Liệu");

        jPanel11.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel11MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 192, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel8.setText("Hình ảnh");

        btnlammoinguyenlieu.setBackground(new java.awt.Color(51, 153, 255));
        btnlammoinguyenlieu.setText("Làm mới");
        btnlammoinguyenlieu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlammoinguyenlieuActionPerformed(evt);
            }
        });

        btndoimoinguyenlieu.setBackground(new java.awt.Color(51, 153, 255));
        btndoimoinguyenlieu.setText("Đổi mới");
        btndoimoinguyenlieu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndoimoinguyenlieuActionPerformed(evt);
            }
        });

        btnxoanguyenlieu.setBackground(new java.awt.Color(51, 153, 255));
        btnxoanguyenlieu.setText("Xóa");
        btnxoanguyenlieu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnxoanguyenlieuActionPerformed(evt);
            }
        });

        btnchinhsuanguyenlieu.setBackground(new java.awt.Color(51, 153, 255));
        btnchinhsuanguyenlieu.setText("Chỉnh sửa");
        btnchinhsuanguyenlieu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnchinhsuanguyenlieuActionPerformed(evt);
            }
        });

        jPanel12.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btntimkiemnguyenlieu.setText("Tìm Kiếm");
        btntimkiemnguyenlieu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntimkiemnguyenlieuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addComponent(btntimkiemnguyenlieu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txttimkiemnguyenlieu, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(btntimkiemnguyenlieu)
                .addComponent(txttimkiemnguyenlieu, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtmanguyenlieu)
                    .addComponent(txttennguyenlieu, javax.swing.GroupLayout.DEFAULT_SIZE, 296, Short.MAX_VALUE)
                    .addComponent(txtdonvitinh, javax.swing.GroupLayout.DEFAULT_SIZE, 296, Short.MAX_VALUE)
                    .addComponent(txtsoluong, javax.swing.GroupLayout.DEFAULT_SIZE, 296, Short.MAX_VALUE)
                    .addComponent(CboLoaiNguyenLieu, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(btnlammoinguyenlieu, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btndoimoinguyenlieu, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(btnchinhsuanguyenlieu, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnxoanguyenlieu, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(jLabel8)))
                .addContainerGap(232, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(txtmanguyenlieu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(txttennguyenlieu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(txtdonvitinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(26, 26, 26)
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(txtsoluong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(CboLoaiNguyenLieu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(192, 192, 192)
                        .addComponent(jLabel8)))
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnlammoinguyenlieu)
                    .addComponent(btndoimoinguyenlieu))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnxoanguyenlieu)
                    .addComponent(btnchinhsuanguyenlieu))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(352, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 853, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 685, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        tabpnlQuanLy.addTab("Nguyên Liệu", jPanel5);

        jPanel6.setBackground(new java.awt.Color(255, 220, 126));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 837, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 685, Short.MAX_VALUE)
        );

        tabpnlQuanLy.addTab("Phiếu Nhập", jPanel6);

        jPanel7.setBackground(new java.awt.Color(255, 220, 126));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 837, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 685, Short.MAX_VALUE)
        );

        tabpnlQuanLy.addTab("Ca Trực", jPanel7);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 51, 51));

        jMenuBar1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jMenuBar1.setMaximumSize(new java.awt.Dimension(710, 29));
        jMenuBar1.setMinimumSize(new java.awt.Dimension(710, 29));
        jMenuBar1.setPreferredSize(new java.awt.Dimension(710, 29));

        mnDanhmuc.setText("Danh Mục");
        jMenuBar1.add(mnDanhmuc);

        mnThemmoi.setBackground(new java.awt.Color(0, 102, 255));
        mnThemmoi.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        mnThemmoi.setForeground(new java.awt.Color(255, 255, 255));
        mnThemmoi.setText("Thêm Mới");
        jMenuBar1.add(mnThemmoi);

        mnThongke.setText("Thống Kê");
        mnThongke.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jMenuBar1.add(mnThongke);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Button-exit-icon.png"))); // NOI18N
        jMenu2.setText("Thoát");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tabpnlQuanLy, javax.swing.GroupLayout.PREFERRED_SIZE, 858, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(tabpnlQuanLy, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        tabpnlQuanLy.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbochucvuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbochucvuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbochucvuActionPerformed

    private void cbocatrucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbocatrucActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbocatrucActionPerformed

    private void btnlammoinhanvienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlammoinhanvienActionPerformed
        this.newNV();
    }//GEN-LAST:event_btnlammoinhanvienActionPerformed

    private void btnchinhsuanhanvienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnchinhsuanhanvienActionPerformed
//        if (tblnhanvien.getSelectedRow() < 0) {
//            JOptionPane.showMessageDialog(this, "chưa có dữ liệu");
//        } else {
//            this.updateNV();
//        }
    }//GEN-LAST:event_btnchinhsuanhanvienActionPerformed

    private void btndoimoinhanvienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndoimoinhanvienActionPerformed
        if (CheckInput.checkEmpty(txtmanhanvien.getText(), "chưa nhập nhân viên") == false) {
            if (CheckInput.checkEmpty(txthovaten.getText(), "chưa họ tên") == false) {
                if (CheckInput.checkEmpty(txtsodienthoai.getText(), "chưa nhập số điện thoại") == false) {
                    if (CheckInput.checkEmpty(txtdiachi.getText(), "chưa nhập  địa chỉ") == false) {
                        if (CheckInput.checkEmpty(txtluong.getText(), "chưa nhập lương") == false) {
                            if (CheckInput.checkEmpty(txtluong.getText(), "chưa nhập lương") == false) {
                                if (CheckInput.checkEmpty(txtpassword.getText(), "chưa nhập password") == false) {
                                    this.insertNV();
                                }
                            }
                        }
                    }
                }

            }

        }


    }//GEN-LAST:event_btndoimoinhanvienActionPerformed

    private void btnxoanhanvienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnxoanhanvienActionPerformed
        this.deteleNV();
    }//GEN-LAST:event_btnxoanhanvienActionPerformed

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
        JOptionPane.showMessageDialog(this, " Đang phát triển");
    }//GEN-LAST:event_jPanel1MouseClicked

    private void btntimkiemnhanvienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntimkiemnhanvienActionPerformed

        NhanVien nv = new NhanVien();
        maNV = txttimkiem.getText();
        nv = Dao.selectById(maNV);
        if (nv == null) {
            JOptionPane.showMessageDialog(this, "không tìm thâý");
            this.newNV();

        } else {
            if (nv.getMaNV().equalsIgnoreCase(maNV)) {
                txtmanhanvien.setText(nv.getMaNV());
                txthovaten.setText(nv.getHoTen());
                txtsodienthoai.setText(nv.getsDt());
                if (nv.getGioiTinh()) {
                    rdonam.setSelected(true);
                } else {
                    rdonu.setSelected(true);
                }
                cbocatruc.setSelectedItem(nv.getMaCatruc());
                cbochucvu.setSelectedItem(nv.getMaCv());
                txtdiachi.setText(nv.getDiaChi());
                txtpassword.setText(nv.getMatKhau());
                txtluong.setText(String.valueOf(nv.getLuong()));
                btnchinhsuanhanvien.setEnabled(true);
                btnxoanhanvien.setEnabled(true);
                txtmanhanvien.setEnabled(false);
            }
    }//GEN-LAST:event_btntimkiemnhanvienActionPerformed
    }
    private void btnlammoinguyenlieuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlammoinguyenlieuActionPerformed
        this.newNGuyenLieu();
    }//GEN-LAST:event_btnlammoinguyenlieuActionPerformed

    private void btndoimoinguyenlieuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndoimoinguyenlieuActionPerformed

        if (CheckInput.checkEmpty(txtmanguyenlieu.getText(), "chưa nhập mã nguyên liệu") == false) {
            if (CheckInput.checkEmpty(txttennguyenlieu.getText(), "chưa nhập tên nguyên liệu") == false) {
                if (CheckInput.checkEmpty(txtdonvitinh.getText(), "chưa nhập đơn vị tính") == false) {
                    if (CheckInput.checkEmpty(txtsoluong.getText(), "chưa nhập lương") == false) {
                        this.insertNguyenLieu();
                    }
                }

            }

        }

    }//GEN-LAST:event_btndoimoinguyenlieuActionPerformed

    private void btnxoanguyenlieuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnxoanguyenlieuActionPerformed
        this.deteleNL();
    }//GEN-LAST:event_btnxoanguyenlieuActionPerformed

    private void btnchinhsuanguyenlieuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnchinhsuanguyenlieuActionPerformed
        this.updateNL();
    }//GEN-LAST:event_btnchinhsuanguyenlieuActionPerformed
    String maNL;
    private void btntimkiemnguyenlieuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntimkiemnguyenlieuActionPerformed
        NguyenLieu nl = new NguyenLieu();
        maNL = txttimkiemnguyenlieu.getText();
        nl = DaoNL.selectById(maNL);
        if (nl == null) {
            JOptionPane.showMessageDialog(this, "không tìm thâý");
            this.newNGuyenLieu();

        } else {
            if (nl.getManguyenlieu().equalsIgnoreCase(maNL)) {
                txtmanguyenlieu.setText(nl.getManguyenlieu());
                txttennguyenlieu.setText(nl.getTenNguyenLieu());
                txtdonvitinh.setText(nl.getDonvitinh());
                txtdiachi.setText(nl.getSoluong());
                txtsoluong.setText(nl.getSoluong());
                CboLoaiNguyenLieu.setSelectedItem(nl.getMaloainguyenlieu());
            }
        }
    }//GEN-LAST:event_btntimkiemnguyenlieuActionPerformed

    private void jPanel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel11MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel11MouseClicked
    String maNV;

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ThemMoi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CboLoaiNguyenLieu;
    private javax.swing.JButton btnchinhsuanguyenlieu;
    private javax.swing.JButton btnchinhsuanhanvien;
    private javax.swing.JButton btndoimoinguyenlieu;
    private javax.swing.JButton btndoimoinhanvien;
    private javax.swing.JButton btnlammoinguyenlieu;
    private javax.swing.JButton btnlammoinhanvien;
    private javax.swing.JButton btntimkiemnguyenlieu;
    private javax.swing.JButton btntimkiemnhanvien;
    private javax.swing.JButton btnxoanguyenlieu;
    private javax.swing.JButton btnxoanhanvien;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbocatruc;
    private javax.swing.JComboBox<String> cbochucvu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JMenu mnDanhmuc;
    private javax.swing.JMenu mnThemmoi;
    private javax.swing.JMenu mnThongke;
    private javax.swing.JPanel pnlNhanvien;
    private javax.swing.JRadioButton rdonam;
    private javax.swing.JRadioButton rdonu;
    private javax.swing.JTabbedPane tabpnlQuanLy;
    private javax.swing.JTextField txtdiachi;
    private javax.swing.JTextField txtdonvitinh;
    private javax.swing.JTextField txthovaten;
    private javax.swing.JTextField txtluong;
    private javax.swing.JTextField txtmanguyenlieu;
    private javax.swing.JTextField txtmanhanvien;
    private javax.swing.JTextField txtpassword;
    private javax.swing.JTextField txtsodienthoai;
    private javax.swing.JTextField txtsoluong;
    private javax.swing.JTextField txttennguyenlieu;
    private javax.swing.JTextField txttimkiem;
    private javax.swing.JTextField txttimkiemnguyenlieu;
    // End of variables declaration//GEN-END:variables
 void init() {
        fillComboBoxChucVu();
        fillComboBoxCatruc();
        fillComboBoxMaloaiNLNL();
        this.newNV();
        this.newNGuyenLieu();
    }

    void newNGuyenLieu() {
        txtmanguyenlieu.setText("");
        txttennguyenlieu.setText("");
        txtsoluong.setText("");
        txtdonvitinh.setText("");
        btnchinhsuanguyenlieu.setEnabled(false);
        btnxoanguyenlieu.setEnabled(false);

    }
    NguyenlieuDAO DaoNL = new NguyenlieuDAO();

    void insertNguyenLieu() {
        NguyenLieu model = getFormNL();
        NguyenLieu nl = DaoNL.selectById(model.getManguyenlieu());
        if (nl == null) {
           try {
            DaoNL.insert(model);
            MsgBox.alert(this, "Thêm mới thành công!");
        } catch (HeadlessException e) {
            MsgBox.alert(this, "Thêm mới thất bại!");
        }    
        }else{
        JOptionPane.showMessageDialog(this, "Trùng mã Nguyên Liệu");
        }
    }
 
    NguyenLieu getFormNL() {
        NguyenLieu nl = new NguyenLieu();
        nl.setManguyenlieu(txtmanguyenlieu.getText());
        nl.setTenNguyenLieu(txttennguyenlieu.getText());
        nl.setSoluong(txtsoluong.getText());
        nl.setDonvitinh(txtdonvitinh.getText());
        nl.setMaloainguyenlieu((String) CboLoaiNguyenLieu.getSelectedItem());
        return nl;
    }
    LoaiNguyenLieuDAO DAONL = new LoaiNguyenLieuDAO();

    void fillComboBoxMaloaiNLNL() {
        DefaultComboBoxModel model = (DefaultComboBoxModel) CboLoaiNguyenLieu.getModel();
        model.removeAllElements();
        List<LoaiNgLieu> list = DAONL.selectAll();
        for (LoaiNgLieu nl : list) {
            model.addElement(nl.getMaLoaiNguyenLieu());
        }
    }

    void updateNL() {
        NguyenLieu model = getFormNL();
        try {
            DaoNL.update(model);
            MsgBox.alert(this, "Cập nhật thành công!");
        } catch (Exception e) {
            MsgBox.alert(this, "Cập nhật thất bại!");
        }
    }

    private void deteleNL() {
        String maNL = txtmanguyenlieu.getText();
        try {
            DaoNL.delete(maNL);
            this.newNGuyenLieu();
            MsgBox.alert(this, "Xóa thành công!");
        } catch (Exception e) {
            MsgBox.alert(this, "Xóa thất bại!");
        }
    }
    //-------------------------------------------------------------------------

    void newNV() {
        fillComboBoxChucVu();
        btnchinhsuanhanvien.setEnabled(false);
        btnxoanhanvien.setEnabled(false);
        txtmanhanvien.setEnabled(true);
        txtmanhanvien.setText("");
        txthovaten.setText("");
        rdonam.isSelected();
        txtsodienthoai.setText("");
        txtdiachi.setText("");
        txtpassword.setText("");
        txtluong.setText("");
    }
    ChucVuDAO cvdao = new ChucVuDAO();

    void fillComboBoxChucVu() {
        DefaultComboBoxModel model = (DefaultComboBoxModel) cbochucvu.getModel();
        model.removeAllElements();
        List<ChucVu> list = cvdao.selectAll();
        model.addElement("Chưa chọn");
        for (ChucVu cv : list) {
            model.addElement(cv.getMaCV());
        }
    }
    CaTrucDAO ctdao = new CaTrucDAO();

    void fillComboBoxCatruc() {
        DefaultComboBoxModel model = (DefaultComboBoxModel) cbocatruc.getModel();
        model.removeAllElements();
        List<CaTruc> list = ctdao.selectAll();
        model.addElement("Chưa chọn");
        for (CaTruc ct : list) {
            model.addElement(ct.getMacaTruc());
        }
    }
    NhanVienDAO Dao = new NhanVienDAO();

    void insertNV() {
        NhanVien model = getFormNV();
        NhanVien nv = Dao.selectById(model.getMaNV());
        if (nv == null) {
            try {
                Dao.insert(model);

                MsgBox.alert(this, "Thêm mới thành công!");
            } catch (HeadlessException e) {
                MsgBox.alert(this, "Thêm mới thất bại!");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Trùng mã nhân viên");
        }

    }

    NhanVien getFormNV() {
        NhanVien nv = new NhanVien();
        nv.setMaNV(txtmanhanvien.getText());
        nv.setHoTen(txthovaten.getText());
        nv.setGioiTinh(rdonam.isSelected());
        nv.setsDt(txtsodienthoai.getText());
        nv.setDiaChi(txtdiachi.getText());
        nv.setMaCv((String) cbochucvu.getSelectedItem());
        nv.setMaCatruc((String) cbocatruc.getSelectedItem());
        nv.setMatKhau(txtpassword.getText());
        nv.setLuong(Double.valueOf(txtluong.getText()));

        return nv;
    }

    void updateNV() {
        NhanVien model = getFormNV();
        try {
            Dao.update(model);

            MsgBox.alert(this, "Cập nhật thành công!");
        } catch (Exception e) {
            MsgBox.alert(this, "Cập nhật thất bại!");
        }
    }

    private void deteleNV() {
        String macd = txtmanhanvien.getText();
        try {
            Dao.delete(macd);
            this.newNV();
            MsgBox.alert(this, "Xóa thành công!");
        } catch (Exception e) {
            MsgBox.alert(this, "Xóa thất bại!");
        }
    }
}
