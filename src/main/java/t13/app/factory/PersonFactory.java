package t13.app.factory;

import t13.app.Person;
import t13.app.impl.SoraShiina;
import t13.app.impl.YuaMikami;

public class PersonFactory {
    public Person getPerson(String person) {
        if (person.equalsIgnoreCase("sora")) {
            return new SoraShiina();
        } else {
            return new YuaMikami();
        }
    }
}
