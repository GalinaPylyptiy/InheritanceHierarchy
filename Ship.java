package hierarchy.transport;

public class Ship extends WaterTransport {
    private String name;
    private int yearOfCreation;
    private String builderCompany;
    public Ship(){}

    public Ship(String name, int yearOfCreation, String builderCompany) {
        this.name = name;
        this.yearOfCreation = yearOfCreation;
        this.builderCompany = builderCompany;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearOfCreation() {
        return yearOfCreation;
    }

    public void setYearOfCreation(int yearOfCreation) {
        this.yearOfCreation = yearOfCreation;
    }

    public String getBuilderCompany() {
        return builderCompany;
    }

    public void setBuilderCompany(String builderCompany) {
        this.builderCompany = builderCompany;
    }

    @Override
    public String toString() {
        return "Ship{" +
                "name='" + name + '\'' +
                ", yearOfCreation=" + yearOfCreation +
                ", builderCompany='" + builderCompany + '\'' +
                '}';
    }
}
