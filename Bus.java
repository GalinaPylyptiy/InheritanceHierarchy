package hierarchy.transport;

public class Bus extends RoadTransport  {
    private String model;
    private String make;
    private int enginePower;

    public Bus(){}
    public Bus(String model, String make, int enginePower) {
        this.model = model;
        this.make = make;
        this.enginePower = enginePower;
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

    public int getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(int enginePower) {
        this.enginePower = enginePower;
    }
}
