package behavioral.strategy;

public class StrategyDemo {
    public static void main(String[] args) {
        Vehicle car = new Vehicle(VehicleType.CLASS1, 100, 2);
        Vehicle truck = new Vehicle(VehicleType.CLASS2, 300, 3);
        Vehicle bus = new Vehicle(VehicleType.CLASS2, 600, 2);
        Vehicle trailer = new Vehicle(VehicleType.CLASS3, 1000, 8);

        //1. prepare the strategies - initialize
        //2. set context, add strategy instances
        //3. call context, invoke strategy

        FeeStrategy classOneFee = new ClassOneFeeStrategy();
        FeeStrategy classTwoFee = new ClassTwoFeeStrategy();
        FeeStrategy classThreeFee = new ClassThreeFeeStrategy();

        Toll carToll = new Toll(car, classOneFee);
        System.out.println("Car toll is " + carToll.getFee());

        Toll truckToll = new Toll(truck, classTwoFee);
        System.out.println("Truck toll is " + truckToll.getFee());

        Toll busToll = new Toll(bus, classTwoFee);
        System.out.println("Bus toll is " + busToll.getFee());

        Toll trailerToll = new Toll(trailer, classThreeFee);
        System.out.println("Trailer toll is " + trailerToll.getFee());
    }
}
