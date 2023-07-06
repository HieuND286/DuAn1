/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository.impl;

import DomainModels.MauSac_DM;
import DomainModels.Pin_DM;
import Repository.IPinRepository;
import Utilities.DBConnection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author admin
 */
public class PinRepo implements IPinRepository {

    @Override
    public int them(Pin_DM pin) {
        String sql = "insert into Pin(Ma,DungLuong)\n"
                + "values (?,?)";
        return DBConnection.ExcuteDungna(sql, pin.getMaPin(),
                pin.getDungLuongPin());
    }

    @Override
    public int sua(Pin_DM pin) {
        String sql = "update Pin\n"
                + "set Ma = ?, DungLuong = ?\n"
                + "where ID = ?";
        return DBConnection.ExcuteDungna(sql, pin.getMaPin(),
                pin.getDungLuongPin(), pin.getIdPin());
    }

    @Override
    public List<Pin_DM> getAllPin() {
        List<Pin_DM> list = new ArrayList<>();
        String sql = "select * from Pin where TinhTrang = 0";
        try {
            ResultSet rs = DBConnection.getDataFromQuery(sql);
            while (rs.next()) {
                String id = rs.getString("ID");
                String ma = rs.getString("Ma");
                String dungLuong = rs.getString("DungLuong");
                Pin_DM pin = new Pin_DM(id, ma, dungLuong);
                list.add(pin);
            }
            return list;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return list;
        }
    }

    @Override
    public List<Pin_DM> getPinbyMa(String ma) {
        List<Pin_DM> list = new ArrayList<>();
        String sql = "select * from Pin where Ma = ?";
        try {
            ResultSet rs = DBConnection.getDataFromQuery(sql, ma);
            while (rs.next()) {
                String id = rs.getString("ID");
                String ma1 = rs.getString("Ma");
                String dungLuong = rs.getString("DungLuong");
                Pin_DM pin = new Pin_DM(id, ma1, dungLuong);
                list.add(pin);
            }
            return list;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return list;
        }
    }

    @Override
    public int xoa(Pin_DM pin) {
        String sql = "delete from Pin where ID = ?";
        return DBConnection.ExcuteDungna(sql, pin.getDungLuongPin());
    }

    @Override
    public int xoaTT(Pin_DM pin_DM) {
        String sql = "update Pin\n"
                + "set TinhTrang = 1\n"
                + "where ID = ?";
        return DBConnection.ExcuteDungna(sql, pin_DM.getIdPin());
    }

    @Override
    public int hoanLai(Pin_DM pin_DM) {
        String sql = "update Pin\n"
                + "set TinhTrang = 0\n"
                + "where ID = ?";
        return DBConnection.ExcuteDungna(sql, pin_DM.getIdPin());
    }

    @Override
    public List<Pin_DM> getAllDeletePin() {
        List<Pin_DM> list = new ArrayList<>();
        String sql = "select * from Pin where TinhTrang = 1";
        try {
            ResultSet rs = DBConnection.getDataFromQuery(sql);
            while (rs.next()) {
                String id = rs.getString("ID");
                String ma = rs.getString("Ma");
                String dungLuong = rs.getString("DungLuong");
                Pin_DM pin = new Pin_DM(id, ma, dungLuong);
                list.add(pin);
            }
            return list;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return list;
        }
    }

}
