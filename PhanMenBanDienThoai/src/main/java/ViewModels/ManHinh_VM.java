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
public class ManHinh_VM {
    private int stt;
    private String idMH;
    private String maMH;
    private String tenMH;

    public ManHinh_VM() {
    }

    public ManHinh_VM(String idMH) {
        this.idMH = idMH;
    }



    public ManHinh_VM(int stt, String idMH, String maMH, String tenMH) {
        this.stt = stt;
        this.idMH = idMH;
        this.maMH = maMH;
        this.tenMH = tenMH;
    }

    public int getStt() {
        return stt;
    }

    public void setStt(int stt) {
        this.stt = stt;
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
