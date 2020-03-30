package br.com.gpsdive.application;

import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import br.com.gpsdive.entities.GpsLocal;
import br.com.gpsdive.entities.GpsMergulhador;
import br.com.gpsdive.entities.GpsMergulho;
import br.com.gpsdive.entities.GpsPeixe;
import br.com.gpsdive.entities.GpsPesqueiro;
import br.com.gpsdive.entities.GpsPessoa;
import br.com.gpsdive.entities.enums.GpsEscalaBeafort;
import br.com.gpsdive.entities.enums.GpsLua;
import br.com.gpsdive.entities.enums.GpsRosaVentos;
import br.com.gpsdive.entities.enums.GpsTipoFundo;

public class Program {

	public static void main(String[] args) throws ParseException {

		Date data = new Date();
		
		int visibilidade = 5;
		int temperatura = 24;
		
		@SuppressWarnings("deprecation")
		Time horaInicial = new Time(07,00,00);
		@SuppressWarnings("deprecation")
		Time horaFinal = new Time(12,00,00);
		
		GpsLua lua = GpsLua.Minguante;
		GpsRosaVentos direcaoVento = GpsRosaVentos.NE;
		GpsRosaVentos direcaoCorrenteza = GpsRosaVentos.NE;
		GpsEscalaBeafort condicaoMar = GpsEscalaBeafort.Brisa_Leve;
		
		GpsTipoFundo tipoFundo = GpsTipoFundo.Pedras;
		GpsPesqueiro pesqueiro = new GpsPesqueiro("Três Ilhas", "-20.6667", "-40.3333", 3, 16, tipoFundo);
		GpsLocal local = new GpsLocal("ES", "Guaraparí", pesqueiro);
		
//		INSTANCIA O MERGULHO COM BASE NOS DADOS LANÇADOS
		GpsMergulho mergulho = new GpsMergulho(data, visibilidade, temperatura, horaInicial, horaFinal, lua, direcaoVento, direcaoCorrenteza, condicaoMar, local);
		
//		ADICIONA OS MERGULHADORES E SEUS RESPECTIVOS PEIXES
		
		GpsPessoa pessoa = new GpsPessoa("Dentinho", new SimpleDateFormat("dd/MM/yyyy").parse("13/02/1981"));
		GpsMergulhador mergulhador = new GpsMergulhador(pessoa);
		
		mergulhador.addPeixes(new GpsPeixe("Budião", 1.350, 100));
		mergulhador.addPeixes(new GpsPeixe("Sarda", 1.100, 100));
		mergulhador.addPeixes(new GpsPeixe("Parú", 1.830, 100));
		mergulhador.addPeixes(new GpsPeixe("Sioba", 3.000, 100));
		mergulhador.addPeixes(new GpsPeixe("Sargo", 2.000, 100));
		
		mergulho.addMergulhador(mergulhador);
		
		GpsPessoa pessoa1 = new GpsPessoa("Alessandro", new SimpleDateFormat("dd/MM/yyyy").parse("01/01/1983"));
		GpsMergulhador mergulhador1 = new GpsMergulhador(pessoa1);
		
		mergulhador1.addPeixes(new GpsPeixe("Sarda", 1.500, 100));
		mergulhador1.addPeixes(new GpsPeixe("Sarda", 1.100, 100));
		mergulhador1.addPeixes(new GpsPeixe("Parú", 1.830, 100));
		mergulhador1.addPeixes(new GpsPeixe("Parú", 2.800, 100));
		mergulhador1.addPeixes(new GpsPeixe("Sargo", 3.500, 100));
		
		mergulho.addMergulhador(mergulhador1);
		
		GpsPessoa pessoa2 = new GpsPessoa("Vitor", new SimpleDateFormat("dd/MM/yyyy").parse("01/01/1980"));
		GpsMergulhador mergulhador2 = new GpsMergulhador(pessoa2);
		
		mergulhador2.addPeixes(new GpsPeixe("Sarda", 1.500, 100));
		
		mergulho.addMergulhador(mergulhador2);
		
		System.out.println(mergulho);
	}
}
