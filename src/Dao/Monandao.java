/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import Helper.ConnectDatabase;
import Model.ChucVu;
import Model.Monan;
import Model.NguyenLieu;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author HP
 */
public class Monandao extends MainDAO<Monan, String>{

    @Override
    public void insert(Monan model) {
        String sql="INSERT INTO MonAn (MaMon, TenMon, DonGia,DonViHoaDon, MaLoaiMon) VALUES (?, ?, ?, ?, ?)";
        ConnectDatabase.updateData(sql, 
                model.getMamoan(),model.getTenmon(),model.getDongia(),model.getDovitinh(),model.getLoaimonan());
                
    }

    @Override
    public void update(Monan model) {
         String sql="UPDATE MonAn SET TenMon = ?, DonGia = ?, DonViHoaDon = ?, MaLoaiMon = ? WHERE MaMon = ?";
        ConnectDatabase.updateData(sql, 
         model.getTenmon(),model.getDongia(),model.getDovitinh(),model.getLoaimonan(),model.getMamoan());}

    @Override
    public void delete(String id) {
        String sql = "DELETE FROM MonAn WHERE MaMon=?";
        ConnectDatabase.updateData(sql, id);
    }

    @Override
    public Monan selectById(String id) {
       String sql="SELECT * FROM MonAn WHERE MaMon=?";
        List<Monan> list = this.selectBySql(sql, id);
        return list.size() > 0 ? list.get(0) : null;
    }

    @Override
    public List<Monan> selectAll() {
           String sql="SELECT * FROM Monan";
            return this.selectBySql(sql);
    }

    @Override
    protected List<Monan> selectBySql(String sql, Object... args) {
       List<Monan> list=new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = ConnectDatabase.queryData(sql, args);
                while(rs.next()){
                  Monan entity = new Monan();
                   entity.setMamoan(rs.getString("MaMon"));
                   entity.setTenmon(rs.getString("TenMon"));
                    entity.setDongia(rs.getDouble("DonGia"));
                   entity.setDovitinh(rs.getString("DonViHoaDon"));
                   entity.setLoaimonan(rs.getString("MaLoaiMon"));
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
