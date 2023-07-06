/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services.impl;

import Repository.impl.*;
import DomainModels.Hang_DM;
import Repository.IHangRepository;
import Services.IHangServive;
import Utilities.DBConnection;
import ViewModels.Hang_VM;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author admin
 */
public class HangServive implements IHangServive {

    private HangRepo HangRepo = new HangRepo();

    @Override
    public int them(Hang_VM hang) {
        String id = hang.getIdHang();
        String ma = hang.getMaHang();
        String ten = hang.getTenHang();
        int them = HangRepo.them(new Hang_DM(id, ma, ten));
        return them;
    }

    @Override
    public int sua(Hang_VM hang) {
        String id = hang.getIdHang();
        String ma = hang.getMaHang();
        String ten = hang.getTenHang();
        int them = HangRepo.sua(new Hang_DM(id, ma, ten));
        return them;
    }

    @Override
    public int xoa(Hang_VM hang) {
        String id = hang.getIdHang();
        String ma = hang.getMaHang();
        String ten = hang.getTenHang();
        int them = HangRepo.xoa(new Hang_DM(id, ma, ten));
        return them;
    }

    @Override
    public int xoaTT(Hang_VM hang) {
        String id = hang.getIdHang();
        String ma = hang.getMaHang();
        String ten = hang.getTenHang();
        int them = HangRepo.xoaTT(new Hang_DM(id, ma, ten));
        return them;
    }

    @Override
    public int hoanLai(Hang_VM hang) {
        String id = hang.getIdHang();
        String ma = hang.getMaHang();
        String ten = hang.getTenHang();
        int them = HangRepo.hoanLai(new Hang_DM(id, ma, ten));
        return them;
    }

    @Override
    public List<Hang_VM> getAllDelete() {
        List<Hang_VM> listVM = new ArrayList<>();
        List<Hang_DM> listDM = this.HangRepo.getAllDeletedHang();
        int stt = 1;
        for (Hang_DM hang_DM : listDM) {
            listVM.add(new Hang_VM(stt, hang_DM.getIdHang(),
                    hang_DM.getMaHang(), hang_DM.getTenHang()));
            stt++;
        }
        return listVM;
    }

    @Override
    public List<Hang_VM> getAllhHangs() {
        List<Hang_VM> listVM = new ArrayList<>();
        List<Hang_DM> listDM = this.HangRepo.getAllhHangs();
        int stt = 1;
        for (Hang_DM hang_DM : listDM) {
            listVM.add(new Hang_VM(stt, hang_DM.getIdHang(),
                    hang_DM.getMaHang(), hang_DM.getTenHang()));
            stt++;
        }
        return listVM;
    }

    @Override
    public List<Hang_VM> gethHangByMa(String ma) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
