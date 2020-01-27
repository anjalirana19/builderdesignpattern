package builder;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      User user=new User
    		  .UserBuilder("Amar")
    		  .setMidName("kumar")
    		  .setLastName("dixit")
    		  .build();
     System.out.println(user);
	}

}
