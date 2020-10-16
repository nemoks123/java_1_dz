package lesson7;

public class Main {
    public static void main(String[] args) {
        Cat[] cats = {
               new Cat ("Barsik", 10),
               new Cat ("Murzik", 5),
                new Cat ("Tom", 15),
                new Cat ("Tomaz", 2),
                new Cat ("Stefan", 5),
                new Cat ("Tapok", 7),
        };
        Plate plate = new Plate(24);
        for (int i = 0; i < cats.length; i++) {
            cats[i].eat(plate);
            System.out.println(cats[i].toString());
        }

    }
}
