package lesson6;

import lesson6.animals.*;

public class Main {
    public static void main(String[] args) {

        Cat cat = new Cat("Bobik", "white", 3);
        Cat cat1 = new Cat("Murzik", "white", 7);
        Dog dog = new Dog("Captain", "white", 5);
        Dog dog1 = new Dog("Tuzik", "black", 9);
        cat.printInfo();
        cat.run(200);
        cat1.swim(10);
        dog1.swim(6);
        dog.run(455);
        Animals.countanimals();
        Cat.countCat();
        Dog.countDog();

    }
}
