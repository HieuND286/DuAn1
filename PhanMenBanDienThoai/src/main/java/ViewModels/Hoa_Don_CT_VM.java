/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ViewModels;


/**
 *
 * @author admin
 */
public class Hoa_Don_CT_VM {
   private int stt;
    private String id;
    private Imei_VM imei_VM ;
    private HoaDon_VM hoaDon_VM ;
    private int soLuong ;
    private double donGia ;

    public Hoa_Don_CT_VM(int stt, String id, Imei_VM imei_VM, HoaDon_VM hoaDon_VM, int soLuong, double donGia) {
        this.stt = stt;
        this.id = id;
        this.imei_VM = imei_VM;
        this.hoaDon_VM = hoaDon_VM;
        this.soLuong = soLuong;
        this.donGia = donGia;
    }

    

    public Hoa_Don_CT_VM() {
    }

    public int getStt() {
        return stt;
    }

    public void setStt(int stt) {
        this.stt = stt;
    }

    
     
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Imei_VM getImei_VM() {
        return imei_VM;
    }

    public void setImei_VM(Imei_VM imei_VM) {
        this.imei_VM = imei_VM;
    }

    

    public HoaDon_VM getHoaDon_VM() {
        return hoaDon_VM;
    }

    public void setHoaDon_VM(HoaDon_VM hoaDon_VM) {
        this.hoaDon_VM = hoaDon_VM;
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

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }
    
    
}
