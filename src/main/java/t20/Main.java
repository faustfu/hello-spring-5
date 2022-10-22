// 1. 使用宣告 @Autowired 與泛型，自動注入對應的 Beans.
package t20;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import t20.app.Person;
import t20.app.PersonService;
import t20.app.Product;
import t20.app.ProductService;

public class Main {
    public static void main(String[] args) throws Exception {
        var ctx = new ClassPathXmlApplicationContext("t20/beans.xml");
        System.out.println("Beans:"+java.util.Arrays.toString(ctx.getBeanDefinitionNames()));

        var pp = ctx.getBean("personService", PersonService.class);
        pp.work();
        pp.stat(new Person());

        var dd = ctx.getBean("productService", ProductService.class);
        dd.exchange();
        dd.stat(new Product());
    }
}
