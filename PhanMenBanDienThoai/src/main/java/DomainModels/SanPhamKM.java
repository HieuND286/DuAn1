/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DomainModels;

/**
 *
 * @author Admin
 */
public class SanPhamKM {
    private SanPham_DM sanPham;
    private DotKhuyenMai dotKhuyenMai;

    public SanPhamKM() {
    }

    public SanPhamKM(SanPham_DM sanPham, DotKhuyenMai dotKhuyenMai) {
        this.sanPham = sanPham;
        this.dotKhuyenMai = dotKhuyenMai;
    }

    public SanPham_DM getSanPham() {
        return sanPham;
    }

    public void setSanPham(SanPham_DM sanPham) {
        this.sanPham = sanPham;
    }

    public DotKhuyenMai getDotKhuyenMai() {
        return dotKhuyenMai;
    }

    public void setDotKhuyenMai(DotKhuyenMai dotKhuyenMai) {
        this.dotKhuyenMai = dotKhuyenMai;
    }
    
    
}
