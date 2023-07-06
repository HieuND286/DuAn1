/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services.impl;

import Repository.impl.*;
import DomainModels.Ram_DM;
import Repository.IRamRepository;
import Services.IRamServive;
import Utilities.DBConnection;
import Viewmodels.Ram_VM;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author admin
 */
public class RamServive implements IRamServive {

    private RamRepo RamRepo = new RamRepo();

    @Override
    public int them(Ram_VM ram) {
        String id = ram.getIdRam();
        String ma = ram.getMaRam();
        String dungLuog = ram.getDungLuongRam();
        int them = this.RamRepo.them(new Ram_DM(id, ma, dungLuog));
        return them;
    }

    @Override
    public int sua(Ram_VM ram) {
        String id = ram.getIdRam();
        String ma = ram.getMaRam();
        String dungLuog = ram.getDungLuongRam();
        int them = this.RamRepo.sua(new Ram_DM(id, ma, dungLuog));
        return them;
    }

    @Override
    public int xoa(Ram_VM ram) {
        String id = ram.getIdRam();
        String ma = ram.getMaRam();
        String dungLuog = ram.getDungLuongRam();
        int them = this.RamRepo.xoa(new Ram_DM(id, ma, dungLuog));
        return them;
    }

    @Override
    public List<Ram_VM> getAllRams() {
        List<Ram_VM> listVM = new ArrayList<>();
        List<Ram_DM> listDM = this.RamRepo.getAllRams();
        int stt = 1;
        for (Ram_DM ram_DM : listDM) {
            listVM.add(new Ram_VM(stt, ram_DM.getIdRam(),
                    ram_DM.getMaRam(), ram_DM.getDungLuongRam()));
            stt++;
        }
        return listVM;
    }

    @Override
    public List<Ram_VM> getRambyMa(String ma) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int xoaTT(Ram_VM ram) {
        String id = ram.getIdRam();
        String ma = ram.getMaRam();
        String dungLuog = ram.getDungLuongRam();
        int them = this.RamRepo.xoaTT(new Ram_DM(id, ma, dungLuog));
        return them;
    }

    @Override
    public int hoaLai(Ram_VM ram) {
        String id = ram.getIdRam();
        String ma = ram.getMaRam();
        String dungLuog = ram.getDungLuongRam();
        int them = this.RamRepo.hoanLai(new Ram_DM(id, ma, dungLuog));
        return them;
    }

    @Override
    public List<Ram_VM> getAllDeleteRam() {
        List<Ram_VM> listVM = new ArrayList<>();
        List<Ram_DM> listDM = this.RamRepo.getAllDeleteRams();
        int stt = 1;
        for (Ram_DM ram_DM : listDM) {
            listVM.add(new Ram_VM(stt, ram_DM.getIdRam(),
                    ram_DM.getMaRam(), ram_DM.getDungLuongRam()));
            stt++;
        }
        return listVM;
    }

}
