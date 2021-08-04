package jds.clinicacovid.com;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

import jds.clinicacovid.com.objetos.persona.administrador;
import jds.clinicacovid.com.objetos.persona.empleado;
import jds.clinicacovid.com.objetos.persona.enfermero;
import jds.clinicacovid.com.objetos.persona.paciente;
import jds.clinicacovid.com.objetos.persona.persona;
import jds.clinicacovid.com.objetos.persona.tecnico;

public class gestionAdministrador {

	private static stock stock;
	
	public int controlAdmin(int num) {

		int num2 = num;
		Scanner type = new Scanner(System.in);
		System.out.println("Hola!, ¿Qué quieres hacer?: ");
		System.out.println("1 --- Dar de alta un usuario nuevo");
		System.out.println("2 --- Modificar un usuario existente ");
		System.out.println("3 --- Borrar un usuario ");
		System.out.println("4 --- Ver todos los usuarios ");
		System.out.println("5 --- Gestión de Stock de Vacuna");
		System.out.println("6 --- Salir");
		num2 = Integer.parseInt(type.nextLine());
		switch (num2) {
		case 0:
			System.out.println("Tipo de accion Incorrecta");
			break;
		case 1:
			darAltaUsr();
			break;
		case 2:
			modificarUsr();
			break;
		case 3:
			darBajaUsuario();
			break;
		case 4:
			verTodos();
			break;
		case 5:
			stock.gestionStock();
			break;
		case 6:
			num2 = -1;
		default:
			break;
		}
		return num2;
	}

