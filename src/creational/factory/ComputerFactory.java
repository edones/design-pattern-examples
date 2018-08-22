package creational.factory;

public class ComputerFactory {
    public static Computer getComputer(ComputerType computerType) {
        switch (computerType) {
            case BASIC:
                return new BasicComputer();
            case GAMING:
                return new GameComputer();
            default:
                return null;
        }
    }
}
