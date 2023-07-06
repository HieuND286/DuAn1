/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Services;

import Repository.*;
import DomainModels.CPU_DM;
import DomainModels.DongSP_DM;
import ViewModels.ChiTietSP_VM;
import ViewModels.DongSP_VM;
import java.util.List;

/**
 *
 * @author admin
 */
public interface IDongSPServive {

    int them(DongSP_VM dongSP);

    int sua(DongSP_VM dongSP);

    int xoa(DongSP_VM dongSPP);

    int xoaTT(DongSP_VM dongSP);

    int hoanLai(DongSP_VM dongSP);

    List<DongSP_VM> getAllDelete();

    List<DongSP_VM> getAlldDongSP();

    List<DongSP_VM> getdDongSPByMa(String ma);
}
