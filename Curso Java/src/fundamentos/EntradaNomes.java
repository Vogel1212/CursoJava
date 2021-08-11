package fundamentos;

import java.util.Scanner;

public class EntradaNomes {

	   public static void main(String[] args) {
	        String nome = ""; 
	        Scanner LerTeclado = new Scanner(System.in);
	        
	        System.out.println("Olá Estudante!");
	        System.out.print("Qual é o seu nome?: ");
	        nome = LerTeclado.nextLine();
	        System.out.println("Olá "+nome);
	    }   

}
