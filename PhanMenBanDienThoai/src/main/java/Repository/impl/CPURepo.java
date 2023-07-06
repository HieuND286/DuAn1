/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository.impl;

import DomainModels.CPU_DM;
import Repository.ICpuRepository;
import Utilities.DBConnection;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author admin
 */
public class CPURepo implements ICpuRepository {

    @Override
    public int them(CPU_DM cpu) {
        String sql = "insert into CPU (Ma,Ten)\n"
                + "values(?,?)";
        return DBConnection.ExcuteDungna(sql, cpu.getMaCPU(), cpu.getTenCPU());
    }

    @Override
    public int sua(CPU_DM cpu) {
        String sql = "update CPU\n"
                + "set Ma = ? ,  Ten = ?\n"
                + "where ID = ?";
        return DBConnection.ExcuteDungna(sql, cpu.getMaCPU(),
                cpu.getTenCPU(), cpu.getIdCPU());
    }

    @Override
    public int xoa(CPU_DM cpu) {

        String sql = "delete from CPU where ID = ?";
        return DBConnection.ExcuteDungna(sql, cpu.getIdCPU());
    }

    @Override
    public List<CPU_DM> getAllCpus() {
        List<CPU_DM> list = new ArrayList<>();
        String sql = "select *\n"
                + "from CPU \n"
                + "where TinhTrang = 0\n";
        try {
            ResultSet rs = DBConnection.getDataFromQuery(sql);
            while (rs.next()) {
                String id = rs.getString(1);
                String ma = rs.getString(2);
                String ten = rs.getString(3);
                CPU_DM cpu_dm = new CPU_DM(id, ma, ten);
                list.add(cpu_dm);
            }
            return list;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return list;
        }
    }

    @Override
    public List<CPU_DM> getCpusbyMa(String ma) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int xoaTT(CPU_DM cpu) {
        String sql = "update CPU\n"
                + "set TinhTrang = 1\n"
                + "where ID = ?";
        return DBConnection.ExcuteDungna(sql, cpu.getIdCPU());
    }

    @Override
    public int hoaLai(CPU_DM cpu) {
                String sql = "update CPU\n"
                + "set TinhTrang = 0\n"
                + "where ID = ?";
        return DBConnection.ExcuteDungna(sql, cpu.getIdCPU());
    }

    @Override
    public List<CPU_DM> getAllDeleteCpus() {
        List<CPU_DM> list = new ArrayList<>();
        String sql = "select *\n"
                + "from CPU \n"
                + "where TinhTrang = 1\n";
        try {
            ResultSet rs = DBConnection.getDataFromQuery(sql);
            while (rs.next()) {
                String id = rs.getString(1);
                String ma = rs.getString(2);
                String ten = rs.getString(3);
                CPU_DM cpu_dm = new CPU_DM(id, ma, ten);
                list.add(cpu_dm);
            }
            return list;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return list;
        }    }

}
