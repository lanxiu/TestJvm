package 装箱拆箱;

import java.util.Arrays;
import java.util.List;

public class Test {
	
	
	public static void main(String[] args) {
		List<Integer> lst = Arrays.asList(1,2,3,4);
		int sum =0;
		for(int i:lst) {
			sum+=i;
		}
		System.out.println(sum);
		
		
	}
	

}
