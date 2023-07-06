/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Services;

import DomainModels.NhanVien_DM;
import ViewModels.NhanVien_VM;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Acer
 */
public interface INhanVienService {
    public List<NhanVien_DM> getAll();

    public List<NhanVien_VM> getAllNhanVien();
    
    public List<NhanVien_VM> getAllNhanVienNghi();
    
    public String Add(NhanVien_VM x);

    public String Update(NhanVien_VM x);
    
    public String nghiViec(NhanVien_VM x);
    
    public String hoanLai(NhanVien_VM x);


    
}

