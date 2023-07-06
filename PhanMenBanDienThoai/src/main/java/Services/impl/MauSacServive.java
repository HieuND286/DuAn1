/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services.impl;

import DomainModels.ManHinh_DM;
import Repository.impl.*;
import DomainModels.MauSac_DM;
import Repository.IMauSacRepository;
import Services.IMauSacServive;
import Utilities.DBConnection;
import ViewModels.MauSac_VM;
import Viewmodels.ManHinh_VM;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author admin
 */
public class MauSacServive implements IMauSacServive {

    private MauSacRepo MauSacRepo = new MauSacRepo();

    @Override
    public int them(MauSac_VM mauSac) {
        String id = mauSac.getIdMS();
        String ma = mauSac.getMaMS();
        String ten = mauSac.getTenMS();
        int them = this.MauSacRepo.them(new MauSac_DM(id, ma, ten));
        return them;
    }

    @Override
    public int sua(MauSac_VM mauSac) {
        String id = mauSac.getIdMS();
        String ma = mauSac.getMaMS();
        String ten = mauSac.getTenMS();
        int them = this.MauSacRepo.them(new MauSac_DM(id, ma, ten));
        return them;
    }

    @Override
    public int xoa(MauSac_VM mauSac) {
        String id = mauSac.getIdMS();
        String ma = mauSac.getMaMS();
        String ten = mauSac.getTenMS();
        int them = this.MauSacRepo.xoa(new MauSac_DM(id, ma, ten));
        return them;
    }

    @Override
    public int xoaTT(MauSac_VM mauSac) {
        String id = mauSac.getIdMS();
        String ma = mauSac.getMaMS();
        String ten = mauSac.getTenMS();
        int them = this.MauSacRepo.xoaTT(new MauSac_DM(id, ma, ten));
        return them;
    }

    @Override
    public int hoanLai(MauSac_VM mauSac) {
        String id = mauSac.getIdMS();
        String ma = mauSac.getMaMS();
        String ten = mauSac.getTenMS();
        int them = this.MauSacRepo.hoanLai(new MauSac_DM(id, ma, ten));
        return them;
    }

    @Override
    public List<MauSac_VM> getAllDelete() {
        List<MauSac_VM> listVM = new ArrayList<>();
        List<MauSac_DM> listDM = this.MauSacRepo.getAllDeleteMauSacs();
        int stt = 1;
        for (MauSac_DM mauSac_DM : listDM) {
            listVM.add(new MauSac_VM(stt, mauSac_DM.getIdMS(),
                    mauSac_DM.getMaMS(), mauSac_DM.getTenMS()));
            stt++;
        }
        return listVM;
    }

    @Override
    public List<MauSac_VM> getAllMauSacs() {
        List<MauSac_VM> listVM = new ArrayList<>();
        List<MauSac_DM> listDM = this.MauSacRepo.getAllMauSacs();
        int stt = 1;
        for (MauSac_DM mauSac_DM : listDM) {
            listVM.add(new MauSac_VM(stt, mauSac_DM.getIdMS(),
                    mauSac_DM.getMaMS(), mauSac_DM.getTenMS()));
            stt++;
        }
        return listVM;    }

    @Override
    public List<MauSac_VM> getMauSacsbyMa(String ma) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
