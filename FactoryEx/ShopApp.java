public class ShopApp {
    public static void main(String[] args) {
        
        Product smartPhone =  ProductFactory.createProduct("phone","Samsung RG23", 1200, 100);
        Product inkPrinter =  ProductFactory.createProduct("printer","Canon ES 657", 500, "A4");
        Product smallLaptop = ProductFactory.createProduct("laptop", "HP", 2000, "CU 2");
        
        System.out.println(smartPhone);  //automatically calls toString()
        System.out.println(inkPrinter);
        System.out.println(smallLaptop);
    }
}
