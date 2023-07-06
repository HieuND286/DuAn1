/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository.impl;

import DomainModels.CPU_DM;
import DomainModels.DongSP_DM;
import Repository.ICpuRepository;
import Repository.IDongSPRepository;
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
public class DongSPRepo implements IDongSPRepository {

    @Override
    public int them(DongSP_DM dongSP) {
        String sql = "insert into DongSP (Ma,Ten)\n"
                + "values (?,?)";
        return DBConnection.ExcuteDungna(sql, dongSP.getMaDongSP(),
                dongSP.getTenDongSP());
    }

    @Override
    public int sua(DongSP_DM dongSP) {
        String sql = "update DongSP\n"
                + "set Ma = ?, Ten = ?\n"
                + "where ID = ?";
        return DBConnection.ExcuteDungna(sql, dongSP.getMaDongSP(),
                dongSP.getTenDongSP(), dongSP.getIdDongSP());
    }

    @Override
    public List<DongSP_DM> getAlldDongSP() {
        List<DongSP_DM> listDongSP = new ArrayList<>();
        String sql = "select * from DongSP where TinhTrang = 0";
        try {
            ResultSet rs = DBConnection.getDataFromQuery(sql);
            while (rs.next()) {
                String id = rs.getString("ID");
                String ma = rs.getString("Ma");
                String ten = rs.getString("Ten");
                DongSP_DM dongSP = new DongSP_DM(id, ma, ten);
                listDongSP.add(dongSP);
            }
            return listDongSP;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return listDongSP;
        }

    }

    @Override
    public List<DongSP_DM> getdDongSPByMa(String ma) {
        List<DongSP_DM> listDongSP = new ArrayList<>();
        String sql = "select * from DongSP where Ma = ?";
        try {
            ResultSet rs = DBConnection.getDataFromQuery(sql, ma);
            while (rs.next()) {
                String id = rs.getString("IDDongSP");
                String ma1 = rs.getString("Ma");
                String ten = rs.getString("Ten");
                DongSP_DM dongSP = new DongSP_DM(id, ma1, ten);
                listDongSP.add(dongSP);
            }
            return listDongSP;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return listDongSP;
        }
    }

    @Override
    public int xoa(DongSP_DM dongSP) {
        String sql = "delete from DongSP where ID = ?";
        return DBConnection.ExcuteDungna(sql, dongSP.getIdDongSP());
    }

    @Override
    public int xoaTT(DongSP_DM dongSP) {
        String sql = "update DongSP\n"
                + "set TinhTrang = 1\n"
                + "where ID = ?";
        return DBConnection.ExcuteDungna(sql, dongSP.getIdDongSP());
    }

    @Override
    public int hoanLai(DongSP_DM dongSP_DM) {
        String sql = "update DongSP\n"
                + "set TinhTrang = 0\n"
                + "where ID = ?";
        return DBConnection.ExcuteDungna(sql, dongSP_DM.getIdDongSP());
    }

    @Override
    public List<DongSP_DM> getAllDeletedDongSP() {
        List<DongSP_DM> listDongSP = new ArrayList<>();
        String sql = "select * from DongSP where TinhTrang = 1";
        try {
            ResultSet rs = DBConnection.getDataFromQuery(sql);
            while (rs.next()) {
                String id = rs.getString("ID");
                String ma = rs.getString("Ma");
                String ten = rs.getString("Ten");
                DongSP_DM dongSP = new DongSP_DM(id, ma, ten);
                listDongSP.add(dongSP);
            }
            return listDongSP;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return listDongSP;
        }
    }

}
