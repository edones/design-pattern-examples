package behavioral.strategy;

public class Vehicle {
    VehicleType type;
    int weight; //int for simplicity's sake
    int numberOfAxles;

    public Vehicle(VehicleType type, int weight, int numberOfAxles) {
        this.type = type;
        this.weight = weight;
        this.numberOfAxles = numberOfAxles;
    }

    public VehicleType getType() {
        return type;
    }

    public int getWeight() {
        return weight;
    }

    public int getNumberOfAxles() {
        return numberOfAxles;
    }
}
