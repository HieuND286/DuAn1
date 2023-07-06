/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Services;

import Repository.*;
import DomainModels.CPU_DM;
import DomainModels.Rom_DM;
import Viewmodels.Rom_VM;
import java.util.List;

/**
 *
 * @author admin
 */
public interface IRomServive {

    int them(Rom_VM rom);

    int sua(Rom_VM rom);

    int xoa(Rom_VM rom);

    int xoaTT(Rom_VM rom);

    int hoanLai(Rom_VM rom);

    List<Rom_VM> getAllDelete();

    List<Rom_VM> getAllRoms();

    List<Rom_VM> getRombyMa(String ma);
}
