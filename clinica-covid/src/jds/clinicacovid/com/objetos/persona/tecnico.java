package jds.clinicacovid.com.objetos.persona;

public class tecnico extends empleado {

	private int idTecnico;
	private int numPruebasAct;

	public tecnico(int id, int year, String name, String surname, String dni, String direction, String tipo,
			int idTecnico) {
		super(id, year, name, surname, dni, direction, tipo);
		this.idTecnico = idTecnico;
	}

	public tecnico(int idTecnico, int numPruebasAct) {
		super();
		this.idTecnico = idTecnico;
		this.numPruebasAct = numPruebasAct;
	}

	public tecnico() {
		super();
	}

	public int getIdTecnico() {
		return idTecnico;
	}

	public void setIdTecnico(int idTecnico) {
		this.idTecnico = idTecnico;
	}

	public int getNumPruebasAct() {
		return numPruebasAct;
	}

	public void setNumPruebasAct(int numPruebasAct) {
		this.numPruebasAct = numPruebasAct;
	}

	@Override
	public String toString() {
		return "tecnico [idTecnico=" + idTecnico + ", numPruebasAct=" + numPruebasAct + ", getTipo()=" + getTipo()
				+ ", getDni()=" + getDni() + ", getId()=" + getId() + ", getYear()=" + getYear() + ", getName()="
				+ getName() + ", getSurname()=" + getSurname() + ", getDirection()=" + getDirection() + "]";
	}

}
