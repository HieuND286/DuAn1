/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ViewModels;


/**
 *
 * @author admin
 */
public class HoaDon_VM {
    private int stt;
     private String id;
    private String ma;
    private NhanVien_VM nhanVien_VM;
    private KhachHang_VM khachHang_VM;
    private String ngayTao;
    private String ngayThanhToan;
    private int tinhTrang;
    private String moTa;
    private int hinhThucNhan;

    public HoaDon_VM() {
    }

    public HoaDon_VM(String id) {
        this.id = id;
    }

    public int getStt() {
        return stt;
    }

    public void setStt(int stt) {
        this.stt = stt;
    }
    
      
    
    public HoaDon_VM(int stt,String id, String ma, NhanVien_VM nhanVien_VM, KhachHang_VM khachHang_VM, String ngayTao, String ngayThanhToan, int tinhTrang, String moTa, int hinhThucNhan) {
        this.stt = stt;
        this.id = id;
        this.ma = ma;
        this.nhanVien_VM = nhanVien_VM;
        this.khachHang_VM = khachHang_VM;
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

    public NhanVien_VM getNhanVien_VM() {
        return nhanVien_VM;
    }

    public void setNhanVien_VM(NhanVien_VM nhanVien_VM) {
        this.nhanVien_VM = nhanVien_VM;
    }

    public KhachHang_VM getKhachHang_VM() {
        return khachHang_VM;
    }

    public void setKhachHang_VM(KhachHang_VM khachHang_VM) {
        this.khachHang_VM = khachHang_VM;
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
