public class Laptop implements Product {
    
    private String name;
    private double price;
     private String CPU;

    @Override
    public String getName() {
       return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }  

    @Override
    public double getPrice() {
       return price;
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }

    public String getCPU() {
        return CPU;
    }

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    @Override
    public String toString() {
        return "Phone [name= " + name + ", price= " + price + ", CPU= " + CPU + "]";
    }
}
