/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository.impl;

import DomainModels.MauSac_DM;
import Repository.IMauSacRepository;
import Utilities.DBConnection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author admin
 */
public class MauSacRepo implements IMauSacRepository {

    @Override
    public int them(MauSac_DM mauSac) {
        String sql = "insert into MauSac (Ma,Ten)\n"
                + "values (?,?)";
        return DBConnection.ExcuteDungna(sql, mauSac.getMaMS(),
                mauSac.getTenMS());
    }

    @Override
    public int sua(MauSac_DM mauSac) {
        String sql = "update MauSac\n"
                + "set Ma = ?, Ten = ?\n"
                + "where IDMS = ?";
        return DBConnection.ExcuteDungna(sql, mauSac.getMaMS(),
                mauSac.getTenMS(), mauSac.getIdMS());
    }

    @Override
    public List<MauSac_DM> getAllMauSacs() {
        List<MauSac_DM> list = new ArrayList<>();
        String sql = "select * from MauSac where TinhTrang = 0";
        try {
            ResultSet rs = DBConnection.getDataFromQuery(sql);
            while (rs.next()) {
                String id = rs.getString("ID");
                String ma = rs.getString("Ma");
                String Ten = rs.getString("ten");
                MauSac_DM mauSac = new MauSac_DM(id, ma, Ten);
                list.add(mauSac);
            }
            return list;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return list;
        }
    }

    @Override
    public List<MauSac_DM> getMauSacsbyMa(String ma) {
        List<MauSac_DM> list = new ArrayList<>();
        String sql = "select * from HeDieuHanh where Ma = ?";
        try {
            ResultSet rs = DBConnection.getDataFromQuery(sql);
            while (rs.next()) {
                String id = rs.getString("IDMS");
                String ma1 = rs.getString("Ma");
                String Ten = rs.getString("ten");
                MauSac_DM mauSac = new MauSac_DM(id, ma, Ten);
                list.add(mauSac);
            }
            return list;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return list;
        }
    }

    @Override
    public int xoa(MauSac_DM mauSac) {
        String sql = "delete from MauSac where ID = ?";
        return DBConnection.ExcuteDungna(sql, mauSac.getIdMS());
    }

    @Override
    public int xoaTT(MauSac_DM mauSac_DM) {
        String sql = "update MauSac\n"
                + "set TinhTrang = 1\n"
                + "where ID = ?";
        return DBConnection.ExcuteDungna(sql, mauSac_DM.getIdMS());
    }

    @Override
    public int hoanLai(MauSac_DM mauSac_DM) {
        String sql = "update MauSac\n"
                + "set TinhTrang = 0\n"
                + "where ID = ?";
        return DBConnection.ExcuteDungna(sql, mauSac_DM.getIdMS());
    }

    @Override
    public List<MauSac_DM> getAllDeleteMauSacs() {
        List<MauSac_DM> list = new ArrayList<>();
        String sql = "select * from MauSac where TinhTrang = 1";
        try {
            ResultSet rs = DBConnection.getDataFromQuery(sql);
            while (rs.next()) {
                String id = rs.getString("ID");
                String ma = rs.getString("Ma");
                String Ten = rs.getString("ten");
                MauSac_DM mauSac = new MauSac_DM(id, ma, Ten);
                list.add(mauSac);
            }
            return list;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return list;
        }
    }

}
