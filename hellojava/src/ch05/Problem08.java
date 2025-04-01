package ch05;

import java.util.Arrays;


public class Problem08 {

	public static void main(String[] args) {
		
		int[][] array = {{95, 86}, 
						{83, 92, 96}, 
						{78, 83, 93, 87, 88}};
		
		int total = 0;
		int count = 0;
		double avg = 0;
		
		for(int[] row : array) {
			System.out.println(Arrays.toString(row));
			
			for(int num : row) {
				total+=num;
				count++;
				}
			}
		avg = (count > 0) ? (double) total / count : 0;
		System.out.println("합:"+ total);
		System.out.println("평균:" + avg);
	}
}
