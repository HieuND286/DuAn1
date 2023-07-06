/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Repository;

import DomainModels.NhanVien_DM;
import java.util.ArrayList;

/**
 *
 * @author Acer
 */
public interface INhanVienRepository {

    boolean add(NhanVien_DM x);

    boolean update(NhanVien_DM x);

    boolean nghiViec(NhanVien_DM x);

    boolean hoanLai(NhanVien_DM x);

    ArrayList<NhanVien_DM> getAllNhanVien();

    ArrayList<NhanVien_DM> getAllNhanVienNghi();

    ArrayList<NhanVien_DM> getSea(String Ma);

}
