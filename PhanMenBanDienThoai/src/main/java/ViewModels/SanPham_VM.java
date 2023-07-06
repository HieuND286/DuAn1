/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Viewmodels;

import DomainModels.*;

/**
 *
 * @author admin
 */
public class SanPham_VM {

    private int stt;
    private String idSP;
    private String maSP;
    private String tenSP;

    public SanPham_VM() {
    }

    public SanPham_VM(String idSP) {
        this.idSP = idSP;
    }



    public SanPham_VM(int stt, String idSP, String maSP, String tenSP) {
        this.stt = stt;
        this.idSP = idSP;
        this.maSP = maSP;
        this.tenSP = tenSP;
    }

    public int getStt() {
        return stt;
    }

    public void setStt(int stt) {
        this.stt = stt;
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
