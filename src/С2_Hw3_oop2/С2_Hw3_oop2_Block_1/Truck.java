package С2_Hw3_oop2.С2_Hw3_oop2_Block_1;

public class Truck extends TypeOfTransport{
    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public static void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    public static void checkTrailer() {


        System.out.println("Проверяем прицеп");
    }

    @Override
    public void updateTyre() {
        System.out.println("Меняем покрышку у грузовика");
    }
}
