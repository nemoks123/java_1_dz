package lesson7;

public class Cat {
    private String name;
    private boolean satiety;
    private int quantity;

    public Cat(String name, int quantity) {
        this.name = name;
        this.satiety = false;
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getName() {
        return name;
    }



    public void eat(Plate plate){
        System.out.println("Cat " + name + " try eat... ");
        plate.decrease(this);
    }
    public void satietyAfterEat(){
        this.satiety = true;
    }
    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", Сыт= " + satiety +
                '}';
    }
}
