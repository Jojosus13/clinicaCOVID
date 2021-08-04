package jds.clinicacovid.com.objetos.persona;

public class enfermero extends empleado {

	private int idEnfermero;
	private int numPruebasAct;

	public enfermero() {
		super();
	}

	public enfermero(int id, int year, String name, String surname, String dni, String direction, String tipo,
			int idEnfermero) {
		super(id, year, name, surname, dni, direction, tipo);
		this.idEnfermero = idEnfermero;
	}

	public enfermero(int id, int year, String name, String surname, String dni, String direction, String tipo,
			int idEnfermero, int numPruebasAct) {
		super(id, year, name, surname, dni, direction, tipo);
		this.idEnfermero = idEnfermero;
		this.numPruebasAct = numPruebasAct;
	}

	public int getNumPruebasAct() {
		return numPruebasAct;
	}

	public void setNumPruebasAct(int numPruebasAct) {
		this.numPruebasAct = numPruebasAct;
	}

	public int getIdEnfermero() {
		return idEnfermero;
	}

	public void setIdEnfermero(int idEnfermero) {
		this.idEnfermero = idEnfermero;
	}

	@Override
	public String toString() {
		return "enfermero [idEnfermero=" + idEnfermero + ", numPruebasAct=" + numPruebasAct + ", getTipo()=" + getTipo()
				+ ", getDni()=" + getDni() + ", getId()=" + getId() + ", getYear()=" + getYear() + ", getName()="
				+ getName() + ", getSurname()=" + getSurname() + ", getDirection()=" + getDirection() + "]";
	}

}
