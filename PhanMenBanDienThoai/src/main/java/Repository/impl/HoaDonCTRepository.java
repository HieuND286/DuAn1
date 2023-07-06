/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository.impl;

import DomainModels.ChiTietSP_DM;
import DomainModels.DongSP_DM;
import DomainModels.HoaDon_DM;
import DomainModels.Hoa_Don_CT_DM;
import DomainModels.Imei_DM;
import DomainModels.MauSac_DM;
import DomainModels.Ram_DM;
import DomainModels.Rom_DM;
import DomainModels.SanPham_DM;
import Repository.IHoaDonCTRepository;
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
public class HoaDonCTRepository implements IHoaDonCTRepository {

    @Override
    public int them(Hoa_Don_CT_DM hdctdm) {
        String sql = "INSERT INTO [dbo].[HOA_DON_CT] (ID_HOA_DON,DON_GIA,IDimei)\n"
                + "     VALUES(?,?,?)";
        return DBConnection.ExcuteDungna(sql, hdctdm.getHoaDon_DM().getId(),
                hdctdm.getDonGia(), hdctdm.getImei_DM().getiDImei());
    }

    @Override
    public List<Hoa_Don_CT_DM> getAllHDCT(String id) {
        List<Hoa_Don_CT_DM> list = new ArrayList<>();
        String sql = "select \n"
                + "HOA_DON.ID,\n"
                + "CHiTietSP.ID,\n"
                + "CHiTietSP.MaSSP, \n"
                + "SanPham.ID,SanPham.Ten,\n"
                + "DongSP.ID,DongSP.Ten,\n"
                + "MauSac.ID,MauSac.Ten,\n"
                + "Ram.ID,Ram.DUNGLUONG,\n"
                + "Rom.ID,Rom.DUNGLUONG,COUNT (CHiTietSP.ID),HOA_DON_CT.DON_GIA,CHiTietSP.HinhAnh,CHiTietSP.GiaBan\n"
                + "from HOA_DON_CT left join Imei on HOA_DON_CT.IDimei = Imei.ID\n"
                + " left join HOA_DON on HOA_DON_CT.ID_HOA_DON = HOA_DON.ID\n"
                + " left join CHiTietSP on Imei.IDCTSP = CHiTietSP.ID\n"
                + " left join  SanPham on SanPham.ID = CHiTietSP.IDSP\n"
                + " left join  MauSac on MauSac.ID = CHiTietSP.IDMS\n"
                + " left join  DongSP on DongSP.ID = CHiTietSP.IDDongSP\n"
                + " left join  Ram on Ram.ID = CHiTietSP.IDRam\n"
                + " left join  Rom on Rom.ID = CHiTietSP.IDRom\n"
                + "where HOA_DON.ID = ?\n"
                + "group by CHiTietSP.MaSSP, HOA_DON_CT.DON_GIA,HOA_DON.ID,CHiTietSP.ID,SanPham.ID,SanPham.Ten,\n"
                + "DongSP.ID,DongSP.Ten,MauSac.ID,MauSac.Ten,Ram.ID,Ram.DUNGLUONG,Rom.ID,Rom.DUNGLUONG,CHiTietSP.HinhAnh,CHiTietSP.GiaBan";

        try {
            ResultSet rs = DBConnection.getDataFromQuery(sql, id);
            while (rs.next()) {
                HoaDon_DM hoaDon_DM = new HoaDon_DM(rs.getString(1));
                SanPham_DM sanPham_DM = new SanPham_DM(rs.getString(4),
                        null, rs.getString(5));
                DongSP_DM dongSP_DM = new DongSP_DM(rs.getString(6),
                        id, rs.getString(7));
                MauSac_DM mauSac_DM = new MauSac_DM(rs.getString(8),
                        null, rs.getString(9));
                Ram_DM ram_DM = new Ram_DM(rs.getString(10),
                        null, rs.getString(11));
                Rom_DM rom_DM = new Rom_DM(rs.getString(12),
                        null, rs.getString(13));
                int soLuong = rs.getInt(14);
                double donGia = rs.getDouble(15);
                ChiTietSP_DM chiTietSP_DM = new ChiTietSP_DM(rs.getString(2), rs.getString(3),
                        sanPham_DM, null, null,
                        dongSP_DM, null, rom_DM, ram_DM,
                        mauSac_DM, null, null, rs.getString(16), 0,
                        0, 0, rs.getDouble(17));
                Imei_DM imei_DM = new Imei_DM(null, null, chiTietSP_DM);
                Hoa_Don_CT_DM hdctdm = new Hoa_Don_CT_DM(null, imei_DM, hoaDon_DM, soLuong, donGia);
                list.add(hdctdm);
            }
            return list;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return list;
        }
    }

    @Override
    public int xoa(String idHd, String idImei) {
        String sql = "delete \n"
                + "from HOA_DON_CT\n"
                + "where HOA_DON_CT.ID_HOA_DON = ? and HOA_DON_CT.IDimei = ?";
        return DBConnection.ExcuteDungna(sql, idHd, idImei);
    }



}