	public static String darAltaUsr() {

		int id;
		int year;
		String name;
		String surname;
		String dni;
		String direction;
		String tipo;
		int idtipo;
		String fechaenString;
		boolean positivo;
		boolean asintomatico;
		boolean vacunado;
		String vacuna;
		int numeroDosis;
		LocalDate fechaVacunacion;
		LocalDate fechaContagio;
		LocalDate fechaFinConf;
		int diastranscurridos;
		int selecPos;
		int selecAsin;
		int selecVac;

		int num;
		Scanner type = new Scanner(System.in);
		System.out.println("¿Qué tipo de usuario quieres introducir?: ");
		System.out.println("1 --- Empleado");
		System.out.println("2 --- Paciente");
		num = Integer.parseInt(type.nextLine());

		switch (num) {
		case 0:
			System.out.println("Tipo de usuario erroneo");

			break;

		case 1:

			System.out.println("Introduce una ID: ");
			id = Integer.parseInt(type.nextLine());
			System.out.println("Introduce la Edad: ");
			year = Integer.parseInt(type.nextLine());
			System.out.println("Introduce la ID interna: ");
			idtipo = Integer.parseInt(type.nextLine());
			System.out.println("Introduce el Nombre: ");
			name = type.nextLine();
			System.out.println("Introduce los Apellidos: ");
			surname = type.nextLine();
			System.out.println("Introduce el Dni: ");
			dni = type.nextLine();
			System.out.println("Introduce la Direccion: ");
			direction = type.nextLine();
			System.out.println("Introduce el tipo de Empleado (Enfermero, Administrador o Técnico): ");
			tipo = type.nextLine();

			if (tipo.equals("Enfermero")) {
				enfermero enfermeronuevo = new enfermero(id, year, name, surname, dni, direction, tipo, idtipo);
				System.out.println("Nuevo enfermero añadido: " + enfermeronuevo.toString());
			} else if (tipo.equals("Administrador")) {
				administrador adminnuevo = new administrador(id, year, name, surname, dni, direction, tipo, idtipo);
				System.out.println("Nuevo administrador añadido: " + adminnuevo.toString());
			} else if (tipo.equals("Técnico") || tipo.equals("Tecnico")) {
				tecnico tecniconuevo = new tecnico(id, year, name, surname, dni, direction, tipo, idtipo);
				System.out.println("Nuevo tecnico añadido: " + tecniconuevo.toString());
			}

			break;

		case 2:
			System.out.println("Introduce una ID: ");
			id = Integer.parseInt(type.nextLine());
			System.out.println("Introduce la Edad: ");
			year = Integer.parseInt(type.nextLine());
			System.out.println("Introduce el Nombre: ");
			name = type.nextLine();
			System.out.println("Introduce los Apellidos: ");
			surname = type.nextLine();
			System.out.println("Introduce el Dni: ");
			dni = type.nextLine();
			System.out.println("Introduce la Direccion: ");
			direction = type.nextLine();
			System.out.println("Introduce si es positivo en COVID-19: ");
			System.out.println("1 --- Sí ");
			System.out.println("0 --- No ");
			selecPos = Integer.parseInt(type.nextLine());
			if (selecPos == 0) {
				positivo = false;
				fechaContagio = null;
				asintomatico = false;
				fechaFinConf = null;
				diastranscurridos = 0;
			} else {
				positivo = true;
				diastranscurridos = 0;
				fechaContagio = LocalDate.now();
				System.out.println("Introduce si tiene sintomas o no: ");
				System.out.println("1 --- Sí ");
				System.out.println("0 --- No ");
				selecAsin = Integer.parseInt(type.nextLine());
				if (selecAsin == 0) {
					asintomatico = true;
					fechaFinConf = fechaContagio.plusDays(10);
				} else {
					asintomatico = false;
					fechaFinConf = fechaContagio.plusDays(14);

				}

			}
			System.out.println("Introduce si está vacunado: ");
			System.out.println("1 --- Sí ");
			System.out.println("0 --- No ");
			selecVac = Integer.parseInt(type.nextLine());
			if (selecVac == 0) {
				vacunado = false;

				numeroDosis = 0;
				if (fechaContagio == null) {
					fechaVacunacion = LocalDate.now().plusDays(2);
					System.out.println("Introduce el nombre de la Vacuna a recibir: ");
					vacuna = type.nextLine();

				} else {
					fechaVacunacion = fechaFinConf.plusDays(7);
					System.out.println("Introduce el nombre de la Vacuna a recibir: ");
					vacuna = type.nextLine();
				}
			} else {
				vacunado = true;
				System.out.println("Introduce el nombre de la Vacuna recibida: ");
				vacuna = type.nextLine();
				System.out.println("Introduce el numero de dosis recibidas: ");
				numeroDosis = Integer.parseInt(type.nextLine());
				System.out.println("Introduce la fecha de vacunación en el siguiente formato (dd-MM-yyyy): ");
				fechaenString = type.nextLine();
				DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
				fechaVacunacion = LocalDate.parse(fechaenString, formatter);

			}

			paciente nuevopaciente = new paciente(id, year, name, surname, dni, direction, positivo, asintomatico,
					vacunado, vacuna, numeroDosis, fechaVacunacion, fechaContagio, fechaFinConf, diastranscurridos);
			System.out.println("Nuevo Paciente añadido: " + nuevopaciente.toString());

			break;
		default:
			break;
		}

		return "OK";
	}

	public static String modificarUsr() {
		enfermero enfermero = new enfermero(2, 33, "Alberto", "Fernandez Gómez", "22134478P", "Calle la Rosa 33",
				"Enfermero", 1);
		administrador administrador = new administrador(3, 33, "Fernando", "Dominguez Lozano", "22134478P",
				"Calle la Trinidad 22", "Administrador", 1);
		tecnico tecnico = new tecnico(4, 48, "Juan", "Morata Álvarez", "22134478P", "Calle Sagasta 23", "Técnico", 1);

		paciente paciente = new paciente(5, 56, "Alfredo", "Salgado Cortéz", "22134478P", "Calle la Palma 11", true,
				false, false, "", 0, null, LocalDate.now().minusDays(5), LocalDate.now().plusDays(9), 5);

		int num;
		Scanner type = new Scanner(System.in);
		System.out.println("¿Qué tipo de usuario quieres modificar?: ");
		System.out.println("1 --- Enfermero");
		System.out.println("2 --- Administrador ");
		System.out.println("3 --- Técnico ");
		System.out.println("4 --- Paciente ");
		num = Integer.parseInt(type.nextLine());

		switch (num) {
		case 0:
			System.out.println("Tipo de usuario erroneo");

			break;

		case 1:
			modificarEmpleado(enfermero);

			break;

		case 2:
			// modificarAdministrador(administrador);
			modificarEmpleado(administrador);
			break;

		case 3:
//			modificarTecnico(tecnico);
			modificarEmpleado(tecnico);
			break;
		case 4:
			modificarPaciente(paciente);
			break;
		default:
			break;
		}

		return "OK";
	}

