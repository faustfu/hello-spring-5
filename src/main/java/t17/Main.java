// 1. 使用 spring 提供的命名空間 util 簡化集合類型的子元素 property.
package t17;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import t17.app.Person;

public class Main {
    public static void main(String[] args) {
        var ctx = new ClassPathXmlApplicationContext("t17/beans.xml");
        var yu = ctx.getBean("yu", Person.class);

        yu.profile();

        ctx.registerShutdownHook(); // Let spring framework close itself.
    }

}
