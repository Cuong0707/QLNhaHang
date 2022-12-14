package View;


import Dao.CaTrucDAO;
import Dao.ChucVuDAO;
import Dao.LoaiNguyenLieuDAO;
import Dao.NguyenlieuDAO;
import Dao.NhanVienDAO;
import CT.CheckInput;
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
String maNV;
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
        txtMaNhanVien = new javax.swing.JTextField();
        txtHoVaTen = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        rdonam = new javax.swing.JRadioButton();
        rdonu = new javax.swing.JRadioButton();
        txtSoDienThoai = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtDiaChi = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        cboChucVu = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        cboCaTruc = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        txtLuong = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtPassWord = new javax.swing.JTextField();
        jPanel9 = new javax.swing.JPanel();
        btnLamMoiNhanVien = new javax.swing.JButton();
        lblHinhNhanVien = new javax.swing.JLabel();
        btnDoiMoiNhanVien = new javax.swing.JButton();
        btnChinhSuaNhanVien = new javax.swing.JButton();
        btnXoaNhanVien = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        txttimkiem = new javax.swing.JTextField();
        btnTimKiemNhanVien = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jPanel25 = new javax.swing.JPanel();
        jLabel53 = new javax.swing.JLabel();
        txtmamon = new javax.swing.JTextField();
        jLabel54 = new javax.swing.JLabel();
        txtdonvi = new javax.swing.JTextField();
        jLabel55 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        cbochucvu5 = new javax.swing.JComboBox<>();
        jLabel58 = new javax.swing.JLabel();
        cbocatruc5 = new javax.swing.JComboBox<>();
        txtsoluong = new javax.swing.JTextField();
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
        txtmamon1 = new javax.swing.JTextField();
        txttenmon = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txttrongluong = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        txtDonvi1 = new javax.swing.JTextField();
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
        btnLamMoiNguyenLieu = new javax.swing.JButton();
        jLabel62 = new javax.swing.JLabel();
        btnThemMoiNguyenLieu = new javax.swing.JButton();
        btnChinhSuaNguyenLieu = new javax.swing.JButton();
        btnXoaNguyenLieu = new javax.swing.JButton();
        jPanel29 = new javax.swing.JPanel();
        txtTimNguyenLieu = new javax.swing.JTextField();
        btnTimKiemNguyenLieu = new javax.swing.JButton();
        jPanel30 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtmanguyenlieu = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txttennguyenlieu = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtdonvitinh = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtsoluong1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        CboLoaiNguyenLieu = new javax.swing.JComboBox<>();
        jPanel6 = new javax.swing.JPanel();
        jPanel19 = new javax.swing.JPanel();
        jLabel35 = new javax.swing.JLabel();
        txtmaphieunhap = new javax.swing.JTextField();
        txtDongia = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        txtsoluong2 = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        cbochucvu3 = new javax.swing.JComboBox<>();
        txtdonvi1 = new javax.swing.JTextField();
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
        setTitle("Qu???n L?? Nh?? H??ng");
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

        jLabel5.setText("M?? nh??n vi??n");

        jLabel9.setText("H??? v?? t??n");

        rdonam.setSelected(true);
        rdonam.setText("Nam");

        rdonu.setText("N???");

        jLabel12.setText("S??? ??i???n tho???i");

        jLabel13.setText("?????a ch???");

        jLabel14.setText("M?? ch???c v???");

        cboChucVu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboChucVuActionPerformed(evt);
            }
        });

        jLabel15.setText("M?? ca tr???c");

        cboCaTruc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboCaTrucActionPerformed(evt);
            }
        });

        jLabel16.setText("L????ng");

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
                    .addComponent(txtSoDienThoai)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(rdonam)
                        .addGap(39, 39, 39)
                        .addComponent(rdonu))
                    .addComponent(txtHoVaTen)
                    .addComponent(cboCaTruc, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboChucVu, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLuong)
                    .addComponent(txtMaNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPassWord, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );

        jPanel8Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtDiaChi, txtHoVaTen, txtLuong, txtMaNhanVien, txtPassWord, txtSoDienThoai});

        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMaNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtHoVaTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdonam)
                    .addComponent(rdonu))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtSoDienThoai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboChucVu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboCaTruc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(txtLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(txtPassWord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31))
        );

        jPanel8Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtHoVaTen, txtLuong, txtMaNhanVien, txtPassWord, txtSoDienThoai});

        jPanel9.setBackground(new java.awt.Color(255, 255, 204));

        btnLamMoiNhanVien.setBackground(new java.awt.Color(51, 153, 255));
        btnLamMoiNhanVien.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnLamMoiNhanVien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/new-32.png"))); // NOI18N
        btnLamMoiNhanVien.setText("L??m m???i");
        btnLamMoiNhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLamMoiNhanVienActionPerformed(evt);
            }
        });

        lblHinhNhanVien.setBackground(new java.awt.Color(204, 204, 204));
        lblHinhNhanVien.setForeground(new java.awt.Color(255, 51, 51));
        lblHinhNhanVien.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHinhNhanVien.setText("H??nh ???nh");
        lblHinhNhanVien.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnDoiMoiNhanVien.setBackground(new java.awt.Color(51, 153, 255));
        btnDoiMoiNhanVien.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnDoiMoiNhanVien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/add-user-3-32.png"))); // NOI18N
        btnDoiMoiNhanVien.setText("Th??m");
        btnDoiMoiNhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoiMoiNhanVienActionPerformed(evt);
            }
        });

        btnChinhSuaNhanVien.setBackground(new java.awt.Color(51, 153, 255));
        btnChinhSuaNhanVien.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnChinhSuaNhanVien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/available-updates-32.png"))); // NOI18N
        btnChinhSuaNhanVien.setText("Ch???nh s???a");
        btnChinhSuaNhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChinhSuaNhanVienActionPerformed(evt);
            }
        });

        btnXoaNhanVien.setBackground(new java.awt.Color(51, 153, 255));
        btnXoaNhanVien.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnXoaNhanVien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/delete-32.png"))); // NOI18N
        btnXoaNhanVien.setText("X??a");
        btnXoaNhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaNhanVienActionPerformed(evt);
            }
        });

        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnTimKiemNhanVien.setText("T??m Ki???m");
        btnTimKiemNhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemNhanVienActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnTimKiemNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txttimkiem, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTimKiemNhanVien)
                    .addComponent(txttimkiem, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(7, Short.MAX_VALUE))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnTimKiemNhanVien, txttimkiem});

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
                            .addComponent(btnLamMoiNhanVien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnChinhSuaNhanVien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnDoiMoiNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnXoaNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(lblHinhNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel9Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnChinhSuaNhanVien, btnDoiMoiNhanVien, btnLamMoiNhanVien, btnXoaNhanVien});

        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(lblHinhNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLamMoiNhanVien)
                    .addComponent(btnDoiMoiNhanVien))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnChinhSuaNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnXoaNhanVien))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel9Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnChinhSuaNhanVien, btnDoiMoiNhanVien, btnLamMoiNhanVien, btnXoaNhanVien});

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

        tabpnlQuanLy.addTab("Nh??n Vi??n", pnlNhanvien);

        jPanel4.setBackground(new java.awt.Color(255, 255, 204));

        jPanel25.setBackground(new java.awt.Color(255, 220, 126));

        jLabel53.setText("M?? M??n");

        jLabel54.setText("T??n M??n");

        txtdonvi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdonviActionPerformed(evt);
            }
        });

        jLabel55.setText("T??n Nguy??n Li??u");

        jLabel57.setText("??on Vi");

        cbochucvu5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbochucvu5ActionPerformed(evt);
            }
        });

        jLabel58.setText("S?? Luong");

        cbocatruc5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbocatruc5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel25Layout.createSequentialGroup()
                .addGap(9, 46, Short.MAX_VALUE)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel53)
                    .addComponent(jLabel57)
                    .addComponent(jLabel58)
                    .addComponent(jLabel55)
                    .addComponent(jLabel54))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtmamon)
                        .addComponent(cbochucvu5, 0, 151, Short.MAX_VALUE)
                        .addComponent(cbocatruc5, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtsoluong))
                    .addComponent(txtdonvi, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addContainerGap(91, Short.MAX_VALUE)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel53, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtmamon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbochucvu5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel54))
                .addGap(38, 38, 38)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbocatruc5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel55))
                .addGap(27, 27, 27)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel57)
                    .addComponent(txtdonvi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel58)
                    .addComponent(txtsoluong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(72, 72, 72))
        );

        jPanel26.setBackground(new java.awt.Color(255, 255, 204));

        btnlammoinhanvien5.setBackground(new java.awt.Color(51, 153, 255));
        btnlammoinhanvien5.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnlammoinhanvien5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/new-32.png"))); // NOI18N
        btnlammoinhanvien5.setText("L??m m???i");
        btnlammoinhanvien5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlammoinhanvien5ActionPerformed(evt);
            }
        });

        btndoimoinhanvien5.setBackground(new java.awt.Color(51, 153, 255));
        btndoimoinhanvien5.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btndoimoinhanvien5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/add-user-3-32.png"))); // NOI18N
        btndoimoinhanvien5.setText("Th??m");
        btndoimoinhanvien5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndoimoinhanvien5ActionPerformed(evt);
            }
        });

        btnchinhsuanhanvien5.setBackground(new java.awt.Color(51, 153, 255));
        btnchinhsuanhanvien5.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnchinhsuanhanvien5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/available-updates-32.png"))); // NOI18N
        btnchinhsuanhanvien5.setText("Ch???nh s???a");
        btnchinhsuanhanvien5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnchinhsuanhanvien5ActionPerformed(evt);
            }
        });

        btnxoanhanvien5.setBackground(new java.awt.Color(51, 153, 255));
        btnxoanhanvien5.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnxoanhanvien5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/delete-32.png"))); // NOI18N
        btnxoanhanvien5.setText("X??a");
        btnxoanhanvien5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnxoanhanvien5ActionPerformed(evt);
            }
        });

        jPanel27.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btntimkiemnhanvien5.setText("T??m Ki???m");
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
                .addContainerGap(7, Short.MAX_VALUE))
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
                .addComponent(jPanel27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel61.setBackground(new java.awt.Color(204, 204, 204));
        jLabel61.setForeground(new java.awt.Color(255, 51, 51));
        jLabel61.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel61.setText("H??nh ???nh");
        jLabel61.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(513, Short.MAX_VALUE)
                .addComponent(jLabel61, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(jPanel26, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(146, Short.MAX_VALUE)))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(jLabel61, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(237, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(31, 31, 31)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGap(32, 32, 32)))
        );

        tabpnlQuanLy.addTab("C??ng Th???c", jPanel4);

        jPanel3.setBackground(new java.awt.Color(255, 255, 204));

        jPanel13.setBackground(new java.awt.Color(255, 220, 126));

        jLabel10.setText("M?? M??n");

        jLabel11.setText("T??n M??n");

        jLabel19.setText("Trong Luong");

        jLabel24.setText("??on Vi");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(txtmamon1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                                .addComponent(jLabel19)
                                .addGap(18, 18, 18))
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel13Layout.createSequentialGroup()
                                        .addGap(3, 3, 3)
                                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel10)
                                            .addComponent(jLabel11)))
                                    .addComponent(jLabel24))
                                .addGap(36, 36, 36)))
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDonvi1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txttrongluong, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                                .addComponent(txttenmon)))))
                .addContainerGap(81, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap(55, Short.MAX_VALUE)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtmamon1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(35, 35, 35)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txttenmon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(txttrongluong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel24)
                    .addComponent(txtDonvi1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(137, 137, 137))
        );

        jPanel14.setBackground(new java.awt.Color(255, 255, 204));

        btnlammoinhanvien1.setBackground(new java.awt.Color(51, 153, 255));
        btnlammoinhanvien1.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnlammoinhanvien1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/new-32.png"))); // NOI18N
        btnlammoinhanvien1.setText("L??m m???i");
        btnlammoinhanvien1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlammoinhanvien1ActionPerformed(evt);
            }
        });

        jLabel25.setBackground(new java.awt.Color(204, 204, 204));
        jLabel25.setForeground(new java.awt.Color(255, 51, 51));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("H??nh ???nh");
        jLabel25.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btndoimoinhanvien1.setBackground(new java.awt.Color(51, 153, 255));
        btndoimoinhanvien1.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btndoimoinhanvien1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/add-user-3-32.png"))); // NOI18N
        btndoimoinhanvien1.setText("Th??m");
        btndoimoinhanvien1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndoimoinhanvien1ActionPerformed(evt);
            }
        });

        btnchinhsuanhanvien1.setBackground(new java.awt.Color(51, 153, 255));
        btnchinhsuanhanvien1.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnchinhsuanhanvien1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/available-updates-32.png"))); // NOI18N
        btnchinhsuanhanvien1.setText("Ch???nh s???a");
        btnchinhsuanhanvien1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnchinhsuanhanvien1ActionPerformed(evt);
            }
        });

        btnxoanhanvien1.setBackground(new java.awt.Color(51, 153, 255));
        btnxoanhanvien1.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnxoanhanvien1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/delete-32.png"))); // NOI18N
        btnxoanhanvien1.setText("X??a");
        btnxoanhanvien1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnxoanhanvien1ActionPerformed(evt);
            }
        });

        jPanel15.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btntimkiemnhanvien1.setText("T??m Ki???m");
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
                .addContainerGap(7, Short.MAX_VALUE))
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
                .addGap(28, 28, 28)
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
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

        tabpnlQuanLy.addTab("M??n ??n", jPanel3);

        jPanel5.setBackground(new java.awt.Color(255, 255, 204));

        jPanel28.setBackground(new java.awt.Color(255, 255, 204));

        btnLamMoiNguyenLieu.setBackground(new java.awt.Color(51, 153, 255));
        btnLamMoiNguyenLieu.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnLamMoiNguyenLieu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/new-32.png"))); // NOI18N
        btnLamMoiNguyenLieu.setText("L??m m???i");
        btnLamMoiNguyenLieu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLamMoiNguyenLieuActionPerformed(evt);
            }
        });

        jLabel62.setBackground(new java.awt.Color(204, 204, 204));
        jLabel62.setForeground(new java.awt.Color(255, 51, 51));
        jLabel62.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel62.setText("H??nh ???nh");
        jLabel62.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnThemMoiNguyenLieu.setBackground(new java.awt.Color(51, 153, 255));
        btnThemMoiNguyenLieu.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnThemMoiNguyenLieu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/add-user-3-32.png"))); // NOI18N
        btnThemMoiNguyenLieu.setText("Th??m");
        btnThemMoiNguyenLieu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemMoiNguyenLieuActionPerformed(evt);
            }
        });

        btnChinhSuaNguyenLieu.setBackground(new java.awt.Color(51, 153, 255));
        btnChinhSuaNguyenLieu.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnChinhSuaNguyenLieu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/available-updates-32.png"))); // NOI18N
        btnChinhSuaNguyenLieu.setText("Ch???nh s???a");
        btnChinhSuaNguyenLieu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChinhSuaNguyenLieuActionPerformed(evt);
            }
        });

        btnXoaNguyenLieu.setBackground(new java.awt.Color(51, 153, 255));
        btnXoaNguyenLieu.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnXoaNguyenLieu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/delete-32.png"))); // NOI18N
        btnXoaNguyenLieu.setText("X??a");
        btnXoaNguyenLieu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaNguyenLieuActionPerformed(evt);
            }
        });

        jPanel29.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnTimKiemNguyenLieu.setText("T??m Ki???m");
        btnTimKiemNguyenLieu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemNguyenLieuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel29Layout = new javax.swing.GroupLayout(jPanel29);
        jPanel29.setLayout(jPanel29Layout);
        jPanel29Layout.setHorizontalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel29Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnTimKiemNguyenLieu, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTimNguyenLieu, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79))
        );
        jPanel29Layout.setVerticalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel29Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTimNguyenLieu, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTimKiemNguyenLieu)))
        );

        javax.swing.GroupLayout jPanel28Layout = new javax.swing.GroupLayout(jPanel28);
        jPanel28.setLayout(jPanel28Layout);
        jPanel28Layout.setHorizontalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel28Layout.createSequentialGroup()
                        .addComponent(btnChinhSuaNguyenLieu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(btnXoaNguyenLieu, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel28Layout.createSequentialGroup()
                        .addComponent(btnLamMoiNguyenLieu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(btnThemMoiNguyenLieu, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel62, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel28Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel29, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(89, 89, 89))
        );

        jPanel28Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnChinhSuaNguyenLieu, btnLamMoiNguyenLieu, btnThemMoiNguyenLieu, btnXoaNguyenLieu});

        jPanel28Layout.setVerticalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel62, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLamMoiNguyenLieu)
                    .addComponent(btnThemMoiNguyenLieu))
                .addGap(28, 28, 28)
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnChinhSuaNguyenLieu, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnXoaNguyenLieu))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(54, Short.MAX_VALUE))
        );

        jPanel30.setBackground(new java.awt.Color(255, 220, 126));

        jLabel1.setText("M?? Nguy??n Li???u");

        jLabel2.setText("T??n Nguy??n Li???u");

        jLabel3.setText("????n V??? T??nh");

        jLabel6.setText("S??? L?????ng");

        jLabel7.setText("Lo???i Nguy??n Li???u");

        javax.swing.GroupLayout jPanel30Layout = new javax.swing.GroupLayout(jPanel30);
        jPanel30.setLayout(jPanel30Layout);
        jPanel30Layout.setHorizontalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel30Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtsoluong1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtdonvitinh, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txttennguyenlieu, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtmanguyenlieu, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CboLoaiNguyenLieu, 0, 212, Short.MAX_VALUE))
                .addGap(90, 90, 90))
        );
        jPanel30Layout.setVerticalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtmanguyenlieu, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txttennguyenlieu)
                    .addGroup(jPanel30Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtdonvitinh, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtsoluong1)
                    .addGroup(jPanel30Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel6)))
                .addGap(13, 13, 13)
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(CboLoaiNguyenLieu, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(58, 58, 58))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel30, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel28, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(129, 129, 129))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(0, 55, Short.MAX_VALUE)
                .addComponent(jPanel28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(91, 91, 91))
        );

        tabpnlQuanLy.addTab("Nguy??n Li???u", jPanel5);

        jPanel6.setBackground(new java.awt.Color(255, 255, 204));

        jPanel19.setBackground(new java.awt.Color(255, 220, 126));

        jLabel35.setText("M?? Phi??u Nhap");

        jLabel36.setText("??on Gi??");

        jLabel37.setText("S?? Luong");

        jLabel38.setText("??on Vi");

        jLabel39.setText("Loai Nguyen lieu");

        cbochucvu3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbochucvu3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel39)
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel35, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel36)
                                .addComponent(jLabel37))
                            .addComponent(jLabel38))
                        .addGap(40, 40, 40)
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtdonvi1)
                            .addComponent(txtDongia)
                            .addComponent(txtmaphieunhap)
                            .addComponent(txtsoluong2)
                            .addComponent(cbochucvu3, 0, 155, Short.MAX_VALUE))))
                .addGap(0, 39, Short.MAX_VALUE))
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap(58, Short.MAX_VALUE)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtmaphieunhap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel35))
                .addGap(25, 25, 25)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel36)
                    .addComponent(txtDongia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtsoluong2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel37))
                .addGap(32, 32, 32)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel38)
                    .addComponent(txtdonvi1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbochucvu3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel39))
                .addGap(149, 149, 149))
        );

        jPanel20.setBackground(new java.awt.Color(255, 255, 204));

        btnlammoinhanvien3.setBackground(new java.awt.Color(51, 153, 255));
        btnlammoinhanvien3.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnlammoinhanvien3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/new-32.png"))); // NOI18N
        btnlammoinhanvien3.setText("L??m m???i");
        btnlammoinhanvien3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlammoinhanvien3ActionPerformed(evt);
            }
        });

        jLabel43.setBackground(new java.awt.Color(204, 204, 204));
        jLabel43.setForeground(new java.awt.Color(255, 51, 51));
        jLabel43.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel43.setText("H??nh ???nh");
        jLabel43.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btndoimoinhanvien3.setBackground(new java.awt.Color(51, 153, 255));
        btndoimoinhanvien3.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btndoimoinhanvien3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/add-user-3-32.png"))); // NOI18N
        btndoimoinhanvien3.setText("Th??m");
        btndoimoinhanvien3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndoimoinhanvien3ActionPerformed(evt);
            }
        });

        btnchinhsuanhanvien3.setBackground(new java.awt.Color(51, 153, 255));
        btnchinhsuanhanvien3.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnchinhsuanhanvien3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/available-updates-32.png"))); // NOI18N
        btnchinhsuanhanvien3.setText("Ch???nh s???a");
        btnchinhsuanhanvien3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnchinhsuanhanvien3ActionPerformed(evt);
            }
        });

        btnxoanhanvien3.setBackground(new java.awt.Color(51, 153, 255));
        btnxoanhanvien3.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnxoanhanvien3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/delete-32.png"))); // NOI18N
        btnxoanhanvien3.setText("X??a");
        btnxoanhanvien3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnxoanhanvien3ActionPerformed(evt);
            }
        });

        jPanel21.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btntimkiemnhanvien3.setText("T??m Ki???m");
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
                .addContainerGap(7, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel20Layout.createSequentialGroup()
                .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel20Layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
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
                .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
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

        tabpnlQuanLy.addTab("Phi???u Nh???p", jPanel6);

        jPanel7.setBackground(new java.awt.Color(255, 255, 204));

        jPanel16.setBackground(new java.awt.Color(255, 220, 126));

        jLabel26.setText("M?? nh??n vi??n");

        jLabel27.setText("H??? v?? t??n");

        rdonam2.setSelected(true);
        rdonam2.setText("Nam");

        rdonu2.setText("N???");

        jLabel28.setText("S??? ??i???n tho???i");

        jLabel29.setText("?????a ch???");

        jLabel30.setText("M?? ch???c v???");

        cbochucvu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbochucvu2ActionPerformed(evt);
            }
        });

        jLabel31.setText("M?? ca tr???c");

        cbocatruc2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbocatruc2ActionPerformed(evt);
            }
        });

        jLabel32.setText("L????ng");

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
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel31)
                    .addComponent(cbocatruc2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
        btnlammoinhanvien2.setText("L??m m???i");
        btnlammoinhanvien2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlammoinhanvien2ActionPerformed(evt);
            }
        });

        jLabel34.setBackground(new java.awt.Color(204, 204, 204));
        jLabel34.setForeground(new java.awt.Color(255, 51, 51));
        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel34.setText("H??nh ???nh");
        jLabel34.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btndoimoinhanvien2.setBackground(new java.awt.Color(51, 153, 255));
        btndoimoinhanvien2.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btndoimoinhanvien2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/add-user-3-32.png"))); // NOI18N
        btndoimoinhanvien2.setText("Th??m");
        btndoimoinhanvien2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndoimoinhanvien2ActionPerformed(evt);
            }
        });

        btnchinhsuanhanvien2.setBackground(new java.awt.Color(51, 153, 255));
        btnchinhsuanhanvien2.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnchinhsuanhanvien2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/available-updates-32.png"))); // NOI18N
        btnchinhsuanhanvien2.setText("Ch???nh s???a");
        btnchinhsuanhanvien2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnchinhsuanhanvien2ActionPerformed(evt);
            }
        });

        btnxoanhanvien2.setBackground(new java.awt.Color(51, 153, 255));
        btnxoanhanvien2.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnxoanhanvien2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/delete-32.png"))); // NOI18N
        btnxoanhanvien2.setText("X??a");
        btnxoanhanvien2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnxoanhanvien2ActionPerformed(evt);
            }
        });

        jPanel18.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btntimkiemnhanvien2.setText("T??m Ki???m");
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
                .addContainerGap(7, Short.MAX_VALUE))
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
                .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

        tabpnlQuanLy.addTab("Ca Tr???c", jPanel7);

        jMenuBar1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jMenuBar1.setMaximumSize(new java.awt.Dimension(710, 29));
        jMenuBar1.setMinimumSize(new java.awt.Dimension(710, 29));
        jMenuBar1.setPreferredSize(new java.awt.Dimension(710, 29));

        mnDanhmuc.setText("Danh M???c");
        jMenuBar1.add(mnDanhmuc);

        mnThemmoi.setBackground(new java.awt.Color(0, 102, 255));
        mnThemmoi.setBorder(null);
        mnThemmoi.setForeground(new java.awt.Color(255, 255, 255));
        mnThemmoi.setText("Th??m M???i");
        jMenuBar1.add(mnThemmoi);

        mnThongke.setText("Th???ng K??");
        mnThongke.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jMenuBar1.add(mnThongke);

        jMenu2.setText("Tho??t");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tabpnlQuanLy, javax.swing.GroupLayout.DEFAULT_SIZE, 790, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabpnlQuanLy, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 536, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cboChucVuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboChucVuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboChucVuActionPerformed

    private void cboCaTrucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboCaTrucActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboCaTrucActionPerformed
    
    private void btnTimKiemNhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemNhanVienActionPerformed

        NhanVien nv = new NhanVien();
        maNV = txttimkiem.getText();
        nv = Dao.selectById(maNV);
        if (nv == null) {
            JOptionPane.showMessageDialog(this, "kh??ng t??m th????");
            this.newNV();

        } else {
            if (nv.getMaNV().equalsIgnoreCase(maNV)) {
                txtMaNhanVien.setText(nv.getMaNV());
                txtHoVaTen.setText(nv.getHoTen());
                txtSoDienThoai.setText(nv.getsDt());
                if (nv.getGioiTinh()) {
                    rdonam.setSelected(true);
                } else {
                    rdonu.setSelected(true);
                }
                cboCaTruc.setSelectedItem(nv.getMaCatruc());
                cboChucVu.setSelectedItem(nv.getMaCv());
                txtDiaChi.setText(nv.getDiaChi());
                txtPassWord.setText(nv.getMatKhau());
                txtLuong.setText(String.valueOf(nv.getLuong()));
                btnChinhSuaNhanVien.setEnabled(true);
                btnXoaNhanVien.setEnabled(true);
                txtMaNhanVien.setEnabled(false);
            }
        }
    }//GEN-LAST:event_btnTimKiemNhanVienActionPerformed

    private void btnXoaNhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaNhanVienActionPerformed
        this.deteleNV();
    }//GEN-LAST:event_btnXoaNhanVienActionPerformed

    private void btnChinhSuaNhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChinhSuaNhanVienActionPerformed
        //        if (tblnhanvien.getSelectedRow() < 0) {
            //            JOptionPane.showMessageDialog(this, "ch??a c?? d??? li???u");
            //        } else {
            //            this.updateNV();
            //        }
    }//GEN-LAST:event_btnChinhSuaNhanVienActionPerformed

    private void btnDoiMoiNhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoiMoiNhanVienActionPerformed
        if (CheckInput.checkEmpty(txtMaNhanVien.getText(), "ch??a nh???p nh??n vi??n") == false) {
            if (CheckInput.checkEmpty(txtHoVaTen.getText(), "ch??a h??? t??n") == false) {
                if (CheckInput.checkEmpty(txtSoDienThoai.getText(), "ch??a nh???p s??? ??i???n tho???i") == false) {
                    if (CheckInput.checkEmpty(txtDiaChi.getText(), "ch??a nh???p  ?????a ch???") == false) {
                        if (CheckInput.checkEmpty(txtLuong.getText(), "ch??a nh???p l????ng") == false) {
                            if (CheckInput.checkEmpty(txtLuong.getText(), "ch??a nh???p l????ng") == false) {
                                if (CheckInput.checkEmpty(txtPassWord.getText(), "ch??a nh???p password") == false) {
                                    this.insertNV();
                                }
                            }
                        }
                    }
                }

            }

        }
    }//GEN-LAST:event_btnDoiMoiNhanVienActionPerformed

    private void btnLamMoiNhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLamMoiNhanVienActionPerformed
        this.newNV();
    }//GEN-LAST:event_btnLamMoiNhanVienActionPerformed

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

    private void btnLamMoiNguyenLieuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLamMoiNguyenLieuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLamMoiNguyenLieuActionPerformed

    private void btnThemMoiNguyenLieuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemMoiNguyenLieuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnThemMoiNguyenLieuActionPerformed

    private void btnChinhSuaNguyenLieuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChinhSuaNguyenLieuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnChinhSuaNguyenLieuActionPerformed

    private void btnXoaNguyenLieuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaNguyenLieuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnXoaNguyenLieuActionPerformed

    private void btnTimKiemNguyenLieuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemNguyenLieuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTimKiemNguyenLieuActionPerformed

    private void cbocatruc5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbocatruc5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbocatruc5ActionPerformed

    private void txtdonviActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdonviActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdonviActionPerformed
