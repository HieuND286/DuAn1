/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Services;

import Repository.*;
import DomainModels.CPU_DM;
import DomainModels.Hang_DM;
import ViewModels.DongSP_VM;
import ViewModels.Hang_VM;
import java.util.List;

/**
 *
 * @author admin
 */
public interface IHangServive {

    int them(Hang_VM hang);

    int sua(Hang_VM hang);

    int xoa(Hang_VM hang);

    int xoaTT(Hang_VM hang);

    int hoanLai(Hang_VM hang);

    List<Hang_VM> getAllDelete();

    List<Hang_VM> getAllhHangs();

    List<Hang_VM> gethHangByMa(String ma);
}
