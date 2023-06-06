package part16.task63;

import java.util.Random;

public class Person implements Comparable <Person>{

    private  String name;

    private  String surname;

    private  int age;

    private final String [] names = {"Андрей","Сергей","Виктор","Геннадий","Юрий","Леонид","Михаил","Евгений","Иван","Дмитрий"};

    private final String [] surnames = {"Малахов","Светлаков","Сухоруков","Панайотов","Жиглов","Шарапов","Биланов","Градский","Безруков","Спеваков"};

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }
   public Person() {
        Random random = new Random();
        name = String.valueOf(names[random.nextInt(names.length)]);
        surname = String.valueOf(surnames[random.nextInt(surnames.length)]);
        age = (int) (Math.random() * 60 + 10);
    }

    public int getAge() {

        return age = (int) (Math.random() * 60 + 10);
    }

        public String getName() {
        String [] names = {"Андрей","Сергей","Виктор","Геннадий","Юрий","Леонид","Михаил","Евгений","Иван","Дмитрий"};
        return names[(int)(Math.random()* names.length)];
    }

        public String getSurname() {

            return surnames[(int)(Math.random()*surnames.length)];
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
                    '}'+"\n";
    }




    @Override
    public int compareTo(Person o) {
        return this.age - o.getAge();
    }
}
