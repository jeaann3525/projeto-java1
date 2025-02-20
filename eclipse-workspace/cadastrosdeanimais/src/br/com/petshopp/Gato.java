package br.com.petshopp;

public class Gato extends Animal {
	private String corPelo;
	public Gato(String nome, int idade, String corPelo) {
		super(nome, idade);
		this.corPelo = corPelo;
	}
	public void miar() {
		System.out.println(getnome()+"esta miando: miauu miauu");
}
	public void exibirInfo() {
		super.exibirInfo();
		System.out.println("cor do pelo:" + corPelo);
		
		
		
	}

}
