package behavioral.strategy;

public class Toll {
    protected Vehicle vehicle;
    protected FeeStrategy feeStrategy;

    public Toll(Vehicle vehicle, FeeStrategy feeStrategy) {
        this.vehicle = vehicle;
        this.feeStrategy = feeStrategy;
    }

    public int getFee() {
        return feeStrategy.computeWeightAxleFee(vehicle);
    }
}
