// 1. 使用子元素的方式封裝注入 bean, 避免被 Spring 直接存取.
package t07;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import t07.app.Person;

public class Main {
    public static void main(String[] args) {
        var ctx = new ClassPathXmlApplicationContext("t07/beans.xml");
        var p = ctx.getBean("person", Person.class);

        p.useAxe();
    }
}
