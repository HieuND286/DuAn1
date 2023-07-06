/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository.impl;

import DomainModels.Imei_DM;
import Repository.IImeiRepository;
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
public class ImeiRepo implements IImeiRepository {

    @Override
    public int them(Imei_DM imei) {
        String sql = "insert into Imei (SO_Imei)\n"
                + "values (?)";
        return DBConnection.ExcuteDungna(sql, imei.getImei());
    }

    @Override
    public int sua(Imei_DM imei) {
        String sql = "update Imei\n"
                + "set SO_Imei = ?\n"
                + "where ID = ?";
        return DBConnection.ExcuteDungna(sql, imei.getImei(), imei.getiDImei());
    }

    @Override
    public List<Imei_DM> getAllImeis() {
        List<Imei_DM> list = new ArrayList<>();
        String sql = "select * from Imei where TinhTrang = 0";
        try {
            ResultSet rs = DBConnection.getDataFromQuery(sql);
            while (rs.next()) {
                String id = rs.getString("ID");
                String imei = rs.getString("SO_Imei");
                Imei_DM imei1 = new Imei_DM(id, imei, null);
                list.add(imei1);
            }
            return list;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return list;
        }
    }

    @Override
    public List<Imei_DM> getAllImeisofSanPhan(String idsp) {
        List<Imei_DM> list = new ArrayList<>();
        String sql = "select * \n"
                + "from Imei \n"
                + "where TinhTrang = 1 and IDCTSP = ?";
        try {
            ResultSet rs = DBConnection.getDataFromQuery(sql, idsp);
            while (rs.next()) {
                String id = rs.getString("ID");
                String imei = rs.getString("SO_Imei");
                Imei_DM imei1 = new Imei_DM(id, imei, null);
                list.add(imei1);
            }
            return list;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return list;
        }
    }

    @Override
    public int xoaImei() {
        String sql = "delete from Imei where TinhTrang = 0";
        return DBConnection.ExcuteDungna(sql);
    }

    @Override
    public List<Imei_DM> getAllImeisofHD(String idHD) {
        List<Imei_DM> list = new ArrayList<>();
        String sql = "select Imei.ID,Imei.SO_Imei\n"
                + "from Imei join HOA_DON_CT on Imei.ID = HOA_DON_CT.IDimei\n"
                + "          join HOA_DON on HOA_DON.ID = HOA_DON_CT.ID_HOA_DON\n"
                + "where HOA_DON.ID = ?";
        try {
            ResultSet rs = DBConnection.getDataFromQuery(sql, idHD);
            while (rs.next()) {
                String id = rs.getString("ID");
                String imei = rs.getString("SO_Imei");
                Imei_DM imei1 = new Imei_DM(imei, imei, null);
                list.add(imei1);
            }
            return list;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return list;
        }
    }

    @Override
    public List<Imei_DM> getAll() {
        List<Imei_DM> list = new ArrayList<>();
        String sql = "select * from Imei";
        try {
            ResultSet rs = DBConnection.getDataFromQuery(sql);
            while (rs.next()) {
                String id = rs.getString("ID");
                String imei = rs.getString("SO_Imei");
                Imei_DM imei1 = new Imei_DM(id, imei, null);
                list.add(imei1);
            }
            return list;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return list;
        }
    }

}
