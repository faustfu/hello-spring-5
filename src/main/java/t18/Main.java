// 1. 使用宣告及指定 package 作為搜尋路徑, 將物件轉為 beans.
// 2. Bean ID 可依據預設規則產生或手動指定 ID.
package t18;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        var ctx = new ClassPathXmlApplicationContext("t18/beans.xml");
        System.out.println("Beans:"+java.util.Arrays.toString(ctx.getBeanDefinitionNames()));
    }
}
