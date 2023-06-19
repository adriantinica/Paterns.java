public class ObserverPatternEx {

    public static void main(String[] args) {
        Shop shop= new Shop();
        shop.subscribe(new Client("John Doe")); 
        shop.subscribe(new Client("Marry Poppins"));
        shop.unsubcribe(0); 
        
        shop.addProduct(new Product("Uscator de par Dyson HD08"));
        shop.addProduct(new Product ("Sony PlayStation 5"));
        
        System.out.println("The shop has the next subscribers: ");
        for (Client client : shop.clients) {
            if(client != null){
            System.out.println("\t" +client.fullName);
            }
        }



        System.out.println("The shop has the next products: ");
        for (Product product : shop.products) {
            if(product != null){
            System.out.println("\t" +product.name);
            }
        }
        
    }
}

//publisher
class Shop{
    public Product[] products = new Product[5];
    public Client[] clients = new Client[10];

    public void addProduct(Product product){
        for (int i = 0; i < products.length; i++) {
            if(products[i] == null){
                products[i]= product;
                break;
            }
        }
        // notify the subscribers  !!!!
        for (Client client : clients) {
            if(client != null){
                client.update(product);
            }
        }


    }

    public void subscribe(Client client){
        for (int i = 0; i < clients.length; i++) {
            if(clients[i] == null){
                clients[i]= client;
                break;
            }
        }
    }

   public void unsubcribe(int index){
        Client[] newClients = new Client[clients.length - 1];
        for(int oi = 0, ci = 0; oi < clients.length; oi++ ) {
            if( oi != index ){
                newClients[ ci++ ] = clients[ oi ];
            }
        }
        clients = newClients;
   }
    

}


class Product{
    String name;
     public Product(String name){
        this.name = name;
    }
}


//subscribers
class Client{
    String fullName;
    public Client(String fullName){
        this.fullName = fullName;
    }

    public void update(Product product){
        System.out.println("Me, "+ fullName + ", i have decided to buy " + product.name);
    }
}