public class Main {
    public static void main(String[] args) {
        ProductsImpl productsImpl = new ProductsImpl();

        Product product1 = new Product(1, "Sofa");
        Product product2 = new Product(2, "Table");
        Product product3 = new Product(3, "Chair");
        Product product4 = new Product(4, "Bed");
        Product product5 = new Product(5, "Chair");
        productsImpl.productsList.add(product1);
        productsImpl.productsList.add(product2);
        productsImpl.productsList.add(product3);
        productsImpl.productsList.add(product4);
        productsImpl.productsList.add(product5);

        System.out.println(productsImpl.addProduct(new Product(1, "Closet")));
        System.out.println(productsImpl.addProduct(new Product(6, "Closet")));
        System.out.println(productsImpl.productsList);

        System.out.println(productsImpl.deleteProduct(new Product(1, "Closet")));
        System.out.println(productsImpl.deleteProduct(product4));
        System.out.println(productsImpl.productsList);

        System.out.println(productsImpl.getName(3));
        System.out.println(productsImpl.getName(15));

        System.out.println(productsImpl.findByName("chair"));
        System.out.println(productsImpl.findByName("stool"));
    }
}