//    }    String maNL;    String maNV;

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ThemMoi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CboLoaiNguyenLieu;
    private javax.swing.JButton btnChinhSuaNguyenLieu;
    private javax.swing.JButton btnChinhSuaNhanVien;
    private javax.swing.JButton btnDoiMoiNhanVien;
    private javax.swing.JButton btnLamMoiNguyenLieu;
    private javax.swing.JButton btnLamMoiNhanVien;
    private javax.swing.JButton btnThemMoiNguyenLieu;
    private javax.swing.JButton btnTimKiemNguyenLieu;
    private javax.swing.JButton btnTimKiemNhanVien;
    private javax.swing.JButton btnXoaNguyenLieu;
    private javax.swing.JButton btnXoaNhanVien;
    private javax.swing.JButton btnchinhsuanhanvien1;
    private javax.swing.JButton btnchinhsuanhanvien2;
    private javax.swing.JButton btnchinhsuanhanvien3;
    private javax.swing.JButton btnchinhsuanhanvien5;
    private javax.swing.JButton btndoimoinhanvien1;
    private javax.swing.JButton btndoimoinhanvien2;
    private javax.swing.JButton btndoimoinhanvien3;
    private javax.swing.JButton btndoimoinhanvien5;
    private javax.swing.JButton btnlammoinhanvien1;
    private javax.swing.JButton btnlammoinhanvien2;
    private javax.swing.JButton btnlammoinhanvien3;
    private javax.swing.JButton btnlammoinhanvien5;
    private javax.swing.JButton btntimkiemnhanvien1;
    private javax.swing.JButton btntimkiemnhanvien2;
    private javax.swing.JButton btntimkiemnhanvien3;
    private javax.swing.JButton btntimkiemnhanvien5;
    private javax.swing.JButton btnxoanhanvien1;
    private javax.swing.JButton btnxoanhanvien2;
    private javax.swing.JButton btnxoanhanvien3;
    private javax.swing.JButton btnxoanhanvien5;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cboCaTruc;
    private javax.swing.JComboBox<String> cboChucVu;
    private javax.swing.JComboBox<String> cbocatruc2;
    private javax.swing.JComboBox<String> cbocatruc5;
    private javax.swing.JComboBox<String> cbochucvu2;
    private javax.swing.JComboBox<String> cbochucvu3;
    private javax.swing.JComboBox<String> cbochucvu5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
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
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel7;
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
    private javax.swing.JLabel lblHinhNhanVien;
    private javax.swing.JMenu mnDanhmuc;
    private javax.swing.JMenu mnThemmoi;
    private javax.swing.JMenu mnThongke;
    private javax.swing.JPanel pnlNhanvien;
    private javax.swing.JRadioButton rdonam;
    private javax.swing.JRadioButton rdonam2;
    private javax.swing.JRadioButton rdonu;
    private javax.swing.JRadioButton rdonu2;
    private javax.swing.JTabbedPane tabpnlQuanLy;
    private javax.swing.JTextField txtDiaChi;
    private javax.swing.JTextField txtDongia;
    private javax.swing.JTextField txtDonvi1;
    private javax.swing.JTextField txtHoVaTen;
    private javax.swing.JTextField txtLuong;
    private javax.swing.JTextField txtMaNhanVien;
    private javax.swing.JTextField txtPassWord;
    private javax.swing.JTextField txtSoDienThoai;
    private javax.swing.JTextField txtTimNguyenLieu;
    private javax.swing.JTextField txtdiachi2;
    private javax.swing.JTextField txtdonvi;
    private javax.swing.JTextField txtdonvi1;
    private javax.swing.JTextField txtdonvitinh;
    private javax.swing.JTextField txthovaten2;
    private javax.swing.JTextField txtluong2;
    private javax.swing.JTextField txtmamon;
    private javax.swing.JTextField txtmamon1;
    private javax.swing.JTextField txtmanguyenlieu;
    private javax.swing.JTextField txtmanhanvien2;
    private javax.swing.JTextField txtmaphieunhap;
    private javax.swing.JTextField txtpassword2;
    private javax.swing.JTextField txtsodienthoai2;
    private javax.swing.JTextField txtsoluong;
    private javax.swing.JTextField txtsoluong1;
    private javax.swing.JTextField txtsoluong2;
    private javax.swing.JTextField txttenmon;
    private javax.swing.JTextField txttennguyenlieu;
    private javax.swing.JTextField txttimkiem;
    private javax.swing.JTextField txttimkiem1;
    private javax.swing.JTextField txttimkiem2;
    private javax.swing.JTextField txttimkiem3;
    private javax.swing.JTextField txttimkiem5;
    private javax.swing.JTextField txttrongluong;
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
        txtsoluong1.setText("");
        txtdonvitinh.setText("");
        btnChinhSuaNguyenLieu.setEnabled(false);
        btnXoaNguyenLieu.setEnabled(false);

    }
    NguyenlieuDAO DaoNL = new NguyenlieuDAO();

    void insertNguyenLieu() {
        NguyenLieu model = getFormNL();
        NguyenLieu nl = DaoNL.selectById(model.getManguyenlieu());
        if (nl == null) {
           try {
            DaoNL.insert(model);
            MsgBox.alert(this, "Th??m m???i th??nh c??ng!");
        } catch (HeadlessException e) {
            MsgBox.alert(this, "Th??m m???i th???t b???i!");
        }    
        }else{
        JOptionPane.showMessageDialog(this, "Tr??ng m?? Nguy??n Li???u");
        }
    }
 
    NguyenLieu getFormNL() {
        NguyenLieu nl = new NguyenLieu();
        nl.setManguyenlieu(txtmanguyenlieu.getText());
        nl.setTenNguyenLieu(txttennguyenlieu.getText());
        nl.setSoluong(Double.valueOf(txtsoluong1.getText()));
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
            MsgBox.alert(this, "C???p nh???t th??nh c??ng!");
        } catch (Exception e) {
            MsgBox.alert(this, "C???p nh???t th???t b???i!");
        }
    }

    private void deteleNL() {
        String maNL = txtmanguyenlieu.getText();
        try {
            DaoNL.delete(maNL);
            this.newNGuyenLieu();
            MsgBox.alert(this, "X??a th??nh c??ng!");
        } catch (Exception e) {
            MsgBox.alert(this, "X??a th???t b???i!");
        }
    }
    //-------------------------------------------------------------------------

    void newNV() {
        fillComboBoxChucVu();
        btnChinhSuaNhanVien.setEnabled(false);
        btnXoaNhanVien.setEnabled(false);
        txtMaNhanVien.setEnabled(true);
        txtMaNhanVien.setText("");
        txtHoVaTen.setText("");
        rdonam.isSelected();
        txtSoDienThoai.setText("");
        txtDiaChi.setText("");
        txtPassWord.setText("");
        txtLuong.setText("");
    }
    ChucVuDAO cvdao = new ChucVuDAO();

    void fillComboBoxChucVu() {
        DefaultComboBoxModel model = (DefaultComboBoxModel) cboChucVu.getModel();
        model.removeAllElements();
        List<ChucVu> list = cvdao.selectAll();
        model.addElement("Ch??a ch???n");
        for (ChucVu cv : list) {
            model.addElement(cv.getMaCV());
        }
    }
    CaTrucDAO ctdao = new CaTrucDAO();

    void fillComboBoxCatruc() {
        DefaultComboBoxModel model = (DefaultComboBoxModel) cboCaTruc.getModel();
        model.removeAllElements();
        List<CaTruc> list = ctdao.selectAll();
        model.addElement("Ch??a ch???n");
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

                MsgBox.alert(this, "Th??m m???i th??nh c??ng!");
            } catch (HeadlessException e) {
                MsgBox.alert(this, "Th??m m???i th???t b???i!");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Tr??ng m?? nh??n vi??n");
        }

    }

    NhanVien getFormNV() {
        NhanVien nv = new NhanVien();
        nv.setMaNV(txtMaNhanVien.getText());
        nv.setHoTen(txtHoVaTen.getText());
        nv.setGioiTinh(rdonam.isSelected());
        nv.setsDt(txtSoDienThoai.getText());
        nv.setDiaChi(txtDiaChi.getText());
        nv.setMaCv((String) cboChucVu.getSelectedItem());
        nv.setMaCatruc((String) cboCaTruc.getSelectedItem());
        nv.setMatKhau(txtPassWord.getText());
        nv.setLuong(Double.valueOf(txtLuong.getText()));

        return nv;
    }

    void updateNV() {
        NhanVien model = getFormNV();
        try {
            Dao.update(model);

            MsgBox.alert(this, "C???p nh???t th??nh c??ng!");
        } catch (Exception e) {
            MsgBox.alert(this, "C???p nh???t th???t b???i!");
        }
    }

    private void deteleNV() {
        String macd = txtMaNhanVien.getText();
        try {
            Dao.delete(macd);
            this.newNV();
            MsgBox.alert(this, "X??a th??nh c??ng!");
        } catch (Exception e) {
            MsgBox.alert(this, "X??a th???t b???i!");
        }
    }
}
