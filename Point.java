/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package point;

/**
 *
 * @author thang
 */
public class Point {

    int x, y, z;

    public Point() {

    }

    public Point(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public void show() {
        System.out.println("(" + this.x + "," + this.y + "," + this.z + ")");
    }
}

