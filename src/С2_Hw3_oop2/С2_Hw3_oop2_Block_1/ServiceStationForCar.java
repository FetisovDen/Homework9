package С2_Hw3_oop2.С2_Hw3_oop2_Block_1;

public class ServiceStationForCar implements ServiceStationForAll {
    @Override
    public void check(TypeOfTransport car){
        int g = 3;
        if (g < car.getWheelsCount()) {
            System.out.println("Обслуживаем " + car.getModelName());
            for (int i = 0; i < car.getWheelsCount(); i++) {
                car.updateTyre();
            }
            Car.checkEngine();
        }
        else {
            System.out.println("Данный тип транспорта не обслуживается в этом сервисе");
        }
    }

}
