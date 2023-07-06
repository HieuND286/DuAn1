/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository.impl;

import DomainModels.HoaDon_DM;
import DomainModels.KhachHang_DM;
import DomainModels.NhanVien_DM;
import Repository.IHoaDonRepository;
import Utilities.DBConnection;
import java.util.List;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author admin
 */
public class HoaDonRepository implements IHoaDonRepository {

    @Override
    public int them(HoaDon_DM hoaDon_DM) {
        String sql = "insert into HOA_DON (IDNV,IDKH,MA,NGAY_TAO,TINH_TRANG,MO_TA,HinhThucNhan)\n"
                + "values (?,?,?,?,?,?,?)";
        return DBConnection.ExcuteDungna(sql, hoaDon_DM.getNhanVien_DM().getIDNV(),
                hoaDon_DM.getKhachHang_DM().getId(), hoaDon_DM.getMa(), hoaDon_DM.getNgayTao(),
                hoaDon_DM.getTinhTrang(), hoaDon_DM.getMoTa(), hoaDon_DM.getHinhThucNhan()
        );
    }

    @Override
    public int sua(HoaDon_DM hoaDon_DM) {
        String sql = "update HOA_DON\n"
                + "set IDNV = ?,IDKH  = ?,MA  = ? ,NGAY_TAO  = ?,TINH_TRANG  = ?,MO_TA  = ?,HinhThucNhan  = ?\n"
                + "where ID = ?";
        return DBConnection.ExcuteDungna(sql, hoaDon_DM.getNhanVien_DM().getIDNV(),
                hoaDon_DM.getKhachHang_DM().getId(), hoaDon_DM.getMa(), hoaDon_DM.getNgayTao(),
                hoaDon_DM.getTinhTrang(), hoaDon_DM.getMoTa(), hoaDon_DM.getHinhThucNhan(), hoaDon_DM.getId()
        );
    }

    @Override
    public int thanhToan(HoaDon_DM hoaDon_DM) {
        String sql = "update HOA_DON\n"
                + "set TINH_TRANG  = 1\n"
                + "where ID = ?";
        return DBConnection.ExcuteDungna(sql, hoaDon_DM.getId()
        );
    }

    @Override
    public List<HoaDon_DM> getAllDTT() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<HoaDon_DM> getAllHD() {
        List<HoaDon_DM> list = new ArrayList<>();
        String sql = "select HOA_DON.ID,HOA_DON.MA,CONVERT(varchar,HOA_DON.NGAY_TAO,103) as 'NGAY_TAO',HOA_DON.TINH_TRANG,HOA_DON.HinhThucNhan,\n"
                + "NhanVien.IDNV,NhanVien.HoVaTen,KhachHang.IDKH,KhachHang.HOTEN,KhachHang.SDT,HOA_DON.MO_TA\n"
                + "from HOA_DON left join NhanVien on HOA_DON.IDNV = NhanVien.IDNV left  join KhachHang on HOA_DON.IDKH = KhachHang.IDKH\n"
                + "order by HOA_DON.NGAY_TAO desc\n";
        try {
            ResultSet rs = DBConnection.getDataFromQuery(sql);
            while (rs.next()) {
                String id = rs.getString(1);
                String ma = rs.getString(2);
                String ngayTao = rs.getString(3);
                int tinhTrang = rs.getInt(4);
                int hTN = rs.getInt(5);
                String mt = rs.getString(11);
                NhanVien_DM nhanVien_DM = new NhanVien_DM(rs.getString(6), null,
                        rs.getString(7), 0, null, null, null,
                        0, null, null, 0);
                KhachHang_DM khachHang_DM = new KhachHang_DM(rs.getString(8),
                        null, rs.getString(10), rs.getString(9),
                        0, 0,null,null,null);
                HoaDon_DM hoaDon_DM = new HoaDon_DM(id, ma, nhanVien_DM, khachHang_DM, ngayTao, null, tinhTrang, mt, hTN);
                list.add(hoaDon_DM);
            }
            return list;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return list;
        }
    }

    @Override
    public List<HoaDon_DM> getAllHDTCH() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<HoaDon_DM> getAllHDShip() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
