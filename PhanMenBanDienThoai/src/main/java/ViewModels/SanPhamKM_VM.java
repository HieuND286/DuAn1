/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ViewModels;

import DomainModels.SanPhamKM;
import Viewmodels.SanPham_VM;

/**
 *
 * @author Admin
 */
public class SanPhamKM_VM {
    private SanPham_VM sanPham;
    private DotKhuyenMai_VM dotKhuyenMai;

    public SanPhamKM_VM() {
    }

    public SanPhamKM_VM(SanPham_VM sanPham, DotKhuyenMai_VM dotKhuyenMai) {
        this.sanPham = sanPham;
        this.dotKhuyenMai = dotKhuyenMai;
    }

    public SanPham_VM getSanPham() {
        return sanPham;
    }

    public void setSanPham(SanPham_VM sanPham) {
        this.sanPham = sanPham;
    }

    public DotKhuyenMai_VM getDotKhuyenMai() {
        return dotKhuyenMai;
    }

    public void setDotKhuyenMai(DotKhuyenMai_VM dotKhuyenMai) {
        this.dotKhuyenMai = dotKhuyenMai;
    }
    
    
}
