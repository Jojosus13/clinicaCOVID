package jds.clinicacovid.com.objetos.test;

import java.time.LocalDate;

public class serologico extends prueba {

	private int resultado;

	public serologico(LocalDate fechaDePrueba, String tipo, String dniPaciente, int idEnfermero, int idTecnico,
			int resultado) {
		super(fechaDePrueba, tipo, dniPaciente, idEnfermero, idTecnico);
		this.resultado = resultado;
	}

	public serologico() {
		super();
	}

	public int getResultado() {
		return resultado;
	}

	public void setResultado(int resultado) {
		this.resultado = resultado;
	}

	@Override
	public String toString() {
		return "serologico [resultado=" + resultado + ", getFechaDePrueba()=" + getFechaDePrueba()
				+ ", getDniPaciente()=" + getDniPaciente() + ", getIdEnfermero()=" + getIdEnfermero()
				+ ", getIdTecnico()=" + getIdTecnico() + ", getTipo()=" + getTipo() + "]";
	}

}
