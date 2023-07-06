/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Repository;

import DomainModels.CPU_DM;
import DomainModels.MauSac_DM;
import java.util.List;

/**
 *
 * @author admin
 */
public interface IMauSacRepository {
    int them(MauSac_DM mauSac);
    int sua(MauSac_DM mauSac);
    int xoa(MauSac_DM mauSac);
    int xoaTT(MauSac_DM mauSac_DM);
    int hoanLai(MauSac_DM mauSac_DM);
    List<MauSac_DM> getAllMauSacs();
    List<MauSac_DM> getAllDeleteMauSacs();
    List<MauSac_DM> getMauSacsbyMa(String ma);
}
