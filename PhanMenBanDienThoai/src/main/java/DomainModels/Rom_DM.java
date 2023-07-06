/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DomainModels;

/**
 *
 * @author admin
 */
public class Rom_DM {

    private String idRom;
    private String maRom;
    private String dungLuongRom;

    public Rom_DM() {
    }

    public Rom_DM(String idRom) {
        this.idRom = idRom;
    }
    
    

    public Rom_DM(String idRom, String maRom, String dungLuongRom) {
        this.idRom = idRom;
        this.maRom = maRom;
        this.dungLuongRom = dungLuongRom;
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
