package lesson3;

import java.util.Random;
import java.util.Scanner;

public class Hw3 {
    static Scanner sc = new Scanner(System.in);
    static Random random = new Random();
    public static void main(String[] args) {

        int temp;
        int answer ;
        int tmp = 1;
        while (tmp == 1) {
            int question = random.nextInt(10);
            temp = 3;
            System.out.println("Компьютер загадал число от 0 до 9, попробуйте его угадать \n" +
                    "У вас есть " + temp + " попытки ");
            do {
                answer = sc.nextInt();
                if (answer == question) {
                    System.out.println("Вы отгадали, поздравляю!" +
                            "\n Хотите попробовать еще раз? Если да, то введите 1, если нет, то 0");
                    tmp = sc.nextInt();
                    break;
                } else {
                    if(temp == 1)
                    {
                        System.out.println("Вы проиграли!! Искомоме число = " + question +
                                " \n Для того чтобы начать сначала введите 1 , для выхода 0 ");
                        tmp = sc.nextInt();
                        break;
                    }
                    if(answer < question) {
                        temp--;
                        System.out.println("искомое число больше, попробуйте еще раз \n" +
                                "У вас осталось " + temp + " попыток");

                    }
                    else
                    {
                        temp--;
                        System.out.println("Искомое число меньше, попробуйте еще раз \n" +
                                " У вас осталось " + temp + " попыток");

                    }
                }

            } while (answer != question) ;
        }
    }
}
