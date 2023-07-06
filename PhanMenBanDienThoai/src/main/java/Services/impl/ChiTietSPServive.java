/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services.impl;

import Repository.impl.*;
import DomainModels.CPU_DM;
import DomainModels.ChiTietSP_DM;
import DomainModels.DongSP_DM;
import DomainModels.Hang_DM;
import DomainModels.HeDieuHanh_DM;
import DomainModels.Imei_DM;
import DomainModels.ManHinh_DM;
import DomainModels.MauSac_DM;
import DomainModels.Pin_DM;
import DomainModels.Ram_DM;
import DomainModels.Rom_DM;
import DomainModels.SanPham_DM;
import Repository.IChiTietSPRepository;
import Repository.ICpuRepository;
import Services.IChiTietSPServive;
import Utilities.DBConnection;
import ViewModels.CPU_VM;
import ViewModels.ChiTietSP_VM;
import ViewModels.DongSP_VM;
import ViewModels.Hang_VM;
import ViewModels.HeDieuHanh_VM;
import ViewModels.MauSac_VM;
import Viewmodels.ManHinh_VM;
import Viewmodels.Pin_VM;
import Viewmodels.Ram_VM;
import Viewmodels.Rom_VM;
import Viewmodels.SanPham_VM;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author admin
 */
public class ChiTietSPServive implements IChiTietSPServive {

    private ChiTietSPRepo ChiTietSPRepo = new ChiTietSPRepo();

    @Override
    public int them(ChiTietSP_VM chiTietSP) {
        String maSoSP = "MSP" + new Random().nextInt(100) + 1;
        String iDCTSP = chiTietSP.getiDCTSP();//id chi tiết sản phẩm//
        String idSanPham = chiTietSP.getSanPham().getIdSP();
        String idHeDieuHanh = chiTietSP.getHeDieuHanh().getIdHDH();
        String idHang = chiTietSP.getHang().getIdHang();
        String idDongSP = chiTietSP.getDongSP().getIdDongSP();
        String idCpu = chiTietSP.getCpu().getIdCPU();
        String idRom = chiTietSP.getRom().getIdRom();
        String idRam = chiTietSP.getRam().getIdRam();
        String idMauSac = chiTietSP.getMauSac().getIdMS();
        String idManHinh = chiTietSP.getManHinh().getIdMH();
        String idPin = chiTietSP.getPin().getIdPin();
        String HinhAnh = chiTietSP.getHinhAnh();
        int loai = chiTietSP.getLoai();
        int soLuong = chiTietSP.getSoLuong();
        double giaNhap = chiTietSP.getGiaNhap();
        double giaBan = chiTietSP.getGiaBan();

        int execute = this.ChiTietSPRepo.them(new ChiTietSP_DM(iDCTSP, maSoSP,
                new SanPham_DM(idSanPham), new HeDieuHanh_DM(idHeDieuHanh),
                new Hang_DM(idHang), new DongSP_DM(idDongSP), new CPU_DM(idCpu),
                new Rom_DM(idRom), new Ram_DM(idRam), new MauSac_DM(idMauSac),
                new ManHinh_DM(idManHinh), new Pin_DM(idPin),
                HinhAnh, loai, soLuong, giaNhap, giaBan));
        return execute;
    }

    @Override
    public int sua(ChiTietSP_VM chiTietSP) {
        String maSoSP = chiTietSP.getMaSoSP();
        String iDCTSP = chiTietSP.getiDCTSP();//id chi tiết sản phẩm//
        String idSanPham = chiTietSP.getSanPham().getIdSP();
        String idHeDieuHanh = chiTietSP.getHeDieuHanh().getIdHDH();
        String idHang = chiTietSP.getHang().getIdHang();
        String idDongSP = chiTietSP.getDongSP().getIdDongSP();
        String idCpu = chiTietSP.getCpu().getIdCPU();
        String idRom = chiTietSP.getRom().getIdRom();
        String idRam = chiTietSP.getRam().getIdRam();
        String idMauSac = chiTietSP.getMauSac().getIdMS();
        String idManHinh = chiTietSP.getManHinh().getIdMH();
        String idPin = chiTietSP.getPin().getIdPin();
        String HinhAnh = chiTietSP.getHinhAnh();
        int loai = chiTietSP.getLoai();
        int soLuong = chiTietSP.getSoLuong();
        double giaNhap = chiTietSP.getGiaNhap();
        double giaBan = chiTietSP.getGiaBan();

        int execute = this.ChiTietSPRepo.sua(new ChiTietSP_DM(iDCTSP, maSoSP,
                new SanPham_DM(idSanPham), new HeDieuHanh_DM(idHeDieuHanh),
                new Hang_DM(idHang), new DongSP_DM(idDongSP), new CPU_DM(idCpu),
                new Rom_DM(idRom), new Ram_DM(idRam), new MauSac_DM(idMauSac),
                new ManHinh_DM(idManHinh), new Pin_DM(idPin),
                HinhAnh, loai, soLuong, giaNhap, giaBan));
        return execute;
    }

    @Override
    public List<ChiTietSP_VM> getAllChiTietSPs() {
        List<ChiTietSP_VM> listVM = new ArrayList<>();
        List<ChiTietSP_DM> listDM = this.ChiTietSPRepo.getAllChiTietSPs();
        int stt = 1;
        for (ChiTietSP_DM chiTietSP_DM : listDM) {
            listVM.add(new ChiTietSP_VM(stt, chiTietSP_DM.getMaSoSP(), chiTietSP_DM.getiDCTSP(),
                    new SanPham_VM(0, chiTietSP_DM.getSanPham().getIdSP(),
                            chiTietSP_DM.getSanPham().getMaSP(), chiTietSP_DM.getSanPham().getTenSP()),
                    new HeDieuHanh_VM(0, chiTietSP_DM.getHeDieuHanh().getIdHDH(),
                            chiTietSP_DM.getHeDieuHanh().getMaHDH(), chiTietSP_DM.getHeDieuHanh().getTenHDH()),
                    new Hang_VM(0, chiTietSP_DM.getHang().getIdHang(),
                            chiTietSP_DM.getHang().getMaHang(),
                            chiTietSP_DM.getHang().getTenHang()),
                    new DongSP_VM(0, chiTietSP_DM.getDongSP().getIdDongSP(),
                            chiTietSP_DM.getDongSP().getMaDongSP(),
                            chiTietSP_DM.getDongSP().getTenDongSP()),
                    new CPU_VM(0, chiTietSP_DM.getCpu().getIdCPU(),
                            chiTietSP_DM.getCpu().getMaCPU(),
                            chiTietSP_DM.getCpu().getTenCPU()),
                    new Rom_VM(0, chiTietSP_DM.getRom().getIdRom(),
                            chiTietSP_DM.getRom().getMaRom(),
                            chiTietSP_DM.getRom().getDungLuongRom()),
                    new Ram_VM(0, chiTietSP_DM.getRam().getIdRam(),
                            chiTietSP_DM.getRam().getMaRam(),
                            chiTietSP_DM.getRam().getDungLuongRam()),
                    new MauSac_VM(0, chiTietSP_DM.getMauSac().getIdMS(),
                            chiTietSP_DM.getMauSac().getMaMS(),
                            chiTietSP_DM.getMauSac().getTenMS()),
                    new ManHinh_VM(0, chiTietSP_DM.getManHinh().getIdMH(),
                            chiTietSP_DM.getManHinh().getMaMH(),
                            chiTietSP_DM.getManHinh().getTenMH()),
                    new Pin_VM(0, chiTietSP_DM.getPin().getIdPin(),
                            chiTietSP_DM.getPin().getMaPin(),
                            chiTietSP_DM.getPin().getDungLuongPin()),
                    chiTietSP_DM.getHinhAnh(), chiTietSP_DM.getLoai(),
                    chiTietSP_DM.getSoLuong(),
                    chiTietSP_DM.getGiaNhap(), chiTietSP_DM.getGiaBan()));
            stt++;
        }
        return listVM;
    }

