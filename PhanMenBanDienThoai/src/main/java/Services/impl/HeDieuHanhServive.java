/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services.impl;

import DomainModels.Hang_DM;
import Repository.impl.*;
import DomainModels.HeDieuHanh_DM;
import Repository.IHeDieuHanhRepository;
import Services.IHeDieuHanhServive;
import Utilities.DBConnection;
import ViewModels.Hang_VM;
import ViewModels.HeDieuHanh_VM;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author admin
 */
public class HeDieuHanhServive implements IHeDieuHanhServive {

    private HeDieuHanhRepo heDieuHanhRepo = new HeDieuHanhRepo();

    @Override
    public int them(HeDieuHanh_VM heDieuHanh) {
        String id = heDieuHanh.getIdHDH();
        String ma = heDieuHanh.getMaHDH();
        String ten = heDieuHanh.getTenHDH();
        int them = this.heDieuHanhRepo.them(new HeDieuHanh_DM(id, ma, ten));
        return them;
    }

    @Override
    public int sua(HeDieuHanh_VM heDieuHanh) {
        String id = heDieuHanh.getIdHDH();
        String ma = heDieuHanh.getMaHDH();
        String ten = heDieuHanh.getTenHDH();
        int them = this.heDieuHanhRepo.sua(new HeDieuHanh_DM(id, ma, ten));
        return them;
    }

    @Override
    public int xoa(HeDieuHanh_VM heDieuHanh) {
        String id = heDieuHanh.getIdHDH();
        String ma = heDieuHanh.getMaHDH();
        String ten = heDieuHanh.getTenHDH();
        int them = this.heDieuHanhRepo.xoa(new HeDieuHanh_DM(id, ma, ten));
        return them;
    }

    @Override
    public int xoaTT(HeDieuHanh_VM heDieuHanh) {
        String id = heDieuHanh.getIdHDH();
        String ma = heDieuHanh.getMaHDH();
        String ten = heDieuHanh.getTenHDH();
        int them = this.heDieuHanhRepo.xoaTT(new HeDieuHanh_DM(id, ma, ten));
        return them;
    }

    @Override
    public int hoanLai(HeDieuHanh_VM heDieuHanh) {
        String id = heDieuHanh.getIdHDH();
        String ma = heDieuHanh.getMaHDH();
        String ten = heDieuHanh.getTenHDH();
        int them = this.heDieuHanhRepo.hoanLai(new HeDieuHanh_DM(id, ma, ten));
        return them;
    }

    @Override
    public List<HeDieuHanh_VM> getAllDelete() {
        List<HeDieuHanh_VM> listVM = new ArrayList<>();
        List<HeDieuHanh_DM> listDM = this.heDieuHanhRepo.getAllDeleteHDH();
        int stt = 1;
        for (HeDieuHanh_DM heDieuHanh_DM : listDM) {
            listVM.add(new HeDieuHanh_VM(stt, heDieuHanh_DM.getIdHDH(),
                    heDieuHanh_DM.getMaHDH(), heDieuHanh_DM.getTenHDH()));
            stt++;
        }
        return listVM;
    }

    @Override
    public List<HeDieuHanh_VM> getAllhHeDieuHanhs() {
        List<HeDieuHanh_VM> listVM = new ArrayList<>();
        List<HeDieuHanh_DM> listDM = this.heDieuHanhRepo.getAllhHeDieuHanhs();
        int stt = 1;
        for (HeDieuHanh_DM heDieuHanh_DM : listDM) {
            listVM.add(new HeDieuHanh_VM(stt, heDieuHanh_DM.getIdHDH(),
                    heDieuHanh_DM.getMaHDH(), heDieuHanh_DM.getTenHDH()));
            stt++;
        }
        return listVM;
    }

    @Override
    public List<HeDieuHanh_VM> getHeDieuHanhbyMa(String ma) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
