
package com.mycompany.entyti;

/**
 *
 * @author LUU THE TRUNG
 */
public class Khoa {
    private String makhoa;
    private String tenkhoa;
    private String sdt;

    public Khoa(String makhoa, String tenkhoa, String sdt) {
        this.makhoa = makhoa;
        this.tenkhoa = tenkhoa;
        this.sdt = sdt;
    }

    public Khoa() {
    }

    public String getMakhoa() {
        return makhoa;
    }

    public void setMakhoa(String makhoa) {
        this.makhoa = makhoa;
    }

    public String getTenkhoa() {
        return tenkhoa;
    }

    public void setTenkhoa(String tenkhoa) {
        this.tenkhoa = tenkhoa;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }
    
    public String toString() {
        return this.makhoa+";"+this.tenkhoa+";"+this.sdt;
    }
    
    public Object[] toArray() {
     return new Object[]{this.makhoa,this.tenkhoa,this.sdt};    
    }
    

    
}
