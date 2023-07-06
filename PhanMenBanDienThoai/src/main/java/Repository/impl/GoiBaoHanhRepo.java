/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository.impl;

import Repository.IGoiBaoHanhRepository;
import Utilities.DBConnection;
import DomainModels.GoiBaoHanhDomainModel;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public class GoiBaoHanhRepo implements IGoiBaoHanhRepository {

    @Override
    public ArrayList<GoiBaoHanhDomainModel> getAll() {
        ArrayList<GoiBaoHanhDomainModel> ghb = new ArrayList<>();
        try {
            String sqlString = "select*from goiBaoHanh";
            ResultSet rs = DBConnection.getDataFromQuery(sqlString);
            while (rs.next()) {

                GoiBaoHanhDomainModel pbh = new GoiBaoHanhDomainModel(rs.getString(1), rs.getString(2), rs.getInt(3));
                ghb.add(pbh);
            }
            return ghb;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }
    }

    @Override
    public int add(GoiBaoHanhDomainModel p) {
        String sqlString = " insert into GoiBaoHanh(Ten, trangthai)values(?,?);";
        return DBConnection.ExcuteDungna(sqlString, p.getTen(), p.getTrangThai());
    }

    @Override
    public int update(GoiBaoHanhDomainModel p) {
        String sqlString = " update GoiBaoHanh set Ten=?,TrangThai=?,ID=? ;";
        return DBConnection.ExcuteDungna(sqlString, p.getTen(), p.getTrangThai(), p.getId());
    }

    @Override
    public int delete(GoiBaoHanhDomainModel p) {
        String sqlString = " DELETE FROM GoiBaoHanh WHERE Id =?";
        return DBConnection.ExcuteDungna(sqlString, p.getId());
    }

}
