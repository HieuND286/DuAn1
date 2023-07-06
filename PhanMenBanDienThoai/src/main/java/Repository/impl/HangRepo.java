/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository.impl;

import DomainModels.Hang_DM;
import Repository.IHangRepository;
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
public class HangRepo implements IHangRepository {

    @Override
    public int them(Hang_DM hang) {
        String sql = "insert into Hang (Ma,Ten)\n"
                + "values (?,?)";
        return DBConnection.ExcuteDungna(sql, hang.getMaHang(),
                hang.getTenHang());
    }

    @Override
    public int sua(Hang_DM hang) {
        String sql = "update Hang\n"
                + "set Ma = ?, Ten = ?\n"
                + "where ID = ?";
        return DBConnection.ExcuteDungna(sql, hang.getMaHang(),
                hang.getTenHang(), hang.getIdHang());
    }

    @Override
    public List<Hang_DM> getAllhHangs() {
        List<Hang_DM> listHang = new ArrayList<>();
        String sql = "select * from Hang where TinhTrang = 0";
        try {
            ResultSet rs = DBConnection.getDataFromQuery(sql);
            while (rs.next()) {
                String id = rs.getString("ID");
                String ma = rs.getString("Ma");
                String ten = rs.getString("Ten");
                Hang_DM hang = new Hang_DM(id, ma, ten);
                listHang.add(hang);
            }
            return listHang;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return listHang;
        }
    }

    @Override
    public List<Hang_DM> gethHangByMa(String ma) {
        List<Hang_DM> listHang = new ArrayList<>();
        String sql = "select * from Hang where Ma = ?";
        try {
            ResultSet rs = DBConnection.getDataFromQuery(sql, ma);
            while (rs.next()) {
                String id = rs.getString("IDHNG");
                String ma1 = rs.getString("Ma");
                String ten = rs.getString("Ten");
                Hang_DM hang = new Hang_DM(id, ma1, ten);
                listHang.add(hang);
            }
            return listHang;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return listHang;
        }
    }

    @Override
    public int xoa(Hang_DM hang) {
        String sql = "delete from Hang where ID = ?";
        return DBConnection.ExcuteDungna(sql, hang.getIdHang());
    }

    @Override
    public int xoaTT(Hang_DM hang_DM) {
        String sql = "update Hang\n"
                + "set TinhTrang = 1\n"
                + "where ID = ?";
        return DBConnection.ExcuteDungna(sql, hang_DM.getIdHang());
    }

    @Override
    public int hoanLai(Hang_DM hang_DM) {
        String sql = "update Hang\n"
                + "set TinhTrang = 0\n"
                + "where ID = ?";
        return DBConnection.ExcuteDungna(sql, hang_DM.getIdHang());
    }

    @Override
    public List<Hang_DM> getAllDeletedHang() {
        List<Hang_DM> listHang = new ArrayList<>();
        String sql = "select * from Hang where TinhTrang = 1";
        try {
            ResultSet rs = DBConnection.getDataFromQuery(sql);
            while (rs.next()) {
                String id = rs.getString("ID");
                String ma = rs.getString("Ma");
                String ten = rs.getString("Ten");
                Hang_DM hang = new Hang_DM(id, ma, ten);
                listHang.add(hang);
            }
            return listHang;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return listHang;
        }
    }

}
