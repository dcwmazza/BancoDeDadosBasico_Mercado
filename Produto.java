package exercicioMercado;

public class Produto {
	private	String nome;
	private String marca;
	private	String peso;
	private	String valor;
	
	public String getNome() {
		return nome;
	}	
	public String getMarca() {
		return marca;
	}
	public String getPeso() {
		return peso;
	}	
	public String getValor() {
		return valor;
	}


	public void  setNome(String nome) {
		this.nome = nome;
	}

	public void  setMarca(String marca) {
		this.marca = marca;
	}

	public void  setPeso(String peso) {
		this.peso = peso;
	}

	public void  setValor(String valor) {
		this.valor = valor;
	}
}