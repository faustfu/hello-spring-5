package t20.app.impl;

import org.springframework.stereotype.Component;
import t20.app.Person;
import t20.app.PersonService;

@Component("personService")
public class PersonServiceImpl extends BaseServiceImpl<Person> implements PersonService {
    public PersonServiceImpl() {
        System.out.println("PersonServiceImpl initialized...");
    }

    @Override
    public void work() {
        System.out.println("上班");
    }
}
