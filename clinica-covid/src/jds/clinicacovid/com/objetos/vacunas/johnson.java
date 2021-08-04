package jds.clinicacovid.com.objetos.vacunas;

public class johnson extends vacuna {

	private int idJohnson;

	public johnson(int id, int dosisSuministradas, String nombre, int idEnfermero, String dniPaciente, int idJohnson) {
		super(id, dosisSuministradas, nombre, idEnfermero, dniPaciente);
		this.idJohnson = idJohnson;
	}

	public johnson() {
		super();
	}

	public int getIdJohnson() {
		return idJohnson;
	}

	public void setIdJohnson(int idJohnson) {
		this.idJohnson = idJohnson;
	}

	@Override
	public String toString() {
		return "johnson [idJohnson=" + idJohnson + ", getId()=" + getId() + ", getDosisSuministradas()="
				+ getDosisSuministradas() + ", getIdEnfermero()=" + getIdEnfermero() + ", getDniPaciente()="
				+ getDniPaciente() + ", getNombre()=" + getNombre() + "]";
	}

}