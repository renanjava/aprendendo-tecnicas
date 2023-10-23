package learning.stream;

import java.util.Arrays;
import java.util.List;

public class LearningStream {
	
	public static void main(String[] args) {
		
		List<Integer> numeros = Arrays.asList(1,2,3,4,5);
		
		for (Integer n : numeros) {
			System.out.print(n);
		}
		
		System.out.println();
		
		numeros.stream().forEach((n) -> System.out.print(n));	
		
		System.out.println();
		
		
		for (Integer n : numeros) {
			if(n % 2 == 0)
				System.out.print(n);
		}
		
		System.out.println();
		
		numeros.stream().filter(e -> e % 2 == 0).forEach((n) -> System.out.print(n));
		System.out.println();
		
		numeros.stream().skip(4).limit(1).map(e -> e * 5).forEach(e -> System.out.println(e));
	}
}
