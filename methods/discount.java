package methods;

public class discount {
	public static void total(int price) {
		int amount=0;
		int dis;
		
		
		if(price>5000 && price<10000) {
			dis=10;
			int s=100-dis;
				amount=(s*price)/100;
		}
		
	
		else if(price>10000) {
			dis=15;
			int s=100-dis;
		amount=(s*price)/100;
		}
		System.out.println("total amount after discoumt " + amount);
	}

	public static void main(String[] args) {
		discount.total(11000);

	}

}
