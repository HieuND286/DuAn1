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
public class Pin_VM {
    private int stt;
    private String idPin;
    private String maPin;
    private String dungLuongPin;

    public Pin_VM() {
    }

    public Pin_VM(String idPin) {
        this.idPin = idPin;
    }



    public Pin_VM(int stt, String idPin, String maPin, String dungLuongPin) {
        this.stt = stt;
        this.idPin = idPin;
        this.maPin = maPin;
        this.dungLuongPin = dungLuongPin;
    }

    public int getStt() {
        return stt;
    }

    public void setStt(int stt) {
        this.stt = stt;
    }

    

    public String getIdPin() {
        return idPin;
    }

    public void setIdPin(String idPin) {
        this.idPin = idPin;
    }

    public String getMaPin() {
        return maPin;
    }

    public void setMaPin(String maPin) {
        this.maPin = maPin;
    }

    public String getDungLuongPin() {
        return dungLuongPin;
    }

    public void setDungLuongPin(String dungLuongPin) {
        this.dungLuongPin = dungLuongPin;
    }
    
    
}
