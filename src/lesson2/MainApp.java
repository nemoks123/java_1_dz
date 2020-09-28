package lesson2;

public class MainApp {
    public static void main(String[] args) {
        // Задание 1
        int n =10;
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = (int) Math.round(Math.random());
            System.out.print(a[i] + " ");
        }
        System.out.println(   );
        for (int i = 0; i < n; i++) {
            if (a[i] == 0) {
                a[i] = 1;
            } else {
                a[i] = 0;
            }
            System.out.print(a[i] + " " );
        }
        System.out.println();
        // Задание 2
        int[] b = new int[8];
        b[0] =0;
        for (int i = 1; i < 8; i++) {
            b[i] = b[i - 1] + 3;

        }
        for (int i = 0; i < 8; i ++)
        {
            System.out.print(b[i] + " ");
        }
        System.out.println();
        //Задание 3
        int[] c =  new int[] { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 } ;

        for (int i = 0; i < c.length; i++) {
            if (c[i] < 6) {
                c[i] = c[i] * 2;
            }
            System.out.print(c[i] + " ");
        }
        System.out.println();
        //Задание 4
        int[][] d = new int[n][n];
        for(int i = 0; i < n; i++)
        {
            d[i][i] = 1;
        }
        for (int i = 0; i < n; i++) {
            System.out.println();
            for (int j = 0; j < n; j++) {
                System.out.print(d[i][j] + " ");
            }
        }
        System.out.println();
        //Задание 5
        int[] e = new int[n];
        int min = 0 ;
        int max  = 0  ;
        for (int i = 0; i <n ; i++) {
            e[i] = (int) Math.round(Math.random() * 100);
            System.out.print(e[i] + " ");
        }
        System.out.println();
        for(int i = 1; i  <n; i++)
        {
            min = Math.min(e[i],e[i-1]);
            max = Math.max(e[i],e[i-1]);
        }
        System.out.println("Минимальное значение в массиве = " + min + "\n Максимальное значение в массиве = " + max);
    }

}