	public static String modificarEmpleado(empleado empleado) {

		int num;
		Scanner type = new Scanner(System.in);
		System.out.println("¿Qué dato del enfermero quieres modificar?: ");
		System.out.println("1 --- Nombre");
		System.out.println("2 --- Apellido ");
		System.out.println("3 --- DNI ");
		System.out.println("4 --- Dirección ");
		System.out.println("5 --- Edad ");
		System.out.println("6 --- Todos los anteriores");
		num = Integer.parseInt(type.nextLine());

		switch (num) {
		case 0:
			System.out.println("Tipo de dato erroneo");

			break;

		case 1:

			System.out.println("Introduce un nuevo nombre: ");
			empleado.setName(type.nextLine());
			System.out.println("Nombre cambiado");
			System.out.println(empleado.toString());

			break;

		case 2:

			System.out.println("Introduce un nuevo apellido: ");
			empleado.setSurname(type.nextLine());
			System.out.println("Apellido cambiado");
			System.out.println(empleado.toString());

			break;
		case 3:

			System.out.println("Introduce un nuevo DNI: ");
			empleado.setDni(type.nextLine());
			System.out.println("DNI cambiado");
			System.out.println(empleado.toString());

			break;

		case 4:

			System.out.println("Introduce una nueva dirección: ");
			empleado.setDirection(type.nextLine());
			System.out.println("Dirección cambiada");
			System.out.println(empleado.toString());

			break;
		case 5:

			System.out.println("Introduce una nueva edad: ");
			empleado.setYear(Integer.parseInt(type.nextLine()));
			System.out.println("Edad cambiada");
			System.out.println(empleado.toString());

			break;
		case 6:

			System.out.println("Introduce un nuevo nombre: ");
			empleado.setName(type.nextLine());
			System.out.println("Nombre cambiado");
			System.out.println("Introduce un nuevo apellido: ");
			empleado.setSurname(type.nextLine());
			System.out.println("Apellido cambiado");
			System.out.println("Introduce un nuevo DNI: ");
			empleado.setDni(type.nextLine());
			System.out.println("DNI cambiado");
			System.out.println("Introduce una nueva dirección: ");
			empleado.setDirection(type.nextLine());
			System.out.println("Dirección cambiada");
			System.out.println("Introduce una nueva edad: ");
			empleado.setYear(Integer.parseInt(type.nextLine()));
			System.out.println("Edad cambiada");
			System.out.println(empleado.toString());

			break;
		default:
			break;
		}

		return "OK";
	}

