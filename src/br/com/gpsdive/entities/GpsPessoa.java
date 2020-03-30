package br.com.gpsdive.entities;

import java.util.Date;

public class GpsPessoa {

	private String nome;
	private Date dataNascimento;
	
	public GpsPessoa() {}
	
	public GpsPessoa(String nome, Date dataNascimento) {
		this.nome = nome;
		this.dataNascimento = dataNascimento;
	}

	String getNome() {
		return nome;
	}

	void setNome(String nome) {
		this.nome = nome;
	}

	Date getDataNascimento() {
		return dataNascimento;
	}

	void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	@Override
	public String toString() {
		return "GpsPessoa [nome=" + nome + ", dataNascimento=" + dataNascimento + "]";
	}
}
