package br.com.gpsdive.entities;

public class GpsPeixe {

	private String nome;
	
	private double peso;
	private double percentualCaptura;
	
	public GpsPeixe() {}
	
	public GpsPeixe(String nome, double peso, double percentualCaptura) {
		this.nome = nome;
		this.peso = peso;
		this.percentualCaptura = percentualCaptura;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getPercentualCaptura() {
		return percentualCaptura;
	}

	public void setPercentualCaptura(double percentualCaptura) {
		this.percentualCaptura = percentualCaptura;
	}

	@Override
	public String toString() {
		return "GpsPeixe [nome=" + nome + ", peso=" + peso + ", percentualCaptura=" + percentualCaptura + "]";
	}
}
