package br.com.gpsdive.entities;

import br.com.gpsdive.entities.enums.GpsTipoFundo;

public class GpsPesqueiro {

	private String nome;
	private String latitude;
	private String longitude;
	
	private Integer profundidadeMinima;
	private Integer profundidadeMaxima;
	
	private GpsTipoFundo tipoFundo;

	public GpsPesqueiro() {}
	
	public GpsPesqueiro(String nome, String latitude, String longitude, Integer profundidadeMinima,
			Integer profundidadeMaxima, GpsTipoFundo tipoFundo) {
		this.nome = nome;
		this.latitude = latitude;
		this.longitude = longitude;
		this.profundidadeMinima = profundidadeMinima;
		this.profundidadeMaxima = profundidadeMaxima;
		this.tipoFundo = tipoFundo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public Integer getProfundidadeMinima() {
		return profundidadeMinima;
	}

	public void setProfundidadeMinima(Integer profundidadeMinima) {
		this.profundidadeMinima = profundidadeMinima;
	}

	public Integer getProfundidadeMaxima() {
		return profundidadeMaxima;
	}

	public void setProfundidadeMaxima(Integer profundidadeMaxima) {
		this.profundidadeMaxima = profundidadeMaxima;
	}

	public GpsTipoFundo getTipoFundo() {
		return tipoFundo;
	}

	public void setTipoFundo(GpsTipoFundo tipoFundo) {
		this.tipoFundo = tipoFundo;
	}

	@Override
	public String toString() {
		return "GpsPesqueiro [nome=" + nome + ", latitude=" + latitude + ", longitude=" + longitude
				+ ", profundidadeMinima=" + profundidadeMinima + ", profundidadeMaxima=" + profundidadeMaxima
				+ ", tipoFundo=" + tipoFundo + "]";
	}
}
