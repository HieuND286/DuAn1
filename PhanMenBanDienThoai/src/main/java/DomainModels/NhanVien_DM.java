/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DomainModels;

/**
 *
 * @author Acer
 */
public class NhanVien_DM {

    private String IDNV;
    private String MANV;
    private String HoVaTen;
    private int GioiTinh;
    private String NgaySinh;
    private String DiaChi;
    private String Sdt;
    private int ChucVu;
    private String matKhau;
    private String hinhAnh;
    private int TrangThai;

    public NhanVien_DM() {
    }

    public NhanVien_DM(String IDNV) {
        this.IDNV = IDNV;
    }
    
    

    public NhanVien_DM(String IDNV, String MANV, String HoVaTen, int GioiTinh, String NgaySinh, String DiaChi, String Sdt, int ChucVu, String matKhau, String hinhAnh, int TrangThai) {
        this.IDNV = IDNV;
        this.MANV = MANV;
        this.HoVaTen = HoVaTen;
        this.GioiTinh = GioiTinh;
        this.NgaySinh = NgaySinh;
        this.DiaChi = DiaChi;
        this.Sdt = Sdt;
        this.ChucVu = ChucVu;
        this.matKhau = matKhau;
        this.hinhAnh = hinhAnh;
        this.TrangThai = TrangThai;
    }

    

    public String getHinhAnh() {
        return hinhAnh;
    }

    public void setHinhAnh(String hinhAnh) {
        this.hinhAnh = hinhAnh;
    }
    
    

    public String getIDNV() {
        return IDNV;
    }

    public void setIDNV(String IDNV) {
        this.IDNV = IDNV;
    }

    public String getMANV() {
        return MANV;
    }

    public void setMANV(String MANV) {
        this.MANV = MANV;
    }

    public String getHoVaTen() {
        return HoVaTen;
    }

    public void setHoVaTen(String HoVaTen) {
        this.HoVaTen = HoVaTen;
    }

    public int getGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(int GioiTinh) {
        this.GioiTinh = GioiTinh;
    }

    public String getNgaySinh() {
        return NgaySinh;
    }

    public void setNgaySinh(String NgaySinh) {
        this.NgaySinh = NgaySinh;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public String getSdt() {
        return Sdt;
    }

    public void setSdt(String Sdt) {
        this.Sdt = Sdt;
    }

    public int getChucVu() {
        return ChucVu;
    }

    public void setChucVu(int ChucVu) {
        this.ChucVu = ChucVu;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    public int getTrangThai() {
        return TrangThai;
    }

    public void setTrangThai(int TrangThai) {
        this.TrangThai = TrangThai;
    }

    
}
