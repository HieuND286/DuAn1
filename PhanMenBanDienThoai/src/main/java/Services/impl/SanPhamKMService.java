/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services.impl;

import Repository.impl.SanPhamKMRepositoryImpl;
import Services.ISanPhamKMService;
import ViewModels.SanPhamKM_VM;

/**
 *
 * @author Admin
 */
public class SanPhamKMService implements ISanPhamKMService {

    private SanPhamKMRepositoryImpl rs = new SanPhamKMRepositoryImpl();

    @Override
    public String add(SanPhamKM_VM sanPhamKM) {
        SanPhamKM_VM SPKM = new SanPhamKM_VM(sanPhamKM.getSanPham(), sanPhamKM.getDotKhuyenMai());
        if (this.rs.add(SPKM) == true) {
            return "thành công";
        } else {
            return "thất bại";
        }
    }

}
