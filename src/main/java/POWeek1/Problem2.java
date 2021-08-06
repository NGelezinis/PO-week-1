package POWeek1;

import java.util.Arrays;
import java.util.Scanner;

public class Problem2 {
	public static void main(String[] args) {
		int[] arr1={7,5,6,1,4,2};
		int[] arr2={5,3,1,2};
		System.out.println("The Array is: " + Arrays.toString(arr1));
		findMinMax(arr1);
		findfirstMissing(arr1);
		System.out.println("The Array is: " + Arrays.toString(arr2));
		findMinMax(arr2);
		findfirstMissing(arr2);
		Scanner in = new Scanner(System.in);
		int action = 0;
		int problemSize = 0;
		while (true) {
			System.out.println("Enter 0 to quit, 1 to find the min and max of an array, or 2 to find the first missing number in an array from 1 to some n:");
			action = in.nextInt();
			if(action == 0) {
				return;
			}
			System.out.println("Enter the size of the array:");
			problemSize = in.nextInt();
			int[] intArray = new int[problemSize];
			System.out.println("Enter the numbers in the array");
			for(int i = 0; i < problemSize; i++) {
				intArray[i] = in.nextInt();
			}
			if(action == 1) {
				findMinMax(intArray);
			}
			if(action == 2) {
				findfirstMissing(intArray);
			}
			
		}
	}
	
	public static void findMinMax(int[] numList) {
		int min = 999999999;
		int max = 0;
		for(int i = 0; i < numList.length; i++) {
			if (numList[i] < min) {
				min = numList[i];
			}
		}
		for(int i = 0; i < numList.length; i++) {
			if (numList[i] > max) {
				max = numList[i];
			}
		}
		System.out.println("Min: " + min);
		System.out.println("Max: " + max);
	}
	
	public static void findfirstMissing(int[] numList) {
		Arrays.sort(numList);
		for(int i = 0; i < numList.length; i++) {
			if(numList[i] != i+1) {
				System.out.println("The missing number is: " + (i+1));
				return;
			}
		}
		System.out.println("There is no missing number");
	}

}
