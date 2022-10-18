/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import Helper.ConnectDatabase;
import Model.HoaDon;
import Model.HoaDonCT;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author HP
 */
public class HoaDonCTDAO extends MainDAO<HoaDonCT, String>{

    @Override
    public void insert(HoaDonCT model) {
        String sql="INSERT INTO HoaDonCT (MaHoaDonCT, MaHoaDon, MaMon, SoLuong, DoViTinh) VALUES (?, ?, ?, ?, ?)";
        ConnectDatabase.update(sql, 
                model.getMaHoaDonCT(),model.getMaMon(),model.getMaMon(),model.getSoLuong(),model.getDonViTinh());
      
    }

    @Override
    public void update(HoaDonCT model) {
        String sql = "UPDATE HoaDonCT SET MaHoaDon= ?, MaMon = ?, SoLuong = ?, DonViTinh = ? WHERE MaHoaDonCT = ?";
        ConnectDatabase.update(sql,
               model.getMaMon(),model.getMaMon(),model.getSoLuong(),model.getDonViTinh(),model.getMaHoaDonCT());
   
    }

    @Override
    public void delete(String id) {
         String sql="DELETE FROM HoaDonCT WHERE MaHoaDonCT=? ";
        ConnectDatabase.update(sql, id);
    }

    @Override
    public HoaDonCT selectById(String id) {
           String sql="SELECT * FROM  HoaDonCT WHERE  MaHoaDonCT =?";
        List<HoaDonCT> list = this.selectBySql(sql, id);
        return list.size() > 0 ? list.get(0) : null;
    }
    

    @Override
    public List<HoaDonCT> selectAll() {
        String sql="SELECT * FROM HoaDonCT ";
        return this.selectBySql(sql); 
    }

    @Override
    protected List<HoaDonCT> selectBySql(String sql, Object... args) {
       List<HoaDonCT> list=new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = ConnectDatabase.query(sql, args);
                while(rs.next()){
                    HoaDonCT entity = new HoaDonCT();
                    entity.setMaHoaDonCT(rs.getString("MaHoaDonCT"));
                    entity.setMaHoaDon(rs.getString("MaHoaDon")); 
                    entity.setMaMon(rs.getString("MaMon"));
                    entity.setSoLuong(rs.getDouble("SoLuong"));
                    entity.setDonViTinh(rs.getString("DonViTinh")); 
                    list.add(entity);
                }
            } 
            finally{
                rs.getStatement().getConnection().close();
            }
        } 
        catch (SQLException ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
        return list;
    }
    
    
}
