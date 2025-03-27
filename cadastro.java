package br.com.petshop;

import java.util.Scanner;
import java.util.List;

public class Cadastro extends PetShop {
	
	private Scanner scanner;
	private List<Animal> animais;
	
	public Cadastro(Scanner scanner, List<Animal> animais) {
		this.scanner = scanner;
		this.animais = animais;
	}


	public void cadastroCachorro() {
        String nomeCachorro = Validacao.validarS(scanner, "NOME:");
        String raca = Validacao.validarS(scanner, "RAÇA:");
        int idadeCachorro = Validacao.validarI(scanner, "IDADE:");
        animais.add(new Cachorro(nomeCachorro, idadeCachorro, raca));
        System.out.print("✅ CACHORRO CADASTRADO.");
    }
}

