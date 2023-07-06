/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services.impl;

import Repository.impl.*;
import DomainModels.CPU_DM;
import DomainModels.DongSP_DM;
import Repository.ICpuRepository;
import Repository.IDongSPRepository;
import Services.IDongSPServive;
import Utilities.DBConnection;
import ViewModels.DongSP_VM;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author admin
 */
public class DongSPServive implements IDongSPServive {

    private DongSPRepo dongSPRepo = new DongSPRepo();

    @Override
    public int them(DongSP_VM dongSP) {
        String id = dongSP.getIdDongSP();
        String ten = dongSP.getTenDongSP();
        String ma = dongSP.getMaDongSP();
        int them = this.dongSPRepo.them(new DongSP_DM(id, ma, ten));
        return them;
    }

    @Override
    public int sua(DongSP_VM dongSP) {
        String id = dongSP.getIdDongSP();
        String ten = dongSP.getTenDongSP();
        String ma = dongSP.getMaDongSP();
        int them = this.dongSPRepo.sua(new DongSP_DM(id, ma, ten));
        return them;
    }

    @Override
    public List<DongSP_VM> getAlldDongSP() {
        List<DongSP_VM> listVM = new ArrayList<>();
        List<DongSP_DM> listDM = this.dongSPRepo.getAlldDongSP();
        int stt = 1;
        for (DongSP_DM dongSP_DM : listDM) {
            listVM.add(new DongSP_VM(stt, dongSP_DM.getIdDongSP(),
                    dongSP_DM.getMaDongSP(), dongSP_DM.getTenDongSP()));
            stt++;
        }
        return listVM;
    }

    @Override
    public List<DongSP_VM> getdDongSPByMa(String ma) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int xoa(DongSP_VM dongSPP) {
        String id = dongSPP.getIdDongSP();
        String ten = dongSPP.getTenDongSP();
        String ma = dongSPP.getMaDongSP();
        int them = this.dongSPRepo.xoa(new DongSP_DM(id, ma, ten));
        return them;
    }

    @Override
    public int xoaTT(DongSP_VM dongSP) {
        String id = dongSP.getIdDongSP();
        String ten = dongSP.getTenDongSP();
        String ma = dongSP.getMaDongSP();
        int them = this.dongSPRepo.xoaTT(new DongSP_DM(id, ma, ten));
        return them;
    }

    @Override
    public int hoanLai(DongSP_VM dongSP) {
        String id = dongSP.getIdDongSP();
        String ten = dongSP.getTenDongSP();
        String ma = dongSP.getMaDongSP();
        int them = this.dongSPRepo.hoanLai(new DongSP_DM(id, ma, ten));
        return them;
    }

    @Override
    public List<DongSP_VM> getAllDelete() {
        List<DongSP_VM> listVM = new ArrayList<>();
        List<DongSP_DM> listDM = this.dongSPRepo.getAllDeletedDongSP();
        int stt = 1;
        for (DongSP_DM dongSP_DM : listDM) {
            listVM.add(new DongSP_VM(stt, dongSP_DM.getIdDongSP(),
                    dongSP_DM.getMaDongSP(), dongSP_DM.getTenDongSP()));
            stt++;
        }
        return listVM;
    }

}
