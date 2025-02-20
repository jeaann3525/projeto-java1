package br.com.petshopp;

public class Cachorro extends Animal {
	private String raca;
	
	public Cachorro(String nome, int idade, String raca) {
		super(nome, idade);
		this.raca = raca;
	}

	public void latir() {
		System.out.println(getnome() + "está latindo: AUUU AUUU");
	}
		public void exibirInfo(){
			super.exibirInfo();
			System.out.println("raca"+raca);
			}
	}


