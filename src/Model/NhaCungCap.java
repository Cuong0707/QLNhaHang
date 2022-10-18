/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author HP
 */
public class NhaCungCap {
    String MaCC;
    String TenCC;
    String SoDT;
    String DiaChi;

    public NhaCungCap() {
    }

    public NhaCungCap(String MaCC, String TenCC, String SoDT, String DiaChi) {
        this.MaCC = MaCC;
        this.TenCC = TenCC;
        this.SoDT = SoDT;
        this.DiaChi = DiaChi;
    }

    public String getMaCC() {
        return MaCC;
    }

    public void setMaCC(String MaCC) {
        this.MaCC = MaCC;
    }

    public String getTenCC() {
        return TenCC;
    }

    public void setTenCC(String TenCC) {
        this.TenCC = TenCC;
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
}
