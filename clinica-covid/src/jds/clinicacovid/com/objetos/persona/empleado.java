package jds.clinicacovid.com.objetos.persona;

public class empleado extends persona {

	private String tipo;

	public empleado() {
		super();
	}

	public empleado(int id, int year, String name, String surname, String dni, String direction, String tipo) {
		super(id, year, name, surname, dni, direction);
		this.tipo = tipo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

}