    @Override
    public List<ChiTietSP_VM> getChiTietSPByImei(String imei) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int xoa(ChiTietSP_VM chiTietSP) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int xoaTT(ChiTietSP_VM chiTietSP) {
        String maSoSP = chiTietSP.getMaSoSP();
        String iDCTSP = chiTietSP.getiDCTSP();//id chi tiết sản phẩm//
        String idSanPham = chiTietSP.getSanPham().getIdSP();
        String idHeDieuHanh = chiTietSP.getHeDieuHanh().getIdHDH();
        String idHang = chiTietSP.getHang().getIdHang();
        String idDongSP = chiTietSP.getDongSP().getIdDongSP();
        String idCpu = chiTietSP.getCpu().getIdCPU();
        String idRom = chiTietSP.getRom().getIdRom();
        String idRam = chiTietSP.getRam().getIdRam();
        String idMauSac = chiTietSP.getMauSac().getIdMS();
        String idManHinh = chiTietSP.getManHinh().getIdMH();
        String idPin = chiTietSP.getPin().getIdPin();
        String HinhAnh = chiTietSP.getHinhAnh();
        int loai = chiTietSP.getLoai();
        int soLuong = chiTietSP.getSoLuong();
        double giaNhap = chiTietSP.getGiaNhap();
        double giaBan = chiTietSP.getGiaBan();

        int execute = this.ChiTietSPRepo.xoaTT(new ChiTietSP_DM(iDCTSP, maSoSP,
                new SanPham_DM(idSanPham), new HeDieuHanh_DM(idHeDieuHanh),
                new Hang_DM(idHang), new DongSP_DM(idDongSP), new CPU_DM(idCpu),
                new Rom_DM(idRom), new Ram_DM(idRam), new MauSac_DM(idMauSac),
                new ManHinh_DM(idManHinh), new Pin_DM(idPin),
                HinhAnh, loai, soLuong, giaNhap, giaBan));
        return execute;
    }

    @Override
    public int hoanLai(ChiTietSP_VM chiTietSP) {
        String maSoSP = chiTietSP.getMaSoSP();
        String iDCTSP = chiTietSP.getiDCTSP();//id chi tiết sản phẩm//
        String idSanPham = chiTietSP.getSanPham().getIdSP();
        String idHeDieuHanh = chiTietSP.getHeDieuHanh().getIdHDH();
        String idHang = chiTietSP.getHang().getIdHang();
        String idDongSP = chiTietSP.getDongSP().getIdDongSP();
        String idCpu = chiTietSP.getCpu().getIdCPU();
        String idRom = chiTietSP.getRom().getIdRom();
        String idRam = chiTietSP.getRam().getIdRam();
        String idMauSac = chiTietSP.getMauSac().getIdMS();
        String idManHinh = chiTietSP.getManHinh().getIdMH();
        String idPin = chiTietSP.getPin().getIdPin();
        String HinhAnh = chiTietSP.getHinhAnh();
        int loai = chiTietSP.getLoai();
        int soLuong = chiTietSP.getSoLuong();
        double giaNhap = chiTietSP.getGiaNhap();
        double giaBan = chiTietSP.getGiaBan();

        int execute = this.ChiTietSPRepo.hoaLia(new ChiTietSP_DM(iDCTSP, maSoSP,
                new SanPham_DM(idSanPham), new HeDieuHanh_DM(idHeDieuHanh),
                new Hang_DM(idHang), new DongSP_DM(idDongSP), new CPU_DM(idCpu),
                new Rom_DM(idRom), new Ram_DM(idRam), new MauSac_DM(idMauSac),
                new ManHinh_DM(idManHinh), new Pin_DM(idPin),
                HinhAnh, loai, soLuong, giaNhap, giaBan));
        return execute;
    }

