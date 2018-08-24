package behavioral.strategy;

public enum VehicleType {
    CLASS1("Cars, Jeepneys, Pick-Ups, Vans"),
    CLASS2("Light Trucks, Tourist/School & PUB, Class 1 - above 7 ft. height"),
    CLASS3("Heavy and Multi-Axled Trucks, Trailers");

    private String description;

    VehicleType(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
