/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Services;

import Repository.*;
import DomainModels.CPU_DM;
import DomainModels.Imei_DM;
import ViewModels.Imei_VM;
import java.util.List;

/**
 *
 * @author admin
 */
public interface IImeiServive {
    int them(Imei_VM imei);
    int sua(Imei_VM imei);
    int xoaImei();
    List<Imei_VM> getAllImeis();
    List<Imei_VM> getAllImeisofSP(String idsp);
    List<Imei_VM> getAllImeisofHD(String idsp);
        List<Imei_VM> getAll();
}
