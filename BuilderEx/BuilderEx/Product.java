import java.util.Arrays;

public class Product{
    private String name;
    private Double price;

    private Attribute[] attribute;
 



    

    private Product(){

    }

         //BUILDER
    // ###########################################################################################@####################3

    public static class productBuilder{
        //fixed part
        private String name;
        private Double price;

        // dinamic part
        private PhysicalDimensions width;
        private PhysicalDimensions length;
        private PhysicalDimensions height;
        private PhysicalDimensions weight;
        


        
        productBuilder(String name,Double price ){
            this.name=name;
            this.price=price;
        }

        public productBuilder withDimensions(Double width,Double length,Double height ){
            this.width =new PhysicalDimensions(width, "inch");
            this.length = new PhysicalDimensions(length, "inch");
            this.height =new PhysicalDimensions(height, "inch");

            return this;
        };
        public productBuilder withWeight(Double weight ){
            this.weight = new PhysicalDimensions(weight, "grams");
            
            return this;
        };
        // FINAL STEP
        public Product build(){
            Product product = new Product();
            //product.setAttribute(new Attribute[4]);
            //fixed part
            product.setName(name);
            product.setPrice(price);
            //dinamic part
            if(width != null){
                addAttribute(product,new Attribute("width", width ));
            }
            if(length != null){
                addAttribute(product, new Attribute("length", length ));
            }
            if(height != null){
                addAttribute(product, new Attribute("height", height));
            }
            if(weight != null){
                addAttribute(product,new Attribute("weight",weight));
            }

            return product;

        }

        private void addAttribute(Product product, Attribute attribute){
            if (product.getAttribute() == null) {
                product.setAttribute(new Attribute[1]);       
            } else {
                product.setAttribute(
                    Arrays.copyOf(product.getAttribute(),product.getAttribute().length+1));
            }
            product.getAttribute()[product.getAttribute().length-1] = attribute;
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
        return attribute;
    }


    public  void setAttribute(Attribute[] attribute) {
        this.attribute = attribute;
    }

    @Override
    public String toString() {
        return "Product [name=" + name + ", price=" + price + ", atribute=" + Arrays.toString(attribute) + "]";
    }


   
    

    
}