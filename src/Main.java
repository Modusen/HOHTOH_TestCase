public class Main {
    public static void main(String[] args) {
        ProductImpl productImpl = new ProductImpl();

        Product product1 = new Product(1, "Sofa");
        Product product2 = new Product(2, "Table");
        Product product3 = new Product(3, "Chair");
        Product product4 = new Product(4, "Bed");
        Product product5 = new Product(5, "Chair");
        productImpl.productsList.add(product1);
        productImpl.productsList.add(product2);
        productImpl.productsList.add(product3);
        productImpl.productsList.add(product4);
        productImpl.productsList.add(product5);

        System.out.println(productImpl.addProduct(new Product(1, "Closet")));
        System.out.println(productImpl.addProduct(new Product(6, "Closet")));
        System.out.println(productImpl.productsList);

        System.out.println(productImpl.deleteProduct(new Product(1, "Closet")));
        System.out.println(productImpl.deleteProduct(product4));
        System.out.println(productImpl.productsList);

        System.out.println(productImpl.getName(3));
        System.out.println(productImpl.getName(15));

        System.out.println(productImpl.findByName("chair"));
        System.out.println(productImpl.findByName("stool"));
    }
}