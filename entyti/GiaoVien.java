
package com.mycompany.entyti;


public class GiaoVien extends NguoiDung implements java.io.Serializable{
    private String maGV;
    private String tenGV;
    private String mk;

    public GiaoVien(String maGV, String tenGV, String gioiTinh, String khoa, String diaChi, String sdt,String mk) {
        super(gioiTinh, khoa, diaChi, sdt);
        this.maGV = maGV;
        this.tenGV = tenGV;
        this.mk = mk;
    }

    
    
    public GiaoVien() {
    }

    public String getMaGV() {
        return maGV;
    }

    public void setMaGV(String maGV) {
        this.maGV = maGV;
    }

    public String getTenGV() {
        return tenGV;
    }

    public void setTenGV(String tenGV) {
        this.tenGV = tenGV;
    }

    public String getMk() {
        return mk;
    }

    public void setMk(String mk) {
        this.mk = mk;
    }

    
    public String toString() {
        return maGV + ";" +tenGV + ";" +gioiTinh+ ";"+khoa+ ";" +diaChi+ ";" +sdt+ ";" +mk;
    }
    
    public Object[] toArray(){
        return new Object[]{this.maGV,this.tenGV,this.gioiTinh,this.khoa,this.diaChi,this.sdt,this.mk};
    }

}
