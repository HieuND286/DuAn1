/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Repository;

import DomainModels.CPU_DM;
import DomainModels.SanPham_DM;
import java.util.List;

/**
 *
 * @author admin
 */
public interface ISanPhamRepository {

    int them(SanPham_DM sanPham);

    int sua(SanPham_DM sanPham);

    int xoa(SanPham_DM sanPham);

    int xoaTT(SanPham_DM sanPham_DM);

    int hoanLai(SanPham_DM sanPham_DM);

    List<SanPham_DM> getAllSanPhams();

    List<SanPham_DM> getAllDeleteSanPhams();

    List<SanPham_DM> getSanPhambyMa(String ma);

    List<SanPham_DM> getAllSanPhamss();

    List<SanPham_DM> getSanPhambyMas(String ma);

    List<SanPham_DM> getSanPhambyTen(String ten);
}
