/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository.impl;

import DomainModels.Ram_DM;
import Repository.IRamRepository;
import Utilities.DBConnection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author admin
 */
public class RamRepo implements IRamRepository {

    @Override
    public int them(Ram_DM ram) {
        String sql = "insert into Ram (Ma,DungLuong)\n"
                + "values (?,?)";
        return DBConnection.ExcuteDungna(sql, ram.getMaRam(), ram.getDungLuongRam());
    }

    @Override
    public int sua(Ram_DM ram) {
        String sql = "update Ram\n"
                + "set Ma = ?, DungLuong = ?\n"
                + "where ID = ?";
        return DBConnection.ExcuteDungna(sql, ram.getMaRam(), ram.getDungLuongRam(), ram.getIdRam());
    }

    @Override
    public List<Ram_DM> getAllRams() {
        List<Ram_DM> list = new ArrayList<>();
        String sql = "select * from Ram where TinhTrang = 0";
        try {
            ResultSet rs = DBConnection.getDataFromQuery(sql);
            while (rs.next()) {
                String id = rs.getString("ID");
                String ma = rs.getString("Ma");
                String dungLuong = rs.getString("DungLuong");
                Ram_DM pin = new Ram_DM(id, ma, dungLuong);
                list.add(pin);
            }
            return list;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return list;
        }
    }

    @Override
    public List<Ram_DM> getRambyMa(String ma) {
        List<Ram_DM> list = new ArrayList<>();
        String sql = "select * from Ram where Ma = ?";
        try {
            ResultSet rs = DBConnection.getDataFromQuery(sql, ma);
            while (rs.next()) {
                String id = rs.getString("ID");
                String ma1 = rs.getString("Ma");
                String dungLuong = rs.getString("DungLuong");
                Ram_DM pin = new Ram_DM(id, ma1, dungLuong);
                list.add(pin);
            }
            return list;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return list;
        }
    }

    @Override
    public int xoa(Ram_DM ram) {
        String sql = "delete from Ram where ID = ?";
        return DBConnection.ExcuteDungna(sql, ram.getIdRam());
    }

    @Override
    public int xoaTT(Ram_DM ram) {
        String sql = "update Ram\n"
                + "set TinhTrang = 1"
                + "where ID = ?";
        return DBConnection.ExcuteDungna(sql, ram.getIdRam());
    }

    @Override
    public int hoanLai(Ram_DM ram) {
        String sql = "update Ram\n"
                + "set TinhTrang = 0"
                + "where ID = ?";
        return DBConnection.ExcuteDungna(sql, ram.getIdRam());
    }

    @Override
    public List<Ram_DM> getAllDeleteRams() {
        List<Ram_DM> list = new ArrayList<>();
        String sql = "select * from Ram where TinhTrang = 1";
        try {
            ResultSet rs = DBConnection.getDataFromQuery(sql);
            while (rs.next()) {
                String id = rs.getString("ID");
                String ma = rs.getString("Ma");
                String dungLuong = rs.getString("DungLuong");
                Ram_DM pin = new Ram_DM(id, ma, dungLuong);
                list.add(pin);
            }
            return list;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return list;
        }
    }

}
