class Person {
    int id;
    String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
        System.out.println(id + " " + name);
    }
}

public class PersonBuilder {
    private static Person builderPerson(int id, String name) {
        id = 22;
        System.out.println(id + " " + name);
        return new Person(id, name);
    }

    public static void main(String[] args) {
        int id = 23;
        String name = "John";
        Person person = null;
        person = builderPerson(id, name);
    }
}