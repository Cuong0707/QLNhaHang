package Dao;

import Helper.ConnectDatabase;
import Model.NhanVien;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class NhanVienDAO extends MainDAO<NhanVien, String>{
    public void insert(NhanVien model){
        String sql="INSERT INTO NhanVien (MaNV, HotenNV, GioiTinh, SoDT, DiaChi, MaCV, MaCaTruc, Luong, MatKhau) VALUES (?, ?, ?, ?, ?, ? ,? ,? ,?)";
        ConnectDatabase.updateData(sql, 
              model.getMaNV(),model.getHoTen(),model.getGioiTinh(),model.getsDt(),model.getDiaChi(),
                model.getMaCv(),model.getMaCatruc(),model.getLuong(),model.getMatKhau());
    }
    
    public void update(NhanVien model){
        String sql="UPDATE NhanVien SET HotenNV=?, GioiTinh=?, SoDT=?, Diachi=?, MaCV= ?, MaCaTruc= ?, Luong = ? , Matkhau = ? WHERE MaNV=?";
        ConnectDatabase.updateData(sql, 
                model.getHoTen(),model.getGioiTinh(),model.getsDt(),model.getDiaChi(),
                model.getMaCv(),model.getMaCatruc(),model.getLuong(),model.getMatKhau(),model.getMaNV());
    }
    
    public void delete(String MaNV){
        String sql="DELETE FROM NhanVien WHERE MaNV=?";
        ConnectDatabase.updateData(sql, MaNV);
    }
    
    public List<NhanVien> selectAll(){
        String sql="SELECT * FROM NhanVien";
        return this.selectBySql(sql);
    }
    
    public List<NhanVien> selectCV(){
        String sql="SELECT MaCV FROM NhanVien";
        return this.selectBySql(sql);
    }
    
    public NhanVien selectById(String manv){
        String sql="SELECT * FROM NhanVien WHERE MaNV=?";
        List<NhanVien> list = this.selectBySql(sql, manv);
        return list.size() > 0 ? list.get(0) : null;
    }
  public NhanVien selectByup(String manv , String mamk){
        String sql="SELECT * FROM NhanVien WHERE MaNV=? and MatKhau=? ";
        List<NhanVien> list = this.selectBySql(sql, manv,mamk);
        return list.size() > 0 ? list.get(0) : null;
    }  
    protected List<NhanVien> selectBySql(String sql, Object...args){
        List<NhanVien> list=new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = ConnectDatabase.queryData(sql, args);
                while(rs.next()){
                    NhanVien entity=new NhanVien();
                    entity.setMaNV(rs.getString("MaNV"));
                    entity.setHoTen(rs.getString("HotenNV"));
                    entity.setGioiTinh(rs.getBoolean("Gioitinh"));
                    entity.setsDt(rs.getString("SoDT"));
                    entity.setDiaChi(rs.getString("DiaChi"));
                    entity.setMaCv(rs.getString("MaCV"));
                    entity.setMaCatruc(rs.getString("MaCatruc"));
                    entity.setLuong(rs.getDouble("Luong"));
                    entity.setMatKhau(rs.getString("Matkhau"));
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
    public List<NhanVien> selectAllbyentity(String entity,String a){
        String sql="SELECT * FROM NhanVien ORDER BY "+entity+" "+a;
        List<NhanVien> list = this.selectBySql(sql);
        return list;
    }
}
