/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btap04;

/**
 *
 * @author Admin
 */
public class TestPhanSo {
     
    public static void main(String[] args) {
        PhanSo phanSo1=new PhanSo(16,3);    
        PhanSo phanSo2=new PhanSo(4,8); 
         
        
        phanSo1.congPhanSo(phanSo2);
        phanSo1.truPhanSo(phanSo2);
        phanSo1.nhanPhanSo(phanSo2);
        phanSo1.chiaPhanSo(phanSo2);
    }
     
}
    

