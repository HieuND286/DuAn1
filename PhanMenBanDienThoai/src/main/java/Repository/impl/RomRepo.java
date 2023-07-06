/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository.impl;

import DomainModels.Ram_DM;
import DomainModels.Rom_DM;
import Repository.IRomRepository;
import Utilities.DBConnection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author admin
 */
public class RomRepo implements IRomRepository {

    @Override
    public int them(Rom_DM rom) {
        String sql = "insert into Rom (Ma,DungLuong)\n"
                + "values (?,?)";
        return DBConnection.ExcuteDungna(sql, rom.getMaRom(), rom.getDungLuongRom());
    }

    @Override
    public int sua(Rom_DM rom) {
        String sql = "update Rom\n"
                + "set Ma = ?, DungLuong = ?\n"
                + "where ID = ?";
        return DBConnection.ExcuteDungna(sql, rom.getMaRom(), rom.getDungLuongRom(), rom.getIdRom());
    }

    @Override
    public List<Rom_DM> getAllRoms() {
        List<Rom_DM> list = new ArrayList<>();
        String sql = "select * from Rom where TinhTrang = 0";
        try {
            ResultSet rs = DBConnection.getDataFromQuery(sql);
            while (rs.next()) {
                String id = rs.getString("ID");
                String ma = rs.getString("Ma");
                String dungLuong = rs.getString("DungLuong");
                Rom_DM rom = new Rom_DM(id, ma, dungLuong);
                list.add(rom);
            }
            return list;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return list;
        }
    }

    @Override
    public List<Rom_DM> getRombyMa(String ma) {
        List<Rom_DM> list = new ArrayList<>();
        String sql = "select * from Rom where Ma = ?";
        try {
            ResultSet rs = DBConnection.getDataFromQuery(sql, ma);
            while (rs.next()) {
                String id = rs.getString("ID");
                String ma1 = rs.getString("Ma");
                String dungLuong = rs.getString("DungLuong");
                Rom_DM rom = new Rom_DM(id, ma1, dungLuong);
                list.add(rom);
            }
            return list;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return list;
        }
    }

    @Override
    public int xoa(Rom_DM rom) {
        String sql = "delete from Rom where ID = ?";
        return DBConnection.ExcuteDungna(sql, rom.getIdRom());
    }

    @Override
    public int xoaTT(Rom_DM rom_DM) {
        String sql = "update Rom\n"
                + "set TinhTrang = 1\n"
                + "where ID = ?";
        return DBConnection.ExcuteDungna(sql, rom_DM.getIdRom());
    }

    @Override
    public int hoanLai(Rom_DM rom_DM) {
        String sql = "update Rom\n"
                + "set TinhTrang = 0\n"
                + "where ID = ?";
        return DBConnection.ExcuteDungna(sql, rom_DM.getIdRom());
    }

    @Override
    public List<Rom_DM> getAllDeleteRoms() {
        List<Rom_DM> list = new ArrayList<>();
        String sql = "select * from Rom where TinhTrang = 1";
        try {
            ResultSet rs = DBConnection.getDataFromQuery(sql);
            while (rs.next()) {
                String id = rs.getString("ID");
                String ma = rs.getString("Ma");
                String dungLuong = rs.getString("DungLuong");
                Rom_DM rom = new Rom_DM(id, ma, dungLuong);
                list.add(rom);
            }
            return list;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return list;
        }
    }

}
