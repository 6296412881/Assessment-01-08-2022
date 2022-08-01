package Abstractiondemo;
interface LibraryUser {
 void registerAccount(); 

 void requestBook(); 
}

class KidUser implements LibraryUser {
	private int age;
	private String bookType;
	
	public void setAge(int age) {
		this.age =age;
	}
	public void setBookType(String book) {
		this.bookType= book;
	}
	@Override
	public void registerAccount() {
		if(age < 12)
			System.out.println("you have successfully registered under a Kids Account");
		else
			System.out.println("Sorry Age must be less than 12 to register as a kid");
	}
	@Override
	public void requestBook() {
		if(bookType.equals("kids"))
			System.out.println("Book Issued successfully, please return the book within 10 days");
		else
			System.out.println("oops, you are allowed to take only kids books");
	}
}
	class AdultUser implements LibraryUser {
		private int age;
		private String bookType;
		
		public void setAge(int age) {
			this.age=age;
		}
		public void setBookType(String book) {
			this.bookType=book;
		}
		@Override
		public void registerAccount() {
			if(age > 12)
				System.out.println("You have successfully registered under an Adult Account");
				else
					System.out.println("Sorry, Age must be less than 12 to register as a kid");
				
								
		}
		@Override
		public void requestBook() {
			if(bookType.equals("Fiction"))
				System.out.println("“Book Issued successfully, please return the book within 7 days");
			else
				System.out.println("Oops, you are allowed to take only adult Fiction books");
				
		}
		
	}
	public class LibraryInterfaceDemo {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			KidUser kidUsers = new KidUser();
			kidUsers.setAge(10);
			kidUsers.setBookType("Kids");
			kidUsers.registerAccount();
			kidUsers.requestBook();
			kidUsers.setAge(18);	
			kidUsers.setBookType("Fiction");		
			kidUsers.registerAccount();
			kidUsers.requestBook();
			System.out.println();
			
			AdultUser adultUser = new AdultUser();
			adultUser.setAge(5);
			adultUser.setBookType("Kids");
			adultUser.registerAccount();
			adultUser.requestBook();
			adultUser.setAge(23);	
			adultUser.setBookType("Fiction");		
			adultUser.registerAccount();
			adultUser.requestBook();
	
	
}
	}
	













	