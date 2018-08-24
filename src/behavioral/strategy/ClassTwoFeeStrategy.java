package behavioral.strategy;

public class ClassTwoFeeStrategy extends FeeStrategy {
    @Override
    int computeWeightAxleFee(Vehicle vehicle) {
        int fee = 0;

        fee = (vehicle.weight * 3) + (vehicle.numberOfAxles * 2) + 10;

        return fee;
    }
}
