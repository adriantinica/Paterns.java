public class App {
    public static void main(String[] args) {
        

        User user1 =  new User.UserBuilder("Tinica", "Adrian")
        .address("Soldanesti, s.Cotiujenii Mari")
        .phone("069408080")
        .age(23)
        .build();
        User user2 =  new User.UserBuilder("Potoroaca", "Valeriu")
        .address("Soldanesti, s.Cotiujenii Mari")
        //.phone("069408080")
        //.age(23)
        .build();


        System.out.println("\n\n");
        System.out.println(user1);
        System.out.println(user2);
        System.out.println("\n\n");

    }
}
