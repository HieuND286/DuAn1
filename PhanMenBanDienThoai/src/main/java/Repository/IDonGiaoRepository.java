/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repository;

import DomainModels.DonGiao_DM;
import java.util.ArrayList;


/**
 *
 * @author 84339
 */
public interface IDonGiaoRepository {
    boolean them(DonGiao_DM donGiao);
    boolean sua(DonGiao_DM donGiao);
    ArrayList<DonGiao_DM> getAllDonGiao();
    ArrayList<DonGiao_DM> getDonGiaoByMa(String ma);
}
