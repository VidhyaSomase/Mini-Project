import java.util.Scanner;

public class RegistrationForm {
	private String FirstName;
	private String LastName;
	private String userName;
	private int Password;
	private String Address;
	private long Contact;
	

	public void registration() {
		Scanner sc = new Scanner(System.in);
		System.out.println("registration for purchase product ");
		System.out.println("enter name");
		FirstName= sc.next();
		System.out.println("enter last name");
		LastName = sc.next();
		System.out.println("userName");
		userName=sc.next();
		System.out.println("enter password");
		Password=sc.nextInt();
		System.out.println("enter Address");
		Address = sc.next();
		System.out.println("enter contact");
		Contact=sc.nextInt();		
	}

}
