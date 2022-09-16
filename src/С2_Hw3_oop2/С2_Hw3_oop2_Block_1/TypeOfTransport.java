package С2_Hw3_oop2.С2_Hw3_oop2_Block_1;

public abstract class TypeOfTransport {

    private String setModelName;
    private int wheelsCount;

    public TypeOfTransport(String modelName, int wheelsCount) {
        this.setModelName = modelName;
        this.wheelsCount = wheelsCount;
    }
    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }

    public String getModelName() {
        return setModelName;
    }

    public void setModelName(String modelName) {
        this.setModelName = modelName;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    public void setWheelsCount(int wheelsCount) {
        this.wheelsCount = wheelsCount;
    }

    @Override
    public String toString() {
        return "TypeOfTransport{" +
                "modelName='" + setModelName +
                ", wheelsCount=" + wheelsCount +
                '}';
    }
}
