// 1. 使用 ref 屬性指定另一個 bean ID 的方式注入非基本型別的成員
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
