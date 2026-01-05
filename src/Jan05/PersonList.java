package Jan05;

import java.util.ArrayList;
import java.util.List;

public class PersonList {

    public static List<Person> getPersonList() {

        List<Person> list = new ArrayList<>();

        list.add(new Person(1, "Zayed", 35000.0));
        list.add(new Person(2, "Mahadi", 40000.0));
        list.add(new Person(3, "Sefat", 38000.0));

        return list;
    }
}
