/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DomainModels;

/**
 *
 * @author admin
 */
public class ChiTietSP_DM {
    private String iDCTSP;//id chi tiết sản phẩm//
    private String maSoSP;
    private SanPham_DM sanPham;
    private HeDieuHanh_DM heDieuHanh;
    private Hang_DM hang;
    private DongSP_DM dongSP;
    private CPU_DM cpu;
    private Rom_DM rom;
    private Ram_DM ram;
    private MauSac_DM mauSac;
    private ManHinh_DM manHinh;
    private Pin_DM pin;
    private String hinhAnh;
    private int loai;
    private int soLuong;
    private double giaNhap;
    private double giaBan;

    public ChiTietSP_DM() {
    }

    public ChiTietSP_DM(String iDCTSP) {
        this.iDCTSP = iDCTSP;
    }
    
    

    public ChiTietSP_DM(String iDCTSP, String maSoSP, SanPham_DM sanPham, HeDieuHanh_DM heDieuHanh, Hang_DM hang, DongSP_DM dongSP, CPU_DM cpu, Rom_DM rom, Ram_DM ram, MauSac_DM mauSac, ManHinh_DM manHinh, Pin_DM pin, String hinhAnh, int loai, int soLuong, double giaNhap, double giaBan) {
        this.iDCTSP = iDCTSP;
        this.maSoSP = maSoSP;
        this.sanPham = sanPham;
        this.heDieuHanh = heDieuHanh;
        this.hang = hang;
        this.dongSP = dongSP;
        this.cpu = cpu;
        this.rom = rom;
        this.ram = ram;
        this.mauSac = mauSac;
        this.manHinh = manHinh;
        this.pin = pin;
        this.hinhAnh = hinhAnh;
        this.loai = loai;
        this.soLuong = soLuong;
        this.giaNhap = giaNhap;
        this.giaBan = giaBan;
    }
    
    
    

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    
    
    

    public String getMaSoSP() {
        return maSoSP;
    }

    public void setMaSoSP(String maSoSP) {
        this.maSoSP = maSoSP;
    }

    public String getHinhAnh() {
        return hinhAnh;
    }

    public void setHinhAnh(String hinhAnh) {
        this.hinhAnh = hinhAnh;
    }

    
    

    public String getiDCTSP() {
        return iDCTSP;
    }

    public void setiDCTSP(String iDCTSP) {
        this.iDCTSP = iDCTSP;
    }

    public SanPham_DM getSanPham() {
        return sanPham;
    }

    public void setSanPham(SanPham_DM sanPham) {
        this.sanPham = sanPham;
    }

    public HeDieuHanh_DM getHeDieuHanh() {
        return heDieuHanh;
    }

    public void setHeDieuHanh(HeDieuHanh_DM heDieuHanh) {
        this.heDieuHanh = heDieuHanh;
    }

    public Hang_DM getHang() {
        return hang;
    }

    public void setHang(Hang_DM hang) {
        this.hang = hang;
    }

    public DongSP_DM getDongSP() {
        return dongSP;
    }

    public void setDongSP(DongSP_DM dongSP) {
        this.dongSP = dongSP;
    }

    public CPU_DM getCpu() {
        return cpu;
    }

    public void setCpu(CPU_DM cpu) {
        this.cpu = cpu;
    }

    public Rom_DM getRom() {
        return rom;
    }

    public void setRom(Rom_DM rom) {
        this.rom = rom;
    }

    public Ram_DM getRam() {
        return ram;
    }

    public void setRam(Ram_DM ram) {
        this.ram = ram;
    }

    public MauSac_DM getMauSac() {
        return mauSac;
    }

    public void setMauSac(MauSac_DM mauSac) {
        this.mauSac = mauSac;
    }

    public ManHinh_DM getManHinh() {
        return manHinh;
    }

    public void setManHinh(ManHinh_DM manHinh) {
        this.manHinh = manHinh;
    }

    public Pin_DM getPin() {
        return pin;
    }

    public void setPin(Pin_DM pin) {
        this.pin = pin;
    }

    public int getLoai() {
        return loai;
    }

    public void setLoai(int loai) {
        this.loai = loai;
    }

    public double getGiaNhap() {
        return giaNhap;
    }

    public void setGiaNhap(double giaNhap) {
        this.giaNhap = giaNhap;
    }

    public double getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(double giaBan) {
        this.giaBan = giaBan;
    }
    
    
}
