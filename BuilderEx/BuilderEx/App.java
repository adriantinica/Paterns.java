

public class App {
    public static void main(String[] args) {

        // using productBuilder
       
        System.out.println("\n\n");

        Product firstProduct = new Product.productBuilder("Samsung XXIII", 1000.00)
                                         .withDimensions(200.00,300.00,200.00)
                                         //.withWeight(300.00)
                                         .build();
        
        System.out.println(firstProduct);   
        
        Product secondProduct = new Product.productBuilder("PS5", 2000.00)
                                        //.withDimensions(13.00, 7.00, 20.00)
                                        .withWeight(2000.00)
                                        .build();

        System.out.println(secondProduct); 
        System.out.println("\n\n");
        
                                        


        //Product product = new Product(); 
        //Attribute objectH = new Attribute("height", 100.0);
                         //   ^
                                                           //   |
        //System.out.println(objectH.getValue().getClass()); //----  auto boxing (because of type Object)
       
       
        //System.out.println(product.getName());
        //System.out.println(product.getPrice());
        //System.out.println(product.getAtribute());

        //product.setName("Phone");
        //product.setPrice(2000.00);
        //product.setAtribute(new Attribute[3]);

        //product.getAtribute()[0]= new Attribute("width", 2.3);
        //product.getAtribute()[0]= new Attribute("heigh", 4.3);
        //product.getAtribute()[0]= new Attribute("weight", 600);



    }

   
}