    @Override
    public List<ChiTietSP_VM> getAllDeleteChiTietSPs() {
        List<ChiTietSP_VM> listVM = new ArrayList<>();
        List<ChiTietSP_DM> listDM = this.ChiTietSPRepo.getAllDeletedCTSP();
        int stt = 1;
        for (ChiTietSP_DM chiTietSP_DM : listDM) {
            listVM.add(new ChiTietSP_VM(stt, chiTietSP_DM.getMaSoSP(), chiTietSP_DM.getiDCTSP(),
                    new SanPham_VM(0, chiTietSP_DM.getSanPham().getIdSP(),
                            chiTietSP_DM.getSanPham().getMaSP(), chiTietSP_DM.getSanPham().getTenSP()),
                    new HeDieuHanh_VM(0, chiTietSP_DM.getHeDieuHanh().getIdHDH(),
                            chiTietSP_DM.getHeDieuHanh().getMaHDH(), chiTietSP_DM.getHeDieuHanh().getTenHDH()),
                    new Hang_VM(0, chiTietSP_DM.getHang().getIdHang(),
                            chiTietSP_DM.getHang().getMaHang(),
                            chiTietSP_DM.getHang().getTenHang()),
                    new DongSP_VM(0, chiTietSP_DM.getDongSP().getIdDongSP(),
                            chiTietSP_DM.getDongSP().getMaDongSP(),
                            chiTietSP_DM.getDongSP().getTenDongSP()),
                    new CPU_VM(0, chiTietSP_DM.getCpu().getIdCPU(),
                            chiTietSP_DM.getCpu().getMaCPU(),
                            chiTietSP_DM.getCpu().getTenCPU()),
                    new Rom_VM(0, chiTietSP_DM.getRom().getIdRom(),
                            chiTietSP_DM.getRom().getMaRom(),
                            chiTietSP_DM.getRom().getDungLuongRom()),
                    new Ram_VM(0, chiTietSP_DM.getRam().getIdRam(),
                            chiTietSP_DM.getRam().getMaRam(),
                            chiTietSP_DM.getRam().getDungLuongRam()),
                    new MauSac_VM(0, chiTietSP_DM.getMauSac().getIdMS(),
                            chiTietSP_DM.getMauSac().getMaMS(),
                            chiTietSP_DM.getMauSac().getTenMS()),
                    new ManHinh_VM(0, chiTietSP_DM.getManHinh().getIdMH(),
                            chiTietSP_DM.getManHinh().getMaMH(),
                            chiTietSP_DM.getManHinh().getTenMH()),
                    new Pin_VM(0, chiTietSP_DM.getPin().getIdPin(),
                            chiTietSP_DM.getPin().getMaPin(),
                            chiTietSP_DM.getPin().getDungLuongPin()),
                    chiTietSP_DM.getHinhAnh(), chiTietSP_DM.getLoai(),
                    chiTietSP_DM.getSoLuong(),
                    chiTietSP_DM.getGiaNhap(), chiTietSP_DM.getGiaBan()));
            stt++;
        }
        return listVM;
    }

    @Override
    public int themImei(ChiTietSP_VM chiTietSP) {
        String maSoSP = chiTietSP.getMaSoSP();
        String iDCTSP = chiTietSP.getiDCTSP();//id chi tiết sản phẩm//
        String idSanPham = chiTietSP.getSanPham().getIdSP();
        String idHeDieuHanh = chiTietSP.getHeDieuHanh().getIdHDH();
        String idHang = chiTietSP.getHang().getIdHang();
        String idDongSP = chiTietSP.getDongSP().getIdDongSP();
        String idCpu = chiTietSP.getCpu().getIdCPU();
        String idRom = chiTietSP.getRom().getIdRom();
        String idRam = chiTietSP.getRam().getIdRam();
        String idMauSac = chiTietSP.getMauSac().getIdMS();
        String idManHinh = chiTietSP.getManHinh().getIdMH();
        String idPin = chiTietSP.getPin().getIdPin();
        String HinhAnh = chiTietSP.getHinhAnh();
        int loai = chiTietSP.getLoai();
        int soLuong = chiTietSP.getSoLuong();
        double giaNhap = chiTietSP.getGiaNhap();
        double giaBan = chiTietSP.getGiaBan();

        int execute = this.ChiTietSPRepo.themImei(new ChiTietSP_DM(iDCTSP, maSoSP,
                new SanPham_DM(idSanPham), new HeDieuHanh_DM(idHeDieuHanh),
                new Hang_DM(idHang), new DongSP_DM(idDongSP), new CPU_DM(idCpu),
                new Rom_DM(idRom), new Ram_DM(idRam), new MauSac_DM(idMauSac),
                new ManHinh_DM(idManHinh), new Pin_DM(idPin),
                HinhAnh, loai, soLuong, giaNhap, giaBan));
        return execute;
    }

}
