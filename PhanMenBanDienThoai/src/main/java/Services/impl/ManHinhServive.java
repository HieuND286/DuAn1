/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services.impl;

import Repository.impl.*;
import DomainModels.HeDieuHanh_DM;
import DomainModels.ManHinh_DM;
import Repository.IManHinhRepository;
import Services.IManHinhServive;
import Utilities.DBConnection;
import Viewmodels.ManHinh_VM;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author admin
 */
public class ManHinhServive implements IManHinhServive {

    private ManHinhRepo ManHinhRepo = new ManHinhRepo();

    @Override
    public int them(ManHinh_VM manHinh) {
        String id = manHinh.getIdMH();
        String ma = manHinh.getMaMH();
        String ten = manHinh.getTenMH();
        int them = this.ManHinhRepo.them(new ManHinh_DM(id, ma, ten));
        return them;
    }

    @Override
    public int sua(ManHinh_VM manHinh) {
        String id = manHinh.getIdMH();
        String ma = manHinh.getMaMH();
        String ten = manHinh.getTenMH();
        int them = this.ManHinhRepo.sua(new ManHinh_DM(id, ma, ten));
        return them;
    }

    @Override
    public int xoa(ManHinh_VM manHinh) {
        String id = manHinh.getIdMH();
        String ma = manHinh.getMaMH();
        String ten = manHinh.getTenMH();
        int them = this.ManHinhRepo.xoa(new ManHinh_DM(id, ma, ten));
        return them;
    }

    @Override
    public int xoaTT(ManHinh_VM manHinh) {
        String id = manHinh.getIdMH();
        String ma = manHinh.getMaMH();
        String ten = manHinh.getTenMH();
        int them = this.ManHinhRepo.xoaTT(new ManHinh_DM(id, ma, ten));
        return them;
    }

    @Override
    public int hoanLai(ManHinh_VM manHinh) {
        String id = manHinh.getIdMH();
        String ma = manHinh.getMaMH();
        String ten = manHinh.getTenMH();
        int them = this.ManHinhRepo.hoanLai(new ManHinh_DM(id, ma, ten));
        return them;
    }

    @Override
    public List<ManHinh_VM> getAllDelete() {
        List<ManHinh_VM> listVM = new ArrayList<>();
        List<ManHinh_DM> listDM = this.ManHinhRepo.getAllDeletedMH();
        int stt = 1;
        for (ManHinh_DM manHinh_DM : listDM) {
            listVM.add(new ManHinh_VM(stt, manHinh_DM.getIdMH(),
                    manHinh_DM.getMaMH(), manHinh_DM.getTenMH()));
            stt++;
        }
        return listVM;
    }

    @Override
    public List<ManHinh_VM> getAllmaHinhs() {
        List<ManHinh_VM> listVM = new ArrayList<>();
        List<ManHinh_DM> listDM = this.ManHinhRepo.getAllmaHinhs();
        int stt = 1;
        for (ManHinh_DM manHinh_DM : listDM) {
            listVM.add(new ManHinh_VM(stt, manHinh_DM.getIdMH(),
                    manHinh_DM.getMaMH(), manHinh_DM.getTenMH()));
            stt++;
        }
        return listVM;
    }

    @Override
    public List<ManHinh_VM> getManHinhbyMa(String ma) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
