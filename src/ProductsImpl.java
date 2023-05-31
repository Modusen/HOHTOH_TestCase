import java.util.ArrayList;
import java.util.List;

public class ProductsImpl {
    List<Product> productsList = new ArrayList<>();

    public boolean addProduct(Product product) {
        for (Product productInTheList : productsList) {
            if (productInTheList.getId() == product.getId()) {
                return false;
            }
        }
        productsList.add(product);
        return true;
    }

    public boolean deleteProduct(Product product) {
        for (Product productInTheList : productsList) {
            if (productInTheList.getId() == product.getId()) {
                productsList.remove(productInTheList);
                return true;
            }
        }
        return false;
    }

    public String getName(int id) {
        for (Product productInTheList : productsList) {
            if (productInTheList.getId() == id) {
                return productInTheList.getName();
            }
        }
        return "";
    }

    public List<Integer> findByName(String name) {
        List<Integer> result = new ArrayList<>();
        for (Product productInTheList : productsList) {
            if (productInTheList.getName().equalsIgnoreCase(name)) {
                result.add(productInTheList.getId());
            }
        }
        return result;
    }

}
