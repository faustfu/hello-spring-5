package t20.app.impl;

import org.springframework.stereotype.Component;
import t20.app.Product;
import t20.app.ProductDao;

@Component("productDao")
public class ProductDaoImpl extends BaseDaoImpl<Product> implements ProductDao {
    public ProductDaoImpl() {
        System.out.println("ProductDaoImpl initialized...");
    }

    @Override
    public void initIt() {
        System.out.println("initIt");
    }
}
