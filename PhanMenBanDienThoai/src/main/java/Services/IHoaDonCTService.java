/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import DomainModels.Hoa_Don_CT_DM;
import ViewModels.Hoa_Don_CT_VM;
import java.util.List;
import javax.print.DocFlavor;

/**
 *
 * @author admin
 */
public interface IHoaDonCTService {

    int them(Hoa_Don_CT_VM hdctdm);

    List<Hoa_Don_CT_VM> getAllHDCT(String id);
    
    int xoa(String idHd, String idImei);
}
