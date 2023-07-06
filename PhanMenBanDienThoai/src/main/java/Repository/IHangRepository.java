/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Repository;

import DomainModels.CPU_DM;
import DomainModels.Hang_DM;
import java.util.List;

/**
 *
 * @author admin
 */
public interface IHangRepository {
    int them(Hang_DM hang);
    int sua(Hang_DM hang);
    int xoa(Hang_DM hang);
    int xoaTT(Hang_DM hang_DM);
    int hoanLai(Hang_DM hang_DM);
    List<Hang_DM> getAllhHangs();
    List<Hang_DM> getAllDeletedHang();
    List<Hang_DM> gethHangByMa(String ma);
}
