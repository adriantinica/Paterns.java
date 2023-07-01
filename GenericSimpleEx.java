public class GenericSimpleEx {

    public static void main(String[] args) {
        Dimensions <Double, String> weigth = new Dimensions(20.00, "KG");
        Dimensions <Integer , Boolean> experiment = new Dimensions(2, true);
        Dimensions <Integer , String> widthDimensions = new Dimensions(2, "mm");
        Dimensions <Integer , String> heightDimensions = new Dimensions(2, "cm");
        Dimensions <Integer , String> lengthDimensions = new Dimensions(2, " m");
        
    }
}

class Dimensions <T,S>{
    T value;
    S unit;

    public Dimensions(T value, S unit) {
        this.value = value;
        this.unit = unit;
    }
    
}