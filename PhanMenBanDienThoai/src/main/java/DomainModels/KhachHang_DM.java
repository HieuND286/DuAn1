/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DomainModels;

/**
 *
 * @author ThisPC
 */
public class KhachHang_DM {
    private String id;
    private String ma;
    private String sdt;
    private String hoTen;
    private int gioiTinh;
    private int soLuongHoaDon;
    private String eMail;
    private String diaChi;
    private String ngayTao;
            

    public KhachHang_DM() {
    }

    public KhachHang_DM(String id) {
        this.id = id;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(String ngayTao) {
        this.ngayTao = ngayTao;
    }

    public KhachHang_DM(String id, String ma, String sdt, String hoTen, int gioiTinh, int soLuongHoaDon, String eMail, String diaChi, String ngayTao) {
        this.id = id;
        this.ma = ma;
        this.sdt = sdt;
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.soLuongHoaDon = soLuongHoaDon;
        this.eMail = eMail;
        this.diaChi = diaChi;
        this.ngayTao = ngayTao;
    }
    
    

    

    public int getSoLuongHoaDon() {
        return soLuongHoaDon;
    }

    public void setSoLuongHoaDon(int soLuongHoaDon) {
        this.soLuongHoaDon = soLuongHoaDon;
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

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(int gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    
}
