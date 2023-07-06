/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository.impl;

import DomainModels.SanPham_DM;
import Repository.ISanPhamRepository;
import Utilities.DBConnection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author admin
 */
public class SanPhamRepo implements ISanPhamRepository {

    @Override
    public int them(SanPham_DM sanPham) {
        String sql = "insert into SanPham (Ma,Ten)\n"
                + "values (?,?)";
        return DBConnection.ExcuteDungna(sql, sanPham.getMaSP(), sanPham.getTenSP());
    }

    @Override
    public int sua(SanPham_DM sanPham) {
        String sql = "update SanPham\n"
                + "set Ma = ?, Ten = ?\n"
                + "where ID = ?";
        return DBConnection.ExcuteDungna(sql, sanPham.getMaSP(), sanPham.getTenSP(), sanPham.getIdSP());
    }

    @Override
    public List<SanPham_DM> getAllSanPhams() {
        List<SanPham_DM> list = new ArrayList<>();
        String sql = "select * from SanPham where TinhTrang = 0";
        try {
            ResultSet rs = DBConnection.getDataFromQuery(sql);
            while (rs.next()) {
                String id = rs.getString("ID");
                String ma = rs.getString("Ma");
                String Ten = rs.getString("Ten");
                SanPham_DM sanPham = new SanPham_DM(id, ma, Ten);
                list.add(sanPham);
            }
            return list;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return list;
        }
    }

    @Override
    public List<SanPham_DM> getSanPhambyMa(String ma) {
        List<SanPham_DM> list = new ArrayList<>();
        String sql = "select * from SanPham where Ma = ?";
        try {
            ResultSet rs = DBConnection.getDataFromQuery(sql, ma);
            while (rs.next()) {
                String id = rs.getString("ID");
                String ma1 = rs.getString("Ma");
                String Ten = rs.getString("Ten");
                SanPham_DM sanPham = new SanPham_DM(id, ma1, Ten);
                list.add(sanPham);
            }
            return list;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return list;
        }
    }

    @Override
    public int xoa(SanPham_DM sanPham) {
        String sql = "delete from SanPham where ID = ?";
        return DBConnection.ExcuteDungna(sql, sanPham.getIdSP());
    }

    @Override
    public int xoaTT(SanPham_DM sanPham_DM) {
        String sql = "update SanPham\n"
                + "set TinhTrang = 1\n"
                + "where ID = ?";
        return DBConnection.ExcuteDungna(sql, sanPham_DM.getIdSP());
    }

    @Override
    public int hoanLai(SanPham_DM sanPham_DM) {
        String sql = "update SanPham\n"
                + "set TinhTrang = 0\n"
                + "where ID = ?";
        return DBConnection.ExcuteDungna(sql, sanPham_DM.getIdSP());
    }

    @Override
    public List<SanPham_DM> getAllDeleteSanPhams() {
        List<SanPham_DM> list = new ArrayList<>();
        String sql = "select * from SanPham where TinhTrang = 1";
        try {
            ResultSet rs = DBConnection.getDataFromQuery(sql);
            while (rs.next()) {
                String id = rs.getString("ID");
                String ma = rs.getString("Ma");
                String Ten = rs.getString("Ten");
                SanPham_DM sanPham = new SanPham_DM(id, ma, Ten);
                list.add(sanPham);
            }
            return list;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return list;
        }
    }

   @Override
    public List<SanPham_DM> getAllSanPhamss() {
        List<SanPham_DM> list = new ArrayList<>();
        String sql = "select * from SanPham";
        try {
            ResultSet rs = DBConnection.getDataFromQuery(sql);
            while (rs.next()) {
                String id = rs.getString("IDSP");
                String ma = rs.getString("Ma");
                String Ten = rs.getString("DungLuong");
                SanPham_DM sanPham = new SanPham_DM(id, ma, Ten);
                list.add(sanPham);
            }
            return list;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return list;
        }
    }

    @Override
    public List<SanPham_DM> getSanPhambyMas(String ma) {
        List<SanPham_DM> list = new ArrayList<>();
        String sql = "select * from SanPham where Ma = ?";
        try {
            ResultSet rs = DBConnection.getDataFromQuery(sql, ma);
            while (rs.next()) {
                String id = rs.getString("ID");
                String ma1 = rs.getString("Ma");
                String Ten = rs.getString("Ten");
                SanPham_DM sanPham = new SanPham_DM(id, ma1, Ten);
                list.add(sanPham);
            }
            return list;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return list;
        }
    }
    
    
     @Override
    public List<SanPham_DM> getSanPhambyTen(String ten) {
        List<SanPham_DM> list = new ArrayList<>();
        String sql = "select * from SanPham where Ten = ?";
        try {
            ResultSet rs = DBConnection.getDataFromQuery(sql, ten);
            while (rs.next()) {
                String id = rs.getString("ID");
                String ma1 = rs.getString("Ma");
                String Ten = rs.getString("Ten");
                SanPham_DM sanPham = new SanPham_DM(id, ma1, Ten);
                list.add(sanPham);
            }
            return list;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return list;
        }
    }

}
