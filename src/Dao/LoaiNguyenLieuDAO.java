/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import Helper.ConnectDatabase;
import Model.CaTruc;
import Model.LoaiNgLieu;
import Model.NguyenLieu;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author HP
 */
public class LoaiNguyenLieuDAO extends  MainDAO<LoaiNgLieu, String>{

    @Override
    public void insert(LoaiNgLieu model) {
        String sql="INSERT INTO LoaiNgLieu (MaLoaiNgLieu,TenLoaiNgLieu) VALUES (?, ?);";
        ConnectDatabase.update(sql, 
                model.getMaLoaiNguyenLieu(),model.getTenLoaiNgLieu());
    }

    @Override
    public void update(LoaiNgLieu model) {
            String sql = "UPDATE LoaiNgLieu SET TenNgLieu = ?  WHERE MaLoaiNgLieu =  ?;";
        ConnectDatabase.update(sql,
               model.getTenLoaiNgLieu(),model.getMaLoaiNguyenLieu());
    }

    @Override
    public void delete(String id) {
     String sql="DELETE FROM LoaiNgLieu Where MaLoaiNgLieu = ?;";
        ConnectDatabase.update(sql, id); 
    }

    @Override
    public LoaiNgLieu selectById(String id) {
               String sql="SELECT * FROM LoaiNgLieu WHERE MaLoaiNgLieu = ?";
        List<LoaiNgLieu> list = this.selectBySql(sql, id);
        return list.size() > 0 ? list.get(0) : null;
    }

    @Override
    public List<LoaiNgLieu> selectAll() {
         String sql="SELECT * FROM LoaiNgLieu";
        return this.selectBySql(sql);
    }

    @Override
    protected List<LoaiNgLieu> selectBySql(String sql, Object... args) {
          List<LoaiNgLieu> list=new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = ConnectDatabase.query(sql, args);
                while(rs.next()){
                    LoaiNgLieu entity=new LoaiNgLieu();
                    entity.setMaLoaiNguyenLieu(rs.getString("MaLoaiNgLieu"));
                    entity.setTenLoaiNgLieu(rs.getString("TenLoaiNgLieu"));                                       
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
    

