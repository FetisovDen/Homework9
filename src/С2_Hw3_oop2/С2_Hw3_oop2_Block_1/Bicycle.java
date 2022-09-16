package С2_Hw3_oop2.С2_Hw3_oop2_Block_1;

public class Bicycle extends TypeOfTransport{

    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
    @Override
    public void updateTyre() {

        System.out.println("Меняем покрышку у велосипеда");
        }


}
