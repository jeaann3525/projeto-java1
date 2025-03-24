package br.com.petshopp ;

import java.util.ArrayList;
import java.util.Scanner;

public class Petshopp  {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		ArrayList<Animal> animais = new ArrayList<>();
		int opcao;

		
		do {
			System.out.println("\n=== MENU ===");
			System.out.println("1 - Cadastrar Cachorro");
			System.out.println("2 - Cadastrar Gato");
			System.out.println("3 - Exibir animais");
			System.out.println("4 - Sair");
			System.out.println("escolha uma opção");
			opcao = scanner.nextInt();
			scanner.nextLine();

			switch (opcao) {

			case 1:
				boolean isValid = false;
				
				System.out.println("Nome do Cachorro;");
				String nomeCachorro = scanner.nextLine();
				
				while (!isValid) {					
				
				 if (nomeCachorro.matches("[a-zA-Z]+")) {
		                isValid = true;
				  } else {
		                System.out.println("Entrada inválida. Por favor, digite apenas letras.");
		                nomeCachorro = scanner.nextLine();
		            }
				 
		        }
				System.out.println("Idade do Cachorro:");
				int idadeCachorro = scanner.nextInt();
				scanner.nextLine();
				System.out.println("Raça do Cachorro: ");
				String raca = scanner.nextLine();
				animais.add(new Cachorro(nomeCachorro, idadeCachorro, raca));
				System.out.println("Cachorro cadastrado com sucesso.");
				break;

			case 2:
				System.out.println("Nome do Gato: ");
				String nomeGato = scanner.nextLine();
				System.out.println("Idade do Gato: ");
				int idadeGato = scanner.nextInt();
				scanner.nextLine();
				System.out.println("Cor do pelo do Gato: ");
				String corPelo = scanner.nextLine();
				animais.add(new Gato(nomeGato, idadeGato, corPelo));
				System.out.println("Gato cadastrado com sucesso!");
				break;

			case 3:
				System.out.println("\nLista de animais");
				for (Animal animal : animais) {
					animal.exibirInfo();
				}
				break;
				
			case 4:
				System.out.println("Encerrando o programa...");
				break;
			default:
				System.out.println("Opção inválida! Tente novamente.");
				break;
			}

		} while (opcao != 4);

	}
