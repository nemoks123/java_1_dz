package lesson3;

import java.util.Random;
import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);
    static Random random = new Random();
    public static void main(String[] args) {
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado",
                "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi",
                "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper",
                "pineapple", "pumpkin", "potato"};

        int tmp = 1;
        int number ;



        String answer1;
        while (tmp == 1) {

            number = 0;
            answer1 = "";
            int n = random.nextInt(words.length);
            System.out.println("Загадано слово \n Угадайте какое ");
            String answer = "";
            do {
                answer = sc.next();
                if (answer.equals(words[n])) {
                    System.out.println("Вы отгадали слово! \n Для того чтобы начать сначала нажмите 1" +
                            " , длы выхода 0");
                    tmp = sc.nextInt();
                    break;
                } else {
                    answer1 += words[n].charAt(number);
                    if(answer1.equals(words[n])){
                        System.out.println("Вы проиграли! \n" +
                                "Загаданное слово " + answer1 + "\n Для того чтобы начать сначала нажмите 1" +
                                " для выхода нажмите 0");
                        tmp = sc.nextInt();
                        break;
                    }else{
                    System.out.println("Вы ввели неверное слово попробуйте еще раз!");

                    System.out.println(answer1);
                    number ++;

                    }
                }
            } while (answer != words[n]);
        }
    }


}
