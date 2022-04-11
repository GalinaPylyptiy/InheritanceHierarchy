package hierarchy.transport;

public class Car extends RoadTransport {
    private String model;
    private String make;
    private long kmDriven;
    public Car(){}

    public Car(String model, String make, long kmDriven) {
        this.model = model;
        this.make = make;
        this.kmDriven = kmDriven;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public long getKmDriven() {
        return kmDriven;
    }

    public void setKmDriven(long kmDriven) {
        this.kmDriven = kmDriven;
    }
}
