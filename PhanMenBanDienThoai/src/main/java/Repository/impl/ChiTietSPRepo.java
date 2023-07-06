/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository.impl;

import DomainModels.CPU_DM;
import DomainModels.ChiTietSP_DM;
import DomainModels.DongSP_DM;
import DomainModels.Hang_DM;
import DomainModels.HeDieuHanh_DM;
import DomainModels.Imei_DM;
import DomainModels.ManHinh_DM;
import DomainModels.MauSac_DM;
import DomainModels.Pin_DM;
import DomainModels.Ram_DM;
import DomainModels.Rom_DM;
import DomainModels.SanPham_DM;
import Repository.IChiTietSPRepository;
import Repository.ICpuRepository;
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
public class ChiTietSPRepo implements IChiTietSPRepository {

    @Override
    public int them(ChiTietSP_DM chiTietSP) {
        String sql = "insert into CHiTietSP(MaSSP,IDSP,IDHDH,IDHNG,IDDongSP,IDCPU,IDRom,IDRam,IDMS,IDMH,IDPin,Loai,HinhAnh,GiaNhap,GiaBan,SoLuong)\n"
                + "                values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        return DBConnection.ExcuteDungna(sql, chiTietSP.getMaSoSP(), chiTietSP.getSanPham().getIdSP(),
                chiTietSP.getHeDieuHanh().getIdHDH(), chiTietSP.getHang().getIdHang(),
                chiTietSP.getDongSP().getIdDongSP(), chiTietSP.getCpu().getIdCPU(),
                chiTietSP.getRom().getIdRom(), chiTietSP.getRam().getIdRam(),
                chiTietSP.getMauSac().getIdMS(), chiTietSP.getManHinh().getIdMH(),
                chiTietSP.getPin().getIdPin(),
                chiTietSP.getLoai(), chiTietSP.getHinhAnh(),
                chiTietSP.getGiaNhap(), chiTietSP.getGiaBan(), chiTietSP.getSoLuong());
    }

    @Override
    public int sua(ChiTietSP_DM chiTietSP) {
        String sql = "update CHiTietSP\n"
                + "set IDSP = ?,IDHDH = ? ,IDHNG = ?,\n"
                + "IDDongSP = ?,IDCPU = ?,IDRom =?,IDRam = ?,IDMS = ?,IDMH = ?,\n"
                + "IDPin = ?,Loai = ? ,Hinhanh = ?,GiaNhap = ?,GiaBan = ?,SoLuong = ?\n"
                + "where ID = ?";
        return DBConnection.ExcuteDungna(sql, chiTietSP.getSanPham().getIdSP(),
                chiTietSP.getHeDieuHanh().getIdHDH(), chiTietSP.getHang().getIdHang(),
                chiTietSP.getDongSP().getIdDongSP(), chiTietSP.getCpu().getIdCPU(),
                chiTietSP.getRom().getIdRom(), chiTietSP.getRam().getIdRam(),
                chiTietSP.getMauSac().getIdMS(), chiTietSP.getManHinh().getIdMH(),
                chiTietSP.getPin().getIdPin(),
                chiTietSP.getLoai(), chiTietSP.getHinhAnh(),
                chiTietSP.getGiaNhap(), chiTietSP.getGiaBan(),chiTietSP.getSoLuong() ,chiTietSP.getiDCTSP());
    }

    @Override
    public List<ChiTietSP_DM> getAllChiTietSPs() {
        List<ChiTietSP_DM> list = new ArrayList<>();
        String sql = "select CHiTietSP.ID,CHiTietSP.MaSSP,CHiTietSP.SoLuong,CHiTietSP.Loai,\n"
                + " CHiTietSP.Hinhanh,CHiTietSP.GiaNhap,CHiTietSP.GiaBan,\n"
                + " SanPham.ID,SanPham.Ma,SanPham.Ten,HeDieuHanh.ID,HeDieuHanh.Ma,HeDieuHanh.Ten,\n"
                + " Hang.ID,Hang.Ma,Hang.Ten,DongSP.ID,DongSP.Ma,DongSP.Ten,CPU.ID,CPU.Ma,CPU.Ten,\n"
                + " Rom.ID,Rom.Ma,Rom.DUNGLUONG,Ram.ID,Ram.MA,Ram.DUNGLUONG,MauSac.ID,MauSac.Ma,MauSac.Ten,\n"
                + " ManHinh.ID,ManHinh.Ma,ManHinh.Ten,Pin.ID,Pin.Ma,Pin.DungLuong\n"
                + " from CHiTietSP join SanPham on CHiTietSP.IDSP = SanPham.ID\n"
                + "     join HeDieuHanh on CHiTietSP.IDHDH = HeDieuHanh.ID\n"
                + "	 join Hang on CHiTietSP.IDHNG = Hang.ID\n"
                + "	 join DongSP on DongSP.ID = CHiTietSP.IDDongSP\n"
                + "	 join CPU on CHiTietSP.IDCPU = CPU.ID\n"
                + "     join Rom on CHiTietSP.IDRom = Rom.ID\n"
                + "	 join Ram on CHiTietSP.IDRam = Ram.ID\n"
                + "     join MauSac on CHiTietSP.IDMS = MauSac.ID\n"
                + "     join ManHinh on CHiTietSP.IDMH = ManHinh.ID\n"
                + "     join Pin on CHiTietSP.IDPin = Pin.ID\n"
                + "where CHiTietSP.TinhTrang = 0";
        try {
            ResultSet rs = DBConnection.getDataFromQuery(sql);
            while (rs.next()) {
                String iDCTSP = rs.getString(1);
                String maSoSP = rs.getString(2);
                int soLuong = rs.getInt(3);
                int loai = rs.getInt(4);
                String hinhAnh = rs.getString(5);
                double giaNhap = rs.getDouble(6);
                double giaBan = rs.getDouble(7);
                SanPham_DM sanPham = new SanPham_DM(rs.getString(8),
                        rs.getString(9), rs.getString(10));
                HeDieuHanh_DM heDieuHanh = new HeDieuHanh_DM(rs.getString(11),
                        rs.getString(12), rs.getString(13));
                Hang_DM hang = new Hang_DM(rs.getString(14),
                        rs.getString(15), rs.getString(16));
                DongSP_DM dongSP = new DongSP_DM(rs.getString(17),
                        rs.getString(18), rs.getString(19));
                CPU_DM cpu = new CPU_DM(rs.getString(20),
                        rs.getString(21), rs.getString(22));
                Rom_DM rom = new Rom_DM(rs.getString(23),
                        rs.getString(24), rs.getString(25));
                Ram_DM ram = new Ram_DM(rs.getString(26),
                        rs.getString(27), rs.getString(28));
                MauSac_DM mauSac = new MauSac_DM(rs.getString(29),
                        rs.getString(30), rs.getString(31));
                ManHinh_DM manHinh = new ManHinh_DM(rs.getString(32),
                        rs.getString(33), rs.getString(34));
                Pin_DM pin = new Pin_DM(rs.getString(35),
                        rs.getString(36), rs.getString(37));

                ChiTietSP_DM chiTietSP = new ChiTietSP_DM(iDCTSP, maSoSP, sanPham,
                        heDieuHanh, hang, dongSP, cpu, rom, ram, mauSac, manHinh,
                        pin, hinhAnh, loai, soLuong, giaNhap, giaBan);
                list.add(chiTietSP);
            }
            return list;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return list;
        }
    }

    @Override
    public List<ChiTietSP_DM> getChiTietSPByImei(String imei) {
//        List<ChiTietSP_DM> list = new ArrayList<>();
//        String sql = "select CHiTietSP.IDCTSP,CHiTietSP.Loai,\n"
//                + "CHiTietSP.Hinhanh,CHiTietSP.GiaNhap,CHiTietSP.GiaBan,\n"
//                + "SanPham.*,HeDieuHanh.*,Hang.*,DongSP.*,CPU.*,Rom.*,Ram.*,\n"
//                + "MauSac.*,ManHinh.*,Pin.*,Imei.*,CHiTietSP.SoLuong\n"
//                + "from CHiTietSP join SanPham on CHiTietSP.IDSP = SanPham.IDSP\n"
//                + "     join HeDieuHanh on CHiTietSP.IDHDH = HeDieuHanh.IDHDH\n"
//                + "	 join Hang on CHiTietSP.IDHNG = Hang.IDHNG\n"
//                + "	 join DongSP on DongSP.IDDongSP = CHiTietSP.IDDongSP\n"
//                + "	 join CPU on CHiTietSP.IDCPU = CPU.IDCPU\n"
//                + "	 join Rom on CHiTietSP.IDRom = Rom.IDRom\n"
//                + "	 join Ram on CHiTietSP.IDRam = Ram.IDRAM\n"
//                + "	 join MauSac on CHiTietSP.IDMS = MauSac.IDMS\n"
//                + "	 join ManHinh on CHiTietSP.IDMH = ManHinh.IDMH\n"
//                + "	 join Pin on CHiTietSP.IDPin = Pin.IDPin\n"
//                + "	 join Imei on CHiTietSP.IDImei = Imei.IDImei\n"
//                + "where Imei.Imei = ?";
//        try {
//            ResultSet rs = DBConnection.getDataFromQuery(sql,imei);
//            while (rs.next()) {
//                String iDCTSP = rs.getString(1);
//                SanPham_DM sanPham = new SanPham_DM(rs.getString(6),
//                        rs.getString(7), rs.getString(8));
//                HeDieuHanh_DM heDieuHanh = new HeDieuHanh_DM(rs.getString(9),
//                        rs.getString(10), rs.getString(11));
//                Hang_DM hang = new Hang_DM(rs.getString(12),
//                        rs.getString(13), rs.getString(14));
//                DongSP_DM dongSP = new DongSP_DM(rs.getString(15),
//                        rs.getString(16), rs.getString(17));
//                CPU_DM cpu = new CPU_DM(rs.getString(18),
//                        rs.getString(19), rs.getString(20));
//                Rom_DM rom = new Rom_DM(rs.getString(21),
//                        rs.getString(22), rs.getString(23));
//                Ram_DM ram = new Ram_DM(rs.getString(24),
//                        rs.getString(25), rs.getString(26));
//                MauSac_DM mauSac = new MauSac_DM(rs.getString(27),
//                        rs.getString(28), rs.getString(29));
//                ManHinh_DM manHinh = new ManHinh_DM(rs.getString(30),
//                        rs.getString(31), rs.getString(32));
//                Pin_DM pin = new Pin_DM(rs.getString(33),
//                        rs.getString(34), rs.getString(35));
//                Imei_DM imei1 = new Imei_DM(rs.getString(36), rs.getString(37));
//                String hinhAnh = rs.getString(3);
//                int loai = rs.getInt(2);
//                double giaNhap = rs.getDouble(4);
//                double giaBan = rs.getDouble(5);
//                int soLuong = rs.getInt(38);
//                ChiTietSP_DM chiTietSP = new ChiTietSP_DM(iDCTSP, sanPham, heDieuHanh,
//                        hang, dongSP, cpu, rom, ram, mauSac, manHinh, pin, imei1,
//                        hinhAnh, loai, soLuong, giaNhap, giaBan);
//                list.add(chiTietSP);
//            }
//            return list;
//        } catch (SQLException ex) {
//            ex.printStackTrace();
//            return list;
//        }
        return null;
    }

    @Override
    public int xoa(ChiTietSP_DM chiTietSP_DM) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int xoaTT(ChiTietSP_DM chiTietSP) {
        String sql = "update CHiTietSP\n"
                + "set TinhTrang = 1\n"
                + "where ID = ?";
        return DBConnection.ExcuteDungna(sql, chiTietSP.getiDCTSP());
    }

    @Override
    public int hoaLia(ChiTietSP_DM chiTietSP) {
        String sql = "update CHiTietSP\n"
                + "set TinhTrang = 0\n"
                + "where ID = ?";
        return DBConnection.ExcuteDungna(sql, chiTietSP.getiDCTSP());
    }

    @Override
    public List<ChiTietSP_DM> getAllDeletedCTSP() {
        List<ChiTietSP_DM> list = new ArrayList<>();
        String sql = "select CHiTietSP.ID,CHiTietSP.MaSSP,CHiTietSP.SoLuong,CHiTietSP.Loai,\n"
                + " CHiTietSP.Hinhanh,CHiTietSP.GiaNhap,CHiTietSP.GiaBan,\n"
                + " SanPham.ID,SanPham.Ma,SanPham.Ten,HeDieuHanh.ID,HeDieuHanh.Ma,HeDieuHanh.Ten,\n"
                + " Hang.ID,Hang.Ma,Hang.Ten,DongSP.ID,DongSP.Ma,DongSP.Ten,CPU.ID,CPU.Ma,CPU.Ten,\n"
                + " Rom.ID,Rom.Ma,Rom.DUNGLUONG,Ram.ID,Ram.MA,Ram.DUNGLUONG,MauSac.ID,MauSac.Ma,MauSac.Ten,\n"
                + " ManHinh.ID,ManHinh.Ma,ManHinh.Ten,Pin.ID,Pin.Ma,Pin.DungLuong\n"
                + " from CHiTietSP join SanPham on CHiTietSP.IDSP = SanPham.ID\n"
                + "     join HeDieuHanh on CHiTietSP.IDHDH = HeDieuHanh.ID\n"
                + "	 join Hang on CHiTietSP.IDHNG = Hang.ID\n"
                + "	 join DongSP on DongSP.ID = CHiTietSP.IDDongSP\n"
                + "	 join CPU on CHiTietSP.IDCPU = CPU.ID\n"
                + "     join Rom on CHiTietSP.IDRom = Rom.ID\n"
                + "	 join Ram on CHiTietSP.IDRam = Ram.ID\n"
                + "     join MauSac on CHiTietSP.IDMS = MauSac.ID\n"
                + "     join ManHinh on CHiTietSP.IDMH = ManHinh.ID\n"
                + "     join Pin on CHiTietSP.IDPin = Pin.ID\n"
                + "where CHiTietSP.TinhTrang = 1 ";
        try {
            ResultSet rs = DBConnection.getDataFromQuery(sql);
            while (rs.next()) {
                String iDCTSP = rs.getString(1);
                String maSoSP = rs.getString(2);
                int soLuong = rs.getInt(3);
                int loai = rs.getInt(4);
                String hinhAnh = rs.getString(5);
                double giaNhap = rs.getDouble(6);
                double giaBan = rs.getDouble(7);
                SanPham_DM sanPham = new SanPham_DM(rs.getString(8),
                        rs.getString(9), rs.getString(10));
                HeDieuHanh_DM heDieuHanh = new HeDieuHanh_DM(rs.getString(11),
                        rs.getString(12), rs.getString(13));
                Hang_DM hang = new Hang_DM(rs.getString(14),
                        rs.getString(15), rs.getString(16));
                DongSP_DM dongSP = new DongSP_DM(rs.getString(17),
                        rs.getString(18), rs.getString(19));
                CPU_DM cpu = new CPU_DM(rs.getString(20),
                        rs.getString(21), rs.getString(22));
                Rom_DM rom = new Rom_DM(rs.getString(23),
                        rs.getString(24), rs.getString(25));
                Ram_DM ram = new Ram_DM(rs.getString(26),
                        rs.getString(27), rs.getString(28));
                MauSac_DM mauSac = new MauSac_DM(rs.getString(29),
                        rs.getString(30), rs.getString(31));
                ManHinh_DM manHinh = new ManHinh_DM(rs.getString(32),
                        rs.getString(33), rs.getString(34));
                Pin_DM pin = new Pin_DM(rs.getString(35),
                        rs.getString(36), rs.getString(37));

                ChiTietSP_DM chiTietSP = new ChiTietSP_DM(iDCTSP, maSoSP, sanPham,
                        heDieuHanh, hang, dongSP, cpu, rom, ram, mauSac, manHinh,
                        pin, hinhAnh, loai, soLuong, giaNhap, giaBan);
                list.add(chiTietSP);
            }
            return list;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return list;
        }
    }

    @Override
    public int themImei(ChiTietSP_DM chiTietSP) {
        String sql = "update Imei\n"
                + "set IDCTSP = ?\n"
                + "where TinhTrang = 0";
        return DBConnection.ExcuteDungna(sql, chiTietSP.getiDCTSP());
    }
}
