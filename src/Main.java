import java.text.ParseException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws ParseException {

        List<Person> person = new ArrayList<>();

        String name1 = "name1";
        String birthDate1 = "27/11/1983";
        Person person1 = new Person(name1, birthDate1);
        person.add(person1);

        String name2 = "name2";
        String birthDate2 = "24/06/1984";
        Person person2 = new Person(name2, birthDate2);
        person.add(person2);

        for (Person p : person
        ) {
            System.out.println(p.getName() + "___" + p.getBirthDate());
        }
        System.out.println("======================");
        Collections.sort(person);
        for (Person p : person
        ) {
            System.out.println(p.getName() + "___" + p.getBirthDate());
        }
    }
}
