package jds.clinicacovid.com.objetos.vacunas;

public class vacuna {

	private int id;
	private int dosisSuministradas;
	private String nombre;
	private int idEnfermero;
	private String dniPaciente;

	public vacuna(int id, int dosisSuministradas, String nombre, int idEnfermero, String dniPaciente) {
		super();
		this.id = id;
		this.dosisSuministradas = dosisSuministradas;
		this.nombre = nombre;
		this.idEnfermero = idEnfermero;
		this.dniPaciente = dniPaciente;
	}

	public vacuna() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getDosisSuministradas() {
		return dosisSuministradas;
	}

	public void setDosisSuministradas(int dosisSuministradas) {
		this.dosisSuministradas = dosisSuministradas;
	}

	@Override
	public String toString() {
		return "vacuna [id=" + id + ", dosisSuministradas=" + dosisSuministradas + ", idEnfermero=" + idEnfermero
				+ ", dniPaciente=" + dniPaciente + "]";
	}

	public int getIdEnfermero() {
		return idEnfermero;
	}

	public void setIdEnfermero(int idEnfermero) {
		this.idEnfermero = idEnfermero;
	}

	public String getDniPaciente() {
		return dniPaciente;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setDniPaciente(String dniPaciente) {
		this.dniPaciente = dniPaciente;
	}

}
