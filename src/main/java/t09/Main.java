// 1. 注入特殊用途的 beans, ex: data source
package t09;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.util.Random;

public class Main {
    public static void main(String[] args) throws Exception {
        var ctx = new ClassPathXmlApplicationContext("t09/beans.xml");
        var ds = ctx.getBean("dataSource", DataSource.class);
        var conn = ds.getConnection();
        var pstmt = conn.prepareStatement("insert into product values(?, ?, ?);");

        Random random = new Random();
        int nextInt = random.nextInt(Integer.MAX_VALUE);

        pstmt.setInt(1, nextInt);
        pstmt.setString(2, "title " + nextInt);
        pstmt.setString(3, "icon " + nextInt);

        pstmt.executeUpdate();

        pstmt.close();
        conn.close();
    }
}
