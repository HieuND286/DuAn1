/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Repository;

import DomainModels.CPU_DM;
import DomainModels.ChiTietSP_DM;
import DomainModels.DongSP_DM;
import java.util.List;

/**
 *
 * @author admin
 */
public interface IDongSPRepository {
    int them(DongSP_DM dongSP);
    int sua(DongSP_DM dongSP);
    int xoa(DongSP_DM dongSP);
    int xoaTT(DongSP_DM dongSP);
    int hoanLai(DongSP_DM dongSP_DM);
    List<DongSP_DM> getAlldDongSP();
    List<DongSP_DM> getAllDeletedDongSP();
    List<DongSP_DM> getdDongSPByMa(String ma);
}
