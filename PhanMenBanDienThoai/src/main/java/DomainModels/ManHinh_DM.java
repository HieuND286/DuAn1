/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DomainModels;

/**
 *
 * @author admin
 */
public class ManHinh_DM {
    private String idMH;
    private String maMH;
    private String tenMH;

    public ManHinh_DM() {
    }

    public ManHinh_DM(String idMH) {
        this.idMH = idMH;
    }
    
    

    public ManHinh_DM(String idMH, String maMH, String tenMH) {
        this.idMH = idMH;
        this.maMH = maMH;
        this.tenMH = tenMH;
    }

    public String getIdMH() {
        return idMH;
    }

    public void setIdMH(String idMH) {
        this.idMH = idMH;
    }

    public String getMaMH() {
        return maMH;
    }

    public void setMaMH(String maMH) {
        this.maMH = maMH;
    }

    public String getTenMH() {
        return tenMH;
    }

    public void setTenMH(String tenMH) {
        this.tenMH = tenMH;
    }
    
    
}
