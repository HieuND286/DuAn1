/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ViewModels;

/**
 *
 * @author Acer
 */
public class HoaDon_VM1 {
      private String idHD;
    private String idNV;
    private String idKH;
    private String maHD;
     private int hinhThucNhan;
    private String ngayTao;
     private String ngayThanhToan;
    private int trangThai;
    private String moTa;

    public HoaDon_VM1() {
    }

    public String getIdNV() {
        return idNV;
    }

    public void setIdNV(String idNV) {
        this.idNV = idNV;
    }

    public String getNgayThanhToan() {
        return ngayThanhToan;
    }

    public void setNgayThanhToan(String ngayThanhToan) {
        this.ngayThanhToan = ngayThanhToan;
    }

     public HoaDon_VM1(String idHD, String idNV, String idKH, String maHD, int hinhThucNhan, String ngayTao, String ngayThanhToan, int trangThai, String moTa) {
        this.idHD = idHD;
        this.idNV = idNV;
        this.idKH = idKH;
        this.maHD = maHD;
        this.hinhThucNhan = hinhThucNhan;
        this.ngayTao = ngayTao;
        this.ngayThanhToan = ngayThanhToan;
        this.trangThai = trangThai;
        this.moTa = moTa;
    }

    public int getHinhThucNhan() {
        return hinhThucNhan;
    }

    public void setHinhThucNhan(int hinhThucNhan) {
        this.hinhThucNhan = hinhThucNhan;
    }

   

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

  

    public String getIdKH() {
        return idKH;
    }

    public void setIdKH(String idKH) {
        this.idKH = idKH;
    }

 

   


    public String getIdHD() {
        return idHD;
    }

    public void setIdHD(String idHD) {
        this.idHD = idHD;
    }

   

    public String getMaHD() {
        return maHD;
    }

    public void setMaHD(String maHD) {
        this.maHD = maHD;
    }

    public String getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(String ngayTao) {
        this.ngayTao = ngayTao;
    }

    public int getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(int trangThai) {
        this.trangThai = trangThai;
    }
    
}
