// 1. 使用 Java 程式 + @configuration/@Value/@Bean 等各類標籤來取代 XML 的 Beans 設定作業
package t10;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import t10.app.AppConfig;
import t10.app.Person;

public class Main {
    public static void main(String[] args) throws Exception {
        var ctx = new AnnotationConfigApplicationContext(AppConfig.class);

        var yu = ctx.getBean("yu", Person.class);

        System.out.println(yu + " says: " + yu.say());
    }
}
