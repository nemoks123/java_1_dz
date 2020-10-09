package lesson5;

public class Main {
    public static void main(String[] args) {
        Person person[] = new Person[5];
        person[0] = new Person("Иванов Иван Алексеевич", "Директор", "i.a.ivanov@mail.ru",
                "89522222225",1500000,47);
        person[1] = new Person("Иванов Александр Михайлович", "Замдиректора", "m.a.ivanov@mail.ru",
                "89564738111",150000,34);
        person[2] = new Person("Петров Петр Владиславович", "Уборщик", "p.v.petrov@mail.ru",
                "89552718593",15000,18);
        person[3] = new Person("Александров Влад Артемович", "Программист", "v.a.alexsandrov@mail.ru",
                "89575829591",100000,23);
        person[4] = new Person("Петров Алексей Андреевич", "Владелец", "a.a.petrov@mail.ru",
                "89512451234",15000000,69);

        for (int i = 0; i <person.length ; i++) {
            if (person[i].getAge() > 40)
            {
                person[i].info();
            }
        }
    }

}
