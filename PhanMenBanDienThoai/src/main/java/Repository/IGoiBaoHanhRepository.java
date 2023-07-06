/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Repository;

import DomainModels.GoiBaoHanhDomainModel;
import DomainModels.PhieuBaoHanhDomainModel;
import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public interface IGoiBaoHanhRepository {

    ArrayList<GoiBaoHanhDomainModel> getAll();

    int add(GoiBaoHanhDomainModel p);

    int update(GoiBaoHanhDomainModel p);

    int delete(GoiBaoHanhDomainModel p);
}
