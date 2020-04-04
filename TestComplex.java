/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestComplex;

import java.util.Scanner;

/**
 *
 * @author Thắng Đẹp Trai
 *
 */
public class TestComplex {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Số thứ nhất: ");
        System.out.print("Nhập thực và ảo: ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        Complex a = new Complex(x, y);
        System.out.println("Số thứ hai: ");
        System.out.print("Nhập thực và ảo: ");
        x = sc.nextInt();
        y = sc.nextInt();
        Complex b = new Complex(x, y);
        System.out.println(a + "+" + b + "=" + a.cong(b));
        System.out.println(a + "-" + b + "=" + a.tru(b));
        System.out.println(a + "*" + b + "=" + a.nhan(b));
        System.out.println(a + "/" + b + "=" + a.chia(b));

    }

}


    

