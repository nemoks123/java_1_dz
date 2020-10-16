package lesson7;

public class Plate {
    private int  food;

    public Plate(int food) {
        this.food = food;
    }

    public int getQuantity() {
        return food;
    }
    public void decrease(Cat cat){
        food -= cat.getQuantity();
        if(food < 0){
            System.out.println("Cat " + cat.getName() + " не сможет наестся, поэтому не ест");
            food +=cat.getQuantity();
        }else {
            cat.satietyAfterEat();
        }
    }
    public void additionFood(int amount){
        food += amount;
    }
}
