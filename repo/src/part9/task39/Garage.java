package part9.task39;

class Garage <T extends Motorcycle,X extends Car> {

    private T[] motorcycle;

    private X[] car;


    public void setMotorcycle (T[] motorcycle) {
        this.motorcycle = motorcycle;
    }

    public void setCar (X[] car) {
        this.car = car;
    }

    public void printMoto() {

        for (T motorcycles : motorcycle) {
            System.out.println(motorcycles.getName());

        }

    }

    public void  printCar() {

        for (X cars : car) {
            System.out.println(cars.getName());

        }
    }

}
