/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author HP
 */
public class LoaiNgLieu {
    String MaLoaiNgLieu ;
    String tenLoaiNgLieu ;

    public LoaiNgLieu() {
    }

    public LoaiNgLieu(String MaLoaiNgLieu, String tenLoaiNgLieu) {
        this.MaLoaiNgLieu = MaLoaiNgLieu;
        this.tenLoaiNgLieu = tenLoaiNgLieu;
    }

    public String getMaLoaiNguyenLieu() {
        return MaLoaiNgLieu;
    }

    public void setMaLoaiNguyenLieu(String MaLoaiNguyenLieu) {
        this.MaLoaiNgLieu = MaLoaiNguyenLieu;
    }

    public String getTenLoaiNgLieu() {
        return tenLoaiNgLieu;
    }

    public void setTenLoaiNgLieu(String tenLoaiNguyen) {
        this.tenLoaiNgLieu = tenLoaiNguyen;
    }
}
