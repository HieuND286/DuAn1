/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DomainModels;

/**
 *
 * @author admin
 */
public class SanPham_DM {

    private String idSP;
    private String maSP;
    private String tenSP;

    public SanPham_DM() {
    }

    public SanPham_DM(String idSP) {
        this.idSP = idSP;
    }
    
    

    public SanPham_DM(String idSP, String maSP, String tenSP) {
        this.idSP = idSP;
        this.maSP = maSP;
        this.tenSP = tenSP;
    }

    public String getIdSP() {
        return idSP;
    }

    public void setIdSP(String idSP) {
        this.idSP = idSP;
    }

    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }
    
    
}
