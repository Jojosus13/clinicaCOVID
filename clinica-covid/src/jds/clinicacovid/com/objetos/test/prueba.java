package jds.clinicacovid.com.objetos.test;

import java.time.LocalDate;

public class prueba {

	private LocalDate fechaDePrueba;
	private String tipo;
	private String dniPaciente;
	private int idEnfermero;
	private int idTecnico;

	public prueba(LocalDate fechaDePrueba, String tipo, String dniPaciente, int idEnfermero, int idTecnico) {
		super();
		this.fechaDePrueba = fechaDePrueba;
		this.tipo = tipo;
		this.dniPaciente = dniPaciente;
		this.idEnfermero = idEnfermero;
		this.idTecnico = idTecnico;
	}

	public prueba() {
		super();
	}

	public LocalDate getFechaDePrueba() {
		return fechaDePrueba;
	}

	public String getDniPaciente() {
		return dniPaciente;
	}

	public void setDniPaciente(String dniPaciente) {
		this.dniPaciente = dniPaciente;
	}

	public int getIdEnfermero() {
		return idEnfermero;
	}

	public void setIdEnfermero(int idEnfermero) {
		this.idEnfermero = idEnfermero;
	}

	public int getIdTecnico() {
		return idTecnico;
	}

	public void setIdTecnico(int idTecnico) {
		this.idTecnico = idTecnico;
	}

	public void setFechaDePrueba(LocalDate fechaDePrueba) {
		this.fechaDePrueba = fechaDePrueba;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "prueba [fechaDePrueba=" + fechaDePrueba + ", tipo=" + tipo + ", dniPaciente=" + dniPaciente
				+ ", idEnfermero=" + idEnfermero + ", idTecnico=" + idTecnico + "]";
	}

}
