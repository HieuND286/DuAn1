/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Repository;

import DomainModels.CPU_DM;
import DomainModels.Pin_DM;
import java.util.List;

/**
 *
 * @author admin
 */
public interface IPinRepository {

    int them(Pin_DM pin);

    int sua(Pin_DM pin);

    int xoa(Pin_DM pin);

    int xoaTT(Pin_DM pin_DM);

    int hoanLai(Pin_DM pin_DM);

    List<Pin_DM> getAllPin();

    List<Pin_DM> getAllDeletePin();

    List<Pin_DM> getPinbyMa(String ma);
}
