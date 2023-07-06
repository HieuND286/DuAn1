/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Repository;

import DomainModels.CPU_DM;
import DomainModels.Rom_DM;
import java.util.List;

/**
 *
 * @author admin
 */
public interface IRomRepository {
    int them(Rom_DM rom);
    int sua(Rom_DM rom);
    int xoa(Rom_DM rom);
    int xoaTT(Rom_DM rom_DM);
    int hoanLai(Rom_DM rom_DM);
    List<Rom_DM> getAllRoms();
    List<Rom_DM> getAllDeleteRoms();
    List<Rom_DM> getRombyMa(String ma);
}
