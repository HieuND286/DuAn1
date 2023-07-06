/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services.impl;

import DomainModels.GoiBaoHanhDomainModel;
import DomainModels.HoaDonCTDomainModel;
import DomainModels.HoaDonDomainModel;
import DomainModels.PhieuBaoHanhDomainModel;
import Repository.impl.GoiBaoHanhRepo;
import Repository.impl.PhieuBaoHanhrepo;
import Services.IPhieuBaoHanhService;
import ViewModels.PhieuBaoHanhViewModels;
import ViewModels.HoaDonCTViewModel;
import ViewModels.HoaDonViewModel;
import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public class PhieuBaoHanhService implements IPhieuBaoHanhService {

    PhieuBaoHanhrepo repo = new PhieuBaoHanhrepo();
    GoiBaoHanhRepo gbhRepo = new GoiBaoHanhRepo();

    @Override
    public ArrayList<PhieuBaoHanhViewModels> getAll() {
        ArrayList<PhieuBaoHanhDomainModel> list = repo.getAll();
        ArrayList<PhieuBaoHanhViewModels> listView = new ArrayList<>();
        for (PhieuBaoHanhDomainModel p : list) {

            listView.add(new PhieuBaoHanhViewModels(p.getIDPBH(), p.getHoaDonDomainModel().getIdHoaDon(), p.getGoiBaoHanhDomainModel().getId(), p.getHoaDonCTDomainModel().getIDHDCT(), p.getTen(), p.getNgayBatDau(), p.getNGayKetThuc(), p.getTrangThai(), p.getDiaChi(), p.getSdtCH(), p.getMota()));

        }
        return listView;
    }

    @Override
    public int add(PhieuBaoHanhViewModels p) {
        HoaDonDomainModel hoaDon = null;
        ArrayList<HoaDonDomainModel> hd = this.repo.getAllHD();
        for (HoaDonDomainModel h : hd) {
            if (h.getIdHoaDon().equals(p.getIDhoaDon())) {
                hoaDon = new HoaDonDomainModel(h.getIdHoaDon(), h.getIdKH(), h.getIdNV(), h.getMa(), h.getNgayTao(), h.getNgayThanhToan(), h.getTinhTrang());
            }
        }
        HoaDonCTDomainModel HoaDonCT = null;
        ArrayList<HoaDonCTDomainModel> hdct = this.repo.getAllHDCT();
        for (HoaDonCTDomainModel h : hdct) {
            if (h.getIDHDCT().equals(p.getIDhoaDonCT())) {
                HoaDonCT = new HoaDonCTDomainModel(h.getIDHDCT(), h.getIDHD(), h.getIDCTSP(), h.getIDDKM(), h.getIDPBH(), h.getSoLuong(), h.getDonGia());
            }
        }
        GoiBaoHanhDomainModel GoiBH = null;
        ArrayList<GoiBaoHanhDomainModel> gbh = this.gbhRepo.getAll();
        for (GoiBaoHanhDomainModel g : gbh) {
            if (g.getId().equals(p.getIDgoiBaoHanh())) {
                GoiBH = new GoiBaoHanhDomainModel(g.getId(), g.getTen(), g.getTrangThai());
            }
        }
        int add = this.repo.add(new PhieuBaoHanhDomainModel(p.getIDPBH(), hoaDon, GoiBH, HoaDonCT, p.getTen(), p.getNgayBatDau(), p.getNGayKetThuc(), p.getTrangThai(), p.getDiaChi(), p.getSdtCH(), p.getMota()));
        return add;

    }

    @Override
    public int update(PhieuBaoHanhViewModels p) {
        HoaDonDomainModel hoaDon = null;
        ArrayList<HoaDonDomainModel> hd = this.repo.getAllHD();
        for (HoaDonDomainModel h : hd) {
            if (h.getIdHoaDon().equals(p.getIDhoaDon())) {
                hoaDon = new HoaDonDomainModel(h.getIdHoaDon(), h.getIdKH(), h.getIdNV(), h.getMa(), h.getNgayTao(), h.getNgayThanhToan(), h.getTinhTrang());
            }
        }
        HoaDonCTDomainModel HoaDonCT = null;
        ArrayList<HoaDonCTDomainModel> hdct = this.repo.getAllHDCT();
        for (HoaDonCTDomainModel h : hdct) {
            if (h.getIDHDCT().equals(p.getIDhoaDonCT())) {
                HoaDonCT = new HoaDonCTDomainModel(h.getIDHDCT(), h.getIDHD(), h.getIDCTSP(), h.getIDDKM(), h.getIDPBH(), h.getSoLuong(), h.getDonGia());
            }
        }
        GoiBaoHanhDomainModel GoiBH = null;
        ArrayList<GoiBaoHanhDomainModel> gbh = this.gbhRepo.getAll();
        for (GoiBaoHanhDomainModel g : gbh) {
            if (g.getId().equals(p.getIDgoiBaoHanh())) {
                GoiBH = new GoiBaoHanhDomainModel(g.getId(), g.getTen(), g.getTrangThai());
            }
        }
        int update = this.repo.update(new PhieuBaoHanhDomainModel(p.getIDPBH(), hoaDon, GoiBH, HoaDonCT, p.getTen(), p.getNgayBatDau(), p.getNGayKetThuc(), p.getTrangThai(), p.getDiaChi(), p.getSdtCH(), p.getMota()));
        return update;
    }

    @Override
    public int delete(PhieuBaoHanhViewModels p) {
        int delete = this.repo.delete(new PhieuBaoHanhDomainModel(p.getIDPBH(), null, null, null, p.getTen(), p.getNgayBatDau(), p.getNGayKetThuc(), p.getTrangThai(), p.getDiaChi(), p.getSdtCH(), p.getMota()));
        return delete;
    }

    @Override
    public ArrayList<HoaDonViewModel> getAllHD() {
        ArrayList<HoaDonDomainModel> list = this.repo.getAllHD();
        ArrayList<HoaDonViewModel> listView = new ArrayList<>();
        for (HoaDonDomainModel h : list) {
            listView.add(new HoaDonViewModel(h.getIdHoaDon(), h.getIdKH(), h.getIdNV(), h.getMa(), h.getNgayTao(), h.getNgayThanhToan(), h.getTinhTrang()));
        }
        return listView;
    }

    @Override
    public ArrayList<HoaDonCTViewModel> getAllHDCT(String id) {
        ArrayList<HoaDonCTDomainModel> list = this.repo.getAllHDCT(id);
        ArrayList<HoaDonCTViewModel> listView = new ArrayList<>();
        for (HoaDonCTDomainModel h : list) {
            listView.add(new HoaDonCTViewModel(h.getIDHDCT(), h.getIDHD(), h.getIDCTSP(), h.getIDDKM(), h.getIDPBH(), h.getSoLuong(), h.getDonGia()));
        }
        return listView;
    }

    @Override
    public int updateHDCT(PhieuBaoHanhViewModels p) {
        HoaDonDomainModel hoaDon = null;
        ArrayList<HoaDonDomainModel> hd = this.repo.getAllHD();
        for (HoaDonDomainModel h : hd) {
            if (h.getIdHoaDon().equals(p.getIDhoaDon())) {
                hoaDon = new HoaDonDomainModel(h.getIdHoaDon(), h.getIdKH(), h.getIdNV(), h.getMa(), h.getNgayTao(), h.getNgayThanhToan(), h.getTinhTrang());
            }
        }
        HoaDonCTDomainModel HoaDonCT = null;
        ArrayList<HoaDonCTDomainModel> hdct = this.repo.getAllHDCT();
        for (HoaDonCTDomainModel h : hdct) {
            if (h.getIDHDCT().equals(p.getIDhoaDonCT())) {
                HoaDonCT = new HoaDonCTDomainModel(h.getIDHDCT(), h.getIDHD(), h.getIDCTSP(), h.getIDDKM(), h.getIDPBH(), h.getSoLuong(), h.getDonGia());
            }
        }
        GoiBaoHanhDomainModel GoiBH = null;
        ArrayList<GoiBaoHanhDomainModel> gbh = this.gbhRepo.getAll();
        for (GoiBaoHanhDomainModel g : gbh) {
            if (g.getId().equals(p.getIDgoiBaoHanh())) {
                GoiBH = new GoiBaoHanhDomainModel(g.getId(), g.getTen(), g.getTrangThai());
            }
        }
        int update = this.repo.updateHDCT(new PhieuBaoHanhDomainModel(p.getIDPBH(), hoaDon, GoiBH, HoaDonCT, p.getTen(), p.getNgayBatDau(), p.getNGayKetThuc(), p.getTrangThai(), p.getDiaChi(), p.getSdtCH(), p.getMota()));
        return update;
    }

    @Override
    public ArrayList<HoaDonCTViewModel> getAllHDCT() {
        ArrayList<HoaDonCTDomainModel> list = this.repo.getAllHDCT();
        ArrayList<HoaDonCTViewModel> listView = new ArrayList<>();
        for (HoaDonCTDomainModel h : list) {
            listView.add(new HoaDonCTViewModel(h.getIDHDCT(), h.getIDHD(), h.getIDCTSP(), h.getIDDKM(), h.getIDPBH(), h.getSoLuong(), h.getDonGia()));
        }
        return listView;
    }

}
