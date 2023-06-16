
public class PizzaApp {
    public static void main(String[] args) {
        
        Pizza pizza = new Pizza.PizzaBuilder("Blat subtire", "medium")
        .basilLeaves(1)
        .parmigiano(0)
        .mozzarellaCheese(true)
        .pepperoniPieces(6)
        .bakePizza();

        System.out.println("\n\n");
        System.out.println(pizza);
        System.out.println("\n\n");
    }
}
