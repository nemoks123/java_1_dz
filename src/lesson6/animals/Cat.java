package lesson6.animals;

public class Cat extends Animals{
    static int count;
    public Cat(String name, String color, int age) {
        super(name, color, age);
        count++;
    }

    @Override
    public void run(int distance) {
        if (distance > 200){
            System.out.println(name + "не может пробежать более 200 метров");
        }else {
            System.out.println(name + " пробежал "+ distance + " метров");
        }
    }
    @Override
    public void swim(int distance) {
        System.out.println( name + " не умеют плавать");
    }
    public static void countCat(){
        System.out.println("Всего " + count + " кошек");
    }

}
