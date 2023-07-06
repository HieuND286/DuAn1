/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Services;

import ViewModels.KhachHang_VM;
import java.util.ArrayList;

/**
 *
 * @author ThisPC
 */
public interface IKhachHnagService {
    String them(KhachHang_VM kh);
    String sua(KhachHang_VM kh);
    ArrayList<KhachHang_VM> getAllKhacHang();
    ArrayList<KhachHang_VM> getSea(String Ma);
    
}
