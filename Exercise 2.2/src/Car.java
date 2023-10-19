public class Car {
    private String brand;
    private String model;
    private String plateNumber;
    private int CC;

    public Car(String brand, String model, String plateNumber, int CC)
    {
        this.brand = brand;
        this.model = model;
        this.plateNumber = plateNumber;
        this.CC = CC;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public int getCC() {
        return CC;
    }

    public void setCC(int CC) {
        this.CC = CC;
    }

    @Override
    public String toString() {
        return "- Brand: " + brand + '\n' +
                "- Model: " + model + '\n' +
                "- Plate Number: " + plateNumber + '\n' +
                "- CC: " + CC;
    }
}
