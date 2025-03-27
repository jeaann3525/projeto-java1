package br.com.petshop;

public class Cachorro extends Animal {
	private String raca;

	public Cachorro(String nome, int idade, String raca) {
		super(nome, idade);
		this.raca = raca;

	}

	public void latir() {
		System.out.println(getNome() + " ESTÁ LATINDO: AU! AU!");
	}

	public void exibirInfo() {
		System.out.println("\n[CACHORRO]");
		super.exibirInfo();
		System.out.println("RAÇA: " + raca);
		latir();

	}

}
