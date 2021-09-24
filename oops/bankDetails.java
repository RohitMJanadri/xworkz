package oops;

public class bankDetails {

	public static void main(String[] args) {
		
		bank SBI=new bank();
		SBI.Name="State Bank of India";
		SBI.address="near police station Koppal";
		SBI.branch="Koppal";
		SBI.ifscCode="SBIN0020214";
		SBI.Deposit();
		
		System.out.println(SBI.Name);
		System.out.println(SBI.address);
		System.out.println(SBI.branch);
		System.out.println(SBI.ifscCode+"\n");
		
		
		bank pkgb=new bank();
		pkgb.Name="Karnataka gramina bank";
		pkgb.address="Basaveshwara nagara abc building Koppal";
		pkgb.branch="Koppal";
		pkgb.ifscCode="PKGB001245";
		pkgb.withdraw();
		
		System.out.println(pkgb.Name);
		System.out.println(pkgb.address);
		System.out.println(pkgb.branch);
		System.out.println(pkgb.ifscCode);
		
	}

}
