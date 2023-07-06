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
public class Ram_VM {
    private int stt;
    private String idRam;
    private String maRam;
    private String dungLuongRam;

    public Ram_VM() {
    }

    public Ram_VM(String idRam) {
        this.idRam = idRam;
    }


    public Ram_VM(int stt, String idRam, String maRam, String dungLuongRam) {
        this.stt = stt;
        this.idRam = idRam;
        this.maRam = maRam;
        this.dungLuongRam = dungLuongRam;
    }

    public int getStt() {
        return stt;
    }

    public void setStt(int stt) {
        this.stt = stt;
    }

    

    public String getIdRam() {
        return idRam;
    }

    public void setIdRam(String idRam) {
        this.idRam = idRam;
    }

    public String getMaRam() {
        return maRam;
    }

    public void setMaRam(String maRam) {
        this.maRam = maRam;
    }

    public String getDungLuongRam() {
        return dungLuongRam;
    }

    public void setDungLuongRam(String dungLuongRam) {
        this.dungLuongRam = dungLuongRam;
    }
    
    
}
