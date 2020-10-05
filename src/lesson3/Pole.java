package lesson3;

import java.io.IOException;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Pole {

    static Scanner sc = new Scanner(System.in);
    static Random random = new Random();
    static StringBuffer output = new StringBuffer();
    public static void main(String[] args) throws IOException {
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado",
                "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi",
                "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper",
                "pineapple", "pumpkin", "potato"};

        String tmp = "да";


        String str ;
        String str1;

        char ch;
        while (tmp.equals("да")) {
            str = "%%%%%%%%%%%%%%%";
            System.out.println(Arrays.toString(words));

            int n = random.nextInt(words.length);
            StringBuffer str2 = new StringBuffer(words[n].length());
            int igroki = 1 ;

            System.out.println("Мы загадали для вас одно из вышеперечисленных слов" +
                    " \n Угадайте какое \n ");
            String answer = "";
            do {
                System.out.println("Ход игрока " + igroki);
                System.out.println(nachalo());
                String answer1 = sc.next();

                if (answer1.equals("букву"))
            {
                System.out.println("Говорите букву");
               ch = (char) System.in.read() ;
                str1 = Symbol(ch,words[n],str,str2);

                if (str1.equals(str))
                {
                    System.out.println("Вашей буквы нет в слове");
                    igroki++;
                    if (igroki > 3)
                        igroki = 1;
                }else {
                    System.out.println("Вы отгадали букву\n" + str1);
                    str = str1;

                    if(str2.equals(words[n]))
                    {

                        System.out.println("Победа игрока номер " + igroki);
                        break;
                    }
                }
            } else if (answer1.equals("слово"))
                {
                    System.out.println("Говорите слово");
                    answer = sc.next();
                    System.out.println(Slovo(answer,words[n], igroki));
                    tmp = sc.next();
                    break;
                }
                else {
                    System.out.println("Введите именно \"слово\" или \"букву\"");
                }
            }
            while (answer  != words[n]);

        }
    }
    public static String changeCharInPosition(int position, char ch, String str){
        char[] charArray = str.toCharArray();
        charArray[position] = ch;
        return new String(charArray);
    }
    public static String Symbol(char symbol,String word,String str,StringBuffer str2 )
    {

        int temp = 0;

            for (int j = 0; j < word.length() ; j++) {
                {
                    if ( word.charAt(j) == symbol) {
                        str = changeCharInPosition(j, word.charAt(j), str);
                        temp++;
                        str2.insert(j,word.charAt(j));

                    }
                    else
                        str2.insert(j,'%');
                }
            }
        if(temp == 0)
        {
        return str;
        }
        else return str ;

    }
    public static String Slovo(String answer, String word,int igrok)
    {
        if (answer.equals(word)) {
            return "Игрок" + igrok + "отгадал слово! \n Хотите сыграть еще раз?";

        } else {
            return "К сожалению вы не отгадали слово и проиграли,\n" +
                    " хотите попробовать еще раз?";
        }
    }
    public static String nachalo()
    {
        return "Что будете вводить слово или букву?\n" +
                "Если введете неверное слово, то вы проиграете!!!";
    }

}
