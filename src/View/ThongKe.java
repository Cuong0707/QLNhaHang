package View;


import Dao.CaTrucDAO;
import Dao.HoaDonDAO;
import Dao.KhachHangDAO;
import Dao.NguyenlieuDAO;
import Dao.NhanVienDAO;
import Dao.PhieuNhapDAO;
import Dao.ThongKeDao;
import Helper.OutputExcel;
import Model.CaTruc;
import Model.KhachHang;
import Model.NguyenLieu;
import Model.NhanVien;
import Model.PhieuNhap;
import java.awt.Color;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class ThongKe extends javax.swing.JFrame {

    public ThongKe() {
        initComponents();
        WatterMake(txtTimkiem,"Tim Kiem");
        this.setLocationRelativeTo(null);
        mnThongke.setForeground(Color.red);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlTool = new javax.swing.JPanel();
        pnlTimkiem = new javax.swing.JPanel();
        txtTimkiem = new javax.swing.JTextField();
        pnlSapxep = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cboChoncot = new javax.swing.JComboBox<>();
        cboSapxeptheo = new javax.swing.JComboBox<>();
        btnXemchitiet = new javax.swing.JButton();
        btnXuatfile = new javax.swing.JButton();
        tabpnlQuanLy = new javax.swing.JTabbedPane();
        pnlNhanvien = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblNhanVien = new javax.swing.JTable();
        pnlPhieunhap = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblPhieunhap = new javax.swing.JTable();
        pnlNguyenlieu = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblNguyenLieu = new javax.swing.JTable();
        pnlKhachhang = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblKhachhang = new javax.swing.JTable();
        pnlCatruc = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tblCaTruc = new javax.swing.JTable();
        pnlHoadon = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblHoadon = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txtMahd = new javax.swing.JTextField();
        btnThongKe = new javax.swing.JButton();
        txtNgay = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
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

        pnlTimkiem.setBorder(javax.swing.BorderFactory.createTitledBorder("T??m Ki???m"));

        txtTimkiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTimkiemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlTimkiemLayout = new javax.swing.GroupLayout(pnlTimkiem);
        pnlTimkiem.setLayout(pnlTimkiemLayout);
        pnlTimkiemLayout.setHorizontalGroup(
            pnlTimkiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtTimkiem)
        );
        pnlTimkiemLayout.setVerticalGroup(
            pnlTimkiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTimkiemLayout.createSequentialGroup()
                .addComponent(txtTimkiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 10, Short.MAX_VALUE))
        );

        pnlSapxep.setBorder(javax.swing.BorderFactory.createTitledBorder("S???p X???p"));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel1.setText("Ch???n C???t");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel2.setText("S???p X???p Theo");

        cboChoncot.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboChoncot.setMaximumSize(new java.awt.Dimension(72, 26));
        cboChoncot.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboChoncotItemStateChanged(evt);
            }
        });

        cboSapxeptheo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "T??ng", "Gi???m" }));
        cboSapxeptheo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboSapxeptheoItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout pnlSapxepLayout = new javax.swing.GroupLayout(pnlSapxep);
        pnlSapxep.setLayout(pnlSapxepLayout);
        pnlSapxepLayout.setHorizontalGroup(
            pnlSapxepLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSapxepLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlSapxepLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlSapxepLayout.createSequentialGroup()
                        .addGroup(pnlSapxepLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(cboSapxeptheo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cboChoncot, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlSapxepLayout.setVerticalGroup(
            pnlSapxepLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSapxepLayout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cboChoncot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cboSapxeptheo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        btnXemchitiet.setText("Xem Chi Ti???t");
        btnXemchitiet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXemchitietActionPerformed(evt);
            }
        });

        btnXuatfile.setText("Xu???t File");

        javax.swing.GroupLayout pnlToolLayout = new javax.swing.GroupLayout(pnlTool);
        pnlTool.setLayout(pnlToolLayout);
        pnlToolLayout.setHorizontalGroup(
            pnlToolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlToolLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlToolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlSapxep, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlTimkiem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(pnlToolLayout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addGroup(pnlToolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnXemchitiet, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                    .addComponent(btnXuatfile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        pnlToolLayout.setVerticalGroup(
            pnlToolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlToolLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(pnlTimkiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnlSapxep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnXemchitiet)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnXuatfile)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabpnlQuanLy.setBackground(new java.awt.Color(255, 220, 126));
        tabpnlQuanLy.setMaximumSize(new java.awt.Dimension(546, 332));
        tabpnlQuanLy.setMinimumSize(new java.awt.Dimension(546, 332));
        tabpnlQuanLy.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tabpnlQuanLyKeyPressed(evt);
            }
        });

        pnlNhanvien.setBackground(new java.awt.Color(255, 255, 204));
        pnlNhanvien.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                pnlNhanvienComponentShown(evt);
            }
        });

        tblNhanVien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "M?? NV", "H??? T??n NV", "Gi???i T??nh", "S??? ??T", "?????a Ch???", "Ch???c V??? ", "Ca tr???c", "L????ng", "M???t Kh???u"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, true, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblNhanVien);
        if (tblNhanVien.getColumnModel().getColumnCount() > 0) {
            tblNhanVien.getColumnModel().getColumn(0).setResizable(false);
            tblNhanVien.getColumnModel().getColumn(1).setResizable(false);
            tblNhanVien.getColumnModel().getColumn(2).setResizable(false);
            tblNhanVien.getColumnModel().getColumn(3).setResizable(false);
            tblNhanVien.getColumnModel().getColumn(4).setResizable(false);
            tblNhanVien.getColumnModel().getColumn(5).setResizable(false);
            tblNhanVien.getColumnModel().getColumn(7).setResizable(false);
            tblNhanVien.getColumnModel().getColumn(8).setResizable(false);
        }

        javax.swing.GroupLayout pnlNhanvienLayout = new javax.swing.GroupLayout(pnlNhanvien);
        pnlNhanvien.setLayout(pnlNhanvienLayout);
        pnlNhanvienLayout.setHorizontalGroup(
            pnlNhanvienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNhanvienLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 581, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlNhanvienLayout.setVerticalGroup(
            pnlNhanvienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNhanvienLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 331, Short.MAX_VALUE)
                .addContainerGap())
        );

        tabpnlQuanLy.addTab("Nh??n Vi??n", pnlNhanvien);

        pnlPhieunhap.setBackground(new java.awt.Color(255, 255, 204));
        pnlPhieunhap.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                pnlPhieunhapComponentShown(evt);
            }
        });

        tblPhieunhap.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "MaPhieuNhap", "MaNgLieu", "DonGia", "DonViTinh", "SoLuong", "NgayLapPhieu", "NgayNhap", "MaCC", "NguoiNhap"
            }
        ));
        jScrollPane3.setViewportView(tblPhieunhap);

        javax.swing.GroupLayout pnlPhieunhapLayout = new javax.swing.GroupLayout(pnlPhieunhap);
        pnlPhieunhap.setLayout(pnlPhieunhapLayout);
        pnlPhieunhapLayout.setHorizontalGroup(
            pnlPhieunhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPhieunhapLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 581, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlPhieunhapLayout.setVerticalGroup(
            pnlPhieunhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPhieunhapLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 331, Short.MAX_VALUE)
                .addContainerGap())
        );

        tabpnlQuanLy.addTab("Phi???u Nh???p", pnlPhieunhap);

        pnlNguyenlieu.setBackground(new java.awt.Color(255, 255, 204));
        pnlNguyenlieu.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                pnlNguyenlieuComponentShown(evt);
            }
        });

        tblNguyenLieu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "MaLoaiNguyenLieu", "TenLoaiNglieu"
            }
        ));
        jScrollPane4.setViewportView(tblNguyenLieu);

        javax.swing.GroupLayout pnlNguyenlieuLayout = new javax.swing.GroupLayout(pnlNguyenlieu);
        pnlNguyenlieu.setLayout(pnlNguyenlieuLayout);
        pnlNguyenlieuLayout.setHorizontalGroup(
            pnlNguyenlieuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlNguyenlieuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 581, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlNguyenlieuLayout.setVerticalGroup(
            pnlNguyenlieuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNguyenlieuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 331, Short.MAX_VALUE)
                .addContainerGap())
        );

        tabpnlQuanLy.addTab("Nguy??n Li???u", pnlNguyenlieu);

        pnlKhachhang.setBackground(new java.awt.Color(255, 255, 204));
        pnlKhachhang.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                pnlKhachhangComponentShown(evt);
            }
        });

        tblKhachhang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "MaKH", "HoTenKH", "SoDT", "DiaChi"
            }
        ));
        jScrollPane5.setViewportView(tblKhachhang);

        javax.swing.GroupLayout pnlKhachhangLayout = new javax.swing.GroupLayout(pnlKhachhang);
        pnlKhachhang.setLayout(pnlKhachhangLayout);
        pnlKhachhangLayout.setHorizontalGroup(
            pnlKhachhangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlKhachhangLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 581, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlKhachhangLayout.setVerticalGroup(
            pnlKhachhangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlKhachhangLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 331, Short.MAX_VALUE)
                .addContainerGap())
        );

        tabpnlQuanLy.addTab("Kh??ch H??ng", pnlKhachhang);

        pnlCatruc.setBackground(new java.awt.Color(255, 255, 204));
        pnlCatruc.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                pnlCatrucComponentShown(evt);
            }
        });

        tblCaTruc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "MaCaTruc", "GioBatDau", "GioKetCa"
            }
        ));
        jScrollPane6.setViewportView(tblCaTruc);

        javax.swing.GroupLayout pnlCatrucLayout = new javax.swing.GroupLayout(pnlCatruc);
        pnlCatruc.setLayout(pnlCatrucLayout);
        pnlCatrucLayout.setHorizontalGroup(
            pnlCatrucLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCatrucLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 581, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlCatrucLayout.setVerticalGroup(
            pnlCatrucLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCatrucLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 331, Short.MAX_VALUE)
                .addContainerGap())
        );

        tabpnlQuanLy.addTab("Ca Tr???c", pnlCatruc);

        pnlHoadon.setBackground(new java.awt.Color(255, 255, 204));
        pnlHoadon.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                pnlHoadonComponentShown(evt);
            }
        });

        tblHoadon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "M?? H??a ????n", "Ng??y L???p H??a ????n", "Ng?????i L???p H??a ????n", "H??nh Th???c Thanh To??n", "M?? Kh??ch H??ng"
            }
        ));
        jScrollPane2.setViewportView(tblHoadon);

        jLabel4.setText("Chi Ti???t");

        jLabel5.setText("Th???ng K?? H??a ????n");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Xem Th???ng K??"));

        jLabel6.setText("M?? H??a ????n: ");

        btnThongKe.setText("T???ng Ti???n H??a ????n");
        btnThongKe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThongKeActionPerformed(evt);
            }
        });

        jLabel7.setText("Ng??y: ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtMahd, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNgay, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnThongKe, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtMahd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnThongKe)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(txtNgay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(224, 224, 224)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlHoadonLayout = new javax.swing.GroupLayout(pnlHoadon);
        pnlHoadon.setLayout(pnlHoadonLayout);
        pnlHoadonLayout.setHorizontalGroup(
            pnlHoadonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHoadonLayout.createSequentialGroup()
                .addGroup(pnlHoadonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlHoadonLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pnlHoadonLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2)))
                .addContainerGap())
            .addGroup(pnlHoadonLayout.createSequentialGroup()
                .addGap(273, 273, 273)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlHoadonLayout.setVerticalGroup(
            pnlHoadonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHoadonLayout.createSequentialGroup()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        tabpnlQuanLy.addTab("H??a ????n", pnlHoadon);

        jMenuBar1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jMenuBar1.setMaximumSize(new java.awt.Dimension(710, 29));
        jMenuBar1.setMinimumSize(new java.awt.Dimension(710, 29));
        jMenuBar1.setPreferredSize(new java.awt.Dimension(710, 29));

        mnDanhmuc.setText("Danh M???c");
        jMenuBar1.add(mnDanhmuc);

        mnThemmoi.setText("Th??m M???i");
        jMenuBar1.add(mnThemmoi);

        mnThongke.setBackground(new java.awt.Color(0, 102, 255));
        mnThongke.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        mnThongke.setForeground(new java.awt.Color(255, 255, 255));
        mnThongke.setText("Th???ng K??");
        mnThongke.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jMenuBar1.add(mnThongke);

        jMenu2.setText("Tho??t");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlTool, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tabpnlQuanLy, javax.swing.GroupLayout.PREFERRED_SIZE, 614, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlTool, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(tabpnlQuanLy, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        tabpnlQuanLy.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tabpnlQuanLyKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tabpnlQuanLyKeyPressed
        
    }//GEN-LAST:event_tabpnlQuanLyKeyPressed

    private void pnlNhanvienComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_pnlNhanvienComponentShown
        fillChoncot(tblNhanVien);
    }//GEN-LAST:event_pnlNhanvienComponentShown

    private void pnlHoadonComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_pnlHoadonComponentShown
        fillChoncot(tblHoadon);
    }//GEN-LAST:event_pnlHoadonComponentShown

    private void txtTimkiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTimkiemActionPerformed
        if(pnlNhanvien.isShowing())
        {
            selectByid(tblNhanVien);
        }
        else if(pnlHoadon.isShowing())
        {
            selectByid(tblHoadon);
        }
        else if(pnlPhieunhap.isShowing())
        {
            selectByid(tblPhieunhap);
        }
        else if(pnlCatruc.isShowing())
        {
            selectByid(tblCaTruc);
        }
        else if(pnlKhachhang.isShowing())
        {
            selectByid(tblKhachhang);
        }
        else if(pnlNguyenlieu.isShowing())
        {
            selectByid(tblNguyenLieu);
        }
       
    }//GEN-LAST:event_txtTimkiemActionPerformed

    private void cboChoncotItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboChoncotItemStateChanged
        if(pnlNhanvien.isShowing())
        {
            this.showtableNhanvien();
        }
        else if(pnlHoadon.isShowing())
        {
            this.showtableHoaDon();
        }
        else if(pnlPhieunhap.isShowing())
        {
            this.showTablephieunhap();
        }
        else if(pnlCatruc.isShowing())
        {
            this.showTablencatruc();
        }
        else if(pnlKhachhang.isShowing())
        {
            this.showTablenkhachhang();
        }
        else if(pnlNguyenlieu.isShowing())
        {
            this.showTablenguyenlieu();
        }
        
    }//GEN-LAST:event_cboChoncotItemStateChanged

    private void cboSapxeptheoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboSapxeptheoItemStateChanged
        if(pnlNhanvien.isShowing())
        {
            this.showtableNhanvien();
        }
        else if(pnlHoadon.isShowing())
        {
            this.showtableHoaDon();
        }
        else if(pnlPhieunhap.isShowing())
        {
            this.showTablephieunhap();
        }
        else if(pnlCatruc.isShowing())
        {
            this.showTablencatruc();
        }
        else if(pnlKhachhang.isShowing())
        {
            this.showTablenkhachhang();
        }
        else if(pnlNguyenlieu.isShowing())
        {
            this.showTablenguyenlieu();
        }
    }//GEN-LAST:event_cboSapxeptheoItemStateChanged

    private void btnXemchitietActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXemchitietActionPerformed
        if(pnlNhanvien.isShowing())
        {
            DefaultTableModel model = (DefaultTableModel) tblNhanVien.getModel();
            OutputExcel out = new OutputExcel("NhanVien", model);
        }
        else if(pnlHoadon.isShowing())
        {
            DefaultTableModel model = (DefaultTableModel) tblHoadon.getModel();
            OutputExcel out = new OutputExcel("HoaDon", model);
        }
        else if(pnlPhieunhap.isShowing())
        {
            DefaultTableModel model = (DefaultTableModel) tblNguyenLieu.getModel();
            OutputExcel out = new OutputExcel("NguyenLieu", model);
        }
        else if(pnlCatruc.isShowing())
        {
            DefaultTableModel model = (DefaultTableModel) tblCaTruc.getModel();
            OutputExcel out = new OutputExcel("CaTruc", model);
        }
        else if(pnlKhachhang.isShowing())
        {
            DefaultTableModel model = (DefaultTableModel) tblKhachhang.getModel();
            OutputExcel out = new OutputExcel("Khachhang", model);
        }
        else if(pnlNguyenlieu.isShowing())
        {
            DefaultTableModel model = (DefaultTableModel) tblNguyenLieu.getModel();
            OutputExcel out = new OutputExcel("HoaDon", model);
        }
    }//GEN-LAST:event_btnXemchitietActionPerformed

    private void pnlPhieunhapComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_pnlPhieunhapComponentShown
        this.showTablephieunhap();
    }//GEN-LAST:event_pnlPhieunhapComponentShown

    private void pnlNguyenlieuComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_pnlNguyenlieuComponentShown
        this.showTablenguyenlieu();
    }//GEN-LAST:event_pnlNguyenlieuComponentShown

    private void pnlKhachhangComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_pnlKhachhangComponentShown
        this.showTablenkhachhang();
    }//GEN-LAST:event_pnlKhachhangComponentShown

    private void pnlCatrucComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_pnlCatrucComponentShown
        this.showTablencatruc();
    }//GEN-LAST:event_pnlCatrucComponentShown

    private void btnThongKeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThongKeActionPerformed
        this.thongKe();
    }//GEN-LAST:event_btnThongKeActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ThongKe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnThongKe;
    private javax.swing.JButton btnXemchitiet;
    private javax.swing.JButton btnXuatfile;
    private javax.swing.JComboBox<String> cboChoncot;
    private javax.swing.JComboBox<String> cboSapxeptheo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JMenu mnDanhmuc;
    private javax.swing.JMenu mnThemmoi;
    private javax.swing.JMenu mnThongke;
    private javax.swing.JPanel pnlCatruc;
    private javax.swing.JPanel pnlHoadon;
    private javax.swing.JPanel pnlKhachhang;
    private javax.swing.JPanel pnlNguyenlieu;
    private javax.swing.JPanel pnlNhanvien;
    private javax.swing.JPanel pnlPhieunhap;
    private javax.swing.JPanel pnlSapxep;
    private javax.swing.JPanel pnlTimkiem;
    private javax.swing.JPanel pnlTool;
    private javax.swing.JTabbedPane tabpnlQuanLy;
    private javax.swing.JTable tblCaTruc;
    private javax.swing.JTable tblHoadon;
    private javax.swing.JTable tblKhachhang;
    private javax.swing.JTable tblNguyenLieu;
    private javax.swing.JTable tblNhanVien;
    private javax.swing.JTable tblPhieunhap;
    private javax.swing.JTextField txtMahd;
    private javax.swing.JTextField txtNgay;
    private javax.swing.JTextField txtTimkiem;
    // End of variables declaration//GEN-END:variables

    
    NhanVienDAO NVdao = new NhanVienDAO();
    HoaDonDAO HDdao = new HoaDonDAO();
    PhieuNhapDAO PNDAO = new PhieuNhapDAO();
    NguyenlieuDAO NLDao = new NguyenlieuDAO();
    KhachHangDAO KHDao = new KhachHangDAO();
    CaTrucDAO CTDao = new CaTrucDAO();
    ThongKeDao TKDao = new ThongKeDao();
    
    NhanVien nhanVien = new NhanVien();
    Model.HoaDon hoaDon = new Model.HoaDon();
    PhieuNhap phieuNhap = new PhieuNhap();
    NguyenLieu nguyenLieu = new NguyenLieu();
    KhachHang khachHang = new KhachHang();
    CaTruc caTruc = new CaTruc();
    
    
    private void WatterMake(JTextField searchText, String chuoi) {
        searchText.setForeground(Color.GRAY);
        searchText.setText(chuoi);
        searchText.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) 
            {
                if (searchText.getText().equals(chuoi)) 
                {
                    searchText.setText("");
                    searchText.setForeground(Color.BLACK);
                }
            }
            @Override
            public void focusLost(FocusEvent e) 
            {
                if (searchText.getText().isEmpty()) 
                {
                    searchText.setForeground(Color.GRAY);
                    searchText.setText(chuoi);
                }
            }
            });
    }
    public void showtableNhanvien()
    {
        DefaultTableModel model = (DefaultTableModel) tblNhanVien.getModel();
        model.setRowCount(0);
        if(cboChoncot.getItemCount()<1 )
        {
            try {
                List<NhanVien> list = NVdao.selectAll();
                for (NhanVien nv : list) {
                    Object[] row = {
                        nv.getMaNV(),
                        nv.getHoTen(),
                        nv.getGioiTinh(),
                        nv.getsDt(),
                        nv.getDiaChi(),
                        nv.getMaCv(),
                        nv.getMaCatruc(),
                        nv.getLuong(),
                        nv.getMatKhau()
                    };
                    model.addRow(row);  
                }
            } 
            catch (Exception e) {
                JOptionPane.showMessageDialog(this, "L???i Truy V???n D??? Li???u 111!!");
            }
        }
        else{
            try {
                String a;
                if(cboSapxeptheo.getSelectedItem().equals("T??ng"))
                {
                    a = "ASC";
                }
                else{
                    a= "DESC";
                }

                List<NhanVien> listnv = NVdao.selectAllbyentity(nhanVien.getEntity().get(cboChoncot.getSelectedIndex()),a);
                for (NhanVien nv : listnv) {
                    Object[] row = {
                        nv.getMaNV(),
                        nv.getHoTen(),
                        nv.getGioiTinh(),
                        nv.getsDt(),
                        nv.getDiaChi(),
                        nv.getMaCv(),
                        nv.getMaCatruc(),
                        nv.getLuong(),
                        nv.getMatKhau()
                    };
                    model.addRow(row);   
                    
                }
            } 
            catch (Exception e) {
                JOptionPane.showMessageDialog(this, "L???i Truy V???n D??? Li???u 111!!");
            }
        }
    }
    public void showTablephieunhap()
    {
        DefaultTableModel model = (DefaultTableModel) tblPhieunhap.getModel();
        model.setRowCount(0);
        if(cboChoncot.getItemCount()<1 )
        {
            try {
                List<PhieuNhap> list = PNDAO.selectAll();
                for (PhieuNhap pn : list) {
                    Object[] row = {
                        pn.getMaPhieuNhap(),pn.getMaNgLieu(),pn.getDonGia(),pn.getDonViTinh(),pn.getSoluong(),
                        pn.getNgayLapPhieu(),pn.getNgayNhap(),pn.getMaCC(),pn.getMaNV()
                    };
                    model.addRow(row);  
                }
            } 
            catch (Exception e) {
                JOptionPane.showMessageDialog(this, "L???i Truy V???n D??? Li???u 111!!");
            }
        }
        else{
            try {
                String a;
                if(cboSapxeptheo.getSelectedItem().equals("T??ng"))
                {
                    a = "ASC";
                }
                else{
                    a= "DESC";
                }

                List<PhieuNhap> listnv = PNDAO.selectAllbyentity(phieuNhap.getEntity().get(cboChoncot.getSelectedIndex()),a);
                for (PhieuNhap pn : listnv) {
                    Object[] row = {
                        pn.getMaPhieuNhap(),pn.getMaNgLieu(),pn.getDonGia(),pn.getDonViTinh(),pn.getSoluong(),
                        pn.getNgayLapPhieu(),pn.getNgayNhap(),pn.getMaCC(),pn.getMaNV()
                    };
                    model.addRow(row);   
                    
                }
            } 
            catch (Exception e) {
                JOptionPane.showMessageDialog(this, "L???i Truy V???n D??? Li???u 111!!");
            }
        }
    }
    
    
    public void showtableHoaDon()
    {
        DefaultTableModel model = (DefaultTableModel) tblHoadon.getModel();
        model.setRowCount(0);
        if(cboChoncot.getItemCount()<1 )
        {
            try {
                List<Model.HoaDon> list = HDdao.selectAll();
                for (Model.HoaDon a : list) {
                Object[] row = {
                    a.getMaHoaDon(),
                    a.getNgayLapHD(),
                    a.getMaNV(),
                    a.getHinhThucTT(),
                    a.getMaKH()
                    };
                    model.addRow(row);
                }
            } 
            catch (Exception e) {
                JOptionPane.showMessageDialog(this, "L???i Truy V???n D??? Li???u 111!!");
            }
        }
        else{
            try {
                String a;
                if(cboSapxeptheo.getSelectedItem().equals("T??ng"))
                {
                    a = "ASC";
                }
                else{
                    a= "DESC";
                }
                List<Model.HoaDon> list = HDdao.selectAllbyentity(hoaDon.getEntity().get(cboChoncot.getSelectedIndex()), a);
                for (Model.HoaDon b : list) 
                {
                    Object[] row = {
                        b.getMaHoaDon(),
                        b.getNgayLapHD(),
                        b.getMaNV(),
                        b.getHinhThucTT(),
                        b.getMaKH()
                        };
                    model.addRow(row);
                }    
                
            } 
            catch (Exception e) {
                JOptionPane.showMessageDialog(this, "L???i Truy V???n D??? Li???u 111!!");
            }
        }
    }
    public void showTablenguyenlieu()
    {
        DefaultTableModel model = (DefaultTableModel) tblNguyenLieu.getModel();
        model.setRowCount(0);
        if(cboChoncot.getItemCount()<1 )
        {
            try {
                List<NguyenLieu> list = NLDao.selectAll();
                for (NguyenLieu pn : list) {
                    Object[] row = {
                        pn.getManguyenlieu(),pn.getTenNguyenLieu()
                    };
                    model.addRow(row);  
                }
            } 
            catch (Exception e) {
                JOptionPane.showMessageDialog(this, "L???i Truy V???n D??? Li???u 111!!");
            }
        }
        else{
            try {
                String a;
                if(cboSapxeptheo.getSelectedItem().equals("T??ng"))
                {
                    a = "ASC";
                }
                else{
                    a= "DESC";
                }

                List<NguyenLieu> listnv = NLDao.selectAllbyentity(nguyenLieu.getEntity().get(cboChoncot.getSelectedIndex()),a);
                for (NguyenLieu pn : listnv) {
                    Object[] row = {
                        pn.getManguyenlieu(),pn.getTenNguyenLieu()
                    };
                    model.addRow(row);   
                    
                }
            } 
            catch (Exception e) {
                JOptionPane.showMessageDialog(this, "L???i Truy V???n D??? Li???u 111!!");
            }
        }
    }
    public void showTablenkhachhang()
    {
        DefaultTableModel model = (DefaultTableModel) tblKhachhang.getModel();
        model.setRowCount(0);
        if(cboChoncot.getItemCount()<1 )
        {
            try {
                List<KhachHang> list = KHDao.selectAll();
                for (KhachHang pn : list) {
                    Object[] row = {
                        pn.getMaKH(),pn.getHoTenKH(),pn.getSoDT(),pn.getDiaChi()
                    };
                    model.addRow(row);  
                }
            } 
            catch (Exception e) {
                JOptionPane.showMessageDialog(this, "L???i Truy V???n D??? Li???u 111!!");
            }
        }
        else{
            try {
                String a;
                if(cboSapxeptheo.getSelectedItem().equals("T??ng"))
                {
                    a = "ASC";
                }
                else{
                    a= "DESC";
                }

                List<KhachHang> listnv = KHDao.selectAllbyentity(khachHang.getEntity().get(cboChoncot.getSelectedIndex()),a);
                for (KhachHang pn : listnv) {
                    Object[] row = {
                        pn.getMaKH(),pn.getHoTenKH(),pn.getSoDT(),pn.getDiaChi()
                    };
                    model.addRow(row);   
                    
                }
            } 
            catch (Exception e) {
                JOptionPane.showMessageDialog(this, "L???i Truy V???n D??? Li???u 111!!");
            }
        }
    }
    public void showTablencatruc()
    {
        DefaultTableModel model = (DefaultTableModel) tblCaTruc.getModel();
        model.setRowCount(0);
        if(cboChoncot.getItemCount()<1 )
        {
            try {
                List<CaTruc> list = CTDao.selectAll();
                for (CaTruc pn : list) {
                    Object[] row = {
                        pn.getMacaTruc(),pn.getGiobatdau(),pn.getGioketca()
                    };
                    model.addRow(row);  
                }
            } 
            catch (Exception e) {
                JOptionPane.showMessageDialog(this, "L???i Truy V???n D??? Li???u 111!!");
            }
        }
        else{
            try {
                String a;
                if(cboSapxeptheo.getSelectedItem().equals("T??ng"))
                {
                    a = "ASC";
                }
                else{
                    a= "DESC";
                }

                List<CaTruc> listnv = CTDao.selectAllbyentity(caTruc.getEntity().get(cboChoncot.getSelectedIndex()),a);
                for (CaTruc pn : listnv) {
                    Object[] row = {
                        pn.getMacaTruc(),pn.getGiobatdau(),pn.getGioketca()
                    };
                    model.addRow(row);   
                    
                }
            } 
            catch (Exception e) {
                JOptionPane.showMessageDialog(this, "L???i Truy V???n D??? Li???u 111!!");
            }
        }
    }
    public void fillChoncot(JTable a)
    {
        DefaultComboBoxModel model = (DefaultComboBoxModel) cboChoncot.getModel();
        DefaultTableModel model1 = (DefaultTableModel) a.getModel();
        model.removeAllElements();
        int q = a.getColumnCount();
        for(int i = 0 ;i<q;i++)
        {
            model.addElement(model1.getColumnName(i));
        }
    }
    public void selectByid(JTable a)
    {

        nhanVien = NVdao.selectById(txtTimkiem.getText());
        hoaDon = HDdao.selectById(txtTimkiem.getText());
        if(pnlNhanvien.isShowing())
        {
            if(nhanVien!=null)
            {
                DefaultTableModel model = (DefaultTableModel) a.getModel();
                model.setRowCount(0);
                Object[] row = {
                    nhanVien.getMaNV(),
                    nhanVien.getHoTen(),
                    nhanVien.getGioiTinh(),
                    nhanVien.getsDt(),
                    nhanVien.getDiaChi(),
                    nhanVien.getMaCv(),
                    nhanVien.getMaCatruc(),
                    nhanVien.getLuong(),
                    nhanVien.getMatKhau()};
                model.addRow(row);
            }
            else
            {
                JOptionPane.showMessageDialog(this, "Kh??ng t??m th???y m?? nh??n vi??n!!");
            }
        }
        else if(pnlHoadon.isShowing())
        {
            if(hoaDon!=null)
            {
                DefaultTableModel model = (DefaultTableModel) a.getModel();
                model.setRowCount(0);
                Object[] row = {
                    hoaDon.getMaHoaDon(),hoaDon.getNgayLapHD(),hoaDon.getMaNV(),hoaDon.getHinhThucTT(),hoaDon.getMaKH()};
                model.addRow(row);
            }
            else
            {
                JOptionPane.showMessageDialog(this, "Kh??ng t??m th???y H??a ????n!!");
            }
        }
        
            
        
        
        
        
    }
    public void getInfortable()
    {
        
    }
    void ketThuc(){
        int a = JOptionPane.showConfirmDialog(this,"B???n mu???n k???t th??c l??m vi???c?","H??? Th???ng",JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE );
        if(a==JOptionPane.YES_OPTION)
        {
            System.exit(0);
        }
    }
    public void thongKe()
    {
        List<Object[]> list; 
        list = TKDao.getDoanhThu((Integer.valueOf(txtMahd.getText())),txtNgay.getText());
        for(Object[] row : list){
            JOptionPane.showMessageDialog(this, row);
        }
    }
}
