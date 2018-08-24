package behavioral.observer;

public class ObserverDemo {
    public static void main(String[] args) {
        Phone phone = new Phone(new State(100));
        BatterMeterApp meterApp = new BatterMeterApp(phone);
        MessengerApp messengerApp = new MessengerApp(phone);

        meterApp.doBatteryDrain();
        messengerApp.runGame();
    }
}
