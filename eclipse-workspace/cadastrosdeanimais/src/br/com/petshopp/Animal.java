package br.com.petshopp;

public class Animal {
private String nome;
private int idade;
 	public Animal(String nome, int idade) {
	 this.nome = nome;
	 this.idade = idade;
 }
 public String getnome() {
	 return nome;
 }
 public int getidade() {
	 return idade;
 }
 public void exibirInfo( ) {
	 System.out.println("Nome: " + nome + ", idade " + idade +" anos");
	 
 }
 
}
