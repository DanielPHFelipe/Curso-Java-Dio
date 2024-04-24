package SintaxeDasClasses01;

public class Aula03 {
	
	public static void main(String[] args) {
		String primeiroNome = "Gleyson";
		String segundoNome = "Sampaio";
		
		String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
		
		System.out.println(nomeCompleto);
	}
	
	public static String nomeCompleto (String primeiroNome, String segundoNome) {
		return "Resultado do métoodo: " +  primeiroNome.concat(" ").concat(segundoNome);
	}
	
}
