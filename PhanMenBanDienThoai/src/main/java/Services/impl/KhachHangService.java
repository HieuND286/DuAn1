/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services.impl;

import DomainModels.KhachHang_DM;
import Repository.impl.KhachHangReponsitory;
import Services.IKhachHnagService;
import ViewModels.KhachHang_VM;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author ThisPC
 */
public class KhachHangService implements IKhachHnagService{
    private KhachHangReponsitory KhachHangReponsitory = new KhachHangReponsitory();

    @Override
    public String them(KhachHang_VM kh) {
        String sdt = kh.getSdt();
        String ma = "KH"+ new Random().nextInt(1000)+1;
       if(
               sdt.trim().length()==0
              
               ){
           return "ko dc de trong";
       }
       

        KhachHang_DM k = new KhachHang_DM(kh.getId(),ma,kh.getSdt(),kh.getHoTen(),
        kh.getGioiTinh(),
        kh.getSoLuongHoaDon(), kh.geteMail(),kh.getDiaChi(),kh.getNgayTao());
       if(KhachHangReponsitory.them(k)==true){
           return "them thanh cong";
       }else{
           return "them that bai";
       }
    }

    @Override
    public String sua(KhachHang_VM kh) {
        String sdt = kh.getSdt();
       if(
               sdt.trim().length()==0
              
               ){
           return "ko dc de trong";
       }
       


        KhachHang_DM k = new KhachHang_DM(kh.getId(),kh.getMa(),kh.getSdt(),kh.getHoTen(),
        kh.getGioiTinh(),
        kh.getSoLuongHoaDon(), kh.geteMail(),kh.getDiaChi(),kh.getNgayTao());
       if(KhachHangReponsitory.sua(k)==true){
           return "sua thanh cong";
       }else{
           return "sua that bai";
       }
    }
    @Override
    public ArrayList<KhachHang_VM> getSea(String Ma) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<KhachHang_VM> getAllKhacHang() {
        ArrayList<KhachHang_VM> list = new ArrayList<>();
        for (KhachHang_DM kh : KhachHangReponsitory.getAllCpus()) {
             KhachHang_VM ql = new KhachHang_VM(kh.getId(),kh.getMa(),kh.getSdt(),kh.getHoTen(),
        kh.getGioiTinh(),kh.getSoLuongHoaDon(),kh.geteMail(),kh.getDiaChi(),kh.getNgayTao());
            list.add(ql);
        }
        return list;    }
    
}
