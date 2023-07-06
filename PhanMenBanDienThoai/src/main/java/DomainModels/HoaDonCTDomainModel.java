/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DomainModels;

/**
 *
 * @author DELL
 */
public class HoaDonCTDomainModel {

    private String IDHDCT;
    private String IDHD;
    private String IDCTSP;
    private String IDDKM;
    private String IDPBH;
    private int SoLuong;
    private int DonGia;

    public HoaDonCTDomainModel(String IDHDCT, String IDHD, String IDCTSP, String IDDKM, String IDPBH, int SoLuong, int DonGia) {
        this.IDHDCT = IDHDCT;
        this.IDHD = IDHD;
        this.IDCTSP = IDCTSP;
        this.IDDKM = IDDKM;
        this.IDPBH = IDPBH;
        this.SoLuong = SoLuong;
        this.DonGia = DonGia;
    }

    public HoaDonCTDomainModel() {
    }

    public String getIDHDCT() {
        return IDHDCT;
    }

    public void setIDHDCT(String IDHDCT) {
        this.IDHDCT = IDHDCT;
    }

    public String getIDHD() {
        return IDHD;
    }

    public void setIDHD(String IDHD) {
        this.IDHD = IDHD;
    }

    public String getIDCTSP() {
        return IDCTSP;
    }

    public void setIDCTSP(String IDCTSP) {
        this.IDCTSP = IDCTSP;
    }

    public String getIDDKM() {
        return IDDKM;
    }

    public void setIDDKM(String IDDKM) {
        this.IDDKM = IDDKM;
    }

    public String getIDPBH() {
        return IDPBH;
    }

    public void setIDPBH(String IDPBH) {
        this.IDPBH = IDPBH;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }

    public int getDonGia() {
        return DonGia;
    }

    public void setDonGia(int DonGia) {
        this.DonGia = DonGia;
    }
    
}
