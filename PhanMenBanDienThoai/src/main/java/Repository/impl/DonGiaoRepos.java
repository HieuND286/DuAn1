/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository.impl;

import DomainModels.DonGiao_DM;
import Repository.IDonGiaoRepository;
import Utilities.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Acer
 */
public class DonGiaoRepos implements IDonGiaoRepository{
  
    @Override
    public boolean them(DonGiao_DM donGiao) {
        Connection conn= DBConnection.openDbConnection();
        try {

            String sql = "Insert into DON_GIAO(ID_HOA_DON,NGUOI_NHAN,SDT_NN,NGUOI_GIAO,SDT_NG,NGAY_DAO,NGAY_NHAN,DIA_CHI,TINH_TRANG) values(?,?,?,?,?,?,?,?,?)";
            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setString(1, donGiao.getIdHD());
            ps.setString(2, donGiao.getHoTenNguoiNhan());
             ps.setString(3, donGiao.getSdtNguoiNhan());
              ps.setString(4, donGiao.getHoTenShipper());
               ps.setString(5, donGiao.getSdtShipper());
               ps.setString(6, donGiao.getNgayGiao());
               ps.setString(7, donGiao.getNgayNhan());
                  ps.setString(8, donGiao.getDiaChi());
                     ps.setInt(9, donGiao.getTrangThai());
               
               
           
              
                 
                 

            ps.execute();
            System.out.println("Thành công");
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Thất bại");
            return false;
        }
    }

    @Override
    public boolean sua(DonGiao_DM donGiao) {
Connection conn= DBConnection.openDbConnection();
        try {

            String sql = "update DON_GIAO set ID_HOA_DON=?,NGUOI_NHAN=?,SDT_NN=?,NGUOI_GIAO=?,SDT_NG=?,NGAY_DAO=?,NGAY_NHAN=?,DIA_CHI=?,TINH_TRANG=? where ID=?";
            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setString(1, donGiao.getIdHD());
            ps.setString(2, donGiao.getHoTenNguoiNhan());
             ps.setString(3, donGiao.getSdtNguoiNhan());
              ps.setString(4, donGiao.getHoTenShipper());
               ps.setString(5, donGiao.getSdtShipper());
               ps.setString(6, donGiao.getNgayGiao());
               ps.setString(7, donGiao.getNgayNhan());
                  ps.setString(8, donGiao.getDiaChi());
                     ps.setInt(9, donGiao.getTrangThai());
                      ps.setString(10, donGiao.getIdDG());

            ps.execute();
            System.out.println("Thành công");
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Thất bại");
            return false;
        }    }

    @Override
    public ArrayList<DonGiao_DM> getAllDonGiao() {

        ArrayList<DonGiao_DM> ds = new ArrayList<>();
        try {

            String sql = "select * from DON_GIAO";
             ResultSet rs = DBConnection.getDataFromQuery(sql);
            
            while (rs.next()) {
              
                String idDG = rs.getString("ID");
                String idHD = rs.getString("ID_HOA_DON");
                String HTNN = rs.getString("NGUOI_NHAN");
                String SDTNN = rs.getString("SDT_NN");
                String HTSP = rs.getString("NGUOI_GIAO");
                String SDTSP = rs.getString("SDT_NG");
                 String NgayGiao = rs.getString("NGAY_DAO");
                String NgayNhan = rs.getString("NGAY_NHAN");
                  String diaChi = rs.getString("DIA_CHI");
                int tinhTrang = rs.getInt("TINH_TRANG");

                DonGiao_DM dg = new DonGiao_DM(idDG, idHD, HTNN, SDTNN, HTSP, SDTSP, NgayGiao, NgayNhan, diaChi, tinhTrang);
                ds.add(dg);
            }
             return ds;
        } catch (Exception e) {
            e.printStackTrace();
            
        }
        return ds;
    }    
    
    @Override
    public ArrayList<DonGiao_DM> getDonGiaoByMa(String ma) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
