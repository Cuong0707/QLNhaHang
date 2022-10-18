/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import Helper.ConnectDatabase;
import Model.ChucVu;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author HP
 */
public class ChucVuDAO extends MainDAO<ChucVu, String> {

    @Override
    public void insert(ChucVu model) {
         String sql="INSERT INTO ChucVu (MaCV, ChucVu) VALUES (?, ?)";
        ConnectDatabase.update(sql, 
                model.getMaCV(),model.getChucVu());
          }

    @Override
    public void update(ChucVu model) {
         String sql="UPDATE ChucVu SET ChucVu = ? WHERE MaCV = ?";
        ConnectDatabase.update(sql, 
                model.getChucVu(),model.getMaCV());
         }
    

    @Override
    public void delete(String MaCV) {
        String sql="DELETE FROM ChucVu WHERE MaCV=?";
        ConnectDatabase.update(sql, MaCV);
    }

    @Override
    public ChucVu selectById(String id) {
        String sql="SELECT * FROM ChucVu WHERE MaCV = ?";
        List<ChucVu> list = this.selectBySql(sql, id);
        return list.size() > 0 ? list.get(0) : null;
    }

    @Override
    public List<ChucVu> selectAll() {
       String sql="SELECT * FROM ChucVu";
        return this.selectBySql(sql);
    }

    @Override
    protected List<ChucVu> selectBySql(String sql, Object... args) {
          List<ChucVu> list=new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = ConnectDatabase.query(sql, args);
                while(rs.next()){
                    ChucVu entity=new ChucVu();
                    entity.setMaCV(rs.getString("MaCV"));
                    entity.setChucVu(rs.getString("ChucVu"));                 
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
