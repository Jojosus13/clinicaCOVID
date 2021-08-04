package jds.clinicacovid.com.objetos.test;

import java.time.LocalDate;

public class PCR extends prueba {

	private boolean resultado;

	public PCR(LocalDate fechaDePrueba, String tipo, String dniPaciente, int idEnfermero, int idTecnico,
			boolean resultado) {
		super(fechaDePrueba, tipo, dniPaciente, idEnfermero, idTecnico);
		this.resultado = resultado;
	}

	public PCR() {
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
		return "PCR [resultado=" + resultado + ", getFechaDePrueba()=" + getFechaDePrueba() + ", getDniPaciente()="
				+ getDniPaciente() + ", getIdEnfermero()=" + getIdEnfermero() + ", getIdTecnico()=" + getIdTecnico()
				+ ", getTipo()=" + getTipo() + "]";
	}

}