	public static String modificarPaciente(paciente paciente) {
		int SelecPos;
		int SelecAsin;
		int num;
		String vacuna;
		String stringDate;
		int SelecVac;
		Scanner type = new Scanner(System.in);
		System.out.println("¿Qué dato del administrador quieres modificar?: ");
		System.out.println("1 --- Nombre");
		System.out.println("2 --- Apellido ");
		System.out.println("3 --- DNI ");
		System.out.println("4 --- Dirección ");
		System.out.println("5 --- Edad ");
		System.out.println("6 --- Positivo/Negativo en covid");
		System.out.println("7 --- Asintomático");
		System.out.println("8 --- Vacunado");
		System.out.println("9 --- Número de dosis Recibida");
		System.out.println("10 --- Días Transcurridos");
		System.out.println("11 --- Todos los anteriores");
		num = Integer.parseInt(type.nextLine());

		switch (num) {
		case 0:
			System.out.println("Tipo de dato erroneo");

			break;

		case 1:

			System.out.println("Introduce un nuevo nombre: ");
			paciente.setName(type.nextLine());
			System.out.println("Nombre cambiado");
			System.out.println(paciente.toString());

			break;

		case 2:

			System.out.println("Introduce un nuevo apellido: ");
			paciente.setSurname(type.nextLine());
			System.out.println("Apellido cambiado");
			System.out.println(paciente.toString());

			break;
		case 3:

			System.out.println("Introduce un nuevo DNI: ");
			paciente.setDni(type.nextLine());
			System.out.println("DNI cambiado");
			System.out.println(paciente.toString());

			break;

		case 4:

			System.out.println("Introduce una nueva dirección: ");
			paciente.setDirection(type.nextLine());
			System.out.println("Dirección cambiada");
			System.out.println(paciente.toString());

			break;
		case 5:

			System.out.println("Introduce una nueva edad: ");
			paciente.setYear(Integer.parseInt(type.nextLine()));
			System.out.println("Edad cambiada");
			System.out.println(paciente.toString());

			break;
		case 6:

			System.out.println("Selecciona si es +/- en COVID-19: ");
			System.out.println("0 --- Negativo");
			System.out.println("1 --- Positivo");
			SelecPos = Integer.parseInt(type.nextLine());
			if (SelecPos == 0) {
				paciente.setPositivo(false);
			} else {
				if (paciente.isAsintomatico()) {
					paciente.setFechaContagio(LocalDate.now());
					paciente.setFechaFinConfinamiento(LocalDate.now().plusDays(10));
					paciente.setDiasTranscurridos(0);
					paciente.setPositivo(true);
				} else {
					paciente.setFechaContagio(LocalDate.now());
					paciente.setFechaFinConfinamiento(LocalDate.now().plusDays(14));
					paciente.setDiasTranscurridos(0);
					paciente.setPositivo(true);

				}
			}

			System.out.println("Estado de COVID-19 cambiado");
			System.out.println(paciente.toString());

			break;

		case 7:

			System.out.println("Selecciona si es Asintomático: ");
			System.out.println("0 --- No");
			System.out.println("1 --- Sí");
			SelecAsin = Integer.parseInt(type.nextLine());
			if (SelecAsin == 0) {
				paciente.setAsintomatico(false);
			} else {
				if (paciente.isPositivo()) {
					paciente.setFechaContagio(LocalDate.now());
					paciente.setFechaFinConfinamiento(LocalDate.now().plusDays(10));
					paciente.setDiasTranscurridos(0);
					paciente.setAsintomatico(true);
				} else {
					paciente.setFechaContagio(LocalDate.now());
					paciente.setFechaFinConfinamiento(LocalDate.now().plusDays(10));
					paciente.setDiasTranscurridos(0);
					paciente.setPositivo(true);
					paciente.setAsintomatico(true);

				}
			}

			System.out.println("Estado de Sintomas COVID-19 cambiado");
			System.out.println(paciente.toString());

			break;

		case 8:

			System.out.println("Selecciona si está vacunado: ");
			System.out.println("0 --- No");
			System.out.println("1 --- Sí");
			SelecVac = Integer.parseInt(type.nextLine());
			if (SelecVac == 0) {
				paciente.setVacunado(false);
				paciente.setNumeroDosis(0);
				paciente.setFechaVacunacion(null);
				paciente.setVacuna("");
			} else {

				System.out.println("Introduce qué vacuna va a recibir: ");
				vacuna = type.nextLine();
				paciente.setVacuna(vacuna);
				System.out.println("Introduce la fecha de vacunación en el siguiente formato (dd-MM-yyyy): ");
				stringDate = type.nextLine();
				DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

				paciente.setFechaVacunacion(LocalDate.parse(stringDate, formatter));
				paciente.setNumeroDosis(1);

				paciente.setVacunado(true);
			}

			System.out.println("Estado de la vacuna cambiado");
			System.out.println(paciente.toString());

			break;
		case 9:

			System.out.println("Introduce el nuevo número de dosis: ");
			paciente.setNumeroDosis(Integer.parseInt(type.nextLine()));
			System.out.println("Número de dosis cambiado");
			System.out.println(paciente.toString());

			break;
		case 10:

			System.out.println("Introduce el nuevo número de días transcurridos: ");
			paciente.setDiasTranscurridos(Integer.parseInt(type.nextLine()));
			System.out.println("Número de días cambiado");
			System.out.println(paciente.toString());

			break;
		case 11:

			System.out.println("Introduce un nuevo nombre: ");
			paciente.setName(type.nextLine());
			System.out.println("Nombre cambiado");
			System.out.println("Introduce un nuevo apellido: ");
			paciente.setSurname(type.nextLine());
			System.out.println("Apellido cambiado");
			System.out.println("Introduce un nuevo DNI: ");
			paciente.setDni(type.nextLine());
			System.out.println("DNI cambiado");
			System.out.println("Introduce una nueva dirección: ");
			paciente.setDirection(type.nextLine());
			System.out.println("Dirección cambiada");
			System.out.println("Introduce una nueva edad: ");
			paciente.setYear(Integer.parseInt(type.nextLine()));
			System.out.println("Edad cambiada");
			System.out.println("Selecciona si es +/- en COVID-19: ");
			System.out.println("0 --- Negativo");
			System.out.println("1 --- Positivo");
			SelecPos = Integer.parseInt(type.nextLine());
			if (SelecPos == 0) {
				paciente.setPositivo(false);
			} else {
				if (paciente.isAsintomatico()) {
					paciente.setFechaContagio(LocalDate.now());
					paciente.setFechaFinConfinamiento(LocalDate.now().plusDays(10));
					paciente.setDiasTranscurridos(0);
					paciente.setPositivo(true);
				} else {
					paciente.setFechaContagio(LocalDate.now());
					paciente.setFechaFinConfinamiento(LocalDate.now().plusDays(14));
					paciente.setDiasTranscurridos(0);
					paciente.setPositivo(true);

				}
			}

			System.out.println("Estado de COVID-19 cambiado");
			System.out.println("Selecciona si es Asintomático: ");
			System.out.println("0 --- No");
			System.out.println("1 --- Sí");
			SelecAsin = Integer.parseInt(type.nextLine());
			if (SelecAsin == 0) {
				paciente.setAsintomatico(false);
			} else {
				if (paciente.isPositivo()) {
					paciente.setFechaContagio(LocalDate.now());
					paciente.setFechaFinConfinamiento(LocalDate.now().plusDays(10));
					paciente.setDiasTranscurridos(0);
					paciente.setAsintomatico(true);
				} else {
					paciente.setFechaContagio(LocalDate.now());
					paciente.setFechaFinConfinamiento(LocalDate.now().plusDays(10));
					paciente.setDiasTranscurridos(0);
					paciente.setPositivo(true);
					paciente.setAsintomatico(true);

				}
			}

			System.out.println("Estado de Sintomas COVID-19 cambiado");
			System.out.println("Selecciona si está vacunado: ");
			System.out.println("0 --- No");
			System.out.println("1 --- Sí");
			SelecVac = Integer.parseInt(type.nextLine());
			if (SelecVac == 0) {
				paciente.setVacunado(false);
				paciente.setNumeroDosis(0);
				paciente.setFechaVacunacion(null);
				paciente.setVacuna("");
			} else {

				System.out.println("Introduce qué vacuna va a recibir: ");
				vacuna = type.nextLine();
				paciente.setVacuna(vacuna);
				System.out.println("Introduce la fecha de vacunación en el siguiente formato (dd-MM-yyyy): ");
				stringDate = type.nextLine();
				DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

				paciente.setFechaVacunacion(LocalDate.parse(stringDate, formatter));
				paciente.setNumeroDosis(1);

				paciente.setVacunado(true);
			}

			System.out.println("Estado de la vacuna cambiado");
			System.out.println("Introduce el nuevo número de días transcurridos: ");
			paciente.setDiasTranscurridos(Integer.parseInt(type.nextLine()));
			System.out.println("Número de días cambiado");

			System.out.println(paciente.toString());

			break;
		default:
			break;
		}

		return "OK";
	}

