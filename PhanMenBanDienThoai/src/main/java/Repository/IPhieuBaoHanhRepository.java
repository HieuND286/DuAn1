/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Repository;

import DomainModels.HoaDonCTDomainModel;
import DomainModels.HoaDonDomainModel;
import DomainModels.PhieuBaoHanhDomainModel;
import DomainModels.PhieuBaoHanhDomainModel;
import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public interface IPhieuBaoHanhRepository {

    ArrayList<PhieuBaoHanhDomainModel> getAll();

    int add(PhieuBaoHanhDomainModel p);

    int update(PhieuBaoHanhDomainModel p);

    int updateHDCT(PhieuBaoHanhDomainModel p);

    int delete(PhieuBaoHanhDomainModel p);

    ArrayList<HoaDonDomainModel> getAllHD();

    ArrayList<HoaDonCTDomainModel> getAllHDCT();

    ArrayList<HoaDonCTDomainModel> getAllHDCT(String id);

}
