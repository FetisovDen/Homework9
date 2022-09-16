package С2_Hw3_oop2.С2_Hw3_oop2_Block_1;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("car1", 4);
        Car car2 = new Car("car2", 4);

        Truck truck = new Truck("truck1", 6);
        Truck truck2 = new Truck("truck2", 8);

        Bicycle bicycle = new Bicycle("bicycle1", 2);
        Bicycle bicycle2 = new Bicycle("bicycle2", 2);


        ServiceStationForAll ServiceStationForCar = new ServiceStationForCar();
        ServiceStationForCar.check(car);
        ServiceStationForCar.check(car2);
        ServiceStationForAll ServiceStationForTruck = new ServiceStationForTruck();
        ServiceStationForTruck.check(truck);
        ServiceStationForTruck.check(truck2);
        ServiceStationForAll ServiceStationForBicycle = new ServiceStationForBicycle();
        ServiceStationForBicycle.check(bicycle);
        ServiceStationForBicycle.check(bicycle2);

    }
}







