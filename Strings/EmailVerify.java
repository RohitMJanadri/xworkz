package strings;

public class EmailVerify {

	public static void main(String[] args) {
		String mail = "@onmicrosoft.com";
		
		boolean endswith=mail.endsWith(".com");

		
		boolean gmail= mail.contains("@gmail");
		boolean yahoo = mail.contains("@yahoo");
		boolean outlook = mail.contains("@onmicrosoft");
		
		if(gmail==true && endswith==true) {
			System.out.println("mail ID is in Gmail format");
		}		
		else if(yahoo==true && endswith==true) {
			System.out.println("mail ID is in yahoo format");
		}
		
		else if(outlook==true && endswith==true) {
			System.out.println("mail ID is in microsoft format");
		}
		else  { 
			System.out.println("please enter valid mail ID");
		}
		

		}

}
