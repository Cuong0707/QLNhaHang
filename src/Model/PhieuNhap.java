/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author HP
 */
public class PhieuNhap {
    String MaPhieuNhap;
    String MaNgLieu;
    String MaCC;
    String MaNV;
    double Soluong;
    String DonViTinh;
    double DonGia;
    Date NgayLapPhieu;
    Date NgayNhap;

    public PhieuNhap() {
    }

    public PhieuNhap(String MaPhieuNhap, String MaNgLieu, String MaCC, String MaNV, double Soluong, String DonViTinh, double DonGia, Date NgayLapPhieu, Date NgayNhap) {
        this.MaPhieuNhap = MaPhieuNhap;
        this.MaNgLieu = MaNgLieu;
        this.MaCC = MaCC;
        this.MaNV = MaNV;
        this.Soluong = Soluong;
        this.DonViTinh = DonViTinh;
        this.DonGia = DonGia;
        this.NgayLapPhieu = NgayLapPhieu;
        this.NgayNhap = NgayNhap;
    }

  

    public String getMaPhieuNhap() {
        return MaPhieuNhap;
    }

    public void setMaPhieuNhap(String MaPhieuNhap) {
        this.MaPhieuNhap = MaPhieuNhap;
    }

    public String getMaNgLieu() {
        return MaNgLieu;
    }

    public void setMaNgLieu(String MaNgLieu) {
        this.MaNgLieu = MaNgLieu;
    }

    public String getMaCC() {
        return MaCC;
    }

    public void setMaCC(String MaCC) {
        this.MaCC = MaCC;
    }

    public String getMaNV() {
        return MaNV;
    }

    public void setMaNV(String MaNV) {
        this.MaNV = MaNV;
    }

    public double getSoluong() {
        return Soluong;
    }

    public void setSoluong(double Soluong) {
        this.Soluong = Soluong;
    }

    public String getDonViTinh() {
        return DonViTinh;
    }

    public void setDonViTinh(String DonViTinh) {
        this.DonViTinh = DonViTinh;
    }

    public double getDonGia() {
        return DonGia;
    }

    public void setDonGia(double DonGia) {
        this.DonGia = DonGia;
    }

    public Date getNgayLapPhieu() {
        return NgayLapPhieu;
    }

    public void setNgayLapPhieu(Date NgayLapPhieu) {
        this.NgayLapPhieu = NgayLapPhieu;
    }

    public Date getNgayNhap() {
        return NgayNhap;
    }

    public void setNgayNhap(Date NgayNhap) {
        this.NgayNhap = NgayNhap;
    }
    public List<String> getEntity()
    {
        List<String> list = new ArrayList<>();
        list.add("MaPhieuNhap");
        list.add("MaNgLieu");
        list.add("DonGia");
        list.add("DonViTinh");
        list.add("SoLuong");
        list.add("NgayLapPhieu");
        list.add("NgayNhap");
        list.add("MaCC");
        list.add("NguoiNhap");
        return list;
    }
   
}
