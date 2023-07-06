/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import DomainModels.DotKhuyenMai;
import DomainModels.SanPhamKM;
import ViewModels.SanPhamKM_VM;

/**
 *
 * @author Admin
 */
public interface ISanPhamKM {
    boolean add(SanPhamKM_VM sanPhamKM);
}
