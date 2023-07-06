/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Services;

import DomainModels.HoaDon_DM;
import ViewModels.HoaDon_VM;
import java.util.List;

/**
 *
 * @author admin
 */
public interface IHoaDonService {

    int them(HoaDon_VM hoaDon_VM);

    int sua(HoaDon_VM hoaDon_VM);

    int thanhToan(HoaDon_VM hoaDon_VM);

    List<HoaDon_VM> getAllDTT(); //DTT đã Thanh Toán//

    List<HoaDon_VM> getAllHD(); //CTT đã Thanh Toán//

    List<HoaDon_VM> getAllHDTCH(); //TCH tại của hàng//

    List<HoaDon_VM> getAllHDShip(); //hóa đơn ship//
}
