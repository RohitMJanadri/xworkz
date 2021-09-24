package oops;



public class LGManufacturer {

	public static void main(String[] args) {
		
		tv LG=new tv();
		LG.brand="LG";
		LG.price="21000";
		LG.model="LGsmart";
		LG.width=32;
		
		System.out.println(LG.brand);
		System.out.println(LG.price);
		System.out.println(LG.model);
		System.out.println(LG.width+"inches\n");
		
		tv oneplus=new tv();
		oneplus.brand="oneplus";
		oneplus.price="62900";
		oneplus.model="OnePlus TV U1S";
		oneplus.width=65;
		
		System.out.println(oneplus.brand);
		System.out.println(oneplus.price);
		System.out.println(oneplus.model);
		System.out.println(oneplus.width+"inches");
		
		

	}

}
