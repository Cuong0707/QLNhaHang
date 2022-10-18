    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author HP
 */
public class NguyenLieu {
    String Manguyenlieu;
    String TenNguyenLieu;
    String donvitinh;
    double soluong;
    String Maloainguyenlieu;

    public NguyenLieu(String Manguyenlieu, String TenNguyenLieu, String donvitinh, double soluong, String Maloainguyenlieu) {
        this.Manguyenlieu = Manguyenlieu;
        this.TenNguyenLieu = TenNguyenLieu;
        this.donvitinh = donvitinh;
        this.soluong = soluong;
        this.Maloainguyenlieu = Maloainguyenlieu;
    }

    public NguyenLieu() {
    }

    public String getManguyenlieu() {
        return Manguyenlieu;
    }

    public void setManguyenlieu(String Manguyenlieu) {
        this.Manguyenlieu = Manguyenlieu;
    }

    public String getTenNguyenLieu() {
        return TenNguyenLieu;
    }

    public void setTenNguyenLieu(String TenNguyenLieu) {
        this.TenNguyenLieu = TenNguyenLieu;
    }

    public String getDonvitinh() {
        return donvitinh;
    }

    public void setDonvitinh(String donvitinh) {
        this.donvitinh = donvitinh;
    }

    public double getSoluong() {
        return soluong;
    }

    public void setSoluong(double soluong) {
        this.soluong = soluong;
    }

    public String getMaloainguyenlieu() {
        return Maloainguyenlieu;
    }

    public void setMaloainguyenlieu(String Maloainguyenlieu) {
        this.Maloainguyenlieu = Maloainguyenlieu;
    }
}
