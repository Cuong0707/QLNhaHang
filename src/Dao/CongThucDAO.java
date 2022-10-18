/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import Helper.ConnectDatabase;
import Model.CongThuc;
import Model.NguyenLieu;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author HP
 */
public class CongThucDAO extends  MainDAO<CongThuc, String>{

    @Override
    public void insert(CongThuc model) {
       String sql="INSERT INTO CongThuc (MaMon,MaNgLieu, DonViTinh, SoLuong) VALUES (?, ?, ?, ?)";
        ConnectDatabase.updateData(sql, 
                model.getMaMon(),model.getMaNguyenLieu(),model.getDonviTinh(),model.getSoluong());
                 
    }

    @Override
    public void update(CongThuc model) {
       String sql = "UPDATE CongThuc SET MaNgLieu = ?, DonViTinh = ?, SoLuong = ? WHERE MaMon = ?";
        ConnectDatabase.updateData(sql,
               model.getMaNguyenLieu(),model.getDonviTinh(),model.getSoluong(),model.getMaMon());
    }

    @Override
    public void delete(String id) {
        String sql="DELETE FROM CongThuc WHERE MaMon=?";
        ConnectDatabase.updateData(sql, id);
    }

    @Override
    public CongThuc selectById(String id) {
         String sql="SELECT * FROM CongThuc WHERE MaMon=?";
        List<CongThuc> list = this.selectBySql(sql, id);
        return list.size() > 0 ? list.get(0) : null;
    }

    @Override
    public List<CongThuc> selectAll() {
    String sql="SELECT * FROM CongThuc";
        return this.selectBySql(sql);
    }

    @Override
    protected List<CongThuc> selectBySql(String sql, Object... args) {
       List<CongThuc> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = ConnectDatabase.queryData(sql, args);
                while (rs.next()) {
                    CongThuc entity = new CongThuc();
                    entity.setMaMon(rs.getString("MaMon"));
                    entity.setMaNguyenLieu(rs.getString("MaNgLieu"));
                    entity.setDonviTinh(rs.getString("DonViTinh"));
                    entity.setSoluong(rs.getDouble("SoLuong"));                    
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
    }
    

