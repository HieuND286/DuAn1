/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Services;

import java.util.List;
import DomainModels.DotKhuyenMai;
import ViewModels.DotKhuyenMai_VM;

/**
 *
 * @author Admin
 */
public interface IDotKhuyenMaiService {
        String add(DotKhuyenMai_VM dkm);
        String update(DotKhuyenMai_VM dkm, String maVoucher);
        List<DotKhuyenMai_VM> getAllDotKhuyenMais();
}
