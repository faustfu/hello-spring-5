package t11.app.factory;

import t11.app.Person;
import t11.app.impl.SoraShiina;
import t11.app.impl.YuaMikami;

public class PersonFactory {
    public static Person getPerson(String person) {
        if (person.equalsIgnoreCase("sora")) {
            return new SoraShiina();
        } else {
            return new YuaMikami();
        }
    }
}
