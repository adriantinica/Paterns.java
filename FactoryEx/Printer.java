public class Printer implements Product {

    private String name;
    private double price;
    private String format;

    @Override
    public String getName() {
        return name;
        
    }

    @Override
    public void setName(String name) {
        this.name= name;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void setPrice(double price) {
        this.price=price;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    @Override
    public String toString() {
        return "Printer [name= " + name + ", price= " + price + ", format= " + format + "]";
    }
    
    
}
