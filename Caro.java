package btap04;

import static java.lang.Math.abs;
import java.util.Scanner;

public class Lesson05 {

    static char PLAYER = 'X';
    static char[][] MAP = new char[3][3];
    static Scanner sc = new Scanner(System.in);
    static int x, y;

    public static void main(String[] args) {
        // game co caro 3x3, 2 nguoi choi voi nhau, di nuoc bang cach nhap toa do !
        for (int i = 0; i < MAP.length; i++) {
            for (int j = 0; j < MAP.length; j++) {
                MAP[i][j] = '-';
            }
        }
        while (true) {
            show();
            move();

            if (checkCol() == MAP.length || checkRow() == MAP.length
                    || checkPDiagonal() == MAP.length || checkSDiagonal() == MAP.length) {
                System.out.println("Player " + PLAYER + " win");
                break;
            }
            swap();
        }
    }

    static void show() {
        for (int i = 0; i < MAP.length; i++) {
            for (int j = 0; j < MAP.length; j++) {
                System.out.print(MAP[i][j] + " ");
            }
            System.out.println("");
        }
    }

    static void move() {
        System.out.println("Player " + PLAYER + ": ");
        String input = sc.nextLine();
        int x = (int) input.charAt(0) - 48;
        int y = (int) input.charAt(2) - 48;
        MAP[x][y] = PLAYER;
    }

    static void swap() {
        if (PLAYER == 'X') {
            PLAYER = 'O';
        } else {
            PLAYER = 'X';
        }
    }

    static int checkRow() {
        int count = 0;
        for (int i = 0; i < MAP.length; i++) {
            if (MAP[x][(y + i) % MAP.length] == PLAYER) {
                count++;
            }
        }
        return count;
    }

    static int checkCol() {
        int count = 0;
        for (int i = 0; i < MAP.length; i++) {
            if (MAP[(x + i) % MAP.length][y] == PLAYER) {
                count++;
            }
        }
        return count;
    }

    static int checkPDiagonal() {
        int count = 0;
        for (int i = 0; i < MAP.length; i++) {
            if (MAP[i][i] == PLAYER) {
                count++;
            }
        }
        return count;
    }

    static int checkSDiagonal() {
        int count = 0;
        for (int i = 0; i < MAP.length; i++) {
            if (MAP[abs(MAP.length - i - 1)][i] == PLAYER) {
                count++;
            }
        }
        return count;
    }
}
