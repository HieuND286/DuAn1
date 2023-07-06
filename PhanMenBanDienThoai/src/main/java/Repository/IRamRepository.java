/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Repository;

import DomainModels.CPU_DM;
import DomainModels.Ram_DM;
import java.util.List;

/**
 *
 * @author admin
 */
public interface IRamRepository {
    int them(Ram_DM ram);
    int sua(Ram_DM ram);
    int xoa(Ram_DM ram);
    int xoaTT(Ram_DM ram);
    int hoanLai(Ram_DM ram);
    List<Ram_DM> getAllDeleteRams();
    List<Ram_DM> getAllRams();
    List<Ram_DM> getRambyMa(String ma);
}
