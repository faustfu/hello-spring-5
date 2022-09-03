// 使用多國語系訊息
package t04;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;
import java.util.Locale;

public class Main {
    public static void main(String[] args) throws Exception {
        var ctx = new ClassPathXmlApplicationContext("t04/beans.xml");
        var locale = Locale.getDefault(Locale.Category.FORMAT);
        System.out.println(locale);

        var hello = ctx.getMessage("hello", new String[]{"好難笑"}, locale);
        System.out.println(hello);

        var now = ctx.getMessage("now", new Object[]{new Date()}, locale);
        System.out.println(now);
    }
}
