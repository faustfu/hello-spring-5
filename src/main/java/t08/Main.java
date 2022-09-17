// 1. 使用 property 子元素注入 Array/List/Map/Set/Property 等型態資料
// 2. beans 可將同類別物件視為父物件，作為物件資料繼承的基底
package t08;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import t08.app.Person;

public class Main {
    public static void main(String[] args) {
        var ctx = new ClassPathXmlApplicationContext("t08/beans.xml");
        var yu = ctx.getBean("yu", Person.class);

        yu.profile();
    }
}
