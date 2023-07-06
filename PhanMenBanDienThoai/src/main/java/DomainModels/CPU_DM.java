/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DomainModels;

/**
 *
 * @author admin
 */
public class CPU_DM {
    private String idCPU;
    private String maCPU;
    private String tenCPU;

    public CPU_DM() {
    }

    public CPU_DM(String idCPU) {
        this.idCPU = idCPU;
    }
    
    

    public CPU_DM(String idCPU, String maCPU, String tenCPU) {
        this.idCPU = idCPU;
        this.maCPU = maCPU;
        this.tenCPU = tenCPU;
    }

    public String getIdCPU() {
        return idCPU;
    }

    public void setIdCPU(String idCPU) {
        this.idCPU = idCPU;
    }

    public String getMaCPU() {
        return maCPU;
    }

    public void setMaCPU(String maCPU) {
        this.maCPU = maCPU;
    }

    public String getTenCPU() {
        return tenCPU;
    }

    public void setTenCPU(String tenCPU) {
        this.tenCPU = tenCPU;
    }

    
}
