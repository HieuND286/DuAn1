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
public class Rom_VM {
private int stt;
    private String idRom;
    private String maRom;
    private String dungLuongRom;

    public Rom_VM() {
    }

    public Rom_VM(String idRom) {
        this.idRom = idRom;
    }



    public Rom_VM(int stt, String idRom, String maRom, String dungLuongRom) {
        this.stt = stt;
        this.idRom = idRom;
        this.maRom = maRom;
        this.dungLuongRom = dungLuongRom;
    }

    public int getStt() {
        return stt;
    }

    public void setStt(int stt) {
        this.stt = stt;
    }

    

    public String getIdRom() {
        return idRom;
    }

    public void setIdRom(String idRom) {
        this.idRom = idRom;
    }

    public String getMaRom() {
        return maRom;
    }

    public void setMaRom(String maRom) {
        this.maRom = maRom;
    }

    public String getDungLuongRom() {
        return dungLuongRom;
    }

    public void setDungLuongRom(String dungLuongRom) {
        this.dungLuongRom = dungLuongRom;
    }
    
    
}
