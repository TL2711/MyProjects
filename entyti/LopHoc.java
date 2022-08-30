
package com.mycompany.entyti;

/**
 *
 * @author LUU THE TRUNG
 */
public class LopHoc {
    private String tenlop;
    private String siso;
    private String Khoa;

    public LopHoc(String tenlop, String siso, String Khoa) {
        this.tenlop = tenlop;
        this.siso = siso;
        this.Khoa = Khoa;
    }

    public LopHoc() {
    }

    public String getTenlop() {
        return tenlop;
    }

    public void setTenlop(String tenlop) {
        this.tenlop = tenlop;
    }

    public String getSiso() {
        return siso;
    }

    public void setSiso(String siso) {
        this.siso = siso;
    }

    public String getKhoa() {
        return Khoa;
    }

    public void setKhoa(String Khoa) {
        this.Khoa = Khoa;
    }

    public String toString() {
        return this.tenlop+";"+this.siso+";"+this.Khoa;
    }
    
    public Object[] toArray() {
        return new Object[]{this.tenlop,this.siso,this.Khoa};
    }
    
    
}
