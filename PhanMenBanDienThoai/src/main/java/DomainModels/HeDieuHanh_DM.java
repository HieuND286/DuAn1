/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DomainModels;

/**
 *
 * @author admin
 */
public class HeDieuHanh_DM {
    private String idHDH;
    private String maHDH;
    private String tenHDH;

    public HeDieuHanh_DM() {
    }

    public HeDieuHanh_DM(String idHDH) {
        this.idHDH = idHDH;
    }
    
    

    public HeDieuHanh_DM(String idHDH, String maHDH, String tenHDH) {
        this.idHDH = idHDH;
        this.maHDH = maHDH;
        this.tenHDH = tenHDH;
    }

    public String getIdHDH() {
        return idHDH;
    }

    public void setIdHDH(String idHDH) {
        this.idHDH = idHDH;
    }

    public String getMaHDH() {
        return maHDH;
    }

    public void setMaHDH(String maHDH) {
        this.maHDH = maHDH;
    }

    public String getTenHDH() {
        return tenHDH;
    }

    public void setTenHDH(String tenHDH) {
        this.tenHDH = tenHDH;
    }
    
    
}
