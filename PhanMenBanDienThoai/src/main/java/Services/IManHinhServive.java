/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Services;

import Repository.*;
import DomainModels.CPU_DM;
import DomainModels.ManHinh_DM;
import ViewModels.HeDieuHanh_VM;
import Viewmodels.ManHinh_VM;
import java.util.List;

/**
 *
 * @author admin
 */
public interface IManHinhServive {

    int them(ManHinh_VM manHinh);

    int sua(ManHinh_VM manHinh);

    int xoa(ManHinh_VM manHinh);

    int xoaTT(ManHinh_VM manHinh);

    int hoanLai(ManHinh_VM manHinh);

    List<ManHinh_VM> getAllDelete();

    List<ManHinh_VM> getAllmaHinhs();

    List<ManHinh_VM> getManHinhbyMa(String ma);
}
