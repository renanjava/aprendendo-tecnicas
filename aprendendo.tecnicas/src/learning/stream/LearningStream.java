package learning.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

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
		
		//Operações finais
		long quantidadeElementos = numeros.stream().filter(e -> e % 2 == 0).count();
		Optional<Integer> menorPar = numeros.stream()
				.filter(e -> e % 2 == 0).min(Comparator.naturalOrder());
		Optional<Integer> maiorPar = numeros.stream()
				.filter(e -> e % 2 == 0).max(Comparator.naturalOrder());
		List<Integer> elementosImpares = numeros.stream()
				.filter(e -> e % 1 == 0).collect(Collectors.toList());
		
		Map<Boolean, List<Integer>> gruposImparesOuPares = numeros.stream()
		.filter(e -> e % 1 == 0).collect(Collectors.groupingBy(e -> e % 2 == 0));
		
		String stringNumeros = numeros.stream()
				.map(e -> String.valueOf(e)).collect(Collectors.joining());
		
		System.out.println(gruposImparesOuPares);
		System.out.println(stringNumeros);
	}
}
