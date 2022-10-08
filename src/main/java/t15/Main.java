// 1. 使用 PropertyPathFactoryBean 介面將其他物件的成員成為轉為獨立的 beans 或是直接注入其他 beans.
package t15;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import t15.app.Person;

public class Main {
    public static void main(String[] args) {
        var ctx = new ClassPathXmlApplicationContext("t15/beans.xml");
        var wife = ctx.getBean("wife", Person.class);
        var me = ctx.getBean("me", Person.class);
        System.out.println("今天大老婆的自我介紹：");
        wife.introduce();
        me.introduce();
    }
}
