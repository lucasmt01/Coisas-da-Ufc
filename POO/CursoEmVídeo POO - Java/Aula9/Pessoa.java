package Aula9;

public class Pessoa {

	private String nome;
	private int idade;
	private char sexo;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	
	public Pessoa(String nome, int idade, char sexo) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
	}
	
	public void fazerAniv() {
		this.idade++;
		System.out.println("Aniversário!!\n");
	}
	@Override
	public String toString() {
		return String.format("Nome: %s\nIdade: %d\nSexo: %c",this.nome,this.idade,this.sexo);
	}
	
}
