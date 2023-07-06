/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository.impl;

import DomainModels.HeDieuHanh_DM;
import Repository.IHeDieuHanhRepository;
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
public class HeDieuHanhRepo implements IHeDieuHanhRepository {

    @Override
    public int them(HeDieuHanh_DM heDieuHanh) {
        String sql = "insert into HeDieuHanh (Ma,Ten)\n"
                + "values (?,?)";
        return DBConnection.ExcuteDungna(sql, heDieuHanh.getMaHDH(),
                heDieuHanh.getTenHDH());
    }

    @Override
    public int sua(HeDieuHanh_DM heDieuHanh) {
        String sql = "update HeDieuHanh\n"
                + "set Ma = ?, Ten = ?\n"
                + "where ID = ?";
        return DBConnection.ExcuteDungna(sql, heDieuHanh.getMaHDH(),
                heDieuHanh.getTenHDH(), heDieuHanh.getIdHDH());
    }

    @Override
    public List<HeDieuHanh_DM> getAllhHeDieuHanhs() {
        List<HeDieuHanh_DM> list = new ArrayList<>();
        String sql = "select * from HeDieuHanh where TinhTrang = 0";
        try {
            ResultSet rs = DBConnection.getDataFromQuery(sql);
            while (rs.next()) {
                String id = rs.getString("ID");
                String ma = rs.getString("Ma");
                String Ten = rs.getString("ten");
                HeDieuHanh_DM heDieuHanh = new HeDieuHanh_DM(id, ma,
                        Ten);
                list.add(heDieuHanh);
            }
            return list;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return list;
        }
    }

    @Override
    public List<HeDieuHanh_DM> getHeDieuHanhbyMa(String ma) {
        List<HeDieuHanh_DM> list = new ArrayList<>();
        String sql = "select * from HeDieuHanh where Ma = ?";
        try {
            ResultSet rs = DBConnection.getDataFromQuery(sql, ma);
            while (rs.next()) {
                String id = rs.getString("IDHDH");
                String ma1 = rs.getString("Ma");
                String Ten = rs.getString("ten");
                HeDieuHanh_DM heDieuHanh = new HeDieuHanh_DM(id, ma1,
                        Ten);
                list.add(heDieuHanh);
            }
            return list;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return list;
        }
    }

    @Override
    public int xoa(HeDieuHanh_DM heDieuHanh) {
        String sql = "delete from HeDieuHanh where ID = ?";
        return DBConnection.ExcuteDungna(sql, heDieuHanh.getIdHDH());
    }

    @Override
    public int xoaTT(HeDieuHanh_DM heDieuHanh_DM) {
        String sql = "update HeDieuHanh\n"
                + "set TinhTrang = 1\n"
                + "where ID = ?";
        return DBConnection.ExcuteDungna(sql,  heDieuHanh_DM.getIdHDH());
    }

    @Override
    public int hoanLai(HeDieuHanh_DM heDieuHanh_DM) {
        String sql = "update HeDieuHanh\n"
                + "set TinhTrang = 0\n"
                + "where ID = ?";
        return DBConnection.ExcuteDungna(sql,  heDieuHanh_DM.getIdHDH());    }

    @Override
    public List<HeDieuHanh_DM> getAllDeleteHDH() {
        List<HeDieuHanh_DM> list = new ArrayList<>();
        String sql = "select * from HeDieuHanh where TinhTrang = 1";
        try {
            ResultSet rs = DBConnection.getDataFromQuery(sql);
            while (rs.next()) {
                String id = rs.getString("ID");
                String ma = rs.getString("Ma");
                String Ten = rs.getString("ten");
                HeDieuHanh_DM heDieuHanh = new HeDieuHanh_DM(id, ma,
                        Ten);
                list.add(heDieuHanh);
            }
            return list;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return list;
        }
    }

}
