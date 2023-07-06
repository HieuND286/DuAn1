/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Services;

import Viewmodel.DonGiao_VM;
import java.util.ArrayList;

/**
 *
 * @author Acer
 */
public interface IDonGiaoService {
     String them(DonGiao_VM x);
    String sua(DonGiao_VM x);
    ArrayList<DonGiao_VM> getAllDonGiao();
    ArrayList<DonGiao_VM> getDonGiaoByMa(String ma);
}
