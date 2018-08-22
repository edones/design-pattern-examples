package creational.factory;

public class ComputerFactoryDemo {
    public static void main(String[] args) {
        Computer basic = ComputerFactory.getComputer(ComputerType.BASIC);
        System.out.println(basic.getComponents());

        Computer game = ComputerFactory.getComputer(ComputerType.GAMING);
        System.out.println(game.getComponents());
    }
}
