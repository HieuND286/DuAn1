/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ViewModels;

import DomainModels.PhieuBaoHanhDomainModel;
import java.util.Date;

/**
 *
 * @author DELL
 */
public class PhieuBaoHanhViewModels {

    private String IDPBH;
    private String IDhoaDon;
    private String IDgoiBaoHanh;
    private String IDhoaDonCT;
    private String ten;
    private Date NgayBatDau;
    private Date NGayKetThuc;
    private int trangThai;
    private String DiaChi;
    private String SdtCH;
    private String Mota;

    public PhieuBaoHanhViewModels() {
    }

    public PhieuBaoHanhViewModels(String IDPBH, String IDhoaDon, String IDgoiBaoHanh, String IDhoaDonCT, String ten, Date NgayBatDau, Date NGayKetThuc, int trangThai, String DiaChi, String SdtCH, String Mota) {
        this.IDPBH = IDPBH;
        this.IDhoaDon = IDhoaDon;
        this.IDgoiBaoHanh = IDgoiBaoHanh;
        this.IDhoaDonCT = IDhoaDonCT;
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

    public String getIDhoaDon() {
        return IDhoaDon;
    }

    public void setIDhoaDon(String IDhoaDon) {
        this.IDhoaDon = IDhoaDon;
    }

    public String getIDgoiBaoHanh() {
        return IDgoiBaoHanh;
    }

    public void setIDgoiBaoHanh(String IDgoiBaoHanh) {
        this.IDgoiBaoHanh = IDgoiBaoHanh;
    }

    public String getIDhoaDonCT() {
        return IDhoaDonCT;
    }

    public void setIDhoaDonCT(String IDhoaDonCT) {
        this.IDhoaDonCT = IDhoaDonCT;
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
