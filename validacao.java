package br.com.petshop;

import java.util.Scanner;

public class Validacao {
	
	public static String validarS(Scanner scanner, String mensagem) {
        boolean stringValida = false;
        String nome = "";

        while (!stringValida) {
            System.out.println(mensagem);
            nome = scanner.nextLine();

            if (nome.matches("[a-zA-Z]+")) {
                stringValida = true;
            } else {
                System.out.println("❌ [INVÁLIDO] INSIRA APENAS LETRAS.");
            }
        }

        return nome;
    }
	


	public static int validarI(Scanner scanner, String mensagem) {
	    int num = 0;
	    boolean intValido = false;

	    while (!intValido) {
	        System.out.print(mensagem);
	        System.out.println();
	        if (scanner.hasNextInt()) {
	            num = scanner.nextInt();
	            intValido = true;
	        } else {
	            System.out.println("❌ [INVÁLIDO] INSIRA APENAS NÚMEROS INTEIROS.");
	            scanner.next(); 
	        }
	    }
	    scanner.nextLine();
	    return num;
	}

}
