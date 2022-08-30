
package com.mycompany.entyti;

public class SinhVien extends NguoiDung implements java.io.Serializable {
    private String maSV;
    private String tenSV;     
    private String ngaySinh;
    private String mk;

    public SinhVien(String maSV, String tenSV, String gioiTinh, String ngaySinh,  String khoa, String diaChi, String sdt, String mk) {
        super(gioiTinh, khoa, diaChi, sdt);
        this.maSV = maSV;
        this.tenSV = tenSV;
        this.ngaySinh = ngaySinh;
        this.mk = mk;
    }

    public SinhVien() {
    }
    

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getTenSV() {
        return tenSV;
    }

    public void setTenSV(String tenSV) {
        this.tenSV = tenSV;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getMk() {
        return mk;
    }

    public void setMk(String mk) {
        this.mk = mk;
    }
    

    

    
    

    public String toString(){
        return maSV+";"+tenSV+";" +gioiTinh+";" + ngaySinh+";"+ khoa+";"+diaChi+";"+sdt+";"+mk;
    }
    
    public Object[] toArray(){
        return new Object[]{this.maSV,this.tenSV,this.gioiTinh,this.ngaySinh,this.khoa,this.diaChi,this.sdt,this.mk};
    }

}
