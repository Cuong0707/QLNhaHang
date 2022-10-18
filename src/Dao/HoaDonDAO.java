/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import Helper.ConnectDatabase;
import Model.HoaDon;
import Model.LoaiMon;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author admin
 */
public class HoaDonDAO extends MainDAO<HoaDon, String> {

    @Override
    public void insert(HoaDon model) {
           String sql="INSERT INTO HoaDon (MaHoaDon,NgayLapHD, HinhThucTT, MaNV, MaKH) VALUES (?, ?, ?, ?, ?)";
        ConnectDatabase.updateData(sql, 
                model.getMaHoaDon(),model.getNgayLapHD(),model.getHinhThucTT(),model.getMaNV(),model.getMaKH());
      }

    @Override
    public void update(HoaDon Model) {
        String sql = "UPDATE HoaDon SET NgayLapHD = ?, HinhThucTT = ?, MaNV = ?, MaKH = ? WHERE MaHoaDon = ?";
        ConnectDatabase.updateData(sql,
               Model.getNgayLapHD(),Model.getHinhThucTT(),Model.getMaNV(),Model.getMaKH(),Model.getMaHoaDon());
    }

    @Override
    public void delete(String id) {
        String sql="DELETE FROM HoaDon WHERE MaHoaDon=? ";
        ConnectDatabase.updateData(sql, id); 
    }

    @Override
    public HoaDon selectById(String id) {
          String sql="SELECT * FROM  HoaDon WHERE  MaHoaDon =?;";
        List<HoaDon> list = this.selectBySql(sql, id);
        return list.size() > 0 ? list.get(0) : null;
    }

    @Override
    public List<HoaDon> selectAll() {
        String sql="SELECT * FROM HoaDon ";
        return this.selectBySql(sql);
    }

    @Override
    protected List<HoaDon> selectBySql(String sql, Object... args) {
          List<HoaDon> list=new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = ConnectDatabase.queryData(sql, args);
                while(rs.next()){
                    HoaDon entity = new HoaDon();
                    entity.setMaHoaDon(rs.getString("MaHoaDon"));
                    entity.setNgayLapHD(rs.getDate("NgayLapHD")); 
                    entity.setHinhThucTT(rs.getString("HinhThucTT"));
                    entity.setMaNV(rs.getString("MaNV"));
                    entity.setMaKH(rs.getString("MaKH")); 
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
        
        
    

