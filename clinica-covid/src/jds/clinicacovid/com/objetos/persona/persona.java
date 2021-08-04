package jds.clinicacovid.com.objetos.persona;

public class persona {

	private int id;
	private int year;
	private String name;
	private String surname;
	private String dni;
	private String direction;

	public persona() {
		super();
	}

	public persona(int id, int year, String name, String surname, String dni, String direction) {
		super();
		this.id = id;
		this.year = year;
		this.name = name;
		this.surname = surname;
		this.dni = dni;
		this.direction = direction;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getDirection() {
		return direction;
	}

	public void setDirection(String direction) {
		this.direction = direction;
	}

	@Override
	public String toString() {
		return "persona [id=" + id + ", year=" + year + ", name=" + name + ", surname=" + surname + ", direction="
				+ direction + "]";
	}

}
