package br.com.gpsdive.entities;

import java.util.ArrayList;
import java.util.List;

public class GpsMergulhador {

	private GpsPessoa pessoa;
	
	List<GpsPeixe> peixes = new ArrayList<GpsPeixe>();

	public GpsMergulhador() {}

	public GpsMergulhador(GpsPessoa pessoa) {
		this.pessoa = pessoa;
	}

	public GpsPessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(GpsPessoa pessoa) {
		this.pessoa = pessoa;
	}

	public List<GpsPeixe> getPeixes() {
		return peixes;
	}
	
//	LISTA NÃO DEVE SER ALTERADA POR MÉTODO
//	public void setPeixes(List<GpsPeixe> peixes) {
//		this.peixes = peixes;
//	}
	
	public void addPeixes(GpsPeixe peixe) {
		peixes.add(peixe);
	}
	
	public void removePeixes(GpsPeixe peixe) {
		peixes.remove(peixe);
	}

	@Override
	public String toString() {
		return "GpsMergulhador [pessoa=" + pessoa + ", peixes=" + peixes + "]";
	}
}
