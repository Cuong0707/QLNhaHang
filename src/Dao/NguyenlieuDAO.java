/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import Helper.ConnectDatabase;
import Model.NguyenLieu;
import Model.NhanVien;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author HP
 */
public class NguyenlieuDAO extends MainDAO<NguyenLieu, String> {

    @Override
    public void insert(NguyenLieu model) {
        String sql = "INSERT INTO Nglieu (MaNgLieu, TenNgLieu, DonViTinh, SoLuong, MaLoaiNgLieu) VALUES (?, ?, ?, ?,?)";
        ConnectDatabase.updateData(sql,
                model.getManguyenlieu(), model.getTenNguyenLieu(),
                model.getDonvitinh(), model.getSoluong(),
                model.getMaloainguyenlieu());
    }

    @Override
    public void update(NguyenLieu model) {
           String sql = "UPDATE Nglieu SET TenNgLieu = ?, DonViTinh = ?, SoLuong = ?, MaLoaiNgLieu = ? WHERE MaNgLieu = ?";
        ConnectDatabase.updateData(sql,
                 model.getTenNguyenLieu(),
                model.getDonvitinh(), model.getSoluong(),
                model.getMaloainguyenlieu(), model.getManguyenlieu());
    }

    @Override
    public void delete(String MaNL) {
        String sql = "DELETE FROM Nglieu WHERE MaNgLieu=?";
        ConnectDatabase.updateData(sql, MaNL);
    }

    @Override
    public NguyenLieu selectById(String id) {
      String sql="SELECT * FROM Nglieu WHERE MaNgLieu=?";
        List<NguyenLieu> list = this.selectBySql(sql, id);
        return list.size() > 0 ? list.get(0) : null;
    }

    @Override
    public List<NguyenLieu> selectAll() {
        String sql="SELECT * FROM Nglieu";
        return this.selectBySql(sql);
    }

    @Override
    protected List<NguyenLieu> selectBySql(String sql, Object... args) {
        List<NguyenLieu> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = ConnectDatabase.queryData(sql, args);
                while (rs.next()) {
                    NguyenLieu entity = new NguyenLieu();
                    entity.setManguyenlieu(rs.getString("MaNgLieu"));
                    entity.setTenNguyenLieu(rs.getString("TenNgLieu"));
                    entity.setDonvitinh(rs.getString("DonViTinh"));
                    entity.setSoluong(rs.getDouble("SoLuong"));
                    entity.setMaloainguyenlieu(rs.getString("MaLoaiNgLieu"));
                    list.add(entity);
                }
            } finally {
                rs.getStatement().getConnection().close();
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
        return list;
    }

    @Override
    public List<NguyenLieu> selectAllbyentity(String entity, String a) {
        String sql="SELECT * FROM Nglieu ORDER BY "+entity+" "+a;
        List<NguyenLieu> list = this.selectBySql(sql);
        return list;
    }
}


