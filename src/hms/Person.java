package hms;

/**
 * @Sankaja
 */
public abstract class Person {

    private String nic;
    private int age;
    private String name;

    public Person(String nic, int age, String name) {
        this.nic = nic;
        this.name = name;
        this.age = age;
    }

    public String getNic() {
        return nic;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

}
