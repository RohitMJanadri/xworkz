package arrays;

public class sumOfAllEvenNo {

	public static void main(String[] args) {
		int total = 0;
		int sumAmount[] = {1023,224,227,554,1556};
		for(int i=0;i<sumAmount.length;i++)
		if(i%2==0){
			total=total+sumAmount[i];
		}
		System.out.println(total);

	}

}
