package lesson4;

import javax.swing.*;
import java.util.Random;
import java.util.Scanner;
//все выглядит хуже некуда но для второго задания работает, тип работает если нужно собрать все элементы
// типо 3 из 3 или на 1 меньше, если делать на 2 меньше(3 из 5), то мне потребуется еще миллион кривого кода

public class Krest {
    static final int SIZE = 3;
    static final char DOT_X = 'X';
    static final char DOT_O = 'O';
    static final char DOT_EMPTY = '.';
    static char[][] map;
    static Scanner sc;
    static Random random;

    public Krest() {
    }

    public static void main(String[] args) {
        initMap();
        printMap();

        while (true) {
            humanTurn();
            printMap();
            if (checkWin('X')) {
                System.out.println("Вы победитель!");
                break;
            }

            if (isFull()) {
                System.out.println("Ничья!");
                break;
            }

            aiTurn();
            printMap();
            if (checkWin('O')) {
                System.out.println("Комьютер победил!");
                break;
            }

            if (isFull()) {
                System.out.println("Ничья!");
                break;
            }
        }

    }

    static void initMap() {
        map = new char[SIZE][SIZE];

        for (int i = 0; i < SIZE; ++i) {
            for (int j = 0; j < SIZE; ++j) {
                map[i][j] = '.';
            }
        }

    }

    static void printMap() {
        System.out.print("  ");

        int i;
        for (i = 0; i < SIZE; ++i) {
            System.out.print(i + 1 + " ");
        }

        System.out.println();

        for (i = 0; i < SIZE; ++i) {
            System.out.print(i + 1 + " ");

            for (int j = 0; j < SIZE; ++j) {
                System.out.print(map[i][j] + " ");
            }

            System.out.println();
        }

    }

    static void humanTurn() {
        int x;
        int y;
        do {
            System.out.println("Введите координаты X и Y");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        } while (!isCellValid(y, x));

        map[y][x] = 'X';
    }

    static void aiTurn() {
        int x;
        int y;
        do {
            x = random.nextInt(SIZE);
            y = random.nextInt(SIZE);
        } while (!isCellValid(y, x));

        map[y][x] = 'O';
    }

    static boolean isCellValid(int y, int x) {
        if (x >= 0 && y >= 0 && x < SIZE && y < SIZE) {
            return map[y][x] == '.';
        } else {
            return false;
        }
    }

    static boolean isFull() {
        for (int i = 0; i < SIZE; ++i) {
            for (int j = 0; j < SIZE; ++j) {
                if (map[i][j] == '.') {
                    return false;
                }
            }
        }

        return true;
    }

    static boolean checkWin(char c) {
        for (int i = 0; i < SIZE; i++) {

            int tmp4 = 1;
            int tmp5 = 1;
            for (int j = 0; j < SIZE - 2; j++) {
                if (map[j][j + 1] == c && map[j + 1][j + 2] == c) {
                    tmp4++;
                }
                if (map[j + 1][j ] == c && map[j + 2][j + 1] == c) {
                    tmp5++;
                }
            }
            if (tmp4 == SIZE - 1  || tmp5 == SIZE)
                return true;
        }
        for (int i = 0; i < SIZE; i++) {
            int tmp = 1;
            int tmp1 = 1;
            int tmp2 = 1;
            int tmp3 = 1;

            for (int j = 0; j < SIZE - 1; j++) {
                if (map[i][j] == c && map[i][j + 1] == c) {
                    tmp++;
                } else if (map[j][i] == c && map[j + 1][i] == c) {
                    tmp1++;
                } else if (map[j][j] == c && map[j + 1][j + 1] == c) {
                    tmp2++;
                } else if (map[SIZE - j - 1][j] == c) {
                    tmp3++;
                } // if (map[j][j + 1] == c && map[j + 1][SIZE] == c){
                // tmp4++;
                // }
                // когда полностью собрать типо 3 из 3
                        if (tmp1 == SIZE || tmp == SIZE  || tmp2 == SIZE  || tmp3 == SIZE  )
                           return  true;
                // когда без 4 из 5
         //       if ( tmp1 == SIZE - 1 || tmp == SIZE - 1 || tmp2 == SIZE - 1 || tmp3 == SIZE - 1 )
           //         return true;


            }
        }


        return false;
    }
    // if (map[0][0] == c && map[0][1] == c && map[0][2] == c) {
    //      return true;
    //   } else if (map[1][0] == c && map[1][1] == c && map[1][2] == c) {
    //       return true;
    //    } else if (map[2][0] == c && map[2][1] == c && map[2][2] == c) {
    //        return true;
    //  } else if (map[0][0] == c && map[1][0] == c && map[2][0] == c) {
    //      return true;
    //  } else if (map[0][1] == c && map[1][1] == c && map[2][1] == c) {
    //      return true;
    //  } else if (map[0][2] == c && map[1][2] == c && map[2][2] == c) {
    //       return true;
    // } else


    static {
        sc = new Scanner(System.in);
        random = new Random();
    }
}
