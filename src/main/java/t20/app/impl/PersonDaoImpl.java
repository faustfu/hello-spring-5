package t20.app.impl;

import org.springframework.stereotype.Component;
import t20.app.Person;
import t20.app.PersonDao;

@Component("personDao")
public class PersonDaoImpl extends BaseDaoImpl<Person> implements PersonDao {
    public PersonDaoImpl() {
        System.out.println("PersonDaoImpl initialized...");
    }

    @Override
    public void initMe() {
        System.out.println("initMe");
    }
}