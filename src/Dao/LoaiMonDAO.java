/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import Helper.ConnectDatabase;
import Model.CaTruc;
import Model.LoaiMon;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author HP
 */
public class LoaiMonDAO extends MainDAO<LoaiMon, String>{

    @Override
    public void insert(LoaiMon model) {
      String sql="INSERT INTO LoaiMon (MaLoaiMon, TenLoaiMon) VALUES (?, ?)";
        ConnectDatabase.update(sql, 
                model.getMaLoaiMon(),model.getTenLoaiMon());
                   
    }

    @Override
    public void update(LoaiMon model) {
       String sql = "UPDATE LoaiMon SET  TenLoaiMon = ? Where   MaLoaiMon  = ?";
        ConnectDatabase.update(sql,
               model.getTenLoaiMon(),model.getMaLoaiMon());
     
    }

    @Override
    public void delete(String id) {
        String sql="DELETE FROM LoaiMon WHERE MaLoaiMon=?;";
        ConnectDatabase.update(sql, id);
    }

    @Override
    public LoaiMon selectById(String id) {
         String sql="SELECT * FROM  LoaiMon WHERE  MaLoaiMon=?";
        List<LoaiMon> list = this.selectBySql(sql, id);
        return list.size() > 0 ? list.get(0) : null; 
    }

    @Override
    public List<LoaiMon> selectAll() {
       String sql="SELECT * FROM LoaiMon";
        return this.selectBySql(sql);
    }

    @Override
    protected List<LoaiMon> selectBySql(String sql, Object... args) {
          List<LoaiMon> list=new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = ConnectDatabase.query(sql, args);
                while(rs.next()){
                    LoaiMon entity = new LoaiMon();
                    entity.setMaLoaiMon(rs.getString("MaLoaiMon"));
                    entity.setTenLoaiMon(rs.getString("TenLoaiMon"));                                   
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
