package creational.builder;

public class BuilderPersonDemo {
    public static void main(String args[]) {
        PersonBuilder builder = new PersonBuilder();
        Person john = builder.firstName("John").lastName("Wick").age(30).gender("Male").build();
        System.out.println(john.toString());

        builder = new PersonBuilder();
        Person jason = builder.firstName("Jason").lastName("Bourne").age(40).build();
        System.out.println(jason.toString());
    }
}