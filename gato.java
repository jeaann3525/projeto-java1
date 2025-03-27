package br.com.petshop;

public class Gato extends Animal{
	private String corPelo;

	public Gato(String nome, int idade, String corPelo) {
		super(nome, idade);
		this.corPelo = corPelo;
	}
	
	public void miar() {
		System.out.println(getNome() + " ESTÁ MIANDO: MIAU MIAU!");
	}
	
	public void exibirInfo() {
		System.out.println("\n[GATO]");
		super.exibirInfo();
		System.out.println("COR DO PELO: " + corPelo);
		miar();
	}
}
