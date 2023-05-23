import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Person implements Comparable<Person> {

    /*
    Создайте класс Person, которому при создании передавайте имя и дату рождения в виде строки в формате "ДД.ММ.ГГГГ".
    Реализуйте в классе интерфейс Comparable<Person>, в котором "меньше" будет значить "младше".
     */
    private final String name;

    private final Date birthDate;

    public Person(String name, String birthDate) throws ParseException {
        this.name = name;
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        this.birthDate = formatter.parse(birthDate); // throws ParseException
    }

    public String getName() {
        return name;
    }

    public Date getBirthDate() {
        return birthDate;
    }


    @Override
    public int compareTo(Person o) {
        if (!this.birthDate.equals(o.birthDate)) {
            return -(this.getBirthDate().compareTo(o.getBirthDate()));
        }
        return 0;
    }
}
