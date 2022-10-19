package View;


import Dao.HoaDonDAO;
import Dao.NhanVienDAO;
import Model.NhanVien;
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
        this.showtableNhanvien();
        this.showtableHoaDon();
        
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
        pnlHoadon = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblHoadon = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTable5 = new javax.swing.JTable();
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

        pnlTimkiem.setBorder(javax.swing.BorderFactory.createTitledBorder("Tìm Kiếm"));

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

        pnlSapxep.setBorder(javax.swing.BorderFactory.createTitledBorder("Sắp Xếp"));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel1.setText("Chọn Cột");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel2.setText("Sắp Xếp Theo");

        cboChoncot.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboChoncot.setMaximumSize(new java.awt.Dimension(72, 26));
        cboChoncot.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboChoncotItemStateChanged(evt);
            }
        });

        cboSapxeptheo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tăng", "Giảm" }));
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

        btnXemchitiet.setText("Xem Chi Tiết");

        btnXuatfile.setText("Xuất File");

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

        pnlNhanvien.setBackground(new java.awt.Color(255, 220, 126));
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
                "Mã NV", "Họ Tên NV", "Giới Tính", "Số ĐT", "Địa Chỉ", "Chức Vụ ", "Ca trực", "Lương", "Mật Khẩu"
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

        tabpnlQuanLy.addTab("Nhân Viên", pnlNhanvien);

        pnlHoadon.setBackground(new java.awt.Color(255, 220, 126));
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
                "Mã Hóa Đơn", "Ngày Lập Hóa Đơn", "Người Lập Hóa Đơn", "Hình Thức Thanh Toán", "Mã Khách Hàng"
            }
        ));
        jScrollPane2.setViewportView(tblHoadon);

        javax.swing.GroupLayout pnlHoadonLayout = new javax.swing.GroupLayout(pnlHoadon);
        pnlHoadon.setLayout(pnlHoadonLayout);
        pnlHoadonLayout.setHorizontalGroup(
            pnlHoadonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlHoadonLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 581, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlHoadonLayout.setVerticalGroup(
            pnlHoadonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHoadonLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 331, Short.MAX_VALUE)
                .addContainerGap())
        );

        tabpnlQuanLy.addTab("Hóa Đơn", pnlHoadon);

        jPanel4.setBackground(new java.awt.Color(255, 220, 126));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(jTable2);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 581, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 331, Short.MAX_VALUE)
                .addContainerGap())
        );

        tabpnlQuanLy.addTab("Phiếu Nhập", jPanel4);

        jPanel5.setBackground(new java.awt.Color(255, 220, 126));

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane4.setViewportView(jTable3);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 581, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 331, Short.MAX_VALUE)
                .addContainerGap())
        );

        tabpnlQuanLy.addTab("Nguyên Liệu", jPanel5);

        jPanel6.setBackground(new java.awt.Color(255, 220, 126));

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane5.setViewportView(jTable4);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 581, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 331, Short.MAX_VALUE)
                .addContainerGap())
        );

        tabpnlQuanLy.addTab("Khách Hàng", jPanel6);

        jPanel7.setBackground(new java.awt.Color(255, 220, 126));

        jTable5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane6.setViewportView(jTable5);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 581, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 331, Short.MAX_VALUE)
                .addContainerGap())
        );

        tabpnlQuanLy.addTab("Ca Trực", jPanel7);

        jMenuBar1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jMenuBar1.setMaximumSize(new java.awt.Dimension(710, 29));
        jMenuBar1.setMinimumSize(new java.awt.Dimension(710, 29));
        jMenuBar1.setPreferredSize(new java.awt.Dimension(710, 29));

        mnDanhmuc.setText("Danh Mục");
        jMenuBar1.add(mnDanhmuc);

        mnThemmoi.setText("Thêm Mới");
        jMenuBar1.add(mnThemmoi);

        mnThongke.setBackground(new java.awt.Color(0, 102, 255));
        mnThongke.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        mnThongke.setForeground(new java.awt.Color(255, 255, 255));
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
    }//GEN-LAST:event_txtTimkiemActionPerformed

    private void cboChoncotItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboChoncotItemStateChanged

    }//GEN-LAST:event_cboChoncotItemStateChanged

    private void cboSapxeptheoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboSapxeptheoItemStateChanged

    }//GEN-LAST:event_cboSapxeptheoItemStateChanged

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ThongKe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnXemchitiet;
    private javax.swing.JButton btnXuatfile;
    private javax.swing.JComboBox<String> cboChoncot;
    private javax.swing.JComboBox<String> cboSapxeptheo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTable jTable5;
    private javax.swing.JMenu mnDanhmuc;
    private javax.swing.JMenu mnThemmoi;
    private javax.swing.JMenu mnThongke;
    private javax.swing.JPanel pnlHoadon;
    private javax.swing.JPanel pnlNhanvien;
    private javax.swing.JPanel pnlSapxep;
    private javax.swing.JPanel pnlTimkiem;
    private javax.swing.JPanel pnlTool;
    private javax.swing.JTabbedPane tabpnlQuanLy;
    private javax.swing.JTable tblHoadon;
    private javax.swing.JTable tblNhanVien;
    private javax.swing.JTextField txtTimkiem;
    // End of variables declaration//GEN-END:variables

    
    NhanVienDAO NVdao = new NhanVienDAO();
    HoaDonDAO HDdao = new HoaDonDAO();
    NhanVien nhanVien = new NhanVien();
    Model.HoaDon hoaDon = new Model.HoaDon();
    List<NhanVien> listnv = new ArrayList<NhanVien>();
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
        try {
            List<NhanVien> list = NVdao.selectAll();
            if(cboSapxeptheo.getSelectedItem().equals("Tăng"))
            {
                Collections.sort(list, new Comparator<NhanVien>() {
                @Override
                public int compare(NhanVien nv1, NhanVien nv2) {
                    return (nv1.getHoTen().compareTo(nv2.getHoTen()));

                }
                });
            }
            else{
                Collections.sort(list, new Comparator<NhanVien>() {
                    @Override
                    public int compare(NhanVien nv1, NhanVien nv2) {
                        return (nv2.getHoTen().compareTo(nv1.getHoTen()));
                    }
                });
            }
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
            JOptionPane.showMessageDialog(this, "Lỗi Truy Vấn Dữ Liệu 111!!");
        }
    }
    
    
    public void showtableHoaDon()
    {
        DefaultTableModel model = (DefaultTableModel) tblHoadon.getModel();
        model.setRowCount(0);
        try {
            List<Model.HoaDon> list = HDdao.selectAll();
            for (Model.HoaDon a : list) {
                Object[] row = {
                    a.getMaHd(),
                    a.getNgayLap(),
                    a.getNguoiLap(),
                    a.getHinhThuctt(),
                    a.getMaKhachhang()
                };
                model.addRow(row);
            }
        } 
        catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Lỗi Truy Vấn Dữ Liệu !!");
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
                JOptionPane.showMessageDialog(this, "Không tìm thấy mã nhân viên!!");
            }
        }
        else if(pnlHoadon.isShowing())
        {
            if(hoaDon!=null)
            {
                DefaultTableModel model = (DefaultTableModel) a.getModel();
                model.setRowCount(0);
                Object[] row = {
                    hoaDon.getMaHd(),hoaDon.getNgayLap(),hoaDon.getNgayLap(),hoaDon.getHinhThuctt(),hoaDon.getMaKhachhang()};
                model.addRow(row);
            }
            else
            {
                JOptionPane.showMessageDialog(this, "Không tìm thấy Hóa Đơn!!");
            }
        }
        
            
        
        
        
        
    }
//    public void sapXeptable(JTable a)
//    {
//        DefaultComboBoxModel model = (DefaultComboBoxModel) a.getModel();
//        Collections.sort(listnv, new Comparator<NhanVien>() {
//            @Override
//            public int compare(NhanVien nv1, NhanVien nv2) {
//                return (nv1.getEntity().get(cboChoncot.getSelectedIndex()).compareTo(nv2.getEntity().get(cboChoncot.getSelectedIndex())));
//                
//            }
//        });
//        for(int i = 0;i<listnv)
//    }
}
