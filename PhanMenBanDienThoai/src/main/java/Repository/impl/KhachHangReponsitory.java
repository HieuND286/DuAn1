/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository.impl;

import DomainModels.KhachHang_DM;
import Repository.IKhachHangRepossitory;
import Utilities.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author ThisPC
 */
public class KhachHangReponsitory implements IKhachHangRepossitory {

    @Override
    public boolean them(KhachHang_DM kh) {
        String sql = "insert into KhachHang(MA,SDT,HOTEN,GIOITINH,Email,DC,ngaytao) \n"
                + "values (?,?,?,?,?,?,?)";
        try (Connection con = DBConnection.openDbConnection(); PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setObject(1, kh.getMa());
            ps.setObject(2, kh.getSdt());
            ps.setObject(3, kh.getHoTen());
            ps.setObject(4, kh.getGioiTinh());
            ps.setObject(5, kh.geteMail());
            ps.setObject(6, kh.getDiaChi());
            ps.setObject(7, kh.getNgayTao());
            

            ps.execute();
            return true;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return false;
    }

    @Override
    public boolean sua(KhachHang_DM kh) {
        String sql = "update  KhachHang set MA=?,SDT=?,HOTEN=?,GIOITINH=? where idkh=? \n";
        try (Connection con = DBConnection.openDbConnection(); PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setObject(1, kh.getMa());
            ps.setObject(2, kh.getSdt());
            ps.setObject(3, kh.getHoTen());
            ps.setObject(4, kh.getGioiTinh());
            ps.setObject(5, kh.getId());
            ps.execute();
            return true;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return false;
    }

    @Override
    public ArrayList<KhachHang_DM> getAllCpus() {
        ArrayList<KhachHang_DM> listKH = new ArrayList<>();
        String sql = "select KhachHang.*, COUNT(HOA_DON.ID) AS 'SOLHD'\n"
                + "                from KhachHang LEFT join HOA_DON on KhachHang.IDKH = HOA_DON.IDKH\n"
                + "                GROUP BY KhachHang.IDKH,KhachHang.Ma,KhachHang.HOTEN,\n"
                + "                KhachHang.SDT,KhachHang.GIOITINH,KhachHang.DiaChi,\n"
                + "				KhachHang.Email,KhachHang.DC,KhachHang.ngaytao";
        try {
            ResultSet rs = DBConnection.getDataFromQuery(sql);
            while (rs.next()) {
                String id = rs.getString("IDKH");
                String ma = rs.getString("MA");
                String sdt = rs.getString("SDT");
                String HoTen = rs.getString("HoTen");
                int GioiTinh = rs.getInt("GIOITINH");
                String Emai = rs.getString("Email");
                String DC = rs.getString("DC");
                String ngayTao = rs.getString("ngaytao");
                int soLuongHoaDon = rs.getInt("SOLHD");

                KhachHang_DM kh = new KhachHang_DM(id, ma, sdt, HoTen,
                        GioiTinh, soLuongHoaDon,Emai,DC,ngayTao);
                listKH.add(kh);
            }
            return listKH;
        } catch (Exception e) {
            e.printStackTrace();
            return listKH;
        }
    }

    @Override
    public ArrayList<KhachHang_DM> getSea(String Ma) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int getsl(String idkh) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
