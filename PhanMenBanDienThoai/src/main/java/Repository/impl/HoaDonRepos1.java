/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository.impl;


import DomainModels.HoaDon_DM1;
import Repository.IHoaDonRepositori1;
import Utilities.DBConnection;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Acer
 */
public class HoaDonRepos1 implements IHoaDonRepositori1{

    @Override
    public ArrayList<HoaDon_DM1> getAll() {
        ArrayList<HoaDon_DM1> list = new ArrayList<>();
        String sql = "select * from Hoa_Don where hinhthucnhan=0 ";
        try {
            ResultSet rs = DBConnection.getDataFromQuery(sql);
            while (rs.next()) {
                String idHD = rs.getString("ID");
                String idNV = rs.getString("IDNV");
                String idKH = rs.getString("IDKH");
                String maHD = rs.getString("Ma");
                int hinhThucNhan = rs.getInt("hinhthucnhan");
                String ngayTao = rs.getString("Ngay_Tao");
                String ngayThanhToan = rs.getString("Ngay_Thanh_Toan");
                int TrangThai = rs.getInt("Tinh_Trang");
                String mota= rs.getString("Mo_ta");
                
                
                  
                HoaDon_DM1 hd = new HoaDon_DM1(idHD, idNV, idKH, maHD, hinhThucNhan, ngayTao, ngayThanhToan, TrangThai, mota);
                list.add(hd);
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            return list;
        }
    }
    

}
