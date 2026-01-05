package Jan05;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Person> persons = PersonList.getPersonList();

        for (Person p : persons) {
            p.display();
        }
    }
}
