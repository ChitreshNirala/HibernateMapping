package test;

import java.util.Arrays;
import java.util.List;

public class Java8 {

	public static void main(String[] args) {
	//List<Integer> values = Arrays.asList(1,2,3,4,5,6);
	
	//values.forEach(System.out::println);
	
		/*
		 * int result=0; for(int i:values) {
		 * 
		 * result = result+i*2; }
		 */
	//System.out.println(values.stream().map(i->i*2).reduce(0,(c,e)->c+e));
	
	//System.out.println(values.stream().map(i->i*2).reduce(0,(c,e)->Integer.sum(c, e)));
//	System.out.println(values.stream().map(i->i*2).reduce(0,Integer::sum));
		
		
		
		List<Integer> values = Arrays.asList(12,20,35,46,55,68,75);
		int result =0;
		for(int i:values) {
			if(i%5==0)
			result+=i;
		}
		System.out.println(result);	
		
		System.out.println(values.stream().filter(i->i%5==0).reduce(0,Integer::sum));	
		
	
	

	}

}
