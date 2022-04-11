package hierarchy.transport;

public class Helicopter extends AirTransport {
    private String model;
    private double mainRotorDiameter;
    private double tailRotorDiameter;
    public Helicopter(){}

    public Helicopter(String model, double mainRotorDiameter, double tailRotorDiameter) {
        this.model = model;
        this.mainRotorDiameter = mainRotorDiameter;
        this.tailRotorDiameter = tailRotorDiameter;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getMainRotorDiameter() {
        return mainRotorDiameter;
    }

    public void setMainRotorDiameter(double mainRotorDiameter) {
        this.mainRotorDiameter = mainRotorDiameter;
    }

    public double getTailRotorDiameter() {
        return tailRotorDiameter;
    }

    public void setTailRotorDiameter(double tailRotorDiameter) {
        this.tailRotorDiameter = tailRotorDiameter;
    }
}
