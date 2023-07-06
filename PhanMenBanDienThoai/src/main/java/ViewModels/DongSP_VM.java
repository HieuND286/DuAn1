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
public class DongSP_VM {
    private int stt;
    private String idDongSP;
    private String maDongSP;
    private String tenDongSP;

    public DongSP_VM() {
    }

    public DongSP_VM(String idDongSP) {
        this.idDongSP = idDongSP;
    }

    

    public DongSP_VM(int stt, String idDongSP, String maDongSP, String tenDongSP) {
        this.stt = stt;
        this.idDongSP = idDongSP;
        this.maDongSP = maDongSP;
        this.tenDongSP = tenDongSP;
    }

    public int getStt() {
        return stt;
    }

    public void setStt(int stt) {
        this.stt = stt;
    }

    

    public String getIdDongSP() {
        return idDongSP;
    }

    public void setIdDongSP(String idDongSP) {
        this.idDongSP = idDongSP;
    }

    public String getMaDongSP() {
        return maDongSP;
    }

    public void setMaDongSP(String maDongSP) {
        this.maDongSP = maDongSP;
    }

    public String getTenDongSP() {
        return tenDongSP;
    }

    public void setTenDongSP(String tenDongSP) {
        this.tenDongSP = tenDongSP;
    }
    
    
}
