/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Services;
import DomainModels.ChiTietSP_DM;
import Repository.*;
import ViewModels.ChiTietSP_VM;


import java.util.List;

/**
 *
 * @author admin
 */
public interface IChiTietSPServive {
    int them(ChiTietSP_VM chiTietSP);
    int themImei(ChiTietSP_VM chiTietSP);
    int sua(ChiTietSP_VM chiTietSP);
    int xoa(ChiTietSP_VM chiTietSP);
    int xoaTT(ChiTietSP_VM chiTietSP);
    int hoanLai(ChiTietSP_VM chiTietSP);
    List<ChiTietSP_VM> getAllDeleteChiTietSPs();
    List<ChiTietSP_VM> getAllChiTietSPs();
    List<ChiTietSP_VM> getChiTietSPByImei(String imei);
}
