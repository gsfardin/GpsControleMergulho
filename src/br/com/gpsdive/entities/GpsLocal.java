package br.com.gpsdive.entities;

public class GpsLocal {

	private String estado;
	private String cidade;
	
	private GpsPesqueiro pesqueiro;
	
	public GpsLocal() {}

	public GpsLocal(String estado, String cidade, GpsPesqueiro pesqueiro) {
		this.estado = estado;
		this.cidade = cidade;
		this.pesqueiro = pesqueiro;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public GpsPesqueiro getPesqueiro() {
		return pesqueiro;
	}

	public void setPesqueiro(GpsPesqueiro pesqueiro) {
		this.pesqueiro = pesqueiro;
	}

	@Override
	public String toString() {
		return "GpsLocal [estado=" + estado + ", cidade=" + cidade + ", pesqueiro=" + pesqueiro + "]";
	}
}
