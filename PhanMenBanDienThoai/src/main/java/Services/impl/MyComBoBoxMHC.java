/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services.impl;

/**
 *
 * @author admin
 */
public class MyComBoBoxMHC {
    private Object id;
    private Object ten;
    private Object sDT;

    public MyComBoBoxMHC() {
    }


    public MyComBoBoxMHC(Object id, Object ten, Object sDT) {
        this.id = id;
        this.ten = ten;
        this.sDT = sDT;
    }
    

    
    public String idString(){
        return this.id.toString();
    }

    @Override
    public String toString() {
         return ten.toString()+"-"+sDT.toString();
    }
    
    
}


