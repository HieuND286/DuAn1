/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DomainModels;

import java.util.Date;

/**
 *
 * @author Admin
 */
public class DotKhuyenMai {
    private String idDKM;
    private NhanVien_DM idNV;
    private String loaiMa;
    private String maVoucher;
    private int giaTri;
    private String tenKM;
    private Date ngaybatDau;
    private Date ngayKetThuc;
    private int trangThai;

    public DotKhuyenMai() {
    }

    public DotKhuyenMai(String idDKM, NhanVien_DM idNV, String loaiMa, String maVoucher, int giaTri, String tenKM, Date ngaybatDau, Date ngayKetThuc, int trangThai) {
        this.idDKM = idDKM;
        this.idNV = idNV;
        this.loaiMa = loaiMa;
        this.maVoucher = maVoucher;
        this.giaTri = giaTri;
        this.tenKM = tenKM;
        this.ngaybatDau = ngaybatDau;
        this.ngayKetThuc = ngayKetThuc;
        this.trangThai = trangThai;
    }

    public DotKhuyenMai(String loaiMa, String maVoucher, int giaTri, String tenKM, Date ngaybatDau, Date ngayKetThuc, int trangThai) {
        this.loaiMa = loaiMa;
        this.maVoucher = maVoucher;
        this.giaTri = giaTri;
        this.tenKM = tenKM;
        this.ngaybatDau = ngaybatDau;
        this.ngayKetThuc = ngayKetThuc;
        this.trangThai = trangThai;
    }

    public String getIdDKM() {
        return idDKM;
    }

    public void setIdDKM(String idDKM) {
        this.idDKM = idDKM;
    }

    public NhanVien_DM getIdNV() {
        return idNV;
    }

    public void setIdNV(NhanVien_DM idNV) {
        this.idNV = idNV;
    }
    
    public String getLoaiMa() {
        return loaiMa;
    }

    public void setLoaiMa(String loaiMa) {
        this.loaiMa = loaiMa;
    }

    public String getMaVoucher() {
        return maVoucher;
    }

    public void setMaVoucher(String maVoucher) {
        this.maVoucher = maVoucher;
    }

    public int getGiaTri() {
        return giaTri;
    }

    public void setGiaTri(int giaTri) {
        this.giaTri = giaTri;
    }

    public String getTenKM() {
        return tenKM;
    }

    public void setTenKM(String tenKM) {
        this.tenKM = tenKM;
    }

    public Date getNgaybatDau() {
        return ngaybatDau;
    }

    public void setNgaybatDau(Date ngaybatDau) {
        this.ngaybatDau = ngaybatDau;
    }

    public Date getNgayKetThuc() {
        return ngayKetThuc;
    }

    public void setNgayKetThuc(Date ngayKetThuc) {
        this.ngayKetThuc = ngayKetThuc;
    }

    public int getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(int trangThai) {
        this.trangThai = trangThai;
    }

   

    
    
}
