package lesson6.animals;

public class Animals {
    protected String name;
    protected String color;
    protected int age;
    static int count;

    public Animals(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
        count++;
    }
    public  void run(int distance){
        System.out.println("Animal run " + distance + " м");
    }
    public void printInfo(){
        System.out.printf("%s %s %d\n " , name,color,age);
    }
    public void swim(int distance){
        System.out.println("Animal swim " + distance + " м");
    }
    public static void countanimals(){
        System.out.println("Всего " + count + " животных");
    }
}
