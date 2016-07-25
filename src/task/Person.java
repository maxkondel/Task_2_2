package task;


import java.util.Arrays;

public class Person {
    public String name;
    public String surname;
    public String[] phones;
    public String[] sites;
    public Address address;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", phones='" + Arrays.toString(phones) + '\'' +
                ", sites='" + Arrays.toString(sites) + '\'' +
                ", address=" + address +
                '}';
    }
}
