package jds.clinicacovid.com.objetos.vacunas;

public class moderna extends vacuna {

	private int idModerna;

	public moderna() {
		super();
	}

	public moderna(int id, int dosisSuministradas, String nombre, int idEnfermero, String dniPaciente, int idModerna) {
		super(id, dosisSuministradas, nombre, idEnfermero, dniPaciente);
		this.idModerna = idModerna;
	}

	public int getIdModerna() {
		return idModerna;
	}

	public void setIdModerna(int idModerna) {
		this.idModerna = idModerna;
	}

	@Override
	public String toString() {
		return "moderna [idModerna=" + idModerna + ", getId()=" + getId() + ", getDosisSuministradas()="
				+ getDosisSuministradas() + ", getIdEnfermero()=" + getIdEnfermero() + ", getDniPaciente()="
				+ getDniPaciente() + ", getNombre()=" + getNombre() + "]";
	}

}