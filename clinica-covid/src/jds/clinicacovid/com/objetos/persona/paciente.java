package jds.clinicacovid.com.objetos.persona;

import java.time.LocalDate;

public class paciente extends persona {

	private boolean positivo;
	private boolean asintomatico;
	private boolean vacunado;
	private String vacuna; // será objeto vacuna
	private int numeroDosis;
	private LocalDate fechaVacunacion;
	private LocalDate fechaContagio;
	private LocalDate fechaFinConfinamiento;
	private int diasTranscurridos;
	private int idEnfermero;
	private int idTecnico;

	public paciente() {
		super();
	}

	public paciente(int id, int year, String name, String surname, String dni, String direction, boolean positivo,
			boolean asintomatico, boolean vacunado, String vacuna, int numeroDosis, LocalDate fechaVacunacion,
			LocalDate fechaContagio, LocalDate fechaFinConfinamiento, int diasTranscurridos) {
		super(id, year, name, surname, dni, direction);
		this.positivo = positivo;
		this.asintomatico = asintomatico;
		this.vacunado = vacunado;
		this.vacuna = vacuna;
		this.numeroDosis = numeroDosis;
		this.fechaVacunacion = fechaVacunacion;
		this.fechaContagio = fechaContagio;
		this.fechaFinConfinamiento = fechaFinConfinamiento;
		this.diasTranscurridos = diasTranscurridos;
	}

	public paciente(int id, int year, String name, String surname, String dni, String direction, boolean positivo,
			boolean asintomatico, boolean vacunado, String vacuna, int numeroDosis, LocalDate fechaVacunacion,
			LocalDate fechaContagio, LocalDate fechaFinConfinamiento, int diasTranscurridos, int idEnfermero,
			int idTecnico) {
		super(id, year, name, surname, dni, direction);
		this.positivo = positivo;
		this.asintomatico = asintomatico;
		this.vacunado = vacunado;
		this.vacuna = vacuna;
		this.numeroDosis = numeroDosis;
		this.fechaVacunacion = fechaVacunacion;
		this.fechaContagio = fechaContagio;
		this.fechaFinConfinamiento = fechaFinConfinamiento;
		this.diasTranscurridos = diasTranscurridos;
		this.idEnfermero = idEnfermero;
		this.idTecnico = idTecnico;
	}

	public paciente(int id, int year, String name, String surname, String dni, String direction, boolean positivo,
			boolean asintomatico, boolean vacunado, String vacuna, int numeroDosis, LocalDate fechaVacunacion,
			LocalDate fechaContagio, LocalDate fechaFinConfinamiento, int diasTranscurridos, int idEnfermero) {
		super(id, year, name, surname, dni, direction);
		this.positivo = positivo;
		this.asintomatico = asintomatico;
		this.vacunado = vacunado;
		this.vacuna = vacuna;
		this.numeroDosis = numeroDosis;
		this.fechaVacunacion = fechaVacunacion;
		this.fechaContagio = fechaContagio;
		this.fechaFinConfinamiento = fechaFinConfinamiento;
		this.diasTranscurridos = diasTranscurridos;
		this.idEnfermero = idEnfermero;
	}

	public boolean isPositivo() {
		return positivo;
	}

	public void setPositivo(boolean positivo) {
		this.positivo = positivo;
	}

	public boolean isAsintomatico() {
		return asintomatico;
	}

	public void setAsintomatico(boolean asintomatico) {
		this.asintomatico = asintomatico;
	}

	public boolean isVacunado() {
		return vacunado;
	}

	public void setVacunado(boolean vacunado) {
		this.vacunado = vacunado;
	}

	public String getVacuna() {
		return vacuna;
	}

	public void setVacuna(String vacuna) {
		this.vacuna = vacuna;
	}

	public int getNumeroDosis() {
		return numeroDosis;
	}

	public void setNumeroDosis(int numeroDosis) {
		this.numeroDosis = numeroDosis;
	}

	public LocalDate getFechaVacunacion() {
		return fechaVacunacion;
	}

	public void setFechaVacunacion(LocalDate fechaVacunacion) {
		this.fechaVacunacion = fechaVacunacion;
	}

	public LocalDate getFechaContagio() {
		return fechaContagio;
	}

	public void setFechaContagio(LocalDate fechaContagio) {
		this.fechaContagio = fechaContagio;
	}

	public LocalDate getFechaFinConfinamiento() {
		return fechaFinConfinamiento;
	}

	public void setFechaFinConfinamiento(LocalDate fechaFinConfinamiento) {
		this.fechaFinConfinamiento = fechaFinConfinamiento;
	}

	public int getDiasTranscurridos() {
		return diasTranscurridos;
	}

	public void setDiasTranscurridos(int diasTranscurridos) {
		this.diasTranscurridos = diasTranscurridos;
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

	@Override
	public String toString() {
		return "paciente [positivo=" + positivo + ", asintomatico=" + asintomatico + ", vacunado=" + vacunado
				+ ", vacuna=" + vacuna + ", numeroDosis=" + numeroDosis + ", fechaVacunacion=" + fechaVacunacion
				+ ", fechaContagio=" + fechaContagio + ", fechaFinConfinamiento=" + fechaFinConfinamiento
				+ ", diasTranscurridos=" + diasTranscurridos + ", idEnfermero=" + idEnfermero + ", idTecnico="
				+ idTecnico + ", getDni()=" + getDni() + ", getId()=" + getId() + ", getYear()=" + getYear()
				+ ", getName()=" + getName() + ", getSurname()=" + getSurname() + ", getDirection()=" + getDirection()
				+ "]";
	}

}