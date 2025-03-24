package br.com.petshopp;

public class Gato extends Animal{
	private String corPelo;

	public Gato(String nome, int idade, String corPelo) {
		super(nome, idade);
		this.corPelo = corPelo;
	}
	
	public void miar() {
		System.out.println(getNome() + " está miando: Miau Miau!");
	}
	
	public void exibirInfo() {
		super.exibirInfo();
		System.out.println("Cor do Pelo" + corPelo);
	}
}

