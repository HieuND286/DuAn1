/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DomainModels;

public class HoaDon_DM {
    private String id;
    private String ma;
    private NhanVien_DM nhanVien_DM;
    private KhachHang_DM khachHang_DM;
    private String ngayTao;
    private String ngayThanhToan;
    private int tinhTrang;
    private String moTa;
    private int hinhThucNhan;

    public HoaDon_DM() {
    }

    public HoaDon_DM(String id) {
        this.id = id;
    }
    
    
    
    public HoaDon_DM(String id, String ma, NhanVien_DM nhanVien_DM, KhachHang_DM khachHang_DM, String ngayTao, String ngayThanhToan, int tinhTrang, String moTa, int hinhThucNhan) {
        this.id = id;
        this.ma = ma;
        this.nhanVien_DM = nhanVien_DM;
        this.khachHang_DM = khachHang_DM;
        this.ngayTao = ngayTao;
        this.ngayThanhToan = ngayThanhToan;
        this.tinhTrang = tinhTrang;
        this.moTa = moTa;
        this.hinhThucNhan = hinhThucNhan;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public NhanVien_DM getNhanVien_DM() {
        return nhanVien_DM;
    }

    public void setNhanVien_DM(NhanVien_DM nhanVien_DM) {
        this.nhanVien_DM = nhanVien_DM;
    }

    public KhachHang_DM getKhachHang_DM() {
        return khachHang_DM;
    }

    public void setKhachHang_DM(KhachHang_DM khachHang_DM) {
        this.khachHang_DM = khachHang_DM;
    }

    

    public String getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(String ngayTao) {
        this.ngayTao = ngayTao;
    }

    public String getNgayThanhToan() {
        return ngayThanhToan;
    }

    public void setNgayThanhToan(String ngayThanhToan) {
        this.ngayThanhToan = ngayThanhToan;
    }

    public int getTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(int tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public int getHinhThucNhan() {
        return hinhThucNhan;
    }

    public void setHinhThucNhan(int hinhThucNhan) {
        this.hinhThucNhan = hinhThucNhan;
    }
    
    
    
}
