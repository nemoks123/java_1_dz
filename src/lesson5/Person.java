package lesson5;

public class Person {
    private String fio;
    private String doljnost;
    private String email;
    private String number;
    private int salary;
    private int age;

    public Person(String fio, String doljnost, String email, String number, int salary, int age) {
        this.fio = fio;
        this.doljnost = doljnost;
        this.email = email;
        this.number = number;
        this.salary = salary;
        this.age = age;
    }
    public Person(){
        this("НЕизвестно","Не работает","Почта отсутствует","номер не известен",0,0);

    }

    public void setDoljnost(String doljnost) {
        this.doljnost = doljnost;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFio() {
        return fio;
    }

    public String getDoljnost() {
        return doljnost;
    }

    public String getEmail() {
        return email;
    }

    public String getNumber() {
        return number;
    }

    public int getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }

    public void info(){
        System.out.printf("Сотрудник:  %s  %s  %s %s %d  %d\n", fio,doljnost,email,number,salary,age);
    }
}
