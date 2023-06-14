public class Phone extends Product {

    private String name;
    private double price;
    private int diagonal;

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

    public int getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(int diagonal) {
        this.diagonal = diagonal;
    }

    @Override
    public String toString() {
        return "Phone [name= " + name + ", price= " + price + ", diagonal= " + diagonal + "]";
    }

    
    
}
