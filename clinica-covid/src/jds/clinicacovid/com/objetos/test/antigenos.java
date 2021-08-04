package jds.clinicacovid.com.objetos.test;

import java.time.LocalDate;

public class antigenos extends prueba {

	private boolean resultado;

	public antigenos(LocalDate fechaDePrueba, String tipo, String dniPaciente, int idEnfermero, int idTecnico,
			boolean resultado) {
		super(fechaDePrueba, tipo, dniPaciente, idEnfermero, idTecnico);
		this.resultado = resultado;
	}

	public antigenos() {
		super();
	}

	public boolean isResultado() {
		return resultado;
	}

	public void setResultado(boolean resultado) {
		this.resultado = resultado;
	}

	@Override
	public String toString() {
		return "antigenos [resultado=" + resultado + ", getFechaDePrueba()=" + getFechaDePrueba()
				+ ", getDniPaciente()=" + getDniPaciente() + ", getIdEnfermero()=" + getIdEnfermero()
				+ ", getIdTecnico()=" + getIdTecnico() + ", getTipo()=" + getTipo() + "]";
	}

}
