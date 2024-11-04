import java.util.Scanner;
import java.util.ArrayList;


public class Product {

      private String productId ;
      private String Name ;
      private double price;
      private int Quantity;


    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int quantity) {
        Quantity = quantity;
    }

    public Product(char productId, char name, double price, int quantity) {
        this.productId = "item_1";
        Name = "item 1";
        this.price = 1.00;
        Quantity = 1;

    }


    ArrayList<String> Products = new ArrayList<String>();
}







