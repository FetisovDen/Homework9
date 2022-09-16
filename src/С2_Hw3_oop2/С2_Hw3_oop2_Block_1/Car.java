package С2_Hw3_oop2.С2_Hw3_oop2_Block_1;

public class Car extends TypeOfTransport {
    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public static void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    @Override
    public void updateTyre() {
        System.out.println("Меняем покрышку у машины");
    }
}
