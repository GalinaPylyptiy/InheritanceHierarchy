package hierarchy.transport;

public class Plane extends AirTransport {
    private String name;
    private String serialNumber;
    private boolean internationalTransfer;
    public Plane() {
    }
    public Plane(String name, String serialNumber, boolean internationalTransfer) {
        this.name = name;
        this.serialNumber = serialNumber;
        this.internationalTransfer = internationalTransfer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public boolean isInternationalTransfer() {
        return internationalTransfer;
    }

    public void setInternationalTransfer(boolean internationalTransfer) {
        this.internationalTransfer = internationalTransfer;
    }

}
