import java.util.Arrays;

public class CloneSimpleAppEx{
    public static void main(String[] args) {
        
        Product bread = new Product(100, "Baquete", 20, new Money(3,"EUR"));
        Product milk = new Product(499, "Cow Milk",100, new Money(7,"EUR"));
        Product water = new Product(555, "Spark", 500,new Money(2,"EUR"));
      
        // add the product to shop;
        Shop shop = new Shop();
        shop.products[0] = bread;
        shop.products[1] = milk;
        shop.products[2] = water;

        System.out.println(shop);
        
        //add the product to cart;
        Cart cart = new Cart();
        cart.addProducts(water, 100);

        shop.products[2].price.amount += 50;

        System.out.println(cart);
        System.out.println(shop);

    }
}

class Money implements Cloneable{
    public int amount;
    public String currency;

    
    public Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }


    @Override
    public String toString() {
        return "\t\tMoney [" + amount + " " + currency + "]";
    }


    @Override
    protected Object clone() throws CloneNotSupportedException {
        // TODO Auto-generated method stub
        return super.clone();
    }
    
    
}


class Product implements Cloneable{
    public int id;
    public String name;
    public int quantity;
    public Money price;

    public Product(int id, String name, int quantity, Money price) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    @Override
    public String toString() {
        return "\tProduct [id=" + id + ", name=" + name + ", quantity=" + quantity + ", price=" + price + "]\n";
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Object cloned = super.clone();
        // deep cloning
        ((Product)cloned).price = (Money)((Product)cloned).price.clone();
        return cloned;
    }

    
    

}

class Shop{
    Product [] products = new Product [3];

    @Override
    public String toString() {
        return "Shop [products=\n\n" + Arrays.toString(products) + "]";
    }

    
}

class Cart{
    Product [] products = new Product [1];
    
    // !!! clone the original
    public void addProducts(Product product, int quantity){
        try {
            Product  clonnedProduct = (Product)product.clone();
            products[0] = clonnedProduct;
            clonnedProduct.quantity = quantity;
            product.quantity -= quantity;
        } catch (CloneNotSupportedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
    }

    @Override
    public String toString() {
        return "Cart [products=\n\n" + Arrays.toString(products) + "]";
    }
    

}