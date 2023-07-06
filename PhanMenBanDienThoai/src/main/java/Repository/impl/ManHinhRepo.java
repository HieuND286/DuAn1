/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository.impl;

import DomainModels.HeDieuHanh_DM;
import DomainModels.ManHinh_DM;
import Repository.IManHinhRepository;
import Utilities.DBConnection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author admin
 */
public class ManHinhRepo implements IManHinhRepository {

    @Override
    public int them(ManHinh_DM manHinh) {
        String sql = "insert into ManHinh (Ma,Ten)\n"
                + "values (?,?)";
        return DBConnection.ExcuteDungna(sql, manHinh.getMaMH(),
                manHinh.getTenMH());
    }

    @Override
    public int sua(ManHinh_DM manHinh) {
        String sql = "update ManHinh\n"
                + "set Ma = ?, Ten = ?\n"
                + "where IDMH = ?";
        return DBConnection.ExcuteDungna(sql, manHinh.getMaMH(),
                manHinh.getTenMH(), manHinh.getIdMH());
    }

    @Override
    public List<ManHinh_DM> getAllmaHinhs() {
        List<ManHinh_DM> list = new ArrayList<>();
        String sql = "select * from ManHinh where TinhTrang = 0";
        try {
            ResultSet rs = DBConnection.getDataFromQuery(sql);
            while (rs.next()) {
                String id = rs.getString("ID");
                String ma = rs.getString("Ma");
                String Ten = rs.getString("ten");
                ManHinh_DM manHinh = new ManHinh_DM(id, ma,
                        Ten);
                list.add(manHinh);
            }
            return list;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return list;
        }
    }

    @Override
    public List<ManHinh_DM> getManHinhbyMa(String ma) {
        List<ManHinh_DM> list = new ArrayList<>();
        String sql = "select * from ManHinh where Ma = ?";
        try {
            ResultSet rs = DBConnection.getDataFromQuery(sql, ma);
            while (rs.next()) {
                String id = rs.getString("ID");
                String ma1 = rs.getString("Ma");
                String Ten = rs.getString("ten");
                ManHinh_DM manHinh = new ManHinh_DM(id, ma1,
                        Ten);
                list.add(manHinh);
            }
            return list;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return list;
        }
    }

    @Override
    public int xoa(ManHinh_DM manHinh) {
        String sql = "delete from ManHinh where ID = ?";
        return DBConnection.ExcuteDungna(sql, manHinh.getIdMH());
    }

    @Override
    public int xoaTT(ManHinh_DM manHinh_DM) {
        String sql = "update ManHinh\n"
                + "set TinhTrang = 1\n"
                + "where ID = ?";
        return DBConnection.ExcuteDungna(sql, manHinh_DM.getIdMH());
    }

    @Override
    public int hoanLai(ManHinh_DM manHinh_DM) {
        String sql = "update ManHinh\n"
                + "set TinhTrang = 0\n"
                + "where ID = ?";
        return DBConnection.ExcuteDungna(sql, manHinh_DM.getIdMH());
    }

    @Override
    public List<ManHinh_DM> getAllDeletedMH() {
        List<ManHinh_DM> list = new ArrayList<>();
        String sql = "select * from ManHinh where TinhTrang = 1";
        try {
            ResultSet rs = DBConnection.getDataFromQuery(sql);
            while (rs.next()) {
                String id = rs.getString("ID");
                String ma = rs.getString("Ma");
                String Ten = rs.getString("ten");
                ManHinh_DM manHinh = new ManHinh_DM(id, ma,
                        Ten);
                list.add(manHinh);
            }
            return list;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return list;
        }
    }

}
