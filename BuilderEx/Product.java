import java.util.Arrays;

public class Product{
    private String name;
    private Double price;
    private Attribute[] atribute;
    
    public String getName() {
       return name;
    }

    
    public void setName(String name) {
       this.name = name;
    }  

   
    public Double getPrice() {
       return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }


    public Attribute[] getAtribute() {
        return atribute;
    }


    public void setAtribute(Attribute[] atribute) {
        this.atribute = atribute;
    }


    @Override
    public String toString() {
        return "Product [name=" + name + ", price=" + price + ", atribute=" + Arrays.toString(atribute) + "]";
    }

    

    
}