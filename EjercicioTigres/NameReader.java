package JavaApplication9;

import java.util.Scanner;

public class NameReader {
// String names = new String [10];
	public static String[] readNames() throws NameExceptions {
		String[] names = new String[10]; // Declaramos arreglo
		String name = ""; // inicializamos variable para guardar mediante teclado
		Scanner entrada = new Scanner(System.in);

		// Loop para recibir los datos
		for (int i = 0; i < names.length; i++) {
			System.out.println("Name (" + i + "):  ");
			name = entrada.nextLine();
			if (name.equalsIgnoreCase("tigres")) {
				entrada.close();
				throw new NameExceptions(name);
			}
			names[i] = name;
		}
		return names;
	}
}
