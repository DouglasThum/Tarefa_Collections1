package domain;

public class Pessoa implements Comparable<Pessoa>{

	private String nome;
	private Character sexo;
	
	public Pessoa() {
	}

	public Pessoa(String nome, Character sexo) {
		this.nome = nome;
		this.sexo = sexo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Character getSexo() {
		return sexo;
	}

	public void setSexo(Character sexo) {
		this.sexo = sexo;
	}

	@Override
	public int compareTo(Pessoa pessoa) {
		return this.nome.compareTo(pessoa.getNome());
	}

	@Override
	public String toString() {
		return nome;
	}
	
	
}
