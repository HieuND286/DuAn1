package Repository.impl;

import DomainModels.NhanVien_DM;
import Repository.INhanVienRepository;
import Utilities.JDBCHeper;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Acer
 */
public class NhanvVienRepository implements INhanVienRepository {

    @Override
    public ArrayList<NhanVien_DM> getAllNhanVien() {
        ArrayList<NhanVien_DM> nv = new ArrayList<>();
        String sql = "select*from NhanVien where TrangThai = 0";

        ResultSet rs = JDBCHeper.excuteQuery(sql);
        try {
            while (rs.next()) {
                NhanVien_DM v = new NhanVien_DM(rs.getString(1), 
                        rs.getString(2), rs.getString(3), 
                        rs.getInt(4),
                        rs.getString(5), 
                        rs.getString(6), rs.getString(7),
                        rs.getInt(8),
                        rs.getString(9),
                        rs.getString(11), 
                        rs.getInt(10));
                nv.add(v);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return nv;
    }

    @Override
    public ArrayList<NhanVien_DM> getAllNhanVienNghi() {
        ArrayList<NhanVien_DM> nv = new ArrayList<>();
        String sql = "select*from NhanVien where TrangThai = 1";

        ResultSet rs = JDBCHeper.excuteQuery(sql);
        try {
            while (rs.next()) {
                               NhanVien_DM v = new NhanVien_DM(rs.getString(1), 
                        rs.getString(2), rs.getString(3), 
                        rs.getInt(4),
                        rs.getString(5), 
                        rs.getString(6), rs.getString(7),
                        rs.getInt(8),
                        rs.getString(9),
                        rs.getString(11), 
                        rs.getInt(10));
                nv.add(v);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return nv;
    }

    @Override
    public boolean add(NhanVien_DM x) {
        Integer row = 0;
        String sql = "insert into NhanVien(MANV,HoVaTen,GioiTinh,NgaySinh,DiaChi,Sdt,ChucVu,MatKhau,HinhAnh) values\n"
                + "(?,?,?,?,?,?,?,?,?)";
        try {
            row = JDBCHeper.excuteUpdate(sql,
                    x.getMANV(),
                    x.getHoVaTen(),
                    x.getGioiTinh(),
                    x.getNgaySinh(),
                    x.getDiaChi(),
                    x.getSdt(),
                    x.getChucVu(),
                    x.getMatKhau(),
                    x.getHinhAnh()
            );
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean update(NhanVien_DM x) {
        Integer row = 0;
        String sql = "UPDATE NhanVien \n"
                + "set MANV = ?, HoVaTen =? ,GioiTinh =?,NgaySinh =?,DiaChi =?,"
                + "Sdt =?,ChucVu =?,MatKhau=?,TrangThai =?,HinhAnh = ?\n"
                + "where IDNV = ?";
        try {
            row = JDBCHeper.excuteUpdate(sql,
                    x.getMANV(),
                    x.getHoVaTen(),
                    x.getGioiTinh(),
                    x.getNgaySinh(),
                    x.getDiaChi(),
                    x.getSdt(),
                    x.getChucVu(),
                    x.getMatKhau(),
                    x.getTrangThai(),
                    x.getHinhAnh(),
                    x.getIDNV()
            );
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }

    }

    @Override
    public ArrayList<NhanVien_DM> getSea(String Ma) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean nghiViec(NhanVien_DM x) {
        Integer row = 0;
        String sql = "UPDATE NhanVien\n"
                + "set TrangThai = 1 \n"
                + "where IDNV = ?";
        try {
            row = JDBCHeper.excuteUpdate(sql,
                    x.getIDNV()
            );
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean hoanLai(NhanVien_DM x) {
        Integer row = 0;
        String sql = "UPDATE NhanVien \n"
                + " set TrangThai = 0\n"
                + "where IDNV = ?";
        try {
            row = JDBCHeper.excuteUpdate(sql,
                    x.getIDNV()
            );
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

}
