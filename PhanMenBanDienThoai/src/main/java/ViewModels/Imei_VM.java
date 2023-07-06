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
public class Imei_VM {
    private int stt;
    private String iDImei;
    private String imei;
    private ChiTietSP_VM chiTietSP_VM;

    public Imei_VM() {
    }

    public Imei_VM(String iDImei) {
        this.iDImei = iDImei;
    }

    public Imei_VM(int stt, String iDImei, String imei, ChiTietSP_VM chiTietSP_VM) {
        this.stt = stt;
        this.iDImei = iDImei;
        this.imei = imei;
        this.chiTietSP_VM = chiTietSP_VM;
    }

    public ChiTietSP_VM getChiTietSP_VM() {
        return chiTietSP_VM;
    }

    public void setChiTietSP_VM(ChiTietSP_VM chiTietSP_VM) {
        this.chiTietSP_VM = chiTietSP_VM;
    }
    
    public int getStt() {
        return stt;
    }

    public void setStt(int stt) {
        this.stt = stt;
    }

    

    public String getiDImei() {
        return iDImei;
    }

    public void setiDImei(String iDImei) {
        this.iDImei = iDImei;
    }

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }
    
    
}
