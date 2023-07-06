/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services.impl;

import java.util.ArrayList;
import java.util.List;
import Repository.impl.DotKhuyenMaiRepositoryImpl;
import ViewModels.DotKhuyenMai_VM;
import DomainModels.DotKhuyenMai;
import Services.IDotKhuyenMaiService;

/**
 *
 * @author Admin
 */
public class DotKhuyenMaiService implements IDotKhuyenMaiService {

    private DotKhuyenMaiRepositoryImpl rs = new DotKhuyenMaiRepositoryImpl();

    @Override
    public String add(DotKhuyenMai_VM dkm) {
        DotKhuyenMai dotKM = new DotKhuyenMai(dkm.getLoaiMa(),
                dkm.getMaVoucher(),
                dkm.getGiaTri(),
                dkm.getTenKM(),
                dkm.getNgaybatDau(),
                dkm.getNgayKetThuc(),
                dkm.getTrangThai());
        if(this.rs.add(dotKM)==true){
            System.out.println("ok");
            return "thanh công";
        }else{
            return "thất bại";
        }
       
    }

    @Override
    public String update(DotKhuyenMai_VM dkm, String maVoucher) {
         DotKhuyenMai dotKM = new DotKhuyenMai(dkm.getLoaiMa(),
                dkm.getMaVoucher(),
                dkm.getGiaTri(),
                dkm.getTenKM(),
                dkm.getNgaybatDau(),
                dkm.getNgayKetThuc(), 
                dkm.getTrangThai());
         if(this.rs.add(dotKM)==true){
            return "thanh công";
        }else{
            return "thất bại";
        }
       
    }

    @Override
    public List<DotKhuyenMai_VM> getAllDotKhuyenMais() {
        List<DotKhuyenMai_VM> ds = new ArrayList<>();
        List<DotKhuyenMai> list = this.rs.getAllDotKhuyenMai();
        for (DotKhuyenMai dotKhuyenMai : list) {
            DotKhuyenMai_VM vm = new DotKhuyenMai_VM(dotKhuyenMai.getLoaiMa(),
                    dotKhuyenMai.getMaVoucher(),
                    dotKhuyenMai.getGiaTri(), 
                    dotKhuyenMai.getTenKM(),
                    dotKhuyenMai.getNgaybatDau(),
                    dotKhuyenMai.getNgaybatDau(), 
                    0);
            ds.add(vm);
        }
        return ds;
    }


}
