/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services.impl;

import Repository.impl.*;
import DomainModels.Ram_DM;
import DomainModels.Rom_DM;
import Repository.IRomRepository;
import Services.IRomServive;
import Utilities.DBConnection;
import Viewmodels.Rom_VM;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author admin
 */
public class RomServive implements IRomServive {

    private RomRepo RomRepo = new RomRepo();

    @Override
    public int them(Rom_VM rom) {
        String id = rom.getIdRom();
        String ma = rom.getMaRom();
        String dungLuog = rom.getDungLuongRom();
        int them = this.RomRepo.them(new Rom_DM(id, ma, dungLuog));
        return them;
    }

    @Override
    public int sua(Rom_VM rom) {
        String id = rom.getIdRom();
        String ma = rom.getMaRom();
        String dungLuog = rom.getDungLuongRom();
        int them = this.RomRepo.sua(new Rom_DM(id, ma, dungLuog));
        return them;
    }

    @Override
    public int xoa(Rom_VM rom) {
        String id = rom.getIdRom();
        String ma = rom.getMaRom();
        String dungLuog = rom.getDungLuongRom();
        int them = this.RomRepo.xoa(new Rom_DM(id, ma, dungLuog));
        return them;
    }

    @Override
    public int xoaTT(Rom_VM rom) {
        String id = rom.getIdRom();
        String ma = rom.getMaRom();
        String dungLuog = rom.getDungLuongRom();
        int them = this.RomRepo.xoaTT(new Rom_DM(id, ma, dungLuog));
        return them;
    }

    @Override
    public int hoanLai(Rom_VM rom) {
        String id = rom.getIdRom();
        String ma = rom.getMaRom();
        String dungLuog = rom.getDungLuongRom();
        int them = this.RomRepo.hoanLai(new Rom_DM(id, ma, dungLuog));
        return them;
    }

    @Override
    public List<Rom_VM> getAllDelete() {
        List<Rom_VM> listVM = new ArrayList<>();
        List<Rom_DM> listDM = this.RomRepo.getAllDeleteRoms();
        int stt = 1;
        for (Rom_DM pin_DM : listDM) {
            listVM.add(new Rom_VM(stt, pin_DM.getIdRom(),
                    pin_DM.getMaRom(), pin_DM.getDungLuongRom()));
            stt++;
        }
        return listVM;
    }

    @Override
    public List<Rom_VM> getAllRoms() {
        List<Rom_VM> listVM = new ArrayList<>();
        List<Rom_DM> listDM = this.RomRepo.getAllRoms();
        int stt = 1;
        for (Rom_DM pin_DM : listDM) {
            listVM.add(new Rom_VM(stt, pin_DM.getIdRom(),
                    pin_DM.getMaRom(), pin_DM.getDungLuongRom()));
            stt++;
        }
        return listVM;
    }

    @Override
    public List<Rom_VM> getRombyMa(String ma) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
