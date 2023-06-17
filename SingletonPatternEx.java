import java.sql.DataTruncation;
import java.util.Arrays;

public class SingletonPatternEx{
    public static void main(String[] args) {
        DataCollection firstCollection = DataCollection.getInstance();
        firstCollection.add(10);
        firstCollection.add(20);
        firstCollection.add(30);
        firstCollection.add(40);
        System.out.println(firstCollection.get(0));
        System.out.println(firstCollection.get(1));
        System.out.println(firstCollection.get(2));
        System.out.println(firstCollection.get(3));

        System.out.println("\n");

        DataCollection secondCollection = DataCollection.getInstance();
        secondCollection.add(50);
        System.out.println(secondCollection.get(0));
        System.out.println(secondCollection.get(1));
        System.out.println(secondCollection.get(2));
        System.out.println(secondCollection.get(3));
        System.out.println(secondCollection.get(4));


    }
}


 class DataCollection{
    private Object[] data;
    private static DataCollection instance;    // created a new static  variable type as class name;

    private DataCollection(){   // encapsulation of the default constructor

    }

    public static DataCollection getInstance(){
        if(instance == null){
            instance = new DataCollection();
        }
        return instance;
    }

    public void add( Object object){
        if(data == null){
            data = new Object[1];
        }else{
            data = Arrays.copyOf(data, data.length+1);
           
        }
        data[data.length-1]= object;

    }

    public Object get(int index){
        return data[index];
    }
}