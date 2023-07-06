/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Repository;

import DomainModels.Hoa_Don_CT_DM;
import java.util.List;

/**
 *
 * @author admin
 */
public interface IHoaDonCTRepository {
    int them(Hoa_Don_CT_DM hdctdm);
    List<Hoa_Don_CT_DM> getAllHDCT(String ma);
    int xoa(String idHd,String idImei);

}
