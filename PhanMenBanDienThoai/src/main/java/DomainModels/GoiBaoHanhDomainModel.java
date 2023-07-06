/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DomainModels;

/**
 *
 * @author DELL
 */
public class GoiBaoHanhDomainModel {

    private String id;
    private String ten;
    private int trangThai;

    public GoiBaoHanhDomainModel(String id, String ten, int trangThai) {
        this.id = id;
        this.ten = ten;
        this.trangThai = trangThai;
    }

    public GoiBaoHanhDomainModel() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(int trangThai) {
        this.trangThai = trangThai;
    }

}
