/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Repository;

import java.util.List;
import DomainModels.DotKhuyenMai;

/**
 *
 * @author Admin
 */
public interface IDotKhuyenMaiRepository {
        boolean add(DotKhuyenMai dkm);
        boolean update(DotKhuyenMai dkm, String maVoucher);
        List<DotKhuyenMai> getAllDotKhuyenMai();

}
