package br.com.gpsdive.entities;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import br.com.gpsdive.entities.enums.GpsEscalaBeafort;
import br.com.gpsdive.entities.enums.GpsLua;
import br.com.gpsdive.entities.enums.GpsRosaVentos;

public class GpsMergulho {

	private Date data;
	
	private Integer visibilidade;
	private Integer temperatura;
	
	private Time horaInicial;
	private Time horaFinal;
	
	private GpsLua lua;
	private GpsRosaVentos direcaoVento;
	private GpsRosaVentos direcaoCorrenteza;
	private GpsEscalaBeafort condicaoMar;
	
	private GpsLocal local;
	
	List<GpsMergulhador> mergulhadores = new ArrayList<GpsMergulhador>();

	public GpsMergulho(Date data, Integer visibilidade, Integer temperatura, Time horaInicial, Time horaFinal,
			GpsLua lua, GpsRosaVentos direcaoVento, GpsRosaVentos direcaoCorrenteza, GpsEscalaBeafort condicaoMar,
			GpsLocal local) {

		this.data = data;
		this.visibilidade = visibilidade;
		this.temperatura = temperatura;
		this.horaInicial = horaInicial;
		this.horaFinal = horaFinal;
		this.lua = lua;
		this.direcaoVento = direcaoVento;
		this.direcaoCorrenteza = direcaoCorrenteza;
		this.condicaoMar = condicaoMar;
		this.local = local;
	}

	Date getData() {
		return data;
	}

	void setData(Date data) {
		this.data = data;
	}

	Integer getVisibilidade() {
		return visibilidade;
	}

	void setVisibilidade(Integer visibilidade) {
		this.visibilidade = visibilidade;
	}

	Integer getTemperatura() {
		return temperatura;
	}

	void setTemperatura(Integer temperatura) {
		this.temperatura = temperatura;
	}

	Time getHoraInicial() {
		return horaInicial;
	}

	void setHoraInicial(Time horaInicial) {
		this.horaInicial = horaInicial;
	}

	Time getHoraFinal() {
		return horaFinal;
	}

	void setHoraFinal(Time horaFinal) {
		this.horaFinal = horaFinal;
	}

	GpsLua getLua() {
		return lua;
	}

	void setLua(GpsLua lua) {
		this.lua = lua;
	}

	GpsRosaVentos getDirecaoVento() {
		return direcaoVento;
	}

	void setDirecaoVento(GpsRosaVentos direcaoVento) {
		this.direcaoVento = direcaoVento;
	}

	GpsRosaVentos getDirecaoCorrenteza() {
		return direcaoCorrenteza;
	}

	void setDirecaoCorrenteza(GpsRosaVentos direcaoCorrenteza) {
		this.direcaoCorrenteza = direcaoCorrenteza;
	}

	GpsEscalaBeafort getCondicaoMar() {
		return condicaoMar;
	}

	void setCondicaoMar(GpsEscalaBeafort condicaoMar) {
		this.condicaoMar = condicaoMar;
	}

	GpsLocal getLocal() {
		return local;
	}

	void setLocal(GpsLocal local) {
		this.local = local;
	}

	List<GpsMergulhador> getMergulhadores() {
		return mergulhadores;
	}

//	void setMergulhadores(List<GpsMergulhador> mergulhadores) {
//		this.mergulhadores = mergulhadores;
//	}
	
	public void addMergulhador(GpsMergulhador mergulhador) {
		mergulhadores.add(mergulhador);
	}
	
	public void removeMergulhador(GpsMergulhador mergulhador) {
		mergulhadores.remove(mergulhador);
	}

	@Override
	public String toString() {
		return "GpsMergulho [data=" + data + ", visibilidade=" + visibilidade + ", temperatura=" + temperatura
				+ ", horaInicial=" + horaInicial + ", horaFinal=" + horaFinal + ", lua=" + lua + ", direcaoVento="
				+ direcaoVento + ", direcaoCorrenteza=" + direcaoCorrenteza + ", condicaoMar=" + condicaoMar
				+ ", local=" + local + ", mergulhadores=" + mergulhadores + "]";
	}
}
