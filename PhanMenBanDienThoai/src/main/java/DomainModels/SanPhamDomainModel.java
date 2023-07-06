/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DomainModels;

/**
 *
 * @author DELL
 */
public class SanPhamDomainModel {
    
 private String IDSP ;
 private String Ma ;
 private String Ten ;

    public SanPhamDomainModel() {
    }

    public SanPhamDomainModel(String IDSP, String Ma, String Ten) {
        this.IDSP = IDSP;
        this.Ma = Ma;
        this.Ten = Ten;
    }

    public String getIDSP() {
        return IDSP;
    }

    public void setIDSP(String IDSP) {
        this.IDSP = IDSP;
    }

    public String getMa() {
        return Ma;
    }

    public void setMa(String Ma) {
        this.Ma = Ma;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String Ten) {
        this.Ten = Ten;
    }
 
}
