package fundamentos;

import java.util.Scanner;

public class EntradaNomes {

	   public static void main(String[] args) {
	        String nome = ""; 
	        Scanner LerTeclado = new Scanner(System.in);
	        
	        System.out.println("Ol� Estudante!");
	        System.out.print("Qual � o seu nome?: ");
	        nome = LerTeclado.nextLine();
	        System.out.println("Ol� "+nome);
	    }   

}
