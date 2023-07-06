/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Repository;

import DomainModels.KhachHang_DM;
import java.util.ArrayList;

/**
 *
 * @author ThisPC
 */
public interface IKhachHangRepossitory {
    boolean them(KhachHang_DM kh);
    boolean sua(KhachHang_DM kh);
    ArrayList<KhachHang_DM> getAllCpus();
     int getsl(String idkh);
    ArrayList<KhachHang_DM> getSea(String Ma);
    
}
