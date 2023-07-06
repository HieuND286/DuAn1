/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ViewModels;

import DomainModels.*;
import Viewmodels.ManHinh_VM;
import Viewmodels.Pin_VM;
import Viewmodels.Ram_VM;
import Viewmodels.Rom_VM;
import Viewmodels.SanPham_VM;

/**
 *
 * @author admin
 */
public class ChiTietSP_VM {
    private int stt;
    private String maSoSP;
    private String iDCTSP;//id chi tiết sản phẩm//
    private SanPham_VM SanPham;
    private HeDieuHanh_VM HeDieuHanh;
    private Hang_VM Hang;
    private DongSP_VM DongSP;
    private CPU_VM Cpu;
    private Rom_VM Rom;
    private Ram_VM Ram;
    private MauSac_VM MauSac;
    private ManHinh_VM ManHinh;
    private Pin_VM Pin;
    private String HinhAnh;
    private int loai;
    private int soLuong;
    private double giaNhap;
    private double giaBan;

    public ChiTietSP_VM() {
    }

    public ChiTietSP_VM(String iDCTSP) {
        this.iDCTSP = iDCTSP;
    }
    
    

    public ChiTietSP_VM(int stt, String maSoSP, String iDCTSP, SanPham_VM idSanPham, HeDieuHanh_VM idHeDieuHanh, Hang_VM idHang, DongSP_VM idDongSP, CPU_VM Cpu, Rom_VM Rom, Ram_VM Ram, MauSac_VM MauSac, ManHinh_VM ManHinh, Pin_VM Pin, String HinhAnh, int loai, int soLuong, double giaNhap, double giaBan) {
        this.stt = stt;
        this.maSoSP = maSoSP;
        this.iDCTSP = iDCTSP;
        this.SanPham = idSanPham;
        this.HeDieuHanh = idHeDieuHanh;
        this.Hang = idHang;
        this.DongSP = idDongSP;
        this.Cpu = Cpu;
        this.Rom = Rom;
        this.Ram = Ram;
        this.MauSac = MauSac;
        this.ManHinh = ManHinh;
        this.Pin = Pin;
        this.HinhAnh = HinhAnh;
        this.loai = loai;
        this.soLuong = soLuong;
        this.giaNhap = giaNhap;
        this.giaBan = giaBan;
    }

    public int getStt() {
        return stt;
    }

    public void setStt(int stt) {
        this.stt = stt;
    }

    public String getMaSoSP() {
        return maSoSP;
    }

    public void setMaSoSP(String maSoSP) {
        this.maSoSP = maSoSP;
    }

    public String getiDCTSP() {
        return iDCTSP;
    }

    public void setiDCTSP(String iDCTSP) {
        this.iDCTSP = iDCTSP;
    }

    public SanPham_VM getSanPham() {
        return SanPham;
    }

    public void setSanPham(SanPham_VM idSanPham) {
        this.SanPham = idSanPham;
    }

    public HeDieuHanh_VM getHeDieuHanh() {
        return HeDieuHanh;
    }

    public void setHeDieuHanh(HeDieuHanh_VM HeDieuHanh) {
        this.HeDieuHanh = HeDieuHanh;
    }

    public Hang_VM getHang() {
        return Hang;
    }

    public void setHang(Hang_VM idHang) {
        this.Hang = idHang;
    }

    public DongSP_VM getDongSP() {
        return DongSP;
    }

    public void setDongSP(DongSP_VM idDongSP) {
        this.DongSP = idDongSP;
    }

    public CPU_VM getCpu() {
        return Cpu;
    }

    public void setCpu(CPU_VM Cpu) {
        this.Cpu = Cpu;
    }

    public Rom_VM getRom() {
        return Rom;
    }

    public void setRom(Rom_VM Rom) {
        this.Rom = Rom;
    }

    public Ram_VM getRam() {
        return Ram;
    }

    public void setRam(Ram_VM Ram) {
        this.Ram = Ram;
    }

    public MauSac_VM getMauSac() {
        return MauSac;
    }

    public void setMauSac(MauSac_VM MauSac) {
        this.MauSac = MauSac;
    }

    public ManHinh_VM getManHinh() {
        return ManHinh;
    }

    public void setManHinh(ManHinh_VM ManHinh) {
        this.ManHinh = ManHinh;
    }

    public Pin_VM getPin() {
        return Pin;
    }

    public void setPin(Pin_VM Pin) {
        this.Pin = Pin;
    }

    public String getHinhAnh() {
        return HinhAnh;
    }

    public void setHinhAnh(String HinhAnh) {
        this.HinhAnh = HinhAnh;
    }

    public int getLoai() {
        return loai;
    }

    public void setLoai(int loai) {
        this.loai = loai;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
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
