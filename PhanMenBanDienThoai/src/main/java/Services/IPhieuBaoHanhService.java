/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Services;

import ViewModels.HoaDonViewModel;
import ViewModels.HoaDonCTViewModel;
import ViewModels.PhieuBaoHanhViewModels;
import ViewModels.PhieuBaoHanhViewModels;
import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public interface IPhieuBaoHanhService {

    ArrayList<PhieuBaoHanhViewModels> getAll();

    int add(PhieuBaoHanhViewModels p);

    int update(PhieuBaoHanhViewModels p);

    int updateHDCT(PhieuBaoHanhViewModels p);

    int delete(PhieuBaoHanhViewModels p);

    ArrayList<HoaDonViewModel> getAllHD();

    ArrayList<HoaDonCTViewModel> getAllHDCT();

    ArrayList<HoaDonCTViewModel> getAllHDCT(String id);

}
