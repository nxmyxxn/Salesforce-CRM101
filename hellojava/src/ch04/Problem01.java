package ch04;

public class Problem01 {

	public static void main(String[] args) {
		for(int i=1; i<101; i++) {
			if(i%5==0 && i%7==0) {
				System.out.println(i);
			}
		}
	}

}
