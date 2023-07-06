/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Repository;

import DomainModels.CPU_DM;
import DomainModels.Imei_DM;
import java.util.List;

/**
 *
 * @author admin
 */
public interface IImeiRepository {

    int them(Imei_DM imei);

    int sua(Imei_DM imei);

    List<Imei_DM> getAllImeis();

    List<Imei_DM> getAllImeisofSanPhan(String id);

    List<Imei_DM> getAllImeisofHD(String idHD);
    
    List<Imei_DM> getAll();

    int xoaImei();
}
