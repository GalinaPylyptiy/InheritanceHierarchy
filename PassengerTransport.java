package hierarchy.transport;

public abstract class  PassengerTransport {
    private int maxVelocity;
    private int maxCapacity;
    private long weightIfEmpty;
    public PassengerTransport(){};

    public PassengerTransport(int maxVelocity, int maxCapacity, long weightIfEmpty) {
        this.maxVelocity = maxVelocity;
        this.maxCapacity = maxCapacity;
        this.weightIfEmpty = weightIfEmpty;
    }

    public int getMaxVelocity() {
        return maxVelocity;
    }

    public void setMaxVelocity(int maxVelocity) {
        this.maxVelocity = maxVelocity;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public long getWeightIfEmpty() {
        return weightIfEmpty;
    }

    public void setWeightIfEmpty(long weightIfEmpty) {
        this.weightIfEmpty = weightIfEmpty;
    }
}
