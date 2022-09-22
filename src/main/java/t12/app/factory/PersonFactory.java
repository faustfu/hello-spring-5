package t12.app.factory;

import t12.app.Person;
import t12.app.impl.SoraShiina;
import t12.app.impl.YuaMikami;

public class PersonFactory {
    public Person getPerson(String person) {
        if (person.equalsIgnoreCase("sora")) {
            return new SoraShiina();
        } else {
            return new YuaMikami();
        }
    }
}
