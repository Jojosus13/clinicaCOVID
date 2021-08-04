package jds.clinicacovid.com;

import java.util.ArrayList;
import java.util.Scanner;

import jds.clinicacovid.com.objetos.vacunas.johnson;
import jds.clinicacovid.com.objetos.vacunas.moderna;
import jds.clinicacovid.com.objetos.vacunas.pfizer;
import jds.clinicacovid.com.objetos.vacunas.vacuna;

public class stock {

	public void gestionStock() {
		ArrayList<vacuna> vacunas = new ArrayList<vacuna>();
		pfizer v1 = new pfizer(1, 1, "Pfizer", 12, "77171770P", 1);
		moderna v2 = new moderna(2, 0, "Moderna", 11, "77171771P", 1);
		johnson v3 = new johnson(3, 1, "Johnson", 14, "77178922G", 1);
		pfizer v4 = new pfizer(4, 1, "Pfizer", 14, "11232422P", 2);
		moderna v5 = new moderna(5, 2, "Moderna", 16, "98038771S", 2);
		johnson v6 = new johnson(6, 0, "Johnson", 22, "41321136G", 2);
		pfizer v7 = new pfizer(7, 2, "Pfizer", 44, "98112302F", 3);
		moderna v8 = new moderna(8, 0, "Moderna", 66, "77171789V", 3);
		johnson v9 = new johnson(9, 1, "Johnson", 78, "61789219H", 3);
		pfizer v10 = new pfizer(10, 0, "Pfizer", 43, "23319429N", 4);
		moderna v11 = new moderna(11, 1, "Moderna", 34, "2424949N", 4);
		johnson v12 = new johnson(12, 0, "Johnson", 34, "12124343L", 4);
		johnson v13 = new johnson(13, 1, "Johnson", 11, "43432121E", 4);
		johnson v14 = new johnson(14, 1, "Johnson", 12, "98988787B", 4);
		johnson v15 = new johnson(15, 1, "Johnson", 15, "64647878X", 4);
		pfizer v16 = new pfizer(16, 0, "Pfizer", 43, "78485638N", 4);
		pfizer v17 = new pfizer(17, 2, "Pfizer", 43, "90321345L", 4);
		vacunas.add(v1);
		vacunas.add(v2);
		vacunas.add(v3);
		vacunas.add(v4);
		vacunas.add(v5);
		vacunas.add(v6);
		vacunas.add(v7);
		vacunas.add(v8);
		vacunas.add(v9);
		vacunas.add(v10);
		vacunas.add(v11);
		vacunas.add(v12);
		vacunas.add(v13);
		vacunas.add(v14);
		vacunas.add(v15);
		vacunas.add(v16);
		vacunas.add(v17);

		int num;
		Scanner type = new Scanner(System.in);
		System.out.println("¿Qué quieres hacer con las vacunas?: ");
		System.out.println("1 --- Ver Stock total");
		System.out.println("2 --- Añadir vacuna");
		System.out.println("3 --- todavia nada ");
		System.out.println("4 --- todavia nada ");
		num = Integer.parseInt(type.nextLine());

		switch (num) {
		case 0:
			System.out.println("Tipo de usuario erroneo");

			break;
		case 1:
			verStock(vacunas);
			break;

		case 2:
			masStock(vacunas);
			break;
		default:
			break;
		}

	}

	public void verStock(ArrayList<vacuna> vacuna) {

		int stockpfizer = 0;
		int stockmoderna = 0;
		int stockjohnson = 0;
		String pfizer = "Pfizer";
		String moderna = "Moderna";
		String johnson = "Johnson";
		for (int i = 0; i < vacuna.size(); i++) {
			if (vacuna.get(i).getNombre().equals(pfizer)) {
				stockpfizer++;
			} else if (vacuna.get(i).getNombre().equals(moderna)) {
				stockmoderna++;
			} else if (vacuna.get(i).getNombre().equals(johnson)) {
				stockjohnson++;

			}
		}
		System.out.println("Hay un total de " + stockpfizer + " vacunas de Pfizer");
		System.out.println("Hay un total de " + stockjohnson + " vacunas de Jhonson");
		System.out.println("Hay un total de " + stockmoderna + " vacunas de Moderna");

	}

	public void masStock(ArrayList<vacuna> vacuna) {

		int idVacuna;
		int numDosis;
		String nombre;
		int idEnfermero;
		String dniPaciente;
		int idInterna;

		Scanner type = new Scanner(System.in);
		System.out.println("Nombre de la vacuna: ");
		nombre = type.nextLine();
		System.out.println("Id de la vacuna: ");
		idVacuna = Integer.parseInt(type.nextLine());
		System.out.println("Número de dosis administradas: ");
		numDosis = Integer.parseInt(type.nextLine());
		System.out.println("ID del Enfermero que la suministró / va a suministrarla: ");
		idEnfermero = Integer.parseInt(type.nextLine());
		System.out.println("Dni del Paciente que la va a recibir/recibió: ");
		dniPaciente = type.nextLine();
		System.out.println("Id interna de la vacuna: ");
		idInterna = Integer.parseInt(type.nextLine());

		if (nombre.equals("Pfizer")) {
			pfizer nuevaVacuna = new pfizer(idVacuna, numDosis, nombre, idEnfermero, dniPaciente, idInterna);
			System.out.println("Vacuna añadida: " + nuevaVacuna.toString());
			vacuna.add(nuevaVacuna);
		} else if (nombre.equals("Moderna")) {
			moderna nuevaVacuna = new moderna(idVacuna, numDosis, nombre, idEnfermero, dniPaciente, idInterna);
			System.out.println("Vacuna añadida: " + nuevaVacuna.toString());
			vacuna.add(nuevaVacuna);
		} else if (nombre.equals("Johnson")) {
			johnson nuevaVacuna = new johnson(idVacuna, numDosis, nombre, idEnfermero, dniPaciente, idInterna);
			System.out.println("Vacuna añadida: " + nuevaVacuna.toString());
			vacuna.add(nuevaVacuna);
		}
		verStock(vacuna);

	}

}
