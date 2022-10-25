// 1. 使用 Spring 提供的介面 Resource 存取各類資源.
package t22;

import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;

public class Main {
    public static void main(String[] args) throws Exception {
        case1();
        case2();
        case3();
    }

    private static void case1() throws Exception {
        System.out.println("====case 1====");
        dumpXML(new UrlResource("file:src/main/resources/t22/books.xml"));
    }

    private static void case2() throws Exception {
        System.out.println("====case 2====");
        dumpXML(new ClassPathResource("t22/books.xml"));
    }

    private static void case3() throws Exception {
        System.out.println("====case 3====");
        dumpXML(new FileSystemResource("src/main/resources/t22/books.xml")); // 不需再指定 file:
    }

    private static void dumpXML(Resource ur) throws Exception {
        System.out.println(ur.getFilename());
        System.out.println(ur.getDescription());

        var reader = new SAXReader();
        var doc = reader.read(ur.getFile());
        var el = doc.getRootElement();
        var l = el.elements();
        for (Object o : l) {
            var book = (Element) o;
            var ll = book.elements();
            for (Object value : ll) {
                var eee = (Element) value;
                System.out.println(eee.getText());
            }
        }
    }
}
