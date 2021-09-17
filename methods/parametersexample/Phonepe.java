package methods;

public class Phonepe {
	public static void electricitybill(String consumerNo,String amount ) {
		System.out.println("paying electricity bill ");
		System.out.println("username"+ "  "+consumerNo);
		System.out.println("Amount"+ "  "+amount);
		System.out.println("bill paid sucessfully ");
	}
	public static void waterbill(String consumerNo,String amount ) {
		System.out.println("\npaying waterbill ");
		System.out.println("username"+ "  "+consumerNo);
		System.out.println("Amount"+ "  "+amount);
		System.out.println("bill paid sucessfully ");
	}
	public static void DTHrecharge(String consumerNo,String amount ) {
		System.out.println("\npaying DTHrecharge ");
		System.out.println("username"+ "  "+consumerNo);
		System.out.println("Amount"+ "  "+amount);
		System.out.println("bill paid sucessfully ");
	}
	public static void moneyTransfer(String accNo,int amount ) {
		if(amount>2000) {
		System.out.println(" \nmoneyTransfer ");
		System.out.println("AccNo"+ "  "+accNo);
		System.out.println("Amount"+ "  "+amount);
		System.out.println("money transfer sucessfully ");
	}	
	}
	
	public static void main(String[] args) {
		
		Phonepe.electricitybill("B62664588","455");
		Phonepe.waterbill("KAR2462","700");
		Phonepe.DTHrecharge("AIRTEL02035","300");
		Phonepe.moneyTransfer("SBI02356956",2001);
		}
	

}
