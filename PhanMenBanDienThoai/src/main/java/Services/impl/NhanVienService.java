/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services.impl;

import DomainModels.NhanVien_DM;
import Repository.impl.NhanvVienRepository;
import Services.INhanVienService;
import ViewModels.NhanVien_VM;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Acer
 */
public class NhanVienService implements INhanVienService {

    private final NhanvVienRepository Vr;

    public NhanVienService() {
        this.Vr = new NhanvVienRepository();
    }

    @Override
    public List<NhanVien_DM> getAll() {
        return Vr.getAllNhanVien();
    }

    @Override
    public List<NhanVien_VM> getAllNhanVien() {
        List<NhanVien_VM> list = new ArrayList<>();
        for (NhanVien_DM nhanvien : Vr.getAllNhanVien()) {
            NhanVien_VM vv = new NhanVien_VM(nhanvien.getIDNV(), 
                    nhanvien.getMANV(), nhanvien.getHoVaTen(), 
                    nhanvien.getGioiTinh(), nhanvien.getNgaySinh(), 
                    nhanvien.getDiaChi(), nhanvien.getSdt(), nhanvien.getChucVu(), 
                    nhanvien.getMatKhau(), nhanvien.getHinhAnh(),nhanvien.getTrangThai());
            list.add(vv);
            

        }
        return list;
    }

    @Override
    public String Add(NhanVien_VM nhanvien) {
        NhanVien_DM d = new NhanVien_DM(nhanvien.getIDNV(), 
                    nhanvien.getMANV(), nhanvien.getHoVaTen(), 
                    nhanvien.getGioiTinh(), nhanvien.getNgaySinh(), 
                    nhanvien.getDiaChi(), nhanvien.getSdt(), nhanvien.getChucVu(), 
                    nhanvien.getMatKhau(), nhanvien.getHinhAnh(),nhanvien.getTrangThai());
        if (Vr.add(d) == true) {
            return "the thanh cong";
        } else {
            return "them that bai";
        }

    }

    @Override
    public String Update(NhanVien_VM nhanvien) {
        NhanVien_DM d = new NhanVien_DM(nhanvien.getIDNV(), 
                    nhanvien.getMANV(), nhanvien.getHoVaTen(), 
                    nhanvien.getGioiTinh(), nhanvien.getNgaySinh(), 
                    nhanvien.getDiaChi(), nhanvien.getSdt(), nhanvien.getChucVu(), 
                    nhanvien.getMatKhau(), nhanvien.getHinhAnh(),nhanvien.getTrangThai());
        if (Vr.update(d) == true) {
            return "the thanh cong";
        } else {
            return "them that bai";
        }
    }

    @Override
    public List<NhanVien_VM> getAllNhanVienNghi() {
        List<NhanVien_VM> list = new ArrayList<>();
        for (NhanVien_DM nhanvien : Vr.getAllNhanVienNghi()) {
            NhanVien_VM vv = new NhanVien_VM(nhanvien.getIDNV(), 
                    nhanvien.getMANV(), nhanvien.getHoVaTen(), 
                    nhanvien.getGioiTinh(), nhanvien.getNgaySinh(), 
                    nhanvien.getDiaChi(), nhanvien.getSdt(), nhanvien.getChucVu(), 
                    nhanvien.getMatKhau(), nhanvien.getHinhAnh(),nhanvien.getTrangThai());
            list.add(vv);

        }
        return list;
    }

    @Override
    public String nghiViec(NhanVien_VM nhanvien) {
        NhanVien_DM d = new NhanVien_DM(nhanvien.getIDNV(), 
                    nhanvien.getMANV(), nhanvien.getHoVaTen(), 
                    nhanvien.getGioiTinh(), nhanvien.getNgaySinh(), 
                    nhanvien.getDiaChi(), nhanvien.getSdt(), nhanvien.getChucVu(), 
                    nhanvien.getMatKhau(), nhanvien.getHinhAnh(),nhanvien.getTrangThai());
        if (Vr.nghiViec(d) == true) {
            return "the thanh cong";
        } else {
            return "them that bai";
        }
    }

    @Override
    public String hoanLai(NhanVien_VM nhanvien) {
        NhanVien_DM d = new NhanVien_DM(nhanvien.getIDNV(), 
                    nhanvien.getMANV(), nhanvien.getHoVaTen(), 
                    nhanvien.getGioiTinh(), nhanvien.getNgaySinh(), 
                    nhanvien.getDiaChi(), nhanvien.getSdt(), nhanvien.getChucVu(), 
                    nhanvien.getMatKhau(), nhanvien.getHinhAnh(),nhanvien.getTrangThai());
        if (Vr.hoanLai(d) == true) {
            return "the thanh cong";
        } else {
            return "them that bai";
        }
    }

}
