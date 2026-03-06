package domain;

import java.util.ArrayList;
import java.util.List;

public class Facade {

    private static final List<Person> FALSE_REPO = new ArrayList<Person>();

    public static String turnSexIntoLetter(String valor) {
        if (valor.equals("woman"))
            return "W";
        if (valor.equals("man"))
            return "M";
        return "O";
    }

    public static void addPerson(String a, String b, String c, String d) {
        FALSE_REPO.add(new Person(a, b, c, d));
    }

    public static List<Person> getAll() {
        return FALSE_REPO;
    }

}
