
package com.mycompany.entyti;


public class Admin {
    private String tk;
    private String mk;

    public Admin(String tk, String mk) {
        this.tk = tk;
        this.mk = mk;
    }
    
    public Admin() {
    
    }

    public String getTk() {
        return tk;
    }

    public void setTk(String tk) {
        this.tk = tk;
    }

    public String getMk() {
        return mk;
    }

    public void setMk(String mk) {
        this.mk = mk;
    }

    @Override
    public String toString() {
        return tk+ ";" + mk;
    }
    
    
    public Object[] toArray(){
        return new Object[]{this.tk,this.mk};
        
    }
}
