// 1. 使用宣告 @Resource 方式注入 Beans.
package t19;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import t19.app.Person;

public class Main {
    public static void main(String[] args) {
        var ctx = new ClassPathXmlApplicationContext("t19/beans.xml");
        System.out.println("Beans:"+java.util.Arrays.toString(ctx.getBeanDefinitionNames()));

        var p = ctx.getBean("taiwanese", Person.class);

        p.useAxe();

    }
}
