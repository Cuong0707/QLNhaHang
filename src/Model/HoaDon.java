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
 * @author admin
 */
public class HoaDon {
    private String MaHoaDon;
    private Date NgayLapHD;
    private String HinhThucTT;
    private String MaNV;
    private String MaKH;

    public HoaDon() {
    }

    public HoaDon(String MaHoaDon, Date NgayLapHD, String HinhThucTT, String MaNV, String MaKH) {
        this.MaHoaDon = MaHoaDon;
        this.NgayLapHD = NgayLapHD;
        this.HinhThucTT = HinhThucTT;
        this.MaNV = MaNV;
        this.MaKH = MaKH;
    }

    public String getMaHoaDon() {
        return MaHoaDon;
    }

    public void setMaHoaDon(String MaHoaDon) {
        this.MaHoaDon = MaHoaDon;
    }

    public Date getNgayLapHD() {
        return NgayLapHD;
    }

    public void setNgayLapHD(Date NgayLapHD) {
        this.NgayLapHD = NgayLapHD;
    }

    public String getHinhThucTT() {
        return HinhThucTT;
    }

    public void setHinhThucTT(String HinhThucTT) {
        this.HinhThucTT = HinhThucTT;
    }

    public String getMaNV() {
        return MaNV;
    }

    public void setMaNV(String MaNV) {
        this.MaNV = MaNV;
    }

    public String getMaKH() {
        return MaKH;
    }

    public void setMaKH(String MaKH) {
        this.MaKH = MaKH;
    }
    public List<String> getEntity()
    {
        List<String> list = new ArrayList<>();
        list.add("MaHoaDon");
        list.add("NgayLapHD");
        list.add("NguoiLapHD");
        list.add("HinhThucTT");
        list.add("MaKH");
        return list;
    }
}
