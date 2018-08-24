package behavioral.strategy;

public class ClassOneFeeStrategy extends FeeStrategy {
    @Override
    int computeWeightAxleFee(Vehicle vehicle) {
        int fee = 0;

        fee = (vehicle.weight * 2) + (vehicle.numberOfAxles * 2);

        return fee;
    }

}
