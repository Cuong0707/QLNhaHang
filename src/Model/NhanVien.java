package Model;

import java.util.ArrayList;
import java.util.List;

public class NhanVien {
    private String maNV;
    private String hoTen;
    private boolean gioiTinh;
    private String sDt;
    private String diaChi;
    private String maCv;
    private String maCatruc;
    private double luong;
    private String matKhau;

    public NhanVien() {
    }

    public NhanVien(String maNV, String hoTen, boolean gioiTinh, String sDt, String diaChi, String maCv, String maCatruc, double luong, String matKhau) {
        this.maNV = maNV;
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.sDt = sDt;
        this.diaChi = diaChi;
        this.maCv = maCv;
        this.maCatruc = maCatruc;
        this.luong = luong;
        this.matKhau = matKhau;
    }

    @Override
    public String toString() {
        return this.hoTen;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public boolean getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getsDt() {
        return sDt;
    }

    public void setsDt(String sDt) {
        this.sDt = sDt;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getMaCv() {
        return maCv;
    }

    public void setMaCv(String maCv) {
        this.maCv = maCv;
    }

    public String getMaCatruc() {
        return maCatruc;
    }

    public void setMaCatruc(String maCatruc) {
        this.maCatruc = maCatruc;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }
    public List<String> getEntity()
    {
        List<String> list = new ArrayList<>();
        list.add("MaNv");
        list.add("HoTenNV");
        list.add("GioiTinh");
        list.add("SoDt");
        list.add("Diachi");
        list.add("MaCV");
        list.add("MaCaTruc");
        list.add("Luong");
        list.add("MatKhau");
        return list;
    }

}
