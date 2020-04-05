/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestComplex;

/**
 *
 * @author Thắng Đẹp Trai
 */
public class Complex {

    private int thuc, ao;

    public Complex() {

    }

    public Complex(int a) {
        this.thuc = thuc;
        this.ao = 0;
    }

//    public Complex() {
//        thuc = 0;
//        ao = 0;
//    }
    public Complex(int thuc, int ao) {
        this.thuc = thuc;
        this.ao = ao;
    }

    public int getThuc() {
        return thuc;
    }

    public void setThuc(int thuc) {
        this.thuc = thuc;
    }

    public int getAo() {
        return ao;
    }

    public void setAo(int ao) {
        this.ao = ao;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        if (this.ao < 0) {
            return thuc + "+" + this.ao + "i";
        } else {
            return thuc + this.ao + "i";
        }
    }

    public Complex cong(Complex b) {
        Complex c = new Complex();
        c.thuc = thuc + b.thuc;
        c.ao = ao + b.ao;
        return c;
    }

    public Complex tru(Complex b) {
        Complex c = new Complex();
        c.thuc = thuc - b.thuc;
        c.ao = ao - b.ao;
        return c;
    }

    public Complex nhan(Complex b) {
        Complex c = new Complex();
        c.thuc = thuc * b.thuc - ao * b.ao;
        c.ao = thuc * b.ao + ao * b.thuc;
        return c;
    }

    public Complex chia(Complex b) {
        Complex c = new Complex();
        c.thuc = (thuc * b.thuc - ao * b.ao) / (int) (Math.pow(b.thuc, 2) - Math.pow(b.ao, 2));
        c.ao = (ao * b.thuc - thuc * b.ao) / (int) (Math.pow(b.thuc, 2) - Math.pow(b.ao, 2));
        return c;

    }
}
