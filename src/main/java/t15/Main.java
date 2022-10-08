// 1. 使用 PropertyPathFactoryBean 介面將其他物件成為轉為 beans.
package t15;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import t15.app.Person;

public class Main {
    public static void main(String[] args) {
        var ctx = new ClassPathXmlApplicationContext("t15/beans.xml");
        var wife = ctx.getBean("wife", Person.class);
        System.out.println("今天大老婆的自我介紹：");
        wife.introduce();
    }
}
