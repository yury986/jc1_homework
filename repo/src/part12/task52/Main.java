package part12.task52;


import java.io.File;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setName("Andrey");
        person1.setSurname("Malahov");
        person1.setAge(51);
        System.out.println(person1.getName());
        System.out.println(person1.getSurname());
        System.out.println(person1.getAge());

        Person person2 = new Person();
        person2.setName("Сергей");
        person2.setSurname("Светлаков");
        person2.setAge(45);
        System.out.println(person2.getName());
        System.out.println(person2.getSurname());
        System.out.println(person2.getAge());

        Person person3 = new Person();
        person3.setName("Виктор");
        person3.setSurname("Сухоруков");
        person3.setAge(71);
        System.out.println(person3.getName());
        System.out.println(person3.getSurname());
        System.out.println(person3.getAge());

        Person person4 = new Person();
        person4.setName("Геннадий");
        person4.setSurname("Хазанов");
        person4.setAge(77);
        System.out.println(person4.getName());
        System.out.println(person4.getSurname());
        System.out.println(person4.getAge());

        Person person5 = new Person();
        person5.setName("Юрий");
        person5.setSurname("Гальцев");
        person5.setAge(62);
        System.out.println(person5.getName());
        System.out.println(person5.getSurname());
        System.out.println(person5.getAge());

        Person person6 = new Person();
        person6.setName("Дарья");
        person6.setSurname("Домрачева");
        person6.setAge(36);
        System.out.println(person6.getName());
        System.out.println(person6.getSurname());
        System.out.println(person6.getAge());

        Person person7 = new Person();
        person7.setName("Елена");
        person7.setSurname("Темникова");
        person7.setAge(38);
        System.out.println(person7.getName());
        System.out.println(person7.getSurname());
        System.out.println(person7.getAge());

        Person person8 = new Person();
        person8.setName("Анна");
        person8.setSurname("Седакова");
        person8.setAge(40);
        System.out.println(person8.getName());
        System.out.println(person8.getSurname());
        System.out.println(person8.getAge());

        Person person9 = new Person();
        person9.setName("Виктория");
        person9.setSurname("Складчикова");
        person9.setAge(32);
        System.out.println(person9.getName());
        System.out.println(person9.getSurname());
        System.out.println(person9.getAge());

        Person person10 = new Person();
        person10.setName("Александр");
        person10.setSurname("Панайотов");
        person10.setAge(38);
        System.out.println(person10.getName());
        System.out.println(person10.getSurname());
        System.out.println(person10.getAge());

        String destFileName = String.valueOf(new File("person.txt"));
        System.out.println("Save to " + destFileName);

        boolean result1 = new PersonWriter().writeToFile(person1, destFileName);
        if (result1) {
            System.out.println("Saved person1 to file successfully");
        } else {
            System.out.println("Saved person1 to file failure");
        }

        boolean result2 = new PersonWriter().writeToFile(person2, destFileName);
        if (result2) {
            System.out.println("Saved person2 to file successfully");
        } else {
            System.out.println("Saved person2 to file failure");
        }

        boolean result3 = new PersonWriter().writeToFile(person3, destFileName);
        if (result3) {
            System.out.println("Saved person3 to file successfully");
        } else {
            System.out.println("Saved person3 to file failure");
        }

        boolean result4 = new PersonWriter().writeToFile(person4, destFileName);
        if (result4) {
            System.out.println("Saved person4 to file successfully");
        } else {
            System.out.println("Saved person4 to file failure");
        }

        boolean result5 = new PersonWriter().writeToFile(person5, destFileName);
        if (result5) {
            System.out.println("Saved person5 to file successfully");
        } else {
            System.out.println("Saved person5 to file failure");
        }

        boolean result6 = new PersonWriter().writeToFile(person6, destFileName);
        if (result6) {
            System.out.println("Saved person6 to file successfully");
        } else {
            System.out.println("Saved person6 to file failure");
        }

        boolean result7 = new PersonWriter().writeToFile(person7, destFileName);
        if (result7) {
            System.out.println("Saved person7 to file successfully");
        } else {
            System.out.println("Saved person7 to file failure");
        }

        boolean result8 = new PersonWriter().writeToFile(person8, destFileName);
        if (result8) {
            System.out.println("Saved person8 to file successfully");
        } else {
            System.out.println("Saved person8 to file failure");
        }

        boolean result9 = new PersonWriter().writeToFile(person9, destFileName);
        if (result9) {
            System.out.println("Saved person9 to file successfully");
        } else {
            System.out.println("Saved person9 to file failure");
        }

        boolean result10 = new PersonWriter().writeToFile(person10, destFileName);
        if (result10) {
            System.out.println("Saved person10 to file successfully");
        } else {
            System.out.println("Saved person10 to file failure");
        }


    }
}
