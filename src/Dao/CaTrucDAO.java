/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import Helper.ConnectDatabase;
import Model.CaTruc;
import Model.ChucVu;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author HP
 */
public class CaTrucDAO extends MainDAO<CaTruc, String> {

    @Override
    public void insert(CaTruc model) {
        String sql="INSERT INTO CaTruc (MaCaTruc,GioBatDau,GioKetCa) VALUES (?, ?, ?)";
        ConnectDatabase.updateData(sql, 
                model.getMacaTruc(),model.getGiobatdau(),model.getGioketca());
    }

    @Override
    public void update(CaTruc model) {
                String sql="UPDATE CaTruc SET GioBatDau = ?, GioKetCa =? WHERE MaCaTruc =  ?;";
        ConnectDatabase.updateData(sql, 
                model.getGiobatdau(),model.getGioketca(), model.getMacaTruc() );
    }

    @Override
    public void delete(String id) {
           String sql="DELETE FROM CaTruc WHERE MaCaTruc = ?;";
        ConnectDatabase.updateData(sql, id);
    }

    @Override
    public CaTruc selectById(String id) {
    String sql="SELECT * FROM CaTruc WHERE MaCaTruc = ?;";
        List<CaTruc> list = this.selectBySql(sql, id);
        return list.size() > 0 ? list.get(0) : null;
    }

    @Override
    public List<CaTruc> selectAll() {
        String sql="SELECT * FROM CaTruc";
        return this.selectBySql(sql);
      }

    @Override
    protected List<CaTruc> selectBySql(String sql, Object... args) {
            List<CaTruc> list=new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = ConnectDatabase.queryData(sql, args);
                while(rs.next()){
                    CaTruc entity=new CaTruc();
                    entity.setMacaTruc(rs.getString("MacaTruc"));
                    entity.setGiobatdau(rs.getTime("GioDatDau"));    
                    entity.setGioketca(rs.getTime("GioKetCa"));                 
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

    @Override
    public List<CaTruc> selectAllbyentity(String entity, String a) {
        String sql="SELECT * FROM CaTruc ORDER BY "+entity+" "+a;
        List<CaTruc> list = this.selectBySql(sql);
        return list;
    }
    
    }