	public static void darBajaUsuario() {
		ArrayList<persona> personas = new ArrayList<persona>();
		tecnico t1 = new tecnico(1, 25, "Francisco", "Morata Álvarez", "22134478P", "Calle Sagasta 23", "Técnico", 1);
		tecnico t2 = new tecnico(2, 24, "Eufrasio", "Álvarez Sánchez", "11331139J", "Calle Sagasta 44", "Técnico", 2);
		tecnico t3 = new tecnico(3, 33, "Eustaquio", "Galvéz Calvo", "15467789S", "Calle Sacramento 23", "Técnico", 3);
		tecnico t4 = new tecnico(4, 55, "Juan", "Cáceres Herrera", "56993214F", "Avenida Reyes Católicos 32", "Técnico",
				4);
		tecnico t5 = new tecnico(5, 49, "Facundo", "Montoya Ramírez", "95468271T", "Calle Zaragoza 15", "Técnico", 5);
		administrador a1 = new administrador(6, 25, "Francisco", "Morata Álvarez", "66251498R", "Calle Sagasta 23",
				"Administrador", 1);
		administrador a2 = new administrador(7, 24, "Eufrasio", "Álvarez Sánchez", "66485720K", "Calle Sagasta 44",
				"Administrador", 2);
		administrador a3 = new administrador(8, 33, "Eustaquio", "Galvéz Calvo", "45627195S", "Calle Sacramento 23",
				"Administrador", 3);
		administrador a4 = new administrador(9, 55, "Juan", "Cáceres Herrera", "99654711D",
				"Avenida Reyes Católicos 32", "Administrador", 4);
		administrador a5 = new administrador(10, 49, "Facundo", "Montoya Ramírez", "55172691F", "Calle Zaragoza 15",
				"Adiminstrador", 5);

		personas.add(t1);
		personas.add(t2);
		personas.add(t3);
		personas.add(t4);
		personas.add(t5);
		personas.add(a1);
		personas.add(a2);
		personas.add(a3);
		personas.add(a4);
		personas.add(a5);
		String dni;
		Integer index = 1;
		for (int i = 0; i < personas.size(); i++) {

			System.out.println(index.toString() + ".- " + personas.get(i).toString());
			index++;
		}
		System.out.println("¿A quién quieres borrar?");

		Scanner type = new Scanner(System.in);

		boolean encontrado = false;

		dni = type.nextLine();

		for (int i = 0; i < personas.size() && !encontrado; i++) {
			if (personas.get(i).getName().equals(dni)) {
				personas.remove(i);
				encontrado = true;
			}
		}
		for (int i = 0; i < personas.size(); i++) {

			System.out.println(personas.get(i).toString());
		}

	}

