package repository;

import objectpool.DatabasePool;

public class RepositoryApp {
    public static void main(String[] args) {
        Product product = new Product();
        product.setId("1");
        product.setName("Contoh 1");
        product.setPrice(1000);

        DatabasePool.getConnection().sql("insert inti products(id, name, price) values(?,?,?)",
                product.getId(), product.getName(), product.getPrice());

        DatabasePool.getConnection().sql("update  products(id, name, price) values(?,?,?)",
                product.getId(), product.getName(), product.getPrice());

        // menggunakan Repository
        ProductRepository productRepository = new ProductRepository();
        productRepository.inset(product);
        product.setPrice(2000);
        productRepository.update(product);
        productRepository.delete(product.getId());
    }
}
