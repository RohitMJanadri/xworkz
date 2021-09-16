package arrays;

public class sumOfAllElements {

	public static void main(String[] args) {
		int total = 0;
		int sumAmount[] = {1023,224,227,554,1556};
		for(int i=0;i<sumAmount.length;i++)
		{
			total=total+sumAmount[i];
		}
		System.out.println(total);

	}

}
