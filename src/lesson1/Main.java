package lesson1;

public class Main {
    public static void main(String[] args) {
        // Задание 2
        int i = 5;
        byte b = 1;
        short s = 155;
        long l = 1555;
        float f = 6.94F;
        double d = 4.1123;
        char c = 'a';
        boolean b1 = true;
        String str = "Hello world!";

        System.out.println("Ответ = " + proiz(5, 6, 6, 3));
        System.out.println(sum(24, 7));
        proverka(0);
        System.out.println(proverka1(-11));
        Hello("Влад");
        year(1901);
    }

    //Задание 3
    static double proiz(int a, int b, int c, int d) {
        return a * (b + (c / d));
    }

    //Задание 4
    static boolean sum(int a, int b) {
        if (a + b >= 10 && a + b <= 20) {
            return true;
        } else {
            return false;
        }
    }
    //Задание 5
    static void proverka(int a) {
        if (a >= 0) {
            System.out.println("Число " + a + " положительное");
        } else {
            System.out.println("Число " + a + " отрицательное");
        }
    }
    //Задание 6
    static boolean proverka1(int a) {
        if (a < 0) {
            return true;
        } else return false; //в задании на лекции было написано делать вывод true если отрицательно, иначе false
        //а в домашке в задании сказано только про true и ни слова про false

    }
    //Задание 7
    static void Hello(String a) {
        System.out.println("Привет, " + a + "!");
    }
    //Задание 8
    static void year(int a) {
        if (((a % 100 == 0) && (a % 400 != 0)) || (a % 4 != 0)) {
            System.out.println(a + " год не високосный");
        }
        else {
            System.out.println(a + " год високосный");
        }
    }
}
