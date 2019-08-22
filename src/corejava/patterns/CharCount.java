package corejava.patterns;

import java.util.Scanner;

public class CharCount {

	/*public static void main(String args[]) {
	    char Char;
	    int count;
	    String a = "Hi my name is Rahul";
	    a = a.toLowerCase();
	    for (Char = 'a'; Char <= 'z'; Char++) {
	        count = 0;
	        for (int i = 0; i < a.length(); i++) {
	            if (a.charAt(i) == Char) {
	                count++;
	            }
	        }
	        System.out.println("Number of occurences of " + Char + " is " + count);
	    }
	}
}*/
	
	
	public static void main(String[] args) {
	    System.out.println("Plz Enter Your String: ");
	    Scanner sc = new Scanner(System.in);
	    String s1 = sc.nextLine();
	    int count = 0;
	    for (int i = 0; i < s1.length(); i++) {
	        for (int j = 0; j < s1.length(); j++) {
	            if (s1.charAt(i) == s1.charAt(j)) {
	                count++;
	            } 
	        } 
	        System.out.println(s1.charAt(i) + " --> " + count);
	        String d = String.valueOf(s1.charAt(i)).trim();
	        s1 = s1.replaceAll(d, "");
	        count = 0;
	    }
	    }
	}
