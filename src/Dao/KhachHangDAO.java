/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import Helper.ConnectDatabase;
import Model.KhachHang;
import Model.LoaiMon;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author HP
 */
public class KhachHangDAO extends MainDAO<KhachHang, String>{

    @Override
    public void insert(KhachHang model) {
       String sql="INSERT INTO KhachHang (MaKH,HoTenKH,SoDT,DiaChi) VALUES (?, ?, ?, ?)";
        ConnectDatabase.update(sql, 
                model.getMaKH(),model.getHoTenKH(),model.getSoDT(),model.getDiaChi());
    }

    @Override
    public void update(KhachHang model) {
        String sql = "UPDATE KhachHang SET HoTenKH = ?, SoDT =?, DiaChi=? WHERE MaKH =  ?";
        ConnectDatabase.update(sql,
               model.getHoTenKH(),model.getSoDT(),model.getDiaChi(),model.getMaKH());
    }

    @Override
    public void delete(String id) {
         String sql="DELETE FROM KhachHang WHERE MaKH = ?";
        ConnectDatabase.update(sql, id);
    }

    @Override
    public KhachHang selectById(String id) {
        String sql="SELECT * FROM KhachHang WHERE MaKH = ?";
        List<KhachHang> list = this.selectBySql(sql, id);
        return list.size() > 0 ? list.get(0) : null; 
    }

    @Override
    public List<KhachHang> selectAll() {
            String sql="SELECT * FROM KhachHang";
        return this.selectBySql(sql);
    }

    @Override
    protected List<KhachHang> selectBySql(String sql, Object... args) {
            List<KhachHang> list=new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = ConnectDatabase.query(sql, args);
                while(rs.next()){
                    KhachHang entity = new KhachHang();
                    entity.setMaKH(rs.getString("MaKH"));
                    entity.setHoTenKH(rs.getString("HoTenKH"));
                    entity.setSoDT(rs.getString("SoDT"));
                    entity.setDiaChi(rs.getString("DiaChi")); 
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
    

