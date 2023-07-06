/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Services;

import Repository.*;
import DomainModels.CPU_DM;
import DomainModels.Ram_DM;
import Viewmodels.Ram_VM;

import java.util.List;

/**
 *
 * @author admin
 */
public interface IRamServive {
    int them(Ram_VM ram);
    int sua(Ram_VM ram);
    int xoa(Ram_VM ram);
    int xoaTT(Ram_VM ram);
    int hoaLai(Ram_VM ram);
    List<Ram_VM> getAllDeleteRam();
    List<Ram_VM> getAllRams();
    List<Ram_VM> getRambyMa(String ma);
}
