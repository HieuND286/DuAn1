/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository.impl;

import DomainModels.HoaDonCTDomainModel;
import DomainModels.HoaDonDomainModel;
import DomainModels.GoiBaoHanhDomainModel;
import Repository.IPhieuBaoHanhRepository;
import Utilities.DBConnection;
import DomainModels.PhieuBaoHanhDomainModel;
import ViewModels.GoiBaoHanhviewModel;
import ViewModels.HoaDonCTViewModel;
import ViewModels.HoaDonViewModel;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DELL
 */
public class PhieuBaoHanhrepo implements IPhieuBaoHanhRepository {

    @Override
    public ArrayList<PhieuBaoHanhDomainModel> getAll() {
        ArrayList<PhieuBaoHanhDomainModel> d = new ArrayList<>();
        try {
            String sqlString = "select*from GoiBaoHanh "
                    + "join PhieuBaoHanh on GoiBaoHanh.id =PhieuBaoHanh.idGoiBaoHanh "
                    + "join HOA_DON on PhieuBaoHanh.IDHD = HOA_DON.ID "
                    + "join HOA_DON_CT on HOA_DON_CT.ID_HOA_DON=HOA_DON.ID";
            ResultSet rs = DBConnection.getDataFromQuery(sqlString);
            while (rs.next()) {
                GoiBaoHanhDomainModel gbh = new GoiBaoHanhDomainModel(rs.getString(1), rs.getString(2), rs.getInt(3));
                HoaDonCTDomainModel HDCT = new HoaDonCTDomainModel(rs.getString(22), rs.getString(23), rs.getString(24), rs.getString(25), rs.getString(26), rs.getInt(27), rs.getInt(28));
                HoaDonDomainModel hd = new HoaDonDomainModel(rs.getString(14), rs.getString(15), rs.getString(16), rs.getString(17), rs.getDate(18), rs.getDate(19), rs.getInt(20));
                PhieuBaoHanhDomainModel pbh = new PhieuBaoHanhDomainModel(rs.getString(4), hd, gbh, HDCT, rs.getString(7), rs.getDate(8), rs.getDate(9), rs.getInt(10), rs.getString(11), rs.getString(12), rs.getString(13));
                d.add(pbh);
            }
            return d;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }
    }

    @Override
    public int add(PhieuBaoHanhDomainModel p) {
        String sqlString = " insert into PhieuBaoHanh (idGoiBaoHanh,IDHD , TenKhachHang, NgayBatDau, NGayKetThuc ,TrangThai, DiaChi , SdtCH) values (?,?,?,?,?,?,?,?);";
        return DBConnection.ExcuteDungna(sqlString, p.getGoiBaoHanhDomainModel().getId(), p.getHoaDonDomainModel().getIdHoaDon(), p.getTen(), p.getNgayBatDau(), p.getNGayKetThuc(), p.getTrangThai(), p.getDiaChi(), p.getSdtCH());
    }

    @Override
    public int update(PhieuBaoHanhDomainModel p) {
        String sqlString = " update PhieuBaoHanh set  idGoiBaoHanh=? ,IDHD =?,TenKhachHang = ?,NgayBatDau = ?,NGayKetThuc = ?,TrangThai = ?,Mota = ? where ID = ? ;";
        return DBConnection.ExcuteDungna(sqlString, p.getGoiBaoHanhDomainModel().getId(), p.getHoaDonDomainModel().getIdHoaDon(), p.getTen(), p.getNgayBatDau(), p.getNGayKetThuc(), p.getTrangThai(), p.getMota(), p.getIDPBH());

    }

    @Override
    public int delete(PhieuBaoHanhDomainModel p) {
        String sql = "DELETE FROM phieubaohanh WHERE IdPBH = ?";
        return DBConnection.ExcuteDungna(sql, p.getIDPBH());
    }

    @Override
    public ArrayList<HoaDonDomainModel> getAllHD() {
        ArrayList<HoaDonDomainModel> p = new ArrayList<>();
        String sqlString = "select*from Hoa_Don ";
        try {
            ResultSet rs = DBConnection.getDataFromQuery(sqlString);
            while (rs.next()) {

                HoaDonDomainModel d = new HoaDonDomainModel(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getDate(5), rs.getDate(6), rs.getInt(7));
                p.add(d);
            }
            return p;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }
    }

    @Override
    public ArrayList<HoaDonCTDomainModel> getAllHDCT(String id) {
        ArrayList<HoaDonCTDomainModel> p = new ArrayList<>();
        String sqlString = "select id,id_ctsp,id_hoa_don,id_dmk,id_pbh,so_luong,Don_Gia from Hoa_Don_CT where ID_HOA_DON=?";

        try {
            ResultSet rs = DBConnection.getDataFromQuery(sqlString, id);
            while (rs.next()) {
                HoaDonCTDomainModel d = new HoaDonCTDomainModel(rs.getString(1), rs.getString(3), rs.getString(2), rs.getString(4), rs.getString(5), rs.getInt(6), rs.getInt(7));
                p.add(d);
            }
            return p;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;

        }
    }

    @Override
    public ArrayList<HoaDonCTDomainModel> getAllHDCT() {
        ArrayList<HoaDonCTDomainModel> p = new ArrayList<>();
        String sqlString = "select id,id_ctsp,id_hoa_don,id_dmk,id_pbh,so_luong,Don_Gia from Hoa_Don_CT ";

        try {
            ResultSet rs = DBConnection.getDataFromQuery(sqlString);
            while (rs.next()) {
                HoaDonCTDomainModel d = new HoaDonCTDomainModel(rs.getString(1), rs.getString(3), rs.getString(2), rs.getString(4), rs.getString(5), rs.getInt(6), rs.getInt(7));
                p.add(d);
            }
            return p;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;

        }
    }

    @Override
    public int updateHDCT(PhieuBaoHanhDomainModel p) {
        String sqlString = " update Hoa_Don_CT set IDPBH=? where ID = ?";
        return DBConnection.ExcuteDungna(sqlString, p.getIDPBH(), p.getHoaDonCTDomainModel().getIDHDCT());

    }

}
