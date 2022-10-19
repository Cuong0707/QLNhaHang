/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author HP
 */
public class KhachHang {
    String MaKH;
    String HoTenKH;
    String SoDT;
    String DiaChi;

    public KhachHang() {
    }

    public KhachHang(String MaKH, String HoTenKH, String SoDT, String DiaChi) {
        this.MaKH = MaKH;
        this.HoTenKH = HoTenKH;
        this.SoDT = SoDT;
        this.DiaChi = DiaChi;
    }

    public String getMaKH() {
        return MaKH;
    }

    public void setMaKH(String MaKH) {
        this.MaKH = MaKH;
    }

    public String getHoTenKH() {
        return HoTenKH;
    }

    public void setHoTenKH(String HoTenKH) {
        this.HoTenKH = HoTenKH;
    }

    public String getSoDT() {
        return SoDT;
    }

    public void setSoDT(String SoDT) {
        this.SoDT = SoDT;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }
    public List<String> getEntity()
    {
        List<String> list = new ArrayList<>();
        list.add("MaKH");
        list.add("HoTenKH");
        list.add("SoDT");
        list.add("DiaChi");
        return list;
    }
}
