/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Repository;

import DomainModels.CPU_DM;
import java.util.List;

/**
 *
 * @author admin
 */
public interface ICpuRepository {
    int them(CPU_DM cpu);
    int sua(CPU_DM cpu);
    int xoaTT(CPU_DM cpu);
    int xoa(CPU_DM cpu);
    int hoaLai(CPU_DM cpu);
    List<CPU_DM> getAllCpus();
    List<CPU_DM> getAllDeleteCpus();
    List<CPU_DM> getCpusbyMa(String ma);
}
