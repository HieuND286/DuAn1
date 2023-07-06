/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DomainModels;

import ViewModels.ChiTietSP_VM;
import ViewModels.HoaDon_VM;

/**
 *
 * @author admin
 */
public class Hoa_Don_CT_DM {
    private String id;
    private Imei_DM imei_DM;
    private HoaDon_DM hoaDon_DM ;
    private int soLuong ;
    private double donGia ;

    public Hoa_Don_CT_DM(String id, Imei_DM imei_DM, HoaDon_DM hoaDon_DM, int soLuong, double donGia) {
        this.id = id;
        this.imei_DM = imei_DM;
        this.hoaDon_DM = hoaDon_DM;
        this.soLuong = soLuong;
        this.donGia = donGia;
    }

    

    public Hoa_Don_CT_DM() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Imei_DM getImei_DM() {
        return imei_DM;
    }

    public void setImei_DM(Imei_DM imei_DM) {
        this.imei_DM = imei_DM;
    }

    

    public HoaDon_DM getHoaDon_DM() {
        return hoaDon_DM;
    }

    public void setHoaDon_DM(HoaDon_DM hoaDon_DM) {
        this.hoaDon_DM = hoaDon_DM;
    }

    

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(int donGia) {
        this.donGia = donGia;
    }
    
}
