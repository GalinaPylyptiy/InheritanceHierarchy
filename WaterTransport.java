package hierarchy.transport;

public abstract class WaterTransport extends PassengerTransport {
    private long displacement;
    private long loadCapacity;
    private String shipType;
    public WaterTransport(){}

    public WaterTransport(long displacement, long loadCapacity, String shipType) {
        this.displacement = displacement;
        this.loadCapacity = loadCapacity;
        this.shipType = shipType;
    }

    public long getDisplacement() {
        return displacement;
    }

    public void setDisplacement(long displacement) {
        this.displacement = displacement;
    }

    public long getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(long loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    public String getShipType() {
        return shipType;
    }

    public void setShipType(String shipType) {
        this.shipType = shipType;
    }

    @Override
    public String toString() {
        return "WaterTransport{" +
                "displacement=" + displacement +
                ", loadCapacity=" + loadCapacity +
                ", shipType='" + shipType + '\'' +
                '}';
    }
}
