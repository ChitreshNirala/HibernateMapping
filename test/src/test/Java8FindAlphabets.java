package test;

import java.util.ArrayList;
import java.util.List;

public class Java8FindAlphabets {

	public static void main(String[] args) {
		//String str = "chitresh@Niralas";

		// print only alphabates
		/*
		 * List<Character> chrs = new ArrayList<>(); 
		 * for (Character ch : str.toCharArray()) {
		 *  if(ch<'A' || ch>'Z' && ch<'a' || ch>'z')
		 *   {} 
		 *  else {
		 * chrs.add(ch); 
		 * } 
		 * } System.out.println(chrs);
		 */
		
		
		//reverse the string
		/*
		 * char[] strch = str.toCharArray();
		 * 
		 * System.out.println(strch.length); 
		 * for (int i=strch.length-1 ; i>=0; i--) {
		 * System.out.print(strch[i]); }
		 */

		//sum of degits
		int num =765;
		int sum =0;
		while(num != 0) {
			sum= sum + num % 10;
			num = num/10;
		
	}
		System.out.println((sum));

	/*private static int getsum(int num) {
		int sum =0;
		while(num != 0) {
			sum= sum + num % 10;
			num = num/10;
			
		}
		return sum;
	}*/

}}
