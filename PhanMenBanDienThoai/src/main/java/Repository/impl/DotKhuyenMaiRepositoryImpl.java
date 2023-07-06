/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository.impl;

import java.util.ArrayList;
import java.util.List;
import DomainModels.DotKhuyenMai;
import Repository.IDotKhuyenMaiRepository;
import Utilities.DBConnection;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import DomainModels.NhanVien_DM;
import DomainModels.SanPham_DM;

/**
 *
 * @author Admin
 */
public class DotKhuyenMaiRepositoryImpl implements IDotKhuyenMaiRepository {

    @Override
    public List<DotKhuyenMai> getAllDotKhuyenMai() {
        List<DotKhuyenMai> ds = new ArrayList<>();
        String sql = "select dkm.ID, dkm.LoaiMa, dkm.MaVoucher, dkm.GiaTri, dkm.TenKhuyenMai,dkm.NgayBatDau,\n"
                + "dkm.NgayKetThuc, dkm.trangthai\n"
                + "from DotKhuyenMai dkm";
        try ( Connection con = DBConnection.openDbConnection();  PreparedStatement ps = con.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {

                DotKhuyenMai dotKM = new DotKhuyenMai(rs.getString(1),
                        null,
                        rs.getString(2),
                        rs.getString(3),
                        rs.getInt(4),
                        rs.getString(5),
                        rs.getDate(6),
                        rs.getDate(7),
                        rs.getInt(8));
                ds.add(dotKM);
            }
            return ds;
        } catch (Exception e) {
            e.printStackTrace();

        }
        return ds;
    }

    @Override
    public boolean add(DotKhuyenMai dkm) {
        String sql = "INSERT INTO DotKhuyenMai (LoaiMa,"
                + " MaVoucher,"
                + " GiaTri, "
                + "TenKhuyenMai, "
                + "NgayBatDau,"
                + " NgayketThuc,"
                + " trangthai)\n"
                + "VALUES (?,"
                + "?,"
                + "?,"
                + "?,"
                + "?,"
                + "?,"
                + "?)";
        try ( Connection con = DBConnection.openDbConnection();  PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setObject(1, dkm.getLoaiMa());
            ps.setObject(2, dkm.getMaVoucher());
            ps.setObject(3, dkm.getGiaTri());
            ps.setObject(4, dkm.getTenKM());
            ps.setObject(5, dkm.getNgaybatDau());
            ps.setObject(6, dkm.getNgayKetThuc());
            ps.setObject(7, dkm.getTrangThai());
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean update(DotKhuyenMai dkm, String maVoucher) {
        try {
            Connection con = DBConnection.openDbConnection();
            String sql = "UPDATE DotKhuyenMai\n"
                    + "                    SET LoaiMa =? ,\n"
                    + "                     GiaTri =?,\n"
                    + "                     TenKhuyenMai =?,\n"
                    + "                     NgayBatDau =?,\n"
                    + "                     NgayketThuc =?,\n"
                    + "                     trangthai =? where MaVoucher = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, dkm.getLoaiMa());
            ps.setString(7, dkm.getMaVoucher());
            ps.setInt(2, dkm.getGiaTri());
            ps.setString(3, dkm.getTenKM());
            ps.setDate(4, (Date) dkm.getNgaybatDau());
            ps.setDate(5, (Date) dkm.getNgayKetThuc());
            ps.setInt(6, dkm.getTrangThai());
            ps.execute();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

//    @Override
//    public List<DotKhuyenMai> sort() {
//        List<DotKhuyenMai> listDotKhuyenmai = new ArrayList<>();
//        String sql = "select dkm.ID, dkm.LoaiMa, dkm.MaVoucher, dkm.GiaTri, dkm.TenKhuyenMai,\n"
//                + "dkm.NgayKetThuc, dkm.trangthai,sp.ID,sp.Ten,nv.ID,nv.HO_TEN\n"
//                + "from DotKhuyenMai dkm\n"
//                + " inner join SANPHAM sp on sp.ID = dkm.IDSP\n"
//                + " inner join NHAN_VIEN nv on dkm.IDNV = nv.ID ORDER BY Ten DESC";
//        try ( Connection con = DBConnection.openDbConnection();  PreparedStatement ps = con.prepareStatement(sql)) {
//            ResultSet rs = ps.executeQuery();
//            while (rs.next()) {
//                SanPham sanPham = new SanPham(rs.getString(9), rs.getString(10));
//                NhanVien nv = new NhanVien(rs.getString(11), rs.getString(12)
//                );
//                DotKhuyenMai dotKM = new DotKhuyenMai(rs.getString(1),
//                        nv,
//                        sanPham,
//                        rs.getString(2),
//                        rs.getString(3),
//                        rs.getInt(4),
//                        rs.getString(5),
//                        rs.getDate(6),
//                        rs.getDate(7),
//                        rs.getInt(8));
//                listDotKhuyenmai.add(dotKM);
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//            return null;
//        }
//        return listDotKhuyenmai;
//    }
}
