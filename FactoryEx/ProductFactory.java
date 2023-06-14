public class ProductFactory {
    
    //helper method                           // indicates type and other parameters
    private static  Product createBaseProduct(String type, String name, double price){
        Product product=null;
        if (type.equals("phone")) {
            product = new Phone();    
        } else if(type.equals("printer")) {
            product= new Printer();
        }else if(type.equals("laptop")) {
            product= new Laptop();
        }
        if(product != null){
            product.setName(name);
            product.setPrice(price);
        }
        return product;

    }

    public static Product createProduct(String type, String name, double price, int diagonal){
        Product product = createBaseProduct(type, name, price);
        ((Phone)product).setDiagonal(diagonal);
        return product;
    }
    public static Product createProduct(String type, String name, double price, String value){
        Product product = createBaseProduct(type, name, price);
        if (type.equals("printer")) {
            ((Printer)product).setFormat(value);
        }else if(type.equals("laptop")){
            ((Laptop)product).setCPU(value);
        }
        return product;
    }

    //public static Product createProduct(String type, String name, double price, String CPU){
    //    Product product = createBaseProduct(type, name, price);
    //    ((Laptop)product).setCPU(CPU);
    //    return product;
    //}


    
    
}
