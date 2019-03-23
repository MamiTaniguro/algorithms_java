// This program demonstrate Binary Search

import java.util.Scanner;

public class Binary_Serach {
	public static void main(String[] args) {
		
		int array[] = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Pick a number [between 0 to 15]: ");
		int target = sc.nextInt();
		
		binarySearch(array, target);
		
	}
	
	public static void binarySearch(int array[], int target) {
		
		int low = 0;
		int high = array.length-1;
		int mid = (low + high)/2;
		int count = 0;
		
		while(low <= high) {
			System.out.println("I guess the number is: " + mid);
			
			if(array[mid] == target) {
				// found the target
				System.out.println("Yay! After " + count + " guess(es), I found the target!");
				break;
			}
			else if(array[mid] < target) {
				// the guess is too low
				low = mid+1;			
			} 
			else {
				// the guess is too high
				high = mid-1;
			}
			
			System.out.println("Not right? Hmmm....");
			mid = (low + high)/2;
			count++;
		} // end while
		
		if(low > high) {
			System.out.println("The number is not found...");
		}
	}
	
}
