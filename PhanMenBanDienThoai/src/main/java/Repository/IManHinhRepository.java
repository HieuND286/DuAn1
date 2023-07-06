/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Repository;

import DomainModels.CPU_DM;
import DomainModels.ManHinh_DM;
import java.util.List;

/**
 *
 * @author admin
 */
public interface IManHinhRepository {
    int them(ManHinh_DM manHinh);
    int sua(ManHinh_DM manHinh);
    int xoa(ManHinh_DM manHinh);
    int xoaTT(ManHinh_DM manHinh_DM);
    int hoanLai(ManHinh_DM manHinh_DM);
    List<ManHinh_DM> getAllmaHinhs();
    List<ManHinh_DM> getAllDeletedMH();
    List<ManHinh_DM> getManHinhbyMa(String ma);
}
