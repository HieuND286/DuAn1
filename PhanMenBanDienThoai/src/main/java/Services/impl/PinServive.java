/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services.impl;

import Repository.impl.*;
import DomainModels.MauSac_DM;
import DomainModels.Pin_DM;
import Repository.IPinRepository;
import Services.IPinServive;
import Utilities.DBConnection;
import ViewModels.MauSac_VM;
import Viewmodels.Pin_VM;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author admin
 */
public class PinServive implements IPinServive {

    private PinRepo PinRepo = new PinRepo();

    @Override
    public int them(Pin_VM pin) {
        String id = pin.getIdPin();
        String ma = pin.getMaPin();
        String dl = pin.getDungLuongPin();
        int them = this.PinRepo.them(new Pin_DM(id, ma, dl));
        return them;
    }

    @Override
    public int sua(Pin_VM pin) {
        String id = pin.getIdPin();
        String ma = pin.getMaPin();
        String dl = pin.getDungLuongPin();
        int them = this.PinRepo.sua(new Pin_DM(id, ma, dl));
        return them;
    }

    @Override
    public int xoa(Pin_VM pin) {
        String id = pin.getIdPin();
        String ma = pin.getMaPin();
        String dl = pin.getDungLuongPin();
        int them = this.PinRepo.xoa(new Pin_DM(id, ma, dl));
        return them;
    }

    @Override
    public int xoaTT(Pin_VM pin) {
        String id = pin.getIdPin();
        String ma = pin.getMaPin();
        String dl = pin.getDungLuongPin();
        int them = this.PinRepo.xoaTT(new Pin_DM(id, ma, dl));
        return them;
    }

    @Override
    public int hoanLai(Pin_VM pin) {
        String id = pin.getIdPin();
        String ma = pin.getMaPin();
        String dl = pin.getDungLuongPin();
        int them = this.PinRepo.hoanLai(new Pin_DM(id, ma, dl));
        return them;
    }

    @Override
    public List<Pin_VM> getAllDelete() {
        List<Pin_VM> listVM = new ArrayList<>();
        List<Pin_DM> listDM = this.PinRepo.getAllDeletePin();
        int stt = 1;
        for (Pin_DM pin_DM : listDM) {
            listVM.add(new Pin_VM(stt, pin_DM.getIdPin(),
                    pin_DM.getMaPin(), pin_DM.getDungLuongPin()));
            stt++;
        }
        return listVM;
    }

    @Override
    public List<Pin_VM> getAllPin() {
        List<Pin_VM> listVM = new ArrayList<>();
        List<Pin_DM> listDM = this.PinRepo.getAllPin();
        int stt = 1;
        for (Pin_DM pin_DM : listDM) {
            listVM.add(new Pin_VM(stt, pin_DM.getIdPin(),
                    pin_DM.getMaPin(), pin_DM.getDungLuongPin()));
            stt++;
        }
        return listVM;
    }

    @Override
    public List<Pin_VM> getPinbyMa(String ma) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
