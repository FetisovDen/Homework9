package С2_Hw3_oop2.С2_Hw3_oop2_Block_1;

public class ServiceStationForTruck implements ServiceStationForAll {
    @Override
    public void check(TypeOfTransport truck ) {
        int g = 4;
        if (g < truck.getWheelsCount()) {
            System.out.println("Обслуживаем " + truck.getModelName());
            for (int i = 0; i < truck.getWheelsCount(); i++) {
                truck.updateTyre();
            }
            Truck.checkEngine();
            Truck.checkTrailer();
        }
        else {
            System.out.println("Данный тип транспорта не обслуживается в этом сервисе");
        }
    }



}


