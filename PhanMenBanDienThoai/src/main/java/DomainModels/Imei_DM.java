/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DomainModels;

/**
 *
 * @author admin
 */
public class Imei_DM {
    private String iDImei;
    private String imei;
    private ChiTietSP_DM chiTietSP_DM;

    public Imei_DM() {
    }

    public Imei_DM(String iDImei, String imei, ChiTietSP_DM chiTietSP_DM) {
        this.iDImei = iDImei;
        this.imei = imei;
        this.chiTietSP_DM = chiTietSP_DM;
    }

    
    
    public ChiTietSP_DM getChiTietSP_DM() {
        return chiTietSP_DM;
    }

    public void setChiTietSP_DM(ChiTietSP_DM chiTietSP_DM) {
        this.chiTietSP_DM = chiTietSP_DM;
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
