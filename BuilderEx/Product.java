import java.util.Arrays;

public class Product{
    private String name;
    private Double price;

    private Attribute[] atribute;



    //private Attribute[] atribute;

    private Product(){

    }

         //BUILDER
    // ###########################################################################################@####################3

    public static class productBuilder{
        //fixed part
        private String name;
        private Double price;

        // dinamic part
        private Double width;
        private Double length;
        private Double height;
        private Double weight;


        
        productBuilder(String name,Double price ){
            this.name=name;
            this.price=price;
        }

        public productBuilder withDimensions(Double width,Double length,Double height ){
            this.width = width;
            this.length = length;
            this.height =height;

            return this;
        };
        public productBuilder withWeight(Double weight ){
            this.weight = weight;
            
            return this;
        };
        // FINAL STEP
        public Product build(){
            Product product = new Product();
            product.setAttribute(new Attribute[4]);
            //fixed part
            product.setName(name);
            product.setPrice(price);
            //dinamic part
            if(width != null){
                product.getAttribute()[0] = new Attribute("width", width );
            }
            if(length != null){
                product.getAttribute()[1] = new Attribute("length", length );
            }
            if(height != null){
                product.getAttribute()[2] = new Attribute("height",height );
            }
            if(weight != null){
                product.getAttribute()[3] = new Attribute("weight",weight );
            }

            return product;
        }
    }    

    // ###################################################################################################################33
    
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


    public Attribute[] getAttribute() {
        return atribute;
    }


    public  void setAttribute(Attribute[] atribute) {
        this.atribute = atribute;
    }

    @Override
    public String toString() {
        return "Product [name=" + name + ", price=" + price + ", atribute=" + Arrays.toString(atribute) + "]";
    }


   
    

    
}