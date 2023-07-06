/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Services;

import Repository.*;
import DomainModels.CPU_DM;
import DomainModels.SanPham_DM;
import Viewmodels.SanPham_VM;
import java.util.List;

/**
 *
 * @author admin
 */
public interface ISanPhamServive {

    int them(SanPham_VM sanPham);

    int sua(SanPham_VM sanPham);

    int xoa(SanPham_VM sanPham);

    int xoaTT(SanPham_VM sanPham);

    int hoanLai(SanPham_VM sanPham);

    List<SanPham_VM> getAllDelete();

    List<SanPham_VM> getAllSanPhams();

    List<SanPham_VM> getSanPhambyMa(String ma);

    List<SanPham_VM> getAllSanPhamss();
    
    List<SanPham_VM> getSanPhambyTen(String ten);
}
