/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services.impl;

import DomainModels.DonGiao_DM;
import Repository.impl.DonGiaoRepos;
import Services.IDonGiaoService;
import Viewmodel.DonGiao_VM;
import java.util.ArrayList;

/**
 *
 * @author Acer
 */
public class DonGiaoService implements IDonGiaoService{
private DonGiaoRepos repos = new DonGiaoRepos();
    @Override
    public String them(DonGiao_VM x) {
DonGiao_DM dg = new DonGiao_DM(x.getIdDG(), x.getIdHD(), x.getHoTenNguoiNhan(),x.getSdtNguoiNhan(),x.getHoTenShipper(),x.getSdtShipper(),x.getNgayGiao(),x.getNgayNhan(),x.getDiaChi(),x.getTrangThai());
      
       if(repos.them(dg)==true){
           return "them thanh cong";
       }else{
           return "them that bai";
       }  
    }

    @Override
    public String sua(DonGiao_VM x) {
DonGiao_DM dg = new DonGiao_DM(x.getIdDG(), x.getIdHD(), x.getHoTenNguoiNhan(),x.getSdtNguoiNhan(),x.getHoTenShipper(),x.getSdtShipper(),x.getNgayGiao(),x.getNgayNhan(),x.getDiaChi(),x.getTrangThai());
      
       if(repos.sua(dg)==true){
           return "sua thanh cong";
       }else{
           return "sua that bai";
       }      }

    @Override
    public ArrayList<DonGiao_VM> getAllDonGiao() {
 ArrayList<DonGiao_VM> list = new ArrayList<>();
        for (DonGiao_DM x : repos.getAllDonGiao()) {
            DonGiao_VM vv = new DonGiao_VM(x.getIdDG(), x.getIdHD(), x.getHoTenNguoiNhan(),x.getSdtNguoiNhan(),x.getHoTenShipper(),x.getSdtShipper(),x.getNgayGiao(),x.getNgayNhan(),x.getDiaChi(),x.getTrangThai());
            list.add(vv);

        }
        return list;
     
            }

    @Override
    public ArrayList<DonGiao_VM> getDonGiaoByMa(String ma) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
