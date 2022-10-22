package t20.app.impl;

import org.springframework.stereotype.Component;
import t20.app.Product;
import t20.app.ProductService;

@Component("productService")
public class ProductServiceImpl extends BaseServiceImpl<Product> implements ProductService {
    public ProductServiceImpl() {
        System.out.println("ProductServiceImpl initialized...");
    }
    @Override
    public void exchange() {
        System.out.println("等價交換");
    }
}
