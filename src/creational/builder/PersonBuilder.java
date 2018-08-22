package creational.builder;

public class PersonBuilder {
    protected String firstName;
    protected String lastName;
    protected String gender;
    protected int age;

    public Person build() {
        return new Person(this);
    }

    public PersonBuilder firstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public PersonBuilder lastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public PersonBuilder age(int age) {
        this.age = age;
        return this;
    }

    public PersonBuilder gender(String gender) {
        this.gender = gender;
        return this;
    }
}
