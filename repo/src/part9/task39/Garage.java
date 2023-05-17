package part9.task39;

class Garage <T extends Vehicle> {

    private T [] motorcycle;

    private T [] car;


    public void setMotorcycle (T[] motorcycle) {
        this.motorcycle = motorcycle;
    }

    public void setCar (T[] car) {
        this.car = car;
    }

    public void printMoto() {

        for (T motorcycles : motorcycle) {
            System.out.println("Motorcycle" + " " +motorcycles.getName());

        }

    }

    public void  printCar() {

        for (T cars : car) {
            System.out.println("Car" + " " + cars.getName());

        }
    }

}
