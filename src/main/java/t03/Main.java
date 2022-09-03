// 1. 使用構造子注入beans
// 2. 手動建立ApplicationContext
package t03;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import t03.app.Person;

public class Main {
    public static void main(String[] args) {
        var ctx = new ClassPathXmlApplicationContext("t03/beans.xml");
        var p = ctx.getBean("person", Person.class);

        p.useAxe();
    }
}
