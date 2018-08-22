package creational.builder;

public class BuilderPersonDemo {
    public static void main(String args[]) {
        PersonBuilder builder = new PersonBuilder();
        builder.firstName("John").lastName("Wick").age(30).gender("Male");
        Person person = builder.build();
        System.out.println(person.toString());
    }
}