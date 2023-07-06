/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Repository;

import DomainModels.HoaDon_DM;
import java.util.List;

/**
 *
 * @author admin
 */
public interface IHoaDonRepository {
    int them(HoaDon_DM hoaDon_DM);
    int sua(HoaDon_DM hoaDon_DM);
    int thanhToan(HoaDon_DM hoaDon_DM);
    List<HoaDon_DM> getAllDTT(); //DTT đã Thanh Toán//
    List<HoaDon_DM> getAllHD(); 
    List<HoaDon_DM> getAllHDTCH(); //TCH tại của hàng//
    List<HoaDon_DM> getAllHDShip(); //hóa đơn ship//
}
