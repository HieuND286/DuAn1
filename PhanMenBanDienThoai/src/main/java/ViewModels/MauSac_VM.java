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
public class MauSac_VM {
    private int stt;
    private String idMS;
    private String maMS;
    private String tenMS;

    public MauSac_VM() {
    }

    public MauSac_VM(String idMS) {
        this.idMS = idMS;
    }


    
    

    public MauSac_VM(int stt, String idMS, String maMS, String tenMS) {
        this.stt = stt;
        this.idMS = idMS;
        this.maMS = maMS;
        this.tenMS = tenMS;
    }

    public int getStt() {
        return stt;
    }

    public void setStt(int stt) {
        this.stt = stt;
    }
    
    

    public String getIdMS() {
        return idMS;
    }

    public void setIdMS(String idMS) {
        this.idMS = idMS;
    }

    public String getMaMS() {
        return maMS;
    }

    public void setMaMS(String maMS) {
        this.maMS = maMS;
    }

    public String getTenMS() {
        return tenMS;
    }

    public void setTenMS(String tenMS) {
        this.tenMS = tenMS;
    }
    
    
}