	public static void verTodos() {
		ArrayList<persona> personas = new ArrayList<persona>();
		tecnico t1 = new tecnico(1, 25, "Francisco", "Morata Álvarez", "22134478P", "Calle Sagasta 23", "Técnico", 1);
		tecnico t2 = new tecnico(2, 24, "Eufrasio", "Álvarez Sánchez", "11331139J", "Calle Sagasta 44", "Técnico", 2);
		tecnico t3 = new tecnico(3, 33, "Eustaquio", "Galvéz Calvo", "15467789S", "Calle Sacramento 23", "Técnico", 3);
		tecnico t4 = new tecnico(4, 55, "Juan", "Cáceres Herrera", "56993214F", "Avenida Reyes Católicos 32", "Técnico",
				4);
		tecnico t5 = new tecnico(5, 49, "Facundo", "Montoya Ramírez", "95468271T", "Calle Zaragoza 15", "Técnico", 5);
		administrador a1 = new administrador(6, 25, "Francisco", "Morata Álvarez", "66251498R", "Calle Sagasta 23",
				"Administrador", 1);
		administrador a2 = new administrador(7, 24, "Eufrasio", "Álvarez Sánchez", "66485720K", "Calle Sagasta 44",
				"Administrador", 2);
		administrador a3 = new administrador(8, 33, "Eustaquio", "Galvéz Calvo", "45627195S", "Calle Sacramento 23",
				"Administrador", 3);
		administrador a4 = new administrador(9, 55, "Juan", "Cáceres Herrera", "99654711D",
				"Avenida Reyes Católicos 32", "Administrador", 4);
		administrador a5 = new administrador(10, 49, "Facundo", "Montoya Ramírez", "55172691F", "Calle Zaragoza 15",
				"Adiminstrador", 5);

		personas.add(t1);
		personas.add(t2);
		personas.add(t3);
		personas.add(t4);
		personas.add(t5);
		personas.add(a1);
		personas.add(a2);
		personas.add(a3);
		personas.add(a4);
		personas.add(a5);
		Integer index = 1;
		for (int i = 0; i < personas.size(); i++) {

			System.out.println(index.toString() + ".- " + personas.get(i).toString());
			index++;
		}

	}

	public void asignarEnfermero() {
	}
}
