package learning.optional;

import java.util.Optional;

public class LearningOptional {

	public static void main(String[] args) {
		
		String normal = "Oi";
		String emBranco = "";
		String nula = null;
		
		System.out.println("Normal sem Optional: "+verificaString1(normal));
		System.out.println("Normal com Optional: "+verificaString2(normal).get()+"\n");
		
		System.out.println("Em Branco sem Optional: "+verificaString1(emBranco));
		System.out.println("Em Branco com Optional: "+verificaString2(emBranco)
			.orElseGet(() -> {return "Em Branco\n";}));

		
		System.out.println("Null sem Optional: "+verificaString1(nula));
		System.out.println("Null com Optional: "+verificaString2(nula)
		.orElseGet(() -> {return "String nula\n";}));
	}

	public static String verificaString1(String texto) {
		return texto;
	}
	
	public static Optional<String> verificaString2(String texto) {
		if(texto == null)
			return Optional.ofNullable(texto);
		if(texto.isEmpty())
			return Optional.empty();
		
		return Optional.of(texto);
	}
}
