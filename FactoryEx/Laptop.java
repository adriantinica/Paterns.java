public class Laptop extends Product {
    
    private String name;
    private double price;
    private String CPU;

    

    public String getName() {
        return name;
    }

    public void setName(String name) {
       this.name = name;
    }

    public double getPrice() {
        return price;
    }

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
