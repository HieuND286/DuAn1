/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services.impl;

import Repository.impl.*;
import DomainModels.SanPham_DM;
import Repository.ISanPhamRepository;
import Services.ISanPhamServive;
import Utilities.DBConnection;
import Viewmodels.SanPham_VM;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author admin
 */
public class SanPhamServive implements ISanPhamServive {

    private SanPhamRepo SanPhamRepo = new SanPhamRepo();

    @Override
    public int them(SanPham_VM sanPham) {
        String id = sanPham.getIdSP();
        String ma = sanPham.getMaSP();
        String ten = sanPham.getTenSP();
        int them = this.SanPhamRepo.them(new SanPham_DM(id, ma, ten));
        return them;
    }

    @Override
    public int sua(SanPham_VM sanPham) {
        String id = sanPham.getIdSP();
        String ma = sanPham.getMaSP();
        String ten = sanPham.getTenSP();
        int them = this.SanPhamRepo.sua(new SanPham_DM(id, ma, ten));
        return them;
    }

    @Override
    public int xoa(SanPham_VM sanPham) {
        String id = sanPham.getIdSP();
        String ma = sanPham.getMaSP();
        String ten = sanPham.getTenSP();
        int them = this.SanPhamRepo.xoa(new SanPham_DM(id, ma, ten));
        return them;
    }

    @Override
    public int xoaTT(SanPham_VM sanPham) {
        String id = sanPham.getIdSP();
        String ma = sanPham.getMaSP();
        String ten = sanPham.getTenSP();
        int them = this.SanPhamRepo.xoaTT(new SanPham_DM(id, ma, ten));
        return them;
    }

    @Override
    public int hoanLai(SanPham_VM sanPham) {
        String id = sanPham.getIdSP();
        String ma = sanPham.getMaSP();
        String ten = sanPham.getTenSP();
        int them = this.SanPhamRepo.hoanLai(new SanPham_DM(id, ma, ten));
        return them;
    }

    @Override
    public List<SanPham_VM> getAllDelete() {
        List<SanPham_VM> listVM = new ArrayList<>();
        List<SanPham_DM> listDM = this.SanPhamRepo.getAllDeleteSanPhams();
        int stt = 1;
        for (SanPham_DM sanPham_DM : listDM) {
            listVM.add(new SanPham_VM(stt, sanPham_DM.getIdSP(),
                    sanPham_DM.getMaSP(), sanPham_DM.getTenSP()));
            stt++;
        }
        return listVM;
    }

    @Override
    public List<SanPham_VM> getAllSanPhams() {
        List<SanPham_VM> listVM = new ArrayList<>();
        List<SanPham_DM> listDM = this.SanPhamRepo.getAllSanPhams();
        int stt = 1;
        for (SanPham_DM sanPham_DM : listDM) {
            listVM.add(new SanPham_VM(stt, sanPham_DM.getIdSP(),
                    sanPham_DM.getMaSP(), sanPham_DM.getTenSP()));
            stt++;
        }
        return listVM;
    }

@Override
    public List<SanPham_VM> getSanPhambyMa(String ma) {
        List<SanPham_VM> list = new ArrayList<>();
        String sql = "select * from SanPham where Ma = ?";
        try {
            ResultSet rs = DBConnection.getDataFromQuery(sql, ma);
            while (rs.next()) {
                String id = rs.getString("ID");
                String ma1 = rs.getString("Ma");
                String Ten = rs.getString("Ten");
                SanPham_VM sanPham = new SanPham_VM(0, id, ma1, Ten);
                list.add(sanPham);
            }
            return list;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return list;
        }
    }
    
     @Override
    public List<SanPham_VM> getSanPhambyTen(String ten) {
        List<SanPham_VM> list = new ArrayList<>();
        String sql = "select * from SanPham where Ten = ?";
        try {
            ResultSet rs = DBConnection.getDataFromQuery(sql, ten);
            while (rs.next()) {
                String id = rs.getString("ID");
                String ma1 = rs.getString("Ma");
                String Ten = rs.getString("Ten");
                SanPham_VM sanPham = new SanPham_VM(0,id, ma1, Ten);
                list.add(sanPham);
            }
            return list;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return list;
        }
    }

    @Override
    public List<SanPham_VM> getAllSanPhamss() {
        List<SanPham_VM> list = new ArrayList<>();
        String sql = "select * from SanPham";
        try {
            ResultSet rs = DBConnection.getDataFromQuery(sql);
            while (rs.next()) {
                String id = rs.getString("ID");
                String ma = rs.getString("Ma");
                String Ten = rs.getString("Ten");
                SanPham_VM sanPham = new SanPham_VM(0,id, ma, Ten);
                list.add(sanPham);
            }
            return list;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return list;
        }
    }

}
