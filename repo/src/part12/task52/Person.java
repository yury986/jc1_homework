package part12.task52;

import java.io.Serializable;
import java.util.Random;

public class Person implements Serializable {

    private  String name;

    private  String surname;

    private  int age;

    private final String [] names = {"Андрей","Сергей","Виктор","Геннадий","Юрий","Леонид","Михаил","Евгений","Иван","Дмитрий"};

    private final String [] surnames = {"Малахов","Светлаков","Сухоруков","Панайотов","Жиглов","Шарапов","Биланов","Градский","Безруков","Спеваков"};

    public Person() {
        Random random = new Random();
        name = String.valueOf(names[random.nextInt(names.length)]);
        surname = String.valueOf(surnames[random.nextInt(surnames.length)]);
        age = (int)(Math.random()*60 + 10);
    }

    public int getAge() {return age;}

    public String getName() {return name;}

    public String getSurname() {return surname;}

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String[] getNames() {
        return names;
    }

    public String[] getSurnames() {
        return surnames;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }
}
