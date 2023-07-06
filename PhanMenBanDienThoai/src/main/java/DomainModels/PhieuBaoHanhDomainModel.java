/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DomainModels;

import java.util.Date;

/**
 *
 * @author DELL
 */
public class PhieuBaoHanhDomainModel {

    private String IDPBH;
    private HoaDonDomainModel hoaDonDomainModel;
    private GoiBaoHanhDomainModel goiBaoHanhDomainModel;
    private HoaDonCTDomainModel hoaDonCTDomainModel;
    private String ten;
    private Date NgayBatDau;
    private Date NGayKetThuc;
    private int trangThai;
    private String DiaChi;
    private String SdtCH;
    private String Mota;

    public PhieuBaoHanhDomainModel() {
    }

    public PhieuBaoHanhDomainModel(String IDPBH, HoaDonDomainModel hoaDonDomainModel, GoiBaoHanhDomainModel goiBaoHanhDomainModel, HoaDonCTDomainModel hoaDonCTDomainModel, String ten, Date NgayBatDau, Date NGayKetThuc, int trangThai, String DiaChi, String SdtCH, String Mota) {
        this.IDPBH = IDPBH;
        this.hoaDonDomainModel = hoaDonDomainModel;
        this.goiBaoHanhDomainModel = goiBaoHanhDomainModel;
        this.hoaDonCTDomainModel = hoaDonCTDomainModel;
        this.ten = ten;
        this.NgayBatDau = NgayBatDau;
        this.NGayKetThuc = NGayKetThuc;
        this.trangThai = trangThai;
        this.DiaChi = DiaChi;
        this.SdtCH = SdtCH;
        this.Mota = Mota;
    }

    public String getIDPBH() {
        return IDPBH;
    }

    public void setIDPBH(String IDPBH) {
        this.IDPBH = IDPBH;
    }

    public HoaDonDomainModel getHoaDonDomainModel() {
        return hoaDonDomainModel;
    }

    public void setHoaDonDomainModel(HoaDonDomainModel hoaDonDomainModel) {
        this.hoaDonDomainModel = hoaDonDomainModel;
    }

    public GoiBaoHanhDomainModel getGoiBaoHanhDomainModel() {
        return goiBaoHanhDomainModel;
    }

    public void setGoiBaoHanhDomainModel(GoiBaoHanhDomainModel goiBaoHanhDomainModel) {
        this.goiBaoHanhDomainModel = goiBaoHanhDomainModel;
    }

    public HoaDonCTDomainModel getHoaDonCTDomainModel() {
        return hoaDonCTDomainModel;
    }

    public void setHoaDonCTDomainModel(HoaDonCTDomainModel hoaDonCTDomainModel) {
        this.hoaDonCTDomainModel = hoaDonCTDomainModel;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public Date getNgayBatDau() {
        return NgayBatDau;
    }

    public void setNgayBatDau(Date NgayBatDau) {
        this.NgayBatDau = NgayBatDau;
    }

    public Date getNGayKetThuc() {
        return NGayKetThuc;
    }

    public void setNGayKetThuc(Date NGayKetThuc) {
        this.NGayKetThuc = NGayKetThuc;
    }

    public int getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(int trangThai) {
        this.trangThai = trangThai;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public String getSdtCH() {
        return SdtCH;
    }

    public void setSdtCH(String SdtCH) {
        this.SdtCH = SdtCH;
    }

    public String getMota() {
        return Mota;
    }

    public void setMota(String Mota) {
        this.Mota = Mota;
    }

}
