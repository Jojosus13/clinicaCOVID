package jds.clinicacovid.com.objetos.vacunas;

public class pfizer extends vacuna {

	private int idpfizer;

	public pfizer(int id, int dosisSuministradas, String nombre, int idEnfermero, String dniPaciente, int idpfizer) {
		super(id, dosisSuministradas, nombre, idEnfermero, dniPaciente);
		this.idpfizer = idpfizer;
	}

	public pfizer() {
		super();
	}

	public int getIdpfizer() {
		return idpfizer;
	}

	public void setIdpfizer(int idpfizer) {
		this.idpfizer = idpfizer;
	}

	@Override
	public String toString() {
		return "pfizer [idpfizer=" + idpfizer + ", getId()=" + getId() + ", getDosisSuministradas()="
				+ getDosisSuministradas() + ", getIdEnfermero()=" + getIdEnfermero() + ", getDniPaciente()="
				+ getDniPaciente() + ", getNombre()=" + getNombre() + "]";
	}

}
