
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import DomainModels.SanPhamKM;
import Repository.ISanPhamKM;
import Utilities.DBConnection;
import ViewModels.SanPhamKM_VM;

/**
 *
 * @author Admin
 */
public class SanPhamKMRepositoryImpl implements ISanPhamKM{

    @Override
    public boolean add(SanPhamKM_VM sanPhamKM) {
        String sql = "INSERT INTO SanPhamKM (IDSANPHAM, IDDOTKHUYENMAI) VALUES (?,?)";
        try ( Connection con = DBConnection.openDbConnection();  PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setObject(1, sanPhamKM.getSanPham().getIdSP());
            ps.setObject(2, sanPhamKM.getDotKhuyenMai().getIdDKM());
                    ps.executeUpdate();
             return true;
        } catch (Exception e) {
            e.printStackTrace();
           
        }
         return false;
    }
    
}
