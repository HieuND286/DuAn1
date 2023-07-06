/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services.impl;

import DomainModels.HoaDon_DM;
import DomainModels.KhachHang_DM;
import DomainModels.NhanVien_DM;
import Repository.impl.HoaDonRepository;
import Services.IHoaDonService;
import ViewModels.HoaDon_VM;
import ViewModels.KhachHang_VM;
import ViewModels.NhanVien_VM;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author admin
 */
public class HoaDonService implements IHoaDonService {

    private HoaDonRepository hodonRepo = new HoaDonRepository();

    @Override
    public int them(HoaDon_VM hoaDon_VM) {
        String id = hoaDon_VM.getId();
        String ma = "HD" + new Random().nextInt(1000) + 1;
        NhanVien_DM nhanVien_DM = new NhanVien_DM(hoaDon_VM.getNhanVien_VM().getIDNV());
        KhachHang_DM khachHang_DM = new KhachHang_DM(hoaDon_VM.getKhachHang_VM().getId());
        String ngayTao = hoaDon_VM.getNgayTao();
        String ngayThanhToan = hoaDon_VM.getNgayThanhToan();
        int tinhTrang = hoaDon_VM.getTinhTrang();
        String moTa = hoaDon_VM.getMoTa();
        int hinhThucNhan = hoaDon_VM.getHinhThucNhan();

        int execute = this.hodonRepo.them(new HoaDon_DM(id, ma, nhanVien_DM,
                khachHang_DM, ngayTao, ngayThanhToan, tinhTrang, moTa, hinhThucNhan));

        return execute;

    }

    @Override
    public int sua(HoaDon_VM hoaDon_VM) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int thanhToan(HoaDon_VM hoaDon_VM) {
        String id = hoaDon_VM.getId();
        String ma = hoaDon_VM.getMa();
        NhanVien_DM nhanVien_DM = new NhanVien_DM(hoaDon_VM.getNhanVien_VM().getIDNV());
        KhachHang_DM khachHang_DM = new KhachHang_DM(hoaDon_VM.getKhachHang_VM().getId());
        String ngayTao = hoaDon_VM.getNgayTao();
        String ngayThanhToan = hoaDon_VM.getNgayThanhToan();
        int tinhTrang = hoaDon_VM.getTinhTrang();
        String moTa = hoaDon_VM.getMoTa();
        int hinhThucNhan = hoaDon_VM.getHinhThucNhan();

        int execute = this.hodonRepo.thanhToan(new HoaDon_DM(id, ma, nhanVien_DM,
                khachHang_DM, ngayTao, ngayThanhToan, tinhTrang, moTa, hinhThucNhan));

        return execute;
    }

    @Override
    public List<HoaDon_VM> getAllDTT() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<HoaDon_VM> getAllHD() {
        List<HoaDon_VM> listVM = new ArrayList<>();
        List<HoaDon_DM> listDM = this.hodonRepo.getAllHD();
        int stt = 1;
        for (HoaDon_DM hoaDon_DM : listDM) {
            listVM.add(new HoaDon_VM(stt, hoaDon_DM.getId(), hoaDon_DM.getMa(),
                    new NhanVien_VM(hoaDon_DM.getNhanVien_DM().getIDNV(),
                            hoaDon_DM.getNhanVien_DM().getHoVaTen()),
                    new KhachHang_VM(hoaDon_DM.getKhachHang_DM().getId(),
                            hoaDon_DM.getKhachHang_DM().getSdt(),
                            hoaDon_DM.getKhachHang_DM().getHoTen()),
                    hoaDon_DM.getNgayTao(),
                    hoaDon_DM.getNgayThanhToan(),
                    hoaDon_DM.getTinhTrang(),
                    hoaDon_DM.getMoTa(), hoaDon_DM.getHinhThucNhan()));
            stt++;
        }
        return listVM;
    }

    @Override
    public List<HoaDon_VM> getAllHDTCH() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<HoaDon_VM> getAllHDShip() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
