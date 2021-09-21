package methods;

public class result {

	public static void results(String USN) {
		String UNIVERSITYNO="3PG17CS028";
		
		if(USN==UNIVERSITYNO) {
			int per=85;
			System.out.println("percentage of the given USN is =" +per+"%");
			
			
		}
		else 
		{
			System.out.println("USN doen not match");
		}
		
	}
	public static void main(String[] args) {
		result.results("3PG17CS028");

	}

}
