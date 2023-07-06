/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Services;

import Repository.*;
import DomainModels.CPU_DM;
import DomainModels.Pin_DM;
import Viewmodels.Pin_VM;
import java.util.List;

/**
 *
 * @author admin
 */
public interface IPinServive {

    int them(Pin_VM pin);

    int sua(Pin_VM pin);

    int xoa(Pin_VM pin);

    int xoaTT(Pin_VM pin);

    int hoanLai(Pin_VM pin);

    List<Pin_VM> getAllDelete();

    List<Pin_VM> getAllPin();

    List<Pin_VM> getPinbyMa(String ma);
}
