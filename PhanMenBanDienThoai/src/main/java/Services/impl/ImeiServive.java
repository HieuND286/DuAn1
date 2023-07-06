/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services.impl;

import DomainModels.ChiTietSP_DM;
import Repository.impl.*;
import DomainModels.Imei_DM;
import Repository.IImeiRepository;
import Services.IImeiServive;
import Utilities.DBConnection;
import ViewModels.ChiTietSP_VM;
import ViewModels.Imei_VM;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author admin
 */
public class ImeiServive implements IImeiServive {

    private ImeiRepo ImeiRepo = new ImeiRepo();

    @Override
    public int them(Imei_VM imei) {
        String id = imei.getiDImei();
        String soImei = imei.getImei();
        int them = this.ImeiRepo.them(new Imei_DM(soImei, soImei, null));
        return them;
    }

    @Override
    public int sua(Imei_VM imei) {
        String id = imei.getiDImei();
        String soImei = imei.getImei();
        ChiTietSP_DM idCTSP = new ChiTietSP_DM(imei.getChiTietSP_VM().getiDCTSP());
        int them = this.ImeiRepo.sua(new Imei_DM(soImei, soImei, null));
        return them;
    }

    @Override
    public List<Imei_VM> getAllImeis() {
        List<Imei_VM> listVM = new ArrayList<>();
        List<Imei_DM> listDM = this.ImeiRepo.getAllImeis();
        int stt = 1;
        for (Imei_DM imei_DM : listDM) {
            listVM.add(new Imei_VM(stt, imei_DM.getiDImei(), imei_DM.getImei(),
                    null));
            stt++;
        }
        return listVM;
    }

    @Override
    public List<Imei_VM> getAllImeisofSP(String idsp) {
        List<Imei_VM> listVM = new ArrayList<>();
        List<Imei_DM> listDM = this.ImeiRepo.getAllImeisofSanPhan(idsp);
        int stt = 1;
        for (Imei_DM imei_DM : listDM) {
            listVM.add(new Imei_VM(stt, imei_DM.getiDImei(), imei_DM.getImei(),
                   null));
            stt++;
        }
        return listVM;
    }

    @Override
    public int xoaImei() {
        int exe = this.ImeiRepo.xoaImei();
        return exe;
    }

    @Override
    public List<Imei_VM> getAllImeisofHD(String idHD) {
        List<Imei_VM> listVM = new ArrayList<>();
        List<Imei_DM> listDM = this.ImeiRepo.getAllImeisofHD(idHD);
        int stt = 1;
        for (Imei_DM imei_DM : listDM) {
            listVM.add(new Imei_VM(stt, imei_DM.getiDImei(), imei_DM.getImei(),
                   null));
            stt++;
        }
        return listVM;    }

    @Override
    public List<Imei_VM> getAll() {
        List<Imei_VM> listVM = new ArrayList<>();
        List<Imei_DM> listDM = this.ImeiRepo.getAll();
        int stt = 1;
        for (Imei_DM imei_DM : listDM) {
            listVM.add(new Imei_VM(stt, imei_DM.getiDImei(), imei_DM.getImei(),
                    null));
            stt++;
        }
        return listVM;    }

}
