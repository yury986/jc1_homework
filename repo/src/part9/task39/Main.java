package part9.task39;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Garage <Vehicle> garageMoto = new Garage<>();
        garageMoto.setMotorcycle(new Motorcycle[]{
                new Motorcycle(sc.nextLine()),
                new Motorcycle(sc.nextLine())
        });

        Garage <Vehicle> garageCar = new Garage<>();
        garageCar.setCar(new Car[]{
                new Car(sc.nextLine()),
                new Car(sc.nextLine())
        });

        garageMoto.printMoto();

        garageCar.printCar();


    }
}

