/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Repository;

import DomainModels.CPU_DM;
import DomainModels.ChiTietSP_DM;
import DomainModels.SanPham_DM;
import java.util.List;

/**
 *
 * @author admin
 */
public interface IChiTietSPRepository {

    int them(ChiTietSP_DM chiTietSP);

    int themImei(ChiTietSP_DM chiTietSP);

    int sua(ChiTietSP_DM chiTietSP);

    int xoa(ChiTietSP_DM chiTietSP_DM);

    int xoaTT(ChiTietSP_DM chiTietSP_DM);

    int hoaLia(ChiTietSP_DM chiTietSP_DM);

    List<ChiTietSP_DM> getAllChiTietSPs();

    List<ChiTietSP_DM> getAllDeletedCTSP();

    List<ChiTietSP_DM> getChiTietSPByImei(String imei);


}
