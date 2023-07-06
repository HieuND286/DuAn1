/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DomainModels;

/**
 *
 * @author admin
 */
public class Hang_DM {
    private String idHang;
    private String maHang;
    private String tenHang;

    public Hang_DM() {
    }

    public Hang_DM(String idHang) {
        this.idHang = idHang;
    }
    
    

    public Hang_DM(String idHang, String maHang, String tenHang) {
        this.idHang = idHang;
        this.maHang = maHang;
        this.tenHang = tenHang;
    }

    public String getIdHang() {
        return idHang;
    }

    public void setIdHang(String idHang) {
        this.idHang = idHang;
    }

    public String getMaHang() {
        return maHang;
    }

    public void setMaHang(String maHang) {
        this.maHang = maHang;
    }

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }
    
    
}
