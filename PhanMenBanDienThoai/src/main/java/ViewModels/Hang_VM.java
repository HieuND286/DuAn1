/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ViewModels;
import DomainModels.*;

/**
 *
 * @author admin
 */
public class Hang_VM {
    private int stt;
    private String idHang;
    private String maHang;
    private String tenHang;

    public Hang_VM() {
    }

    public Hang_VM(String idHang) {
        this.idHang = idHang;
    }

    
    

    public Hang_VM(int stt, String idHang, String maHang, String tenHang) {
        this.stt = stt;
        this.idHang = idHang;
        this.maHang = maHang;
        this.tenHang = tenHang;
    }

    public int getStt() {
        return stt;
    }

    public void setStt(int stt) {
        this.stt = stt;
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
