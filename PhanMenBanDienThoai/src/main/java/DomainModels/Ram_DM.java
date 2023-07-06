/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DomainModels;

/**
 *
 * @author admin
 */
public class Ram_DM {
    
    private String idRam;
    private String maRam;
    private String dungLuongRam;

    public Ram_DM() {
    }

    public Ram_DM(String idRam) {
        this.idRam = idRam;
    }
    
    

    public Ram_DM(String idRam, String maRam, String dungLuongRam) {
        this.idRam = idRam;
        this.maRam = maRam;
        this.dungLuongRam = dungLuongRam;
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
