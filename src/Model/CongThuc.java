/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author HP
 */
public class CongThuc {
    String MaMon;
    String  MaNguyenLieu;
    String DonviTinh;
    double soluong;

    public CongThuc() {
    }

    public CongThuc(String MaMon, String MaNguyenLieu, String DonviTinh, double soluong) {
        this.MaMon = MaMon;
        this.MaNguyenLieu = MaNguyenLieu;
        this.DonviTinh = DonviTinh;
        this.soluong = soluong;
    }

    public String getMaMon() {
        return MaMon;
    }

    public void setMaMon(String MaMon) {
        this.MaMon = MaMon;
    }

    public String getMaNguyenLieu() {
        return MaNguyenLieu;
    }

    public void setMaNguyenLieu(String MaNguyenLieu) {
        this.MaNguyenLieu = MaNguyenLieu;
    }

    public String getDonviTinh() {
        return DonviTinh;
    }

    public void setDonviTinh(String DonviTinh) {
        this.DonviTinh = DonviTinh;
    }

    public double getSoluong() {
        return soluong;
    }

    public void setSoluong(double soluong) {
        this.soluong = soluong;
    }
}
