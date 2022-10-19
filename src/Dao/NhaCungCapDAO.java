/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import Helper.ConnectDatabase;
import Model.NguyenLieu;
import Model.NhaCungCap;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author HP
 */
public class NhaCungCapDAO extends MainDAO<NhaCungCap, String>{

    @Override
    public void insert(NhaCungCap model) {
     String sql="INSERT INTO NhaCungCap (MaCC, TenCC, SoDT, DiaChi) VALUES (?, ?, ?, ?)";
        ConnectDatabase.updateData(sql, 
                model.getMaCC(),model.getTenCC(),model.getSoDT(),model.getDiaChi());
                
    
    }

    @Override
    public void update(NhaCungCap model) {
       String sql="UPDATE NhaCungCap SET TenCC = ?, SoDT = ?, DiaChi = ?  WHERE MaCC = ?";
        ConnectDatabase.updateData(sql, 
      model.getTenCC(),model.getSoDT(),model.getDiaChi(),model.getMaCC());
    }

    @Override
    public void delete(String id) {
       String sql = "DELETE FROM NhaCungCap WHERE MaCC=?";
        ConnectDatabase.updateData(sql, id);
    }

    @Override
    public NhaCungCap selectById(String id) {
            String sql="DELETE FROM NhaCungCap WHERE MaCC=?;";
        List<NhaCungCap> list = this.selectBySql(sql, id);
        return list.size() > 0 ? list.get(0) : null; 
    }

    @Override
    public List<NhaCungCap> selectAll() {
        String sql="SELECT * FROM NhaCungCap;";
        return this.selectBySql(sql);
    }

    @Override
    protected List<NhaCungCap> selectBySql(String sql, Object... args) {
       List<NhaCungCap> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = ConnectDatabase.queryData(sql, args);
                while (rs.next()) {
                    NhaCungCap entity = new NhaCungCap();
                    entity.setMaCC(rs.getString("MaCC"));
                    entity.setTenCC(rs.getString("TenCC"));
                    entity.setSoDT(rs.getString("SoDT"));
                    entity.setDiaChi(rs.getString("DiaChi"));
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
    List<NhaCungCap> selectAllbyentity(String entity, String a) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
