package jds.clinicacovid.com.objetos.persona;

public class administrador extends empleado {

	private int idAdministrador;

	public administrador() {
		super();
	}

	public administrador(int id, int year, String name, String surname, String dni, String direction, String tipo,
			int idAdministrador) {
		super(id, year, name, surname, dni, direction, tipo);
		this.idAdministrador = idAdministrador;
	}

	@Override
	public String toString() {
		return "administrador [idAdministrador=" + idAdministrador + ", getTipo()=" + getTipo() + ", getDni()="
				+ getDni() + ", getId()=" + getId() + ", getYear()=" + getYear() + ", getName()=" + getName()
				+ ", getSurname()=" + getSurname() + ", getDirection()=" + getDirection() + "]";
	}

	public int getIdAdministrador() {
		return idAdministrador;
	}

	public void setIdAdministrador(int idAdministrador) {
		this.idAdministrador = idAdministrador;
	}

}
