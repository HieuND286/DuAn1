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
public class HeDieuHanh_VM {
    private int stt;
    private String idHDH;
    private String maHDH;
    private String tenHDH;

    public HeDieuHanh_VM() {
    }

    public HeDieuHanh_VM(String idHDH) {
        this.idHDH = idHDH;
    }


    

    public HeDieuHanh_VM(int stt, String idHDH, String maHDH, String tenHDH) {
        this.stt = stt;
        this.idHDH = idHDH;
        this.maHDH = maHDH;
        this.tenHDH = tenHDH;
    }

    public int getStt() {
        return stt;
    }

    public void setStt(int stt) {
        this.stt = stt;
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
