package Jan05;

public class Person {

    Integer id;
    String name;
    Double salary;

    public Person(Integer id, String name, Double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public void display() {
        System.out.println(id + " " + name + " " + salary);
    }
}
