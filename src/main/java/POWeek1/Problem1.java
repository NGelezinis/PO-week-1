package POWeek1;

import java.util.Scanner;

public class Problem1 {
	public static void main(String[] Args) {
		System.out.println("example case: ");
		System.out.println("word1: Minneapolis");
		System.out.println("word2: Minnesota");
		LongestCommonSubsequenceLength("Minneapolis", "Minnesota");
		Scanner in = new Scanner(System.in);
        String word1 = "";
        String word2 = "";
        while (true) {
        	System.out.println("Enter a first word to compare or enter x to exit:");
        	word1 = in.next();
        	if(word1.equals("x")) {
        		return;
        	}
        	System.out.println("Enter a second word to compare:");
        	word2 = in.next();
        	LongestCommonSubsequenceLength(word1, word2);
        	
        }
	}
	
	public static void LongestCommonSubsequenceLength(String word1, String word2) {
		int maxSize = 0;
		for(int i = 0; i < word1.length()+1; i++) {
			for(int j = 0; j < i; j++) {
				String temp = word1.substring(j, i);
				if(word2.contains(temp)) {
					if(i-j > maxSize) {
						maxSize = i-j;
					}
				}
			}
		}
		System.out.println(maxSize);
		
	}

}
