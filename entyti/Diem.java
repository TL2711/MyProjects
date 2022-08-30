
package com.mycompany.entyti;

/**
 *
 * @author LUU THE TRUNG
 */
public class Diem {
    private String maSV;
    private String diemHeso;
    private String diemHechu;

    public Diem(String maSV, String diemHeso, String diemHechu) {
        this.maSV = maSV;
        this.diemHeso = diemHeso;
        this.diemHechu = diemHechu;
    }

    public Diem() {
    }
    

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getDiemHeso() {
        return diemHeso;
    }

    public void setDiemHeso(String diemHeso) {
        this.diemHeso = diemHeso;
    }

    public String getDiemHechu() {
        return diemHechu;
    }

    public void setDiemHechu(String diemHechu) {
        this.diemHechu = diemHechu;
    }

    public String toString() {
        return this.maSV+ ";" +this.diemHeso +";" +this.diemHechu;
    }
    
    public Object[] toArray(){
        return new Object[]{this.maSV,this.diemHeso,this.diemHechu};
    }
}
