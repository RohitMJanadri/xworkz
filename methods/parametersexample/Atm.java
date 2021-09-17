package methods;

public class Atm {
	public static void checkbalance(String password,int balance) {
		String pwd="example";
		if(pwd==password) {
			System.out.println("Available balance is :" + balance);
		}
		else
			System.out.println("password not match");
	}
	public static void withdraw(String password,int withdrawMoney) {
		String pwd="rohit";
		int balance=5000;
		if(pwd==password && balance>withdrawMoney) {
			System.out.println("Money withdrawal sucesssfully " + withdrawMoney);
			
		}
		else
			System.out.println("withdrawal unsucessfully");
	}
	
		
	public static void main(String[] args) {
		Atm.checkbalance("example", 5000);
		Atm.withdraw("rohit", 6000);
		
	}

}
