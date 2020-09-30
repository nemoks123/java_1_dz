package lesson3;

import java.util.Arrays;
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

//        StringBuilder answer1 = new StringBuilder("%%%%%%%%%%%%%%%");
        String str ;
      //  String answer1;
        while (tmp == 1) {
            str = "%%%%%%%%%%%%%%%";
            System.out.println(Arrays.toString(words));
            number = 0;
          //  answer1 = "";
            int n = random.nextInt(words.length);
            System.out.println("Загадано слово из вышеперечсленных \n Угадайте какое ");
            String answer = "";
            do {
                answer = sc.next(); // Чтобы человек мог ввести сразу несколько слов
                if (answer.equals(words[n])) {
                    System.out.println("Вы отгадали слово! \n Для того чтобы начать сначала нажмите 1" +
                            " , длы выхода 0");
                    tmp = sc.nextInt();
                    break;
                } else {
                    for (int i = 0; i < answer.length(); i++) {
                        for (int j = 0; j < words[n].length() ; j++) {
                            if(i ==j) {// второй массив сделан для того, если вдруг слово будет введено
                                // слишком большое
                                if (answer.charAt(i) == words[n].charAt(i))
                                    str = changeCharInPosition(i, answer.charAt(i), str);
                            }
                        }


                        }

                    }
                         System.out.println("Вы ввели неверное слово попробуйте еще раз!");

                        System.out.println("Введенные правильно символы: " + str);
                }
        while (answer  != words[n]);

        }
    }
    public static String changeCharInPosition(int position, char ch, String str){
        char[] charArray = str.toCharArray();
        charArray[position] = ch;
        return new String(charArray);
    }


}
