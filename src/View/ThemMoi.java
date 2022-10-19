package View;


import Dao.CaTrucDAO;
import Dao.ChucVuDAO;
import Dao.LoaiNguyenLieuDAO;
import Dao.NguyenlieuDAO;
import Dao.NhanVienDAO;
import Helper.CheckInput;
import Helper.MsgBox;
import Model.CaTruc;
import Model.ChucVu;
import Model.LoaiNgLieu;
import Model.NguyenLieu;
import Model.NhanVien;
import com.sun.jdi.DoubleValue;
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
        jLabel18 = new javax.swing.JLabel();
        btndoimoinhanvien = new javax.swing.JButton();
        btnchinhsuanhanvien = new javax.swing.JButton();
        btnxoanhanvien = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        txttimkiem = new javax.swing.JTextField();
        btntimkiemnhanvien = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jPanel25 = new javax.swing.JPanel();
        jLabel53 = new javax.swing.JLabel();
        txtmanhanvien5 = new javax.swing.JTextField();
        txthovaten5 = new javax.swing.JTextField();
        jLabel54 = new javax.swing.JLabel();
        txtsodienthoai5 = new javax.swing.JTextField();
        jLabel55 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        cbochucvu5 = new javax.swing.JComboBox<>();
        jLabel58 = new javax.swing.JLabel();
        cbocatruc5 = new javax.swing.JComboBox<>();
        jLabel59 = new javax.swing.JLabel();
        txtluong5 = new javax.swing.JTextField();
        jLabel60 = new javax.swing.JLabel();
        txtpassword5 = new javax.swing.JTextField();
        jPanel26 = new javax.swing.JPanel();
        btnlammoinhanvien5 = new javax.swing.JButton();
        btndoimoinhanvien5 = new javax.swing.JButton();
        btnchinhsuanhanvien5 = new javax.swing.JButton();
        btnxoanhanvien5 = new javax.swing.JButton();
        jPanel27 = new javax.swing.JPanel();
        txttimkiem5 = new javax.swing.JTextField();
        btntimkiemnhanvien5 = new javax.swing.JButton();
        jLabel61 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        txtmanhanvien1 = new javax.swing.JTextField();
        txthovaten1 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        rdonam1 = new javax.swing.JRadioButton();
        rdonu1 = new javax.swing.JRadioButton();
        txtsodienthoai1 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        txtdiachi1 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        cbochucvu1 = new javax.swing.JComboBox<>();
        jLabel22 = new javax.swing.JLabel();
        cbocatruc1 = new javax.swing.JComboBox<>();
        jLabel23 = new javax.swing.JLabel();
        txtluong1 = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        txtpassword1 = new javax.swing.JTextField();
        jPanel14 = new javax.swing.JPanel();
        btnlammoinhanvien1 = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        btndoimoinhanvien1 = new javax.swing.JButton();
        btnchinhsuanhanvien1 = new javax.swing.JButton();
        btnxoanhanvien1 = new javax.swing.JButton();
        jPanel15 = new javax.swing.JPanel();
        txttimkiem1 = new javax.swing.JTextField();
        btntimkiemnhanvien1 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jPanel28 = new javax.swing.JPanel();
        btnlammoinhanvien6 = new javax.swing.JButton();
        jLabel62 = new javax.swing.JLabel();
        btndoimoinhanvien6 = new javax.swing.JButton();
        btnchinhsuanhanvien6 = new javax.swing.JButton();
        btnxoanhanvien6 = new javax.swing.JButton();
        jPanel29 = new javax.swing.JPanel();
        txttimkiem6 = new javax.swing.JTextField();
        btntimkiemnhanvien6 = new javax.swing.JButton();
        jPanel30 = new javax.swing.JPanel();
        jLabel63 = new javax.swing.JLabel();
        txtmanhanvien6 = new javax.swing.JTextField();
        txthovaten6 = new javax.swing.JTextField();
        jLabel64 = new javax.swing.JLabel();
        rdonam6 = new javax.swing.JRadioButton();
        rdonu6 = new javax.swing.JRadioButton();
        txtsodienthoai6 = new javax.swing.JTextField();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        txtdiachi6 = new javax.swing.JTextField();
        jLabel67 = new javax.swing.JLabel();
        cbochucvu6 = new javax.swing.JComboBox<>();
        jLabel68 = new javax.swing.JLabel();
        cbocatruc6 = new javax.swing.JComboBox<>();
        jLabel69 = new javax.swing.JLabel();
        txtluong6 = new javax.swing.JTextField();
        jLabel70 = new javax.swing.JLabel();
        txtpassword6 = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jPanel19 = new javax.swing.JPanel();
        jLabel35 = new javax.swing.JLabel();
        txtmanhanvien3 = new javax.swing.JTextField();
        txthovaten3 = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        rdonam3 = new javax.swing.JRadioButton();
        rdonu3 = new javax.swing.JRadioButton();
        txtsodienthoai3 = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        txtdiachi3 = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        cbochucvu3 = new javax.swing.JComboBox<>();
        jLabel40 = new javax.swing.JLabel();
        cbocatruc3 = new javax.swing.JComboBox<>();
        jLabel41 = new javax.swing.JLabel();
        txtluong3 = new javax.swing.JTextField();
        jLabel42 = new javax.swing.JLabel();
        txtpassword3 = new javax.swing.JTextField();
        jPanel20 = new javax.swing.JPanel();
        btnlammoinhanvien3 = new javax.swing.JButton();
        jLabel43 = new javax.swing.JLabel();
        btndoimoinhanvien3 = new javax.swing.JButton();
        btnchinhsuanhanvien3 = new javax.swing.JButton();
        btnxoanhanvien3 = new javax.swing.JButton();
        jPanel21 = new javax.swing.JPanel();
        txttimkiem3 = new javax.swing.JTextField();
        btntimkiemnhanvien3 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        txtmanhanvien2 = new javax.swing.JTextField();
        txthovaten2 = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        rdonam2 = new javax.swing.JRadioButton();
        rdonu2 = new javax.swing.JRadioButton();
        txtsodienthoai2 = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        txtdiachi2 = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        cbochucvu2 = new javax.swing.JComboBox<>();
        jLabel31 = new javax.swing.JLabel();
        cbocatruc2 = new javax.swing.JComboBox<>();
        jLabel32 = new javax.swing.JLabel();
        txtluong2 = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        txtpassword2 = new javax.swing.JTextField();
        jPanel17 = new javax.swing.JPanel();
        btnlammoinhanvien2 = new javax.swing.JButton();
        jLabel34 = new javax.swing.JLabel();
        btndoimoinhanvien2 = new javax.swing.JButton();
        btnchinhsuanhanvien2 = new javax.swing.JButton();
        btnxoanhanvien2 = new javax.swing.JButton();
        jPanel18 = new javax.swing.JPanel();
        txttimkiem2 = new javax.swing.JTextField();
        btntimkiemnhanvien2 = new javax.swing.JButton();
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

        tabpnlQuanLy.setBackground(new java.awt.Color(255, 255, 204));
        tabpnlQuanLy.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
        tabpnlQuanLy.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tabpnlQuanLy.setMaximumSize(new java.awt.Dimension(546, 332));
        tabpnlQuanLy.setMinimumSize(new java.awt.Dimension(546, 332));

        pnlNhanvien.setBackground(new java.awt.Color(255, 255, 204));

        jPanel8.setBackground(new java.awt.Color(255, 220, 126));

        jLabel5.setText("Mã nhân viên");

        jLabel9.setText("Họ và tên");

        rdonam.setSelected(true);
        rdonam.setText("Nam");

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

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGap(0, 20, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtsodienthoai)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(rdonam)
                        .addGap(39, 39, 39)
                        .addComponent(rdonu))
                    .addComponent(txthovaten)
                    .addComponent(cbocatruc, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbochucvu, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtdiachi, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtluong)
                    .addComponent(txtmanhanvien, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );

        jPanel8Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtdiachi, txthovaten, txtluong, txtmanhanvien, txtpassword, txtsodienthoai});

        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtmanhanvien, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txthovaten, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdonam)
                    .addComponent(rdonu))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtsodienthoai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtdiachi, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbochucvu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbocatruc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(txtluong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(txtpassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31))
        );

        jPanel8Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txthovaten, txtluong, txtmanhanvien, txtpassword, txtsodienthoai});

        jPanel9.setBackground(new java.awt.Color(255, 255, 204));

        btnlammoinhanvien.setBackground(new java.awt.Color(51, 153, 255));
        btnlammoinhanvien.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnlammoinhanvien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/new-32.png"))); // NOI18N
        btnlammoinhanvien.setText("Làm mới");
        btnlammoinhanvien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlammoinhanvienActionPerformed(evt);
            }
        });

        jLabel18.setBackground(new java.awt.Color(204, 204, 204));
        jLabel18.setForeground(new java.awt.Color(255, 51, 51));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Hình ảnh");
        jLabel18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btndoimoinhanvien.setBackground(new java.awt.Color(51, 153, 255));
        btndoimoinhanvien.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btndoimoinhanvien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/add-user-3-32.png"))); // NOI18N
        btndoimoinhanvien.setText("Thêm");
        btndoimoinhanvien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndoimoinhanvienActionPerformed(evt);
            }
        });

        btnchinhsuanhanvien.setBackground(new java.awt.Color(51, 153, 255));
        btnchinhsuanhanvien.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnchinhsuanhanvien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/available-updates-32.png"))); // NOI18N
        btnchinhsuanhanvien.setText("Chỉnh sửa");
        btnchinhsuanhanvien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnchinhsuanhanvienActionPerformed(evt);
            }
        });

        btnxoanhanvien.setBackground(new java.awt.Color(51, 153, 255));
        btnxoanhanvien.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnxoanhanvien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/delete-32.png"))); // NOI18N
        btnxoanhanvien.setText("Xóa");
        btnxoanhanvien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnxoanhanvienActionPerformed(evt);
            }
        });

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
                .addContainerGap()
                .addComponent(btntimkiemnhanvien, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txttimkiem, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btntimkiemnhanvien)
                    .addComponent(txttimkiem, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btntimkiemnhanvien, txttimkiem});

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnlammoinhanvien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnchinhsuanhanvien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btndoimoinhanvien, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnxoanhanvien, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel9Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnchinhsuanhanvien, btndoimoinhanvien, btnlammoinhanvien, btnxoanhanvien});

        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnlammoinhanvien)
                    .addComponent(btndoimoinhanvien))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnchinhsuanhanvien, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnxoanhanvien))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel9Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnchinhsuanhanvien, btndoimoinhanvien, btnlammoinhanvien, btnxoanhanvien});

        javax.swing.GroupLayout pnlNhanvienLayout = new javax.swing.GroupLayout(pnlNhanvien);
        pnlNhanvien.setLayout(pnlNhanvienLayout);
        pnlNhanvienLayout.setHorizontalGroup(
            pnlNhanvienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNhanvienLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlNhanvienLayout.setVerticalGroup(
            pnlNhanvienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlNhanvienLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(pnlNhanvienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(60, 60, 60))
        );

        tabpnlQuanLy.addTab("Nhân Viên", pnlNhanvien);

        jPanel4.setBackground(new java.awt.Color(255, 255, 204));

        jPanel25.setBackground(new java.awt.Color(255, 220, 126));

        jLabel53.setText("Mã nhân viên");

        jLabel54.setText("Họ và tên");

        jLabel55.setText("Số điện thoại");

        jLabel57.setText("Mã chức vụ");

        cbochucvu5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbochucvu5ActionPerformed(evt);
            }
        });

        jLabel58.setText("Mã ca trực");

        cbocatruc5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbocatruc5ActionPerformed(evt);
            }
        });

        jLabel59.setText("Lương");

        jLabel60.setText("Password");

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel25Layout.createSequentialGroup()
                .addGap(0, 20, Short.MAX_VALUE)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel54, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel53, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel55, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel57, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel58, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel59, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel60, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtsodienthoai5)
                    .addComponent(txthovaten5)
                    .addComponent(txtluong5)
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbocatruc5, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbochucvu5, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtmanhanvien5, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtpassword5, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(23, 23, 23))
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtmanhanvien5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel53))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel54)
                    .addComponent(txthovaten5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel55)
                    .addComponent(txtsodienthoai5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(88, 88, 88)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbochucvu5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel57))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbocatruc5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel58))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel59)
                    .addComponent(txtluong5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel60)
                    .addComponent(txtpassword5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31))
        );

        jPanel26.setBackground(new java.awt.Color(255, 255, 204));

        btnlammoinhanvien5.setBackground(new java.awt.Color(51, 153, 255));
        btnlammoinhanvien5.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnlammoinhanvien5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/new-32.png"))); // NOI18N
        btnlammoinhanvien5.setText("Làm mới");
        btnlammoinhanvien5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlammoinhanvien5ActionPerformed(evt);
            }
        });

        btndoimoinhanvien5.setBackground(new java.awt.Color(51, 153, 255));
        btndoimoinhanvien5.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btndoimoinhanvien5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/add-user-3-32.png"))); // NOI18N
        btndoimoinhanvien5.setText("Thêm");
        btndoimoinhanvien5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndoimoinhanvien5ActionPerformed(evt);
            }
        });

        btnchinhsuanhanvien5.setBackground(new java.awt.Color(51, 153, 255));
        btnchinhsuanhanvien5.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnchinhsuanhanvien5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/available-updates-32.png"))); // NOI18N
        btnchinhsuanhanvien5.setText("Chỉnh sửa");
        btnchinhsuanhanvien5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnchinhsuanhanvien5ActionPerformed(evt);
            }
        });

        btnxoanhanvien5.setBackground(new java.awt.Color(51, 153, 255));
        btnxoanhanvien5.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnxoanhanvien5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/delete-32.png"))); // NOI18N
        btnxoanhanvien5.setText("Xóa");
        btnxoanhanvien5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnxoanhanvien5ActionPerformed(evt);
            }
        });

        jPanel27.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btntimkiemnhanvien5.setText("Tìm Kiếm");
        btntimkiemnhanvien5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntimkiemnhanvien5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btntimkiemnhanvien5, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txttimkiem5, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btntimkiemnhanvien5)
                    .addComponent(txttimkiem5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel26Layout.createSequentialGroup()
                .addComponent(jPanel27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel26Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnlammoinhanvien5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnchinhsuanhanvien5))
                .addGap(18, 18, 18)
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btndoimoinhanvien5, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnxoanhanvien5, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        jPanel26Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnchinhsuanhanvien5, btndoimoinhanvien5, btnlammoinhanvien5, btnxoanhanvien5});

        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnlammoinhanvien5)
                    .addComponent(btndoimoinhanvien5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnchinhsuanhanvien5, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnxoanhanvien5))
                .addGap(31, 31, 31)
                .addComponent(jPanel27, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel61.setBackground(new java.awt.Color(204, 204, 204));
        jLabel61.setForeground(new java.awt.Color(255, 51, 51));
        jLabel61.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel61.setText("Hình ảnh");
        jLabel61.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(448, Short.MAX_VALUE)
                .addComponent(jLabel61, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57))
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(23, 23, 23)
                    .addComponent(jPanel25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(jPanel26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(24, Short.MAX_VALUE)))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jLabel61, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(235, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(31, 31, 31)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGap(32, 32, 32)))
        );

        tabpnlQuanLy.addTab("Công Thức", jPanel4);

        jPanel3.setBackground(new java.awt.Color(255, 255, 204));

        jPanel13.setBackground(new java.awt.Color(255, 220, 126));

        jLabel10.setText("Mã nhân viên");

        jLabel11.setText("Họ và tên");

        rdonam1.setSelected(true);
        rdonam1.setText("Nam");

        rdonu1.setText("Nữ");

        jLabel19.setText("Số điện thoại");

        jLabel20.setText("Địa chỉ");

        jLabel21.setText("Mã chức vụ");

        cbochucvu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbochucvu1ActionPerformed(evt);
            }
        });

        jLabel22.setText("Mã ca trực");

        cbocatruc1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbocatruc1ActionPerformed(evt);
            }
        });

        jLabel23.setText("Lương");

        jLabel24.setText("Password");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addGap(0, 20, Short.MAX_VALUE)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel21, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel22, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel23, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel24, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtsodienthoai1)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(rdonam1)
                        .addGap(39, 39, 39)
                        .addComponent(rdonu1))
                    .addComponent(txthovaten1)
                    .addComponent(cbocatruc1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbochucvu1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtdiachi1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtluong1)
                    .addComponent(txtmanhanvien1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtpassword1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtmanhanvien1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txthovaten1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdonam1)
                    .addComponent(rdonu1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(txtsodienthoai1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtdiachi1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbochucvu1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbocatruc1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(txtluong1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(txtpassword1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31))
        );

        jPanel14.setBackground(new java.awt.Color(255, 255, 204));

        btnlammoinhanvien1.setBackground(new java.awt.Color(51, 153, 255));
        btnlammoinhanvien1.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnlammoinhanvien1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/new-32.png"))); // NOI18N
        btnlammoinhanvien1.setText("Làm mới");
        btnlammoinhanvien1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlammoinhanvien1ActionPerformed(evt);
            }
        });

        jLabel25.setBackground(new java.awt.Color(204, 204, 204));
        jLabel25.setForeground(new java.awt.Color(255, 51, 51));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("Hình ảnh");
        jLabel25.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btndoimoinhanvien1.setBackground(new java.awt.Color(51, 153, 255));
        btndoimoinhanvien1.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btndoimoinhanvien1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/add-user-3-32.png"))); // NOI18N
        btndoimoinhanvien1.setText("Thêm");
        btndoimoinhanvien1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndoimoinhanvien1ActionPerformed(evt);
            }
        });

        btnchinhsuanhanvien1.setBackground(new java.awt.Color(51, 153, 255));
        btnchinhsuanhanvien1.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnchinhsuanhanvien1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/available-updates-32.png"))); // NOI18N
        btnchinhsuanhanvien1.setText("Chỉnh sửa");
        btnchinhsuanhanvien1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnchinhsuanhanvien1ActionPerformed(evt);
            }
        });

        btnxoanhanvien1.setBackground(new java.awt.Color(51, 153, 255));
        btnxoanhanvien1.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnxoanhanvien1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/delete-32.png"))); // NOI18N
        btnxoanhanvien1.setText("Xóa");
        btnxoanhanvien1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnxoanhanvien1ActionPerformed(evt);
            }
        });

        jPanel15.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btntimkiemnhanvien1.setText("Tìm Kiếm");
        btntimkiemnhanvien1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntimkiemnhanvien1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btntimkiemnhanvien1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txttimkiem1, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btntimkiemnhanvien1)
                    .addComponent(txttimkiem1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel15Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btntimkiemnhanvien1, txttimkiem1});

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnlammoinhanvien1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnchinhsuanhanvien1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btndoimoinhanvien1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnxoanhanvien1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );

        jPanel14Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnchinhsuanhanvien1, btndoimoinhanvien1, btnlammoinhanvien1, btnxoanhanvien1});

        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnlammoinhanvien1)
                    .addComponent(btndoimoinhanvien1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnchinhsuanhanvien1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnxoanhanvien1))
                .addGap(18, 18, 18)
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(60, 60, 60))
        );

        tabpnlQuanLy.addTab("Món Ăn", jPanel3);

        jPanel5.setBackground(new java.awt.Color(255, 255, 204));

        jPanel28.setBackground(new java.awt.Color(255, 255, 204));

        btnlammoinhanvien6.setBackground(new java.awt.Color(51, 153, 255));
        btnlammoinhanvien6.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnlammoinhanvien6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/new-32.png"))); // NOI18N
        btnlammoinhanvien6.setText("Làm mới");
        btnlammoinhanvien6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlammoinhanvien6ActionPerformed(evt);
            }
        });

        jLabel62.setBackground(new java.awt.Color(204, 204, 204));
        jLabel62.setForeground(new java.awt.Color(255, 51, 51));
        jLabel62.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel62.setText("Hình ảnh");
        jLabel62.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btndoimoinhanvien6.setBackground(new java.awt.Color(51, 153, 255));
        btndoimoinhanvien6.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btndoimoinhanvien6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/add-user-3-32.png"))); // NOI18N
        btndoimoinhanvien6.setText("Thêm");
        btndoimoinhanvien6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndoimoinhanvien6ActionPerformed(evt);
            }
        });

        btnchinhsuanhanvien6.setBackground(new java.awt.Color(51, 153, 255));
        btnchinhsuanhanvien6.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnchinhsuanhanvien6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/available-updates-32.png"))); // NOI18N
        btnchinhsuanhanvien6.setText("Chỉnh sửa");
        btnchinhsuanhanvien6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnchinhsuanhanvien6ActionPerformed(evt);
            }
        });

        btnxoanhanvien6.setBackground(new java.awt.Color(51, 153, 255));
        btnxoanhanvien6.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnxoanhanvien6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/delete-32.png"))); // NOI18N
        btnxoanhanvien6.setText("Xóa");
        btnxoanhanvien6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnxoanhanvien6ActionPerformed(evt);
            }
        });

        jPanel29.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btntimkiemnhanvien6.setText("Tìm Kiếm");
        btntimkiemnhanvien6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntimkiemnhanvien6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel29Layout = new javax.swing.GroupLayout(jPanel29);
        jPanel29.setLayout(jPanel29Layout);
        jPanel29Layout.setHorizontalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btntimkiemnhanvien6, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txttimkiem6, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel29Layout.setVerticalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btntimkiemnhanvien6)
                    .addComponent(txttimkiem6, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel28Layout = new javax.swing.GroupLayout(jPanel28);
        jPanel28.setLayout(jPanel28Layout);
        jPanel28Layout.setHorizontalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel28Layout.createSequentialGroup()
                .addComponent(jPanel29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel28Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel28Layout.createSequentialGroup()
                        .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnlammoinhanvien6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnchinhsuanhanvien6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btndoimoinhanvien6, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnxoanhanvien6, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel28Layout.createSequentialGroup()
                        .addComponent(jLabel62, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38))))
        );

        jPanel28Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnchinhsuanhanvien6, btndoimoinhanvien6, btnlammoinhanvien6, btnxoanhanvien6});

        jPanel28Layout.setVerticalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel62, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnlammoinhanvien6)
                    .addComponent(btndoimoinhanvien6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnchinhsuanhanvien6, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnxoanhanvien6))
                .addGap(18, 18, 18)
                .addComponent(jPanel29, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel30.setBackground(new java.awt.Color(255, 220, 126));

        jLabel63.setText("Mã nhân viên");

        jLabel64.setText("Họ và tên");

        rdonam6.setSelected(true);
        rdonam6.setText("Nam");

        rdonu6.setText("Nữ");

        jLabel65.setText("Số điện thoại");

        jLabel66.setText("Địa chỉ");

        jLabel67.setText("Mã chức vụ");

        cbochucvu6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbochucvu6ActionPerformed(evt);
            }
        });

        jLabel68.setText("Mã ca trực");

        cbocatruc6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbocatruc6ActionPerformed(evt);
            }
        });

        jLabel69.setText("Lương");

        jLabel70.setText("Password");

        javax.swing.GroupLayout jPanel30Layout = new javax.swing.GroupLayout(jPanel30);
        jPanel30.setLayout(jPanel30Layout);
        jPanel30Layout.setHorizontalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel30Layout.createSequentialGroup()
                .addGap(0, 20, Short.MAX_VALUE)
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel64, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel63, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel65, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel66, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel67, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel68, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel69, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel70, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtsodienthoai6)
                    .addGroup(jPanel30Layout.createSequentialGroup()
                        .addComponent(rdonam6)
                        .addGap(39, 39, 39)
                        .addComponent(rdonu6))
                    .addComponent(txthovaten6)
                    .addComponent(cbocatruc6, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbochucvu6, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtdiachi6, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtluong6)
                    .addComponent(txtmanhanvien6, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtpassword6, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );
        jPanel30Layout.setVerticalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtmanhanvien6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel63))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel64)
                    .addComponent(txthovaten6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdonam6)
                    .addComponent(rdonu6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel65)
                    .addComponent(txtsodienthoai6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtdiachi6, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel66))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbochucvu6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel67))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbocatruc6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel68))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel69)
                    .addComponent(txtluong6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel70)
                    .addComponent(txtpassword6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 735, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addGap(23, 23, 23)
                    .addComponent(jPanel30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(jPanel28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(24, Short.MAX_VALUE)))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 490, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addGap(31, 31, 31)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGap(32, 32, 32)))
        );

        tabpnlQuanLy.addTab("Nguyên Liệu", jPanel5);

        jPanel6.setBackground(new java.awt.Color(255, 255, 204));

        jPanel19.setBackground(new java.awt.Color(255, 220, 126));

        jLabel35.setText("Mã nhân viên");

        jLabel36.setText("Họ và tên");

        rdonam3.setSelected(true);
        rdonam3.setText("Nam");

        rdonu3.setText("Nữ");

        jLabel37.setText("Số điện thoại");

        jLabel38.setText("Địa chỉ");

        jLabel39.setText("Mã chức vụ");

        cbochucvu3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbochucvu3ActionPerformed(evt);
            }
        });

        jLabel40.setText("Mã ca trực");

        cbocatruc3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbocatruc3ActionPerformed(evt);
            }
        });

        jLabel41.setText("Lương");

        jLabel42.setText("Password");

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel19Layout.createSequentialGroup()
                .addGap(0, 20, Short.MAX_VALUE)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel36, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel35, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel37, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel38, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel39, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel40, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel41, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel42, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtsodienthoai3)
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addComponent(rdonam3)
                        .addGap(39, 39, 39)
                        .addComponent(rdonu3))
                    .addComponent(txthovaten3)
                    .addComponent(cbocatruc3, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbochucvu3, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtdiachi3, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtluong3)
                    .addComponent(txtmanhanvien3, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtpassword3, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtmanhanvien3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel35))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel36)
                    .addComponent(txthovaten3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdonam3)
                    .addComponent(rdonu3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel37)
                    .addComponent(txtsodienthoai3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtdiachi3, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel38))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbochucvu3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel39))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbocatruc3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel40))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel41)
                    .addComponent(txtluong3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel42)
                    .addComponent(txtpassword3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31))
        );

        jPanel20.setBackground(new java.awt.Color(255, 255, 204));

        btnlammoinhanvien3.setBackground(new java.awt.Color(51, 153, 255));
        btnlammoinhanvien3.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnlammoinhanvien3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/new-32.png"))); // NOI18N
        btnlammoinhanvien3.setText("Làm mới");
        btnlammoinhanvien3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlammoinhanvien3ActionPerformed(evt);
            }
        });

        jLabel43.setBackground(new java.awt.Color(204, 204, 204));
        jLabel43.setForeground(new java.awt.Color(255, 51, 51));
        jLabel43.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel43.setText("Hình ảnh");
        jLabel43.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btndoimoinhanvien3.setBackground(new java.awt.Color(51, 153, 255));
        btndoimoinhanvien3.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btndoimoinhanvien3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/add-user-3-32.png"))); // NOI18N
        btndoimoinhanvien3.setText("Thêm");
        btndoimoinhanvien3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndoimoinhanvien3ActionPerformed(evt);
            }
        });

        btnchinhsuanhanvien3.setBackground(new java.awt.Color(51, 153, 255));
        btnchinhsuanhanvien3.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnchinhsuanhanvien3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/available-updates-32.png"))); // NOI18N
        btnchinhsuanhanvien3.setText("Chỉnh sửa");
        btnchinhsuanhanvien3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnchinhsuanhanvien3ActionPerformed(evt);
            }
        });

        btnxoanhanvien3.setBackground(new java.awt.Color(51, 153, 255));
        btnxoanhanvien3.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnxoanhanvien3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/delete-32.png"))); // NOI18N
        btnxoanhanvien3.setText("Xóa");
        btnxoanhanvien3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnxoanhanvien3ActionPerformed(evt);
            }
        });

        jPanel21.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btntimkiemnhanvien3.setText("Tìm Kiếm");
        btntimkiemnhanvien3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntimkiemnhanvien3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btntimkiemnhanvien3, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txttimkiem3, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btntimkiemnhanvien3)
                    .addComponent(txttimkiem3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel20Layout.createSequentialGroup()
                .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel20Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnlammoinhanvien3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnchinhsuanhanvien3))
                .addGap(18, 18, 18)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btndoimoinhanvien3, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnxoanhanvien3, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17))
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel20Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnchinhsuanhanvien3, btndoimoinhanvien3, btnlammoinhanvien3, btnxoanhanvien3});

        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnlammoinhanvien3)
                    .addComponent(btndoimoinhanvien3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnchinhsuanhanvien3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnxoanhanvien3))
                .addGap(18, 18, 18)
                .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(60, 60, 60))
        );

        tabpnlQuanLy.addTab("Phiếu Nhập", jPanel6);

        jPanel7.setBackground(new java.awt.Color(255, 255, 204));

        jPanel16.setBackground(new java.awt.Color(255, 220, 126));

        jLabel26.setText("Mã nhân viên");

        jLabel27.setText("Họ và tên");

        rdonam2.setSelected(true);
        rdonam2.setText("Nam");

        rdonu2.setText("Nữ");

        jLabel28.setText("Số điện thoại");

        jLabel29.setText("Địa chỉ");

        jLabel30.setText("Mã chức vụ");

        cbochucvu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbochucvu2ActionPerformed(evt);
            }
        });

        jLabel31.setText("Mã ca trực");

        cbocatruc2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbocatruc2ActionPerformed(evt);
            }
        });

        jLabel32.setText("Lương");

        jLabel33.setText("Password");

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                .addGap(0, 20, Short.MAX_VALUE)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel27, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel26, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel28, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel29, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel30, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel31, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel32, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel33, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtsodienthoai2)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addComponent(rdonam2)
                        .addGap(39, 39, 39)
                        .addComponent(rdonu2))
                    .addComponent(txthovaten2)
                    .addComponent(cbocatruc2, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbochucvu2, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtdiachi2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtluong2)
                    .addComponent(txtmanhanvien2, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtpassword2, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtmanhanvien2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(txthovaten2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdonam2)
                    .addComponent(rdonu2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(txtsodienthoai2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtdiachi2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel29))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbochucvu2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel30))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbocatruc2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel31))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32)
                    .addComponent(txtluong2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel33)
                    .addComponent(txtpassword2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31))
        );

        jPanel17.setBackground(new java.awt.Color(255, 255, 204));

        btnlammoinhanvien2.setBackground(new java.awt.Color(51, 153, 255));
        btnlammoinhanvien2.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnlammoinhanvien2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/new-32.png"))); // NOI18N
        btnlammoinhanvien2.setText("Làm mới");
        btnlammoinhanvien2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlammoinhanvien2ActionPerformed(evt);
            }
        });

        jLabel34.setBackground(new java.awt.Color(204, 204, 204));
        jLabel34.setForeground(new java.awt.Color(255, 51, 51));
        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel34.setText("Hình ảnh");
        jLabel34.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btndoimoinhanvien2.setBackground(new java.awt.Color(51, 153, 255));
        btndoimoinhanvien2.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btndoimoinhanvien2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/add-user-3-32.png"))); // NOI18N
        btndoimoinhanvien2.setText("Thêm");
        btndoimoinhanvien2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndoimoinhanvien2ActionPerformed(evt);
            }
        });

        btnchinhsuanhanvien2.setBackground(new java.awt.Color(51, 153, 255));
        btnchinhsuanhanvien2.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnchinhsuanhanvien2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/available-updates-32.png"))); // NOI18N
        btnchinhsuanhanvien2.setText("Chỉnh sửa");
        btnchinhsuanhanvien2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnchinhsuanhanvien2ActionPerformed(evt);
            }
        });

        btnxoanhanvien2.setBackground(new java.awt.Color(51, 153, 255));
        btnxoanhanvien2.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnxoanhanvien2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/delete-32.png"))); // NOI18N
        btnxoanhanvien2.setText("Xóa");
        btnxoanhanvien2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnxoanhanvien2ActionPerformed(evt);
            }
        });

        jPanel18.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btntimkiemnhanvien2.setText("Tìm Kiếm");
        btntimkiemnhanvien2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntimkiemnhanvien2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btntimkiemnhanvien2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txttimkiem2, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btntimkiemnhanvien2)
                    .addComponent(txttimkiem2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnlammoinhanvien2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnchinhsuanhanvien2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btndoimoinhanvien2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnxoanhanvien2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                        .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35))))
        );

        jPanel17Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnchinhsuanhanvien2, btndoimoinhanvien2, btnlammoinhanvien2, btnxoanhanvien2});

        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnlammoinhanvien2)
                    .addComponent(btndoimoinhanvien2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnchinhsuanhanvien2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnxoanhanvien2))
                .addGap(18, 18, 18)
                .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(60, 60, 60))
        );

        tabpnlQuanLy.addTab("Ca Trực", jPanel7);

        jMenuBar1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jMenuBar1.setMaximumSize(new java.awt.Dimension(710, 29));
        jMenuBar1.setMinimumSize(new java.awt.Dimension(710, 29));
        jMenuBar1.setPreferredSize(new java.awt.Dimension(710, 29));

        mnDanhmuc.setText("Danh Mục");
        jMenuBar1.add(mnDanhmuc);

        mnThemmoi.setBackground(new java.awt.Color(0, 102, 255));
        mnThemmoi.setBorder(null);
        mnThemmoi.setForeground(new java.awt.Color(255, 255, 255));
        mnThemmoi.setText("Thêm Mới");
        jMenuBar1.add(mnThemmoi);

        mnThongke.setText("Thống Kê");
        mnThongke.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jMenuBar1.add(mnThongke);

        jMenu2.setText("Thoát");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tabpnlQuanLy, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabpnlQuanLy, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 536, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbochucvuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbochucvuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbochucvuActionPerformed

    private void cbocatrucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbocatrucActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbocatrucActionPerformed

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

    private void btnxoanhanvienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnxoanhanvienActionPerformed
        this.deteleNV();
    }//GEN-LAST:event_btnxoanhanvienActionPerformed

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

    private void btnlammoinhanvienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlammoinhanvienActionPerformed
        this.newNV();
    }//GEN-LAST:event_btnlammoinhanvienActionPerformed

    private void cbochucvu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbochucvu1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbochucvu1ActionPerformed

    private void cbocatruc1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbocatruc1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbocatruc1ActionPerformed

    private void btnlammoinhanvien1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlammoinhanvien1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnlammoinhanvien1ActionPerformed

    private void btndoimoinhanvien1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndoimoinhanvien1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btndoimoinhanvien1ActionPerformed

    private void btnchinhsuanhanvien1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnchinhsuanhanvien1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnchinhsuanhanvien1ActionPerformed

    private void btnxoanhanvien1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnxoanhanvien1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnxoanhanvien1ActionPerformed

    private void btntimkiemnhanvien1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntimkiemnhanvien1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btntimkiemnhanvien1ActionPerformed

    private void cbochucvu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbochucvu2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbochucvu2ActionPerformed

    private void cbocatruc2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbocatruc2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbocatruc2ActionPerformed

    private void btnlammoinhanvien2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlammoinhanvien2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnlammoinhanvien2ActionPerformed

    private void btndoimoinhanvien2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndoimoinhanvien2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btndoimoinhanvien2ActionPerformed

    private void btnchinhsuanhanvien2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnchinhsuanhanvien2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnchinhsuanhanvien2ActionPerformed

    private void btnxoanhanvien2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnxoanhanvien2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnxoanhanvien2ActionPerformed

    private void btntimkiemnhanvien2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntimkiemnhanvien2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btntimkiemnhanvien2ActionPerformed

    private void cbochucvu3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbochucvu3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbochucvu3ActionPerformed

    private void cbocatruc3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbocatruc3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbocatruc3ActionPerformed

    private void btnlammoinhanvien3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlammoinhanvien3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnlammoinhanvien3ActionPerformed

    private void btndoimoinhanvien3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndoimoinhanvien3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btndoimoinhanvien3ActionPerformed

    private void btnchinhsuanhanvien3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnchinhsuanhanvien3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnchinhsuanhanvien3ActionPerformed

    private void btnxoanhanvien3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnxoanhanvien3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnxoanhanvien3ActionPerformed

    private void btntimkiemnhanvien3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntimkiemnhanvien3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btntimkiemnhanvien3ActionPerformed

    private void cbochucvu5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbochucvu5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbochucvu5ActionPerformed

    private void cbocatruc5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbocatruc5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbocatruc5ActionPerformed

    private void btnlammoinhanvien5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlammoinhanvien5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnlammoinhanvien5ActionPerformed

    private void btndoimoinhanvien5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndoimoinhanvien5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btndoimoinhanvien5ActionPerformed

    private void btnchinhsuanhanvien5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnchinhsuanhanvien5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnchinhsuanhanvien5ActionPerformed

    private void btnxoanhanvien5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnxoanhanvien5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnxoanhanvien5ActionPerformed

    private void btntimkiemnhanvien5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntimkiemnhanvien5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btntimkiemnhanvien5ActionPerformed

    private void btnlammoinhanvien6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlammoinhanvien6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnlammoinhanvien6ActionPerformed

    private void btndoimoinhanvien6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndoimoinhanvien6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btndoimoinhanvien6ActionPerformed

    private void btnchinhsuanhanvien6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnchinhsuanhanvien6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnchinhsuanhanvien6ActionPerformed

    private void btnxoanhanvien6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnxoanhanvien6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnxoanhanvien6ActionPerformed

    private void btntimkiemnhanvien6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntimkiemnhanvien6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btntimkiemnhanvien6ActionPerformed

    private void cbochucvu6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbochucvu6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbochucvu6ActionPerformed

    private void cbocatruc6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbocatruc6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbocatruc6ActionPerformed
    }    String maNL;    String maNV;

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ThemMoi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnchinhsuanhanvien;
    private javax.swing.JButton btnchinhsuanhanvien1;
    private javax.swing.JButton btnchinhsuanhanvien2;
    private javax.swing.JButton btnchinhsuanhanvien3;
    private javax.swing.JButton btnchinhsuanhanvien5;
    private javax.swing.JButton btnchinhsuanhanvien6;
    private javax.swing.JButton btndoimoinhanvien;
    private javax.swing.JButton btndoimoinhanvien1;
    private javax.swing.JButton btndoimoinhanvien2;
    private javax.swing.JButton btndoimoinhanvien3;
    private javax.swing.JButton btndoimoinhanvien5;
    private javax.swing.JButton btndoimoinhanvien6;
    private javax.swing.JButton btnlammoinhanvien;
    private javax.swing.JButton btnlammoinhanvien1;
    private javax.swing.JButton btnlammoinhanvien2;
    private javax.swing.JButton btnlammoinhanvien3;
    private javax.swing.JButton btnlammoinhanvien5;
    private javax.swing.JButton btnlammoinhanvien6;
    private javax.swing.JButton btntimkiemnhanvien;
    private javax.swing.JButton btntimkiemnhanvien1;
    private javax.swing.JButton btntimkiemnhanvien2;
    private javax.swing.JButton btntimkiemnhanvien3;
    private javax.swing.JButton btntimkiemnhanvien5;
    private javax.swing.JButton btntimkiemnhanvien6;
    private javax.swing.JButton btnxoanhanvien;
    private javax.swing.JButton btnxoanhanvien1;
    private javax.swing.JButton btnxoanhanvien2;
    private javax.swing.JButton btnxoanhanvien3;
    private javax.swing.JButton btnxoanhanvien5;
    private javax.swing.JButton btnxoanhanvien6;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbocatruc;
    private javax.swing.JComboBox<String> cbocatruc1;
    private javax.swing.JComboBox<String> cbocatruc2;
    private javax.swing.JComboBox<String> cbocatruc3;
    private javax.swing.JComboBox<String> cbocatruc5;
    private javax.swing.JComboBox<String> cbocatruc6;
    private javax.swing.JComboBox<String> cbochucvu;
    private javax.swing.JComboBox<String> cbochucvu1;
    private javax.swing.JComboBox<String> cbochucvu2;
    private javax.swing.JComboBox<String> cbochucvu3;
    private javax.swing.JComboBox<String> cbochucvu5;
    private javax.swing.JComboBox<String> cbochucvu6;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
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
    private javax.swing.JRadioButton rdonam1;
    private javax.swing.JRadioButton rdonam2;
    private javax.swing.JRadioButton rdonam3;
    private javax.swing.JRadioButton rdonam6;
    private javax.swing.JRadioButton rdonu;
    private javax.swing.JRadioButton rdonu1;
    private javax.swing.JRadioButton rdonu2;
    private javax.swing.JRadioButton rdonu3;
    private javax.swing.JRadioButton rdonu6;
    private javax.swing.JTabbedPane tabpnlQuanLy;
    private javax.swing.JTextField txtdiachi;
    private javax.swing.JTextField txtdiachi1;
    private javax.swing.JTextField txtdiachi2;
    private javax.swing.JTextField txtdiachi3;
    private javax.swing.JTextField txtdiachi6;
    private javax.swing.JTextField txthovaten;
    private javax.swing.JTextField txthovaten1;
    private javax.swing.JTextField txthovaten2;
    private javax.swing.JTextField txthovaten3;
    private javax.swing.JTextField txthovaten5;
    private javax.swing.JTextField txthovaten6;
    private javax.swing.JTextField txtluong;
    private javax.swing.JTextField txtluong1;
    private javax.swing.JTextField txtluong2;
    private javax.swing.JTextField txtluong3;
    private javax.swing.JTextField txtluong5;
    private javax.swing.JTextField txtluong6;
    private javax.swing.JTextField txtmanhanvien;
    private javax.swing.JTextField txtmanhanvien1;
    private javax.swing.JTextField txtmanhanvien2;
    private javax.swing.JTextField txtmanhanvien3;
    private javax.swing.JTextField txtmanhanvien5;
    private javax.swing.JTextField txtmanhanvien6;
    private javax.swing.JTextField txtpassword;
    private javax.swing.JTextField txtpassword1;
    private javax.swing.JTextField txtpassword2;
    private javax.swing.JTextField txtpassword3;
    private javax.swing.JTextField txtpassword5;
    private javax.swing.JTextField txtpassword6;
    private javax.swing.JTextField txtsodienthoai;
    private javax.swing.JTextField txtsodienthoai1;
    private javax.swing.JTextField txtsodienthoai2;
    private javax.swing.JTextField txtsodienthoai3;
    private javax.swing.JTextField txtsodienthoai5;
    private javax.swing.JTextField txtsodienthoai6;
    private javax.swing.JTextField txttimkiem;
    private javax.swing.JTextField txttimkiem1;
    private javax.swing.JTextField txttimkiem2;
    private javax.swing.JTextField txttimkiem3;
    private javax.swing.JTextField txttimkiem5;
    private javax.swing.JTextField txttimkiem6;
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
        nl.setSoluong(Double.valueOf(txtsoluong.getText()));
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
