package hierarchy.transport;

public abstract class AirTransport extends PassengerTransport {
    private long maxDistance;
    private int mightOfEngine;
    private long maxHeight;
    public AirTransport(){};
    public AirTransport(long maxDistance, int mightOfEngine, long maxHeight) {
        this.maxDistance = maxDistance;
        this.mightOfEngine = mightOfEngine;
        this.maxHeight = maxHeight;
    }
    public long getMaxDistance() {
        return maxDistance;
    }

    public void setMaxDistance(long maxDistance) {
        this.maxDistance = maxDistance;
    }


    public long getMaxHeight() {
        return maxHeight;
    }

    public void setMaxHeight(long maxHeight) {
        this.maxHeight = maxHeight;
    }

    public int getMightOfEngine() {
        return mightOfEngine;
    }

    public void setMightOfEngine(int mightOfEngine) {
        this.mightOfEngine = mightOfEngine;
    }
}

