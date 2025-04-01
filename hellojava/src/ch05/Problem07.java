package ch05;

public class Problem07 {

	public static void main(String[] args) {
		int [] array = {1,5,3,8,2};
		
		int max=0;
		
		for(int temp : array) {
			if (temp>max)
				max = temp;
		
		}
		
		System.out.println("최대값: " + max );

	}

}
