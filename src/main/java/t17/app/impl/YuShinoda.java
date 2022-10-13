package t17.app.impl;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import t17.app.Person;
import t17.app.Product;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.stream.Collectors;

public class YuShinoda implements Person, InitializingBean, DisposableBean {

    public List<String> getNames() {
        return names;
    }

    public void setNames(List<String> names) {
        this.names = names;
    }

    private List<String> names;

    public Map<?, ?> getSizes() {
        return sizes;
    }

    public void setSizes(Map<?, ?> sizes) {
        this.sizes = sizes;
    }

    private Map<?, ?> sizes;

    public Properties getInfo() {
        return info;
    }

    public void setInfo(Properties info) {
        this.info = info;
    }

    private Properties info;

    public String[] getTags() {
        return tags;
    }

    public void setTags(String[] tags) {
        this.tags = tags;
    }

    private String[] tags;

    public Map<String, Product> getProducts() {
        return products;
    }

    public void setProducts(Map<String, Product> products) {
        this.products = products;
    }

    private Map<String, Product> products;

    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void init() {
        System.out.println("篠田優登場....");
    }

    public void close() {
        System.out.println("篠田優下班....");
    }

    @Override
    public void afterPropertiesSet() throws Exception { // run before init()
        String birthDateString = info.getProperty("生日");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate birthDate = LocalDate.parse(birthDateString, formatter);
        LocalDate now = LocalDate.now();

        age = now.getYear() - birthDate.getYear() + 1;
    }

    @Override
    public void destroy() throws Exception { // run before close()
        System.out.println("篠田優壞掉了....");
    }

    @Override
    public void profile() {
        System.out.println("姓名" + names);
        System.out.println("基本資料)生日=" + info.getProperty("生日") + "(" + age + "歲)");
        System.out.println("基本資料)血型=" + info.getProperty("血型"));
        System.out.println("基本資料)暱稱=" + info.getProperty("暱稱"));
        System.out.println("身材" + sizes);
        System.out.println("特徵備註" + Arrays.toString(tags));
        System.out.println("作品集\n" + products.entrySet().stream().map(e -> e.getKey() + ":" + e.getValue())
                .collect(Collectors.joining("\n")));
    }
}
