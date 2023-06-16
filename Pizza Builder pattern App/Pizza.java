public class Pizza{

    //default attributes

    private String pizzaCrust;
    private String pizzaSize;  // (small, medium, large)

    // optional attributes

    private Boolean pomodoroSauce;
    private Boolean pineApplebites;
    private int pepperoniPieces;
    private int parmigiano;
    private int basilLeaves;    // 3-4 pieces
    private Boolean mozzarellaCheese;


    private Pizza(PizzaBuilder builder){
        this.pomodoroSauce = builder.pomodoroSauce;
        this.pineApplebites = builder.pineApplebites;
        this.pepperoniPieces = builder.pepperoniPieces;
        this.parmigiano = builder.parmigiano;
        this.basilLeaves = builder.basilLeaves;
        this.mozzarellaCheese = builder.mozzarellaCheese;
        this.pizzaCrust = builder.pizzaCrust;
        this.pizzaSize = builder.pizzaSize;


    }

    public static class PizzaBuilder{
        
        //default attributes

        private String pizzaCrust;
        private String pizzaSize;  // (small, medium, large)

    // optional attributes

        private Boolean pomodoroSauce;
        private Boolean pineApplebites;
        private Boolean mozzarellaCheese;
        private int pepperoniPieces;
        private int parmigiano;
        private int basilLeaves;    // 3-4 pieces



        public PizzaBuilder(String pizzaCrust,String pizzaSize){
            this.pizzaCrust = pizzaCrust;
            this.pizzaSize = pizzaSize;
        }

        public PizzaBuilder pineApplebites(Boolean pineApplebites){
            this.pineApplebites = pineApplebites;
            return this;

        } 

        public PizzaBuilder mozzarellaCheese(Boolean mozzarellaCheese){
            this.mozzarellaCheese = mozzarellaCheese;
            return this;

        } 

        public PizzaBuilder pepperoniPieces(int pepperoniPieces){
            this.pepperoniPieces = pepperoniPieces;
            return this;

        } 
        
        public PizzaBuilder parmigiano(int parmigiano){
            this.parmigiano = parmigiano;
            return this;

        } 
        
        public PizzaBuilder  basilLeaves(int  basilLeaves){
            this. basilLeaves =  basilLeaves;
            return this;

        } 

        public Pizza bakePizza(){
            Pizza pizza = new Pizza(this);
            return pizza;
        }
    }




    public String getPizzaCrust() {
        return pizzaCrust;
    }
    public String getPizzaSize() {
        return pizzaSize;
    }
    public Boolean getPomodoroSauce() {
        return pomodoroSauce;
    }
    public Boolean getPineApplebites() {
        return pineApplebites;
    }
    public int getPepperoniPieces() {
        return pepperoniPieces;
    }
    public int getParmigiano() {
        return parmigiano;
    }
    public int getBasilLeaves() {
        return basilLeaves;
    }
    public Boolean getMozzarellaCheese() {
        return mozzarellaCheese;
    }


    @Override
    public String toString() {
        return "Pizza [pizzaCrust=" + pizzaCrust + ", pizzaSize=" + pizzaSize + ", pomodoroSauce=" + pomodoroSauce
                + ", pineApplebites=" + pineApplebites + ", pepperoniPieces=" + pepperoniPieces + ", parmigiano="
                + parmigiano + ", basilLeaves=" + basilLeaves + ", mozzarellaCheese=" + mozzarellaCheese + "]";
    }

    

    

}