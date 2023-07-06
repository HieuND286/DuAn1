/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Repository;

import DomainModels.CPU_DM;
import DomainModels.HeDieuHanh_DM;
import java.util.List;

/**
 *
 * @author admin
 */
public interface IHeDieuHanhRepository {

    int them(HeDieuHanh_DM heDieuHanh);

    int sua(HeDieuHanh_DM heDieuHanh);

    int xoa(HeDieuHanh_DM heDieuHanh);

    int xoaTT(HeDieuHanh_DM heDieuHanh_DM);

    int hoanLai(HeDieuHanh_DM heDieuHanh_DM);

    List<HeDieuHanh_DM> getAllhHeDieuHanhs();

    List<HeDieuHanh_DM> getAllDeleteHDH();

    List<HeDieuHanh_DM> getHeDieuHanhbyMa(String ma);
}
