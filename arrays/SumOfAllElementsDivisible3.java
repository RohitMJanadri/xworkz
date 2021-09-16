package arrays;

public class SumOfAllElementsDivisible3 {

	public static void main(String[] args) {
		int total = 0;
		int sumAmount[] = {1,2,3,4,5,6};
		for(int i=0;i<sumAmount.length;i++)
		if(sumAmount[i]%3==0){
			total=total+sumAmount[i];
			
		}
		System.out.println(total);

	}

}
