package t01;

import t01.app.Person;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        var ctx = new ClassPathXmlApplicationContext("t01/beans.xml");
        var p = ctx.getBean("person", Person.class);

        p.useAxe();
    }
}
