// 使用介面解構
package t02;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import t02.app.Person;

public class Main {
    public static void main(String[] args) {
        var ctx = new ClassPathXmlApplicationContext("t02/beans.xml");
        var p = ctx.getBean("person", Person.class);

        p.useAxe();
    }
}
