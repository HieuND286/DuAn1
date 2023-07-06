/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services.impl;

import DomainModels.GoiBaoHanhDomainModel;
import ViewModels.GoiBaoHanhviewModel;
import DomainModels.PhieuBaoHanhDomainModel;
import Repository.impl.GoiBaoHanhRepo;
import Services.IGoiBaoHanhService;
import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public class GoiBaoHanhService implements IGoiBaoHanhService {

    GoiBaoHanhRepo repo = new GoiBaoHanhRepo();

    @Override
    public ArrayList<GoiBaoHanhviewModel> getAll() {
        ArrayList<GoiBaoHanhDomainModel> list = this.repo.getAll();
        ArrayList<GoiBaoHanhviewModel> listviewmodel = new ArrayList<>();
        for (GoiBaoHanhDomainModel p : list) {
            listviewmodel.add(new GoiBaoHanhviewModel(p.getId(), p.getTen(), p.getTrangThai()));
        }
        return listviewmodel;
    }

    @Override
    public int add(GoiBaoHanhviewModel p) {
        int add = this.repo.add(new GoiBaoHanhDomainModel(p.getId(), p.getTen(), p.getTrangThai()));
        return add;
    }

    @Override
    public int update(GoiBaoHanhviewModel p) {
        int update = this.repo.update(new GoiBaoHanhDomainModel(p.getId(), p.getTen(), p.getTrangThai()));
        return update;
    }

    @Override
    public int delete(GoiBaoHanhviewModel p) {
int delete = this.repo.delete(new GoiBaoHanhDomainModel(p.getId(), p.getTen(), p.getTrangThai()));
        return delete;    }

}
