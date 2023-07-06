/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services.impl;

import DomainModels.HoaDon_DM;
import DomainModels.Hoa_Don_CT_DM;
import DomainModels.Imei_DM;
import Repository.IHoaDonCTRepository;
import Repository.impl.HoaDonCTRepository;
import Services.IHoaDonCTService;
import Services.IHoaDonService;
import ViewModels.ChiTietSP_VM;
import ViewModels.DongSP_VM;
import ViewModels.HoaDon_VM;
import ViewModels.Hoa_Don_CT_VM;
import ViewModels.Imei_VM;
import ViewModels.MauSac_VM;
import Viewmodels.Ram_VM;
import Viewmodels.Rom_VM;
import Viewmodels.SanPham_VM;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author admin
 */
public class HoaDonCTServiec implements IHoaDonCTService {

    private HoaDonCTRepository HoaDonCTRepository = new HoaDonCTRepository();

    @Override
    public int them(Hoa_Don_CT_VM hdctdm) {
        String id = hdctdm.getId();
        String idHD = hdctdm.getHoaDon_VM().getId();
        int soLuong = hdctdm.getSoLuong();
        double donGia = hdctdm.getDonGia();
        String idImei = hdctdm.getImei_VM().getiDImei();
        int exe = this.HoaDonCTRepository.them(new Hoa_Don_CT_DM(id,
                new Imei_DM(idImei, null, null),
                new HoaDon_DM(idHD), soLuong, donGia));
        return exe;
    }

    @Override
    public List<Hoa_Don_CT_VM> getAllHDCT(String idHD) {
        List<Hoa_Don_CT_VM> listVM = new ArrayList<>();
        List<Hoa_Don_CT_DM> listDM = this.HoaDonCTRepository.getAllHDCT(idHD);
        int stt = 1;
        for (Hoa_Don_CT_DM hoa_Don_CT_DM : listDM) {
            listVM.add(new Hoa_Don_CT_VM(stt, null, new Imei_VM(0, null, null, new ChiTietSP_VM(0,
                    hoa_Don_CT_DM.getImei_DM().getChiTietSP_DM().getMaSoSP(),
                    hoa_Don_CT_DM.getImei_DM().getChiTietSP_DM().getiDCTSP(), 
                    new SanPham_VM(0, hoa_Don_CT_DM.getImei_DM().getChiTietSP_DM().getSanPham().getIdSP(), null, 
                            hoa_Don_CT_DM.getImei_DM().getChiTietSP_DM().getSanPham().getTenSP()),
                    null, null, 
                    new DongSP_VM(0, hoa_Don_CT_DM.getImei_DM().getChiTietSP_DM().getDongSP().getIdDongSP(), null,
                            hoa_Don_CT_DM.getImei_DM().getChiTietSP_DM().getDongSP().getTenDongSP()),
                    null,
                    new Rom_VM(0, hoa_Don_CT_DM.getImei_DM().getChiTietSP_DM().getRom().getIdRom(), null,
                            hoa_Don_CT_DM.getImei_DM().getChiTietSP_DM().getRom().getDungLuongRom()),
                    new Ram_VM(0, hoa_Don_CT_DM.getImei_DM().getChiTietSP_DM().getRam().getIdRam(), null,
                            hoa_Don_CT_DM.getImei_DM().getChiTietSP_DM().getRam().getDungLuongRam()),
                    new MauSac_VM(0, hoa_Don_CT_DM.getImei_DM().getChiTietSP_DM().getMauSac().getIdMS(),
                            null, hoa_Don_CT_DM.getImei_DM().getChiTietSP_DM().getMauSac().getIdMS()),
                     null, null,
                    hoa_Don_CT_DM.getImei_DM().getChiTietSP_DM().getHinhAnh(),
                    0, 0,
                     0, hoa_Don_CT_DM.getImei_DM().getChiTietSP_DM().getGiaBan())),
                   new HoaDon_VM(hoa_Don_CT_DM.getHoaDon_DM().getId()),
                    hoa_Don_CT_DM.getSoLuong(), hoa_Don_CT_DM.getDonGia()));
            stt++;
        }
        return listVM;
    }

    @Override
    public int xoa(String idHd, String idImei) {
        int execute = this.HoaDonCTRepository.xoa(idHd, idImei);
        return execute;
    }

}
