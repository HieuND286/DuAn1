/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DomainModels;

/**
 *
 * @author 84339
 */
public class DonGiao_DM {
    private String idDG;
    private String idHD;
  
    private String hoTenNguoiNhan;
    private String sdtNguoiNhan;
    private String hoTenShipper;
    private String sdtShipper;
    private String ngayGiao;
    private String ngayNhan;
    private String diaChi;
    private int trangThai;
 private HoaDon_DM1 hoaDon;
    public DonGiao_DM() {
    }

    public DonGiao_DM(String idDG, String idHD, String hoTenNguoiNhan, String sdtNguoiNhan, String hoTenShipper, String sdtShipper, String ngayGiao, String ngayNhan, String diaChi, int trangThai) {
        this.idDG = idDG;
        this.idHD = idHD;
        
        this.hoTenNguoiNhan = hoTenNguoiNhan;
        this.sdtNguoiNhan = sdtNguoiNhan;
        this.hoTenShipper = hoTenShipper;
        this.sdtShipper = sdtShipper;
        this.ngayGiao = ngayGiao;
        this.ngayNhan = ngayNhan;
        this.diaChi = diaChi;
        this.trangThai = trangThai;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    

   

    public String getIdDG() {
        return idDG;
    }

    public void setIdDG(String idDG) {
        this.idDG = idDG;
    }

    public String getIdHD() {
        return idHD;
    }

    public void setIdHD(String idHD) {
        this.idHD = idHD;
    }

   

    public String getHoTenNguoiNhan() {
        return hoTenNguoiNhan;
    }

    public void setHoTenNguoiNhan(String hoTenNguoiNhan) {
        this.hoTenNguoiNhan = hoTenNguoiNhan;
    }

    public String getSdtNguoiNhan() {
        return sdtNguoiNhan;
    }

    public void setSdtNguoiNhan(String sdtNguoiNhan) {
        this.sdtNguoiNhan = sdtNguoiNhan;
    }

    public String getHoTenShipper() {
        return hoTenShipper;
    }

    public void setHoTenShipper(String hoTenShipper) {
        this.hoTenShipper = hoTenShipper;
    }

    public String getSdtShipper() {
        return sdtShipper;
    }

    public void setSdtShipper(String sdtShipper) {
        this.sdtShipper = sdtShipper;
    }

    public String getNgayGiao() {
        return ngayGiao;
    }

    public void setNgayGiao(String ngayGiao) {
        this.ngayGiao = ngayGiao;
    }

    public String getNgayNhan() {
        return ngayNhan;
    }

    public void setNgayNhan(String ngayNhan) {
        this.ngayNhan = ngayNhan;
    }

    public int getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(int trangThai) {
        this.trangThai = trangThai;
    }

    public HoaDon_DM1 getHoaDon() {
        return hoaDon;
    }

    public void setHoaDon(HoaDon_DM1 hoaDon) {
        this.hoaDon = hoaDon;
    }

    
}
