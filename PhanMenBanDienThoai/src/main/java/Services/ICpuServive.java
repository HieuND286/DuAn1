/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Services;

import Repository.*;
import DomainModels.CPU_DM;
import ViewModels.CPU_VM;
import java.util.List;

/**
 *
 * @author admin
 */
public interface ICpuServive {
    int them(CPU_VM cpu);
    int sua(CPU_VM cpu);
    int xoa(CPU_VM cpu);
    int xoaTT(CPU_VM cpu);
    int hoanLai(CPU_VM cpu);
    List<CPU_VM> getAllCpus();
    List<CPU_VM> getAllDeleteCpus();
    List<CPU_VM> getCpusbyMa(String ma);
}
