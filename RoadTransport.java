package hierarchy.transport;

public abstract class RoadTransport extends PassengerTransport {
    private long maxDistance;
    private long weight;
    private long wheelDiameter;
    public RoadTransport(){}

    public RoadTransport(long maxDistance, long weight, long wheelDiameter) {
        this.maxDistance = maxDistance;
        this.weight = weight;
        this.wheelDiameter = wheelDiameter;
    }

    public long getMaxDistance() {
        return maxDistance;
    }

    public void setMaxDistance(long maxDistance) {
        this.maxDistance = maxDistance;
    }

    public long getWeight() {
        return weight;
    }

    public void setWeight(long weight) {
        this.weight = weight;
    }

    public long getWheelDiameter() {
        return wheelDiameter;
    }

    public void setWheelDiameter(long wheelDiameter) {
        this.wheelDiameter = wheelDiameter;
    }
}
