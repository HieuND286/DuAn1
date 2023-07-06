/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Services;

import ViewModels.GoiBaoHanhviewModel;
import ViewModels.PhieuBaoHanhViewModels;
import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public interface IGoiBaoHanhService {

    ArrayList<GoiBaoHanhviewModel> getAll();

    int add(GoiBaoHanhviewModel p);

    int update(GoiBaoHanhviewModel p);

    int delete(GoiBaoHanhviewModel p);
}
