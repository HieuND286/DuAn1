/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services.impl;

import Repository.impl.*;
import DomainModels.CPU_DM;
import Repository.ICpuRepository;
import Services.ICpuServive;
import Utilities.DBConnection;
import ViewModels.CPU_VM;

import java.util.ArrayList;
import java.util.List;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author admin
 */
public class CPUServive implements ICpuServive {

    private CPURepo cpuRepo = new CPURepo();

    @Override
    public int them(CPU_VM cpu) {
        String id = cpu.getIdCPU();
        String ma = cpu.getMaCPU();
        String ten = cpu.getTenCPU();
        int them = this.cpuRepo.them(new CPU_DM(id, ma, ten));
        return them;
    }

    @Override
    public int sua(CPU_VM cpu) {
        String id = cpu.getIdCPU();
        String ma = cpu.getMaCPU();
        String ten = cpu.getTenCPU();
        int them = this.cpuRepo.sua(new CPU_DM(id, ma, ten));
        return them;
    }

    @Override
    public int xoa(CPU_VM cpu) {
        String id = cpu.getIdCPU();
        String ma = cpu.getMaCPU();
        String ten = cpu.getTenCPU();
        int them = this.cpuRepo.xoa(new CPU_DM(id, ma, ten));
        return them;
    }

    @Override
    public List<CPU_VM> getAllCpus() {
        List<CPU_VM> listVM = new ArrayList<>();
        List<CPU_DM> listDM = this.cpuRepo.getAllCpus();
        int stt = 1;
        for (CPU_DM cpu_dm : listDM) {
            listVM.add(new CPU_VM(stt, cpu_dm.getIdCPU(),
                    cpu_dm.getMaCPU(), cpu_dm.getTenCPU()));
            stt++;
        }
        return listVM;
    }

    @Override
    public List<CPU_VM> getCpusbyMa(String ma) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int xoaTT(CPU_VM cpu) {
        String id = cpu.getIdCPU();
        String ma = cpu.getMaCPU();
        String ten = cpu.getTenCPU();
        int them = this.cpuRepo.xoaTT(new CPU_DM(id, ma, ten));
        return them;
    }

    @Override
    public int hoanLai(CPU_VM cpu) {
        String id = cpu.getIdCPU();
        String ma = cpu.getMaCPU();
        String ten = cpu.getTenCPU();
        int them = this.cpuRepo.hoaLai(new CPU_DM(id, ma, ten));
        return them;
    }

    @Override
    public List<CPU_VM> getAllDeleteCpus() {
        List<CPU_VM> listVM = new ArrayList<>();
        List<CPU_DM> listDM = this.cpuRepo.getAllDeleteCpus();
        int stt = 1;
        for (CPU_DM cpu_dm : listDM) {
            listVM.add(new CPU_VM(stt, cpu_dm.getIdCPU(),
                    cpu_dm.getMaCPU(), cpu_dm.getTenCPU()));
            stt++;
        }
        return listVM;
    }

}
