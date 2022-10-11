// 1. 使用 spring 提供的命名空間 p 簡化子元素 property.
package t16;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import t16.app.Person;

public class Main {
    public static void main(String[] args) {
        var ctx = new ClassPathXmlApplicationContext("t16/beans.xml");
        var wife = ctx.getBean("wife", Person.class);
        var me = ctx.getBean("me", Person.class);
        System.out.println("今天大老婆的自我介紹：");
        wife.introduce();
        me.introduce();
    }

}
