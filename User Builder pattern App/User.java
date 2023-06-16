public class User{
   private  String firstName; // required
   private  String lastName; // required

   //optional

   private  String address;
   private  int age;
   private  String phone;



    private User(UserBuilder builder) {
		this.firstName = builder.firstName;
		this.lastName = builder.lastName;
		this.age = builder.age;
		this.phone = builder.phone;
		this.address = builder.address;
	}

    public static class UserBuilder {
      final String firstName; // required
      final String lastName; // required

       //optional

      private String address;
      private int age;
      private String phone;

      public UserBuilder(String firstName,String lastName){
      this.firstName = firstName;
      this.lastName = lastName;
      }

        public UserBuilder phone(String phone){
            this.phone = phone;
            return this;
      
        }
        public UserBuilder address(String address) {
			this.address = address;
			return this;
		}

        public UserBuilder age(int age) {
			this.age = age;
			return this;
		}

        public User build() {
			User user =  new User(this);
			
			return user;
		}

    }




public String getFirstName() {
    return firstName;
}
public String getLastName() {
    return lastName;
}
public String getAdress() {
    return address;
}
public int getAge() {
    return age;
}
public String getPhone() {
    return phone;
}

@Override
public String toString() {
    return "User [firstName=" + firstName + ", lastName=" + lastName + ", adress=" + address + ", age=" + age
            + ", phone=" + phone + "]";
}



   

   

}


