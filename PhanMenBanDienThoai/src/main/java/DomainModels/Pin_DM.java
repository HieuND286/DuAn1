/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DomainModels;

/**
 *
 * @author admin
 */
public class Pin_DM {
    private String idPin;
    private String maPin;
    private String dungLuongPin;

    public Pin_DM() {
    }

    public Pin_DM(String idPin) {
        this.idPin = idPin;
    }
    
    

    public Pin_DM(String idPin, String maPin, String dungLuongPin) {
        this.idPin = idPin;
        this.maPin = maPin;
        this.dungLuongPin = dungLuongPin;
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
