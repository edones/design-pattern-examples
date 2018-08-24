package behavioral.strategy;

public class ClassThreeFeeStrategy extends FeeStrategy {
    @Override
    int computeWeightAxleFee(Vehicle vehicle) {
        int fee = 0;

        fee = (vehicle.weight * 4) + (vehicle.numberOfAxles * 2) + 30;

        return fee;
    }
}
