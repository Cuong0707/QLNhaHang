/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import Helper.ConnectDatabase;
import Model.NhanVien;
import Model.PhieuNhap;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author HP
 */
public class PhieuNhapDAO extends MainDAO<PhieuNhap, String>{

    @Override
    public void insert(PhieuNhap model) {
         String sql="INSERT INTO PhieuNhap (MaPhieuNhap, MaNgLieu, MaCC, MaNV, SoLuong, DoViTinh, DonGia, NgayLapPhieu, NgayNhap) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        ConnectDatabase.update(sql, 
              model.getMaPhieuNhap(),model.getMaNgLieu(),model.getMaCC(),model.getMaNV(),model.getSoluong(),
                model.getDoViTinh(),model.getDonGia(),model.getNgayLapPhieu(),model.getNgayNhap());
    }

    @Override
    public void update(PhieuNhap model) {
          String sql="UPDATE PhieuNhap SET  MaNgLieu = ?, MaCC = ?, MaNV = ?, SoLuong = ?, DonViTinh = ?, DonGia =?, NgayLapPhieu = ?, NgayNhap = ?  Where MaPhieuNhap = ?";
        ConnectDatabase.update(sql, 
               model.getMaNgLieu(),model.getMaCC(),model.getMaNV(),model.getSoluong(),
                model.getDoViTinh(),model.getDonGia(),model.getNgayLapPhieu(),model.getNgayNhap(),model.getMaPhieuNhap());
    }

    @Override
    public void delete(String id) {
        String sql="DELETE FROM PhieuNhap WHERE MaPhieuNhap=?;";
        ConnectDatabase.update(sql, id);
    }

    @Override
    public PhieuNhap selectById(String id) {
          String sql="SSELECT * FROM  PhieuNhap WHERE MaPhieuNhap=?;";
        List<PhieuNhap> list = this.selectBySql(sql, id);
        return list.size() > 0 ? list.get(0) : null;
    }

    @Override
    public List<PhieuNhap> selectAll() {
           String sql="SELECT * FROM PhieuNhap;";
        return this.selectBySql(sql);
    }

    @Override
    protected List<PhieuNhap> selectBySql(String sql, Object... args) {
       List<PhieuNhap> list=new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = ConnectDatabase.query(sql, args);
                while(rs.next()){
                    PhieuNhap entity=new PhieuNhap();
                    entity.setMaPhieuNhap(rs.getString("MaPhieuNhap"));
                    entity.setMaNgLieu(rs.getString("MaNgLieu"));
                    entity.setMaCC(rs.getString("MaCC"));
                    entity.setSoluong(rs.getDouble("SoLuong"));
                    entity.setDonViTinh(rs.getString("DonViTInh"));
                    entity.setDonGia(rs.getString("DonGia"));
                    entity.setNgayLapPhieu(rs.getString("NgayLapPhieu"));
                    entity.setNgayNhap(rs.getString("NgayNhap"));
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
