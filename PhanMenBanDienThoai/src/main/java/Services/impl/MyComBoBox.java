/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services.impl;

/**
 *
 * @author admin
 */
public class MyComBoBox {
    private Object id;
    private Object ten;

    public MyComBoBox() {
    }

    public MyComBoBox(Object id, Object ten) {
        this.id = id;
        this.ten = ten;
    }


    
    public String idString(){
        return this.id.toString();
    }

    @Override
    public String toString() {
        return ten.toString();
    }
    
    
}


