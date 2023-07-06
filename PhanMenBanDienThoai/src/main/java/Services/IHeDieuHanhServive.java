/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Services;

import Repository.*;
import DomainModels.CPU_DM;
import DomainModels.HeDieuHanh_DM;
import ViewModels.Hang_VM;
import ViewModels.HeDieuHanh_VM;
import java.util.List;

/**
 *
 * @author admin
 */
public interface IHeDieuHanhServive {

    int them(HeDieuHanh_VM heDieuHanh);

    int sua(HeDieuHanh_VM heDieuHanh);

    int xoa(HeDieuHanh_VM heDieuHanh);

    int xoaTT(HeDieuHanh_VM heDieuHanh);

    int hoanLai(HeDieuHanh_VM heDieuHanh);

    List<HeDieuHanh_VM> getAllDelete();

    List<HeDieuHanh_VM> getAllhHeDieuHanhs();

    List<HeDieuHanh_VM> getHeDieuHanhbyMa(String ma);
}
