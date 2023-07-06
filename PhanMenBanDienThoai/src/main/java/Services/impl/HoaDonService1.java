/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services.impl;

import DomainModels.HoaDon_DM1;

import Repository.impl.HoaDonRepos1;
import Services.IHoaDonService1;
import ViewModels.HoaDon_VM1;


import java.util.ArrayList;

/**
 *
 * @author Acer
 */
public class HoaDonService1 implements IHoaDonService1{
 private HoaDonRepos1 repos = new HoaDonRepos1();

    
    

    @Override
    public ArrayList<HoaDon_VM1> getAll() {
   ArrayList<HoaDon_VM1> list = new ArrayList<>();
        for (HoaDon_DM1 x :repos.getAll() ) {
            HoaDon_VM1 ql = new HoaDon_VM1(x.getIdHD(), x.getIdNV(), x.getIdKH(),x.getMaHD(),x.getHinhThucNhan(),x.getNgayTao(),x.getNgayThanhToan(),x.getTrangThai(),x.getMoTa());
            list.add(ql);
        }
        
       return list;
     
        
       
}
}
