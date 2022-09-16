package С2_Hw3_oop2.С2_Hw3_oop2_Block_1;

public class ServiceStationForBicycle implements ServiceStationForAll {
    @Override
    public void check(TypeOfTransport bicycle) {
        int g = 3;
        if (g > bicycle.getWheelsCount()) {
        System.out.println("Обслуживаем " + bicycle.getModelName());
        for (int i = 0; i < bicycle.getWheelsCount(); i++) {
            bicycle.updateTyre();
        }
        }
        else {
            System.out.println("Данный тип транспорта не обслуживается в этом сервисе");
            }
        }

    }

