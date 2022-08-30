
package com.mycompany.entyti;

public class NguoiDung implements java.io.Serializable {
    String gioiTinh;
    String khoa;
    String diaChi;
    String sdt;

    public NguoiDung(String gioiTinh,String khoa,  String diaChi, String sdt) {
        this.khoa = khoa;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
        this.sdt = sdt;
    }
    
    public NguoiDung() {
    }

    public String getKhoa() {
        return khoa;
    }

    public void setKhoa(String khoa) {
        this.khoa = khoa;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }
    
    

    

}
