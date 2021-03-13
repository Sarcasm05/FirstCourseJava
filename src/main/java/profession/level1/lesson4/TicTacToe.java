package main.java.profession.level1.lesson4;

import java.util.Random;
import java.util.Scanner;

public class TicTacToe {
    public static Scanner sc = new Scanner(System.in);
    public static Random rand = new Random();
    public static char[][] map;
    public static final int SIZE = 5;
    public static final int DOTS_TO_WIN = 4;
    public static final int BLOCK_SIZE = 4;
    public static final char DOT_EMPTY = '•';
    public static final char DOT_X = 'X';
    public static final char DOT_O = 'O';


    public static void main(String[] args) {
        initMap();
        printMap();
        while (true) {
            humanTurn();
            printMap();
            if (checkWin(DOT_X)){
                System.out.println("Победил человек!");
                break;
            }
            if (isMapFull()){
                System.out.println("Ничья!");
                break;
            }
            aiTurn();
            printMap();
            if (checkWin(DOT_O)) {
                System.out.println("Победил Искуственный Интеллект");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
        }
        System.out.println("Игра окончена!");
        sc.close();
    }

    public static void initMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }

    public static void printMap() {
        for (int i = 0; i <= SIZE; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void humanTurn() {
        int x, y;
        do {
            System.out.println("Введите координаты ты в формате X Y");
             x = sc.nextInt() - 1;
             y = sc.nextInt() - 1;
        } while (!isCellValid(x,y));
        map[y][x] = DOT_X;
    }

    public static boolean isCellValid(int x, int y) {
        if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) return false;
        return map[y][x] == DOT_EMPTY;
    }

    public static void aiTurn() {
        int x, y;
        do {
            x = rand.nextInt(SIZE);
            y = rand.nextInt(SIZE);
        }while (!isCellValid(x,y));
        map[y][x] = DOT_O;
        System.out.printf("Компьютер пошел в точку %d %d \n", y + 1, x + 1);
    }

    public static boolean checkWin(char symb) {
        for (int i = 0; i < 2; i++) { //проверяю по блокам
            for (int j = 0; j < 2; j++) {
                if (checkDiagonal(symb, i, j ) || checkLanes(symb, i, j))
                    return true;
            }
        }
        return  false;

    }
    //Проверяем горизонтальные и вертикальные линии
    public static boolean checkLanes(char symb, int x, int y){
        boolean cols, rows;
        for (int i = x; i < BLOCK_SIZE + x; i++) {
            cols = true; rows = true;
            for (int j = y; j < BLOCK_SIZE + y; j++) {
                cols &= (map[i][j] == symb);
                rows &= (map[j][i] == symb);
            }
            if (cols || rows) return true;
        }
        return false;
    }
    //Проверяем диагонали
    public static boolean checkDiagonal(char symb, int x , int y){
        boolean right = true, left = true;
        for (int i = x; i < BLOCK_SIZE; i++) {
            right &= (map[i+x][i+y] == symb);
            left &= (map[BLOCK_SIZE-i-1+x][i+y] == symb);
        }
        return right || left;
    }

    public static boolean isMapFull(){
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) return false;
            }
        }
        return true;
    }

}
