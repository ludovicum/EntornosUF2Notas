package practica1;

import java.util.Scanner;

/**
 * Esta clase pretende calcular la nota final en función de las medias de las
 * notas obtenidas a los largo de las 3 UF según su ponderación.
 * 
 * @author Luis
 *
 */

public class notas {
	/**
	 * Declaración de variables
	 */
	double uf1, uf2, uf3;
	double acu1, acu2, acu3, def;

	Scanner entrada = new Scanner(System.in);

	/**
	 * Método clave para la introducción de las notas. Cuando ejecutamos el método
	 * queremos que nos pida las notas.
	 */

	public void IngresaNotas() {

		System.out.println("ingrese las notas del estudiante");

		System.out.print("ingrese nota 1: ");

		uf1 = entrada.nextDouble();

		System.out.print("ingrese nota 2: ");

		uf2 = entrada.nextDouble();

		System.out.print("ingrese nota 3: ");

		uf3 = entrada.nextDouble();

	}

	/**
	 * Método para comprobar que las notas están bién introducidas.
	 */
	public void comprobacion() {

		if (uf1 > 10) {
			System.out.println(" nota1 mal introducida");

		} else {
			System.out.println(" nota1 correcta");
		}

		if (uf2 > 10) {
			System.out.println(" nota2 mal introducida");

		} else {
			System.out.println(" nota2 correcta");
		}
		if (uf3 > 10) {
			System.out.println(" nota3 mal introducida");

		} else {
			System.out.println(" nota3 correcta");
		}

	}

	/**
	 * Método para realizar el cálculo de las notas es función de la ponderación de
	 * cada UF y la suma de todas para obtener la nota definitiva.
	 */
	public void Calculonotas() {
		acu1 = uf1 * 0.35;
		acu2 = uf2 * 0.35;
		acu3 = uf3 * 0.30;

		def = acu1 + acu2 + acu3;

	}

	/**
	 * Método para mostrar por pantalla todas las notas, tanto las introducidas,
	 * como las ponderaciones y la nota definitiva.
	 */
	public void Mostrar() {

		System.out.println(" notas introducidas son:");
		System.out.println(" nota1 = " + uf1);
		System.out.println(" nota2 = " + uf2);
		System.out.println(" nota3 = " + uf3);

		System.out.println(" acumuado 1 = " + acu1);
		System.out.println(" acumuado 2 = " + acu2);
		System.out.println(" acumuado 3 = " + acu3);

		System.out.println(" nota definitiva es = " + def);

	}

	/**
	 * Método para comprobar, según las notas introducidas y los cálculos
	 * anteriores, que el alumno ha aprobado, ha suspendido o que hay algún error en
	 * las notas introducidas.
	 */
	public void aprobado() {

		if (def < 5 && def >= 0) {
			System.out.println("suspendio");
		} else {
			if (def >= 5 && def <= 10) {
				System.out.println("aprobado");
			} else {
				System.out.println(" error en la notas");
			}
		}
	}

	/**
	 * Método para llamar a cualquier método creado, fuera de la clase.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		notas fc = new notas();

		fc.IngresaNotas();

		fc.comprobacion();

		fc.Calculonotas();

		fc.Mostrar();

		fc.aprobado();

	}

}
