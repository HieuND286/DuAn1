/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Services;

import Repository.*;
import DomainModels.CPU_DM;
import DomainModels.MauSac_DM;
import ViewModels.MauSac_VM;
import java.util.List;

/**
 *
 * @author admin
 */
public interface IMauSacServive {

    int them(MauSac_VM mauSac);

    int sua(MauSac_VM mauSac);

    int xoa(MauSac_VM mauSac);

    int xoaTT(MauSac_VM mauSac);

    int hoanLai(MauSac_VM mauSac);

    List<MauSac_VM> getAllDelete();

    List<MauSac_VM> getAllMauSacs();

    List<MauSac_VM> getMauSacsbyMa(String ma);
}
