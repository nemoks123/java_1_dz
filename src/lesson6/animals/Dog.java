package lesson6.animals;

public class Dog extends Animals{
    static int count;
    public Dog(String name, String color, int age) {
        super(name, color, age);
        count++;
    }

    @Override
    public void run(int distance) {
        if (distance > 500){
            System.out.println(name + "не может пробежать более 200 метров");
        }else {
            System.out.println(name + " пробежал "+ distance + "метров");
        }
    }

    @Override
    public void swim(int distance) {
        if (distance > 10){
            System.out.println("Dog " + name + "может плыть не более 10м");
        }else {
            System.out.println(name + " проплыл "  + distance + "м");
        }
    }
    public static void countDog(){
        System.out.println("Всего " + count + " собак");
    }
}
