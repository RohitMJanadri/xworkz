package strings;

public class email {
	
	

	public static void main(String[] args) {
		String mail = "@gmail.com";
		boolean contains = mail.contains("@gmail");
		System.out.println(contains);
		
		boolean endsWith=mail.endsWith(".com");
		System.out.println(endsWith);

		
		
		if(contains==true && endsWith==true) {
			System.out.println("Given mail is valid");
			
		}else {
			System.out.println("mail is not valid");
		}
	}

}