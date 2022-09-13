package t08.app.impl;

import t08.app.Person;
import t08.app.Product;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.stream.Collectors;

public class YuShinoda implements Person {

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

    public YuShinoda() {
        System.out.println("篠田優登場....");
    }
    @Override
    public void profile() {
        System.out.println("姓名" + names);
        System.out.println("基本資料"+info);
        System.out.println("身材" + sizes);
        System.out.println("特徵備註" + Arrays.toString(tags));
        System.out.println("作品集\n" + products.entrySet().stream().map(e -> e.getKey() + ":" + e.getValue())
                .collect(Collectors.joining("\n")));
    }
}
