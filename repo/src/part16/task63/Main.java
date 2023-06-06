package part16.task63;


import java.util.*;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) {
        Person[] humans = new Person[100];
        for (int i = 0; i< humans.length; i++){
            humans [i] = new Person();
        }

        List<Person> list = Arrays.asList(humans);

        System.out.println(list);


        list.stream()
                .filter(x -> x.getAge() < 21)
                .peek(System.out::println)
                .sorted(Comparator.comparing(Person::getSurname).thenComparing(Person::getName))
                .limit(4)
                .map(Person::getSurname)
                .collect(Collectors.toList())
                .forEach(System.out::println);



    }
}
