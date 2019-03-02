package ejercicios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Ejercicio4 {

	// listas de ejemplo, pueden variarse su contenido, 
	static Integer[] valoresLista1 = {1, 2, 5, 8, 10, 30, 20, 8, 9, 10};
	static Integer[] valoresLista2 = {1, 2, 4, 20, 5, 10, 7, 8, 10, 9};

	/**	 
	 * Para ejecutar el mÃ©todo main se debe hacer boton derecho sobre la clase
	 * "Run As --> Java Application" 
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println("**** inicializando datos ****");
		
		List<Integer> lista1 = new ArrayList<Integer>(Arrays.asList(valoresLista1));
		List<Integer> lista2 = new ArrayList<Integer>(Arrays.asList(valoresLista2));
	
		System.out.println("**** inicializacion exitosa ****");

		// EJERCICIO 4.1: explicar salidas y sugerir mejoras
		informacion(lista1, 10);
		
		// EJERCICIO 4.2: corregir el metodo
		List<Integer> union = unionListas(lista1, lista2);
		System.out.println("union: " + union.toString());
		
		// EJERCICIO 4.3: implementar
		List<Integer> interseccion = interseccionListas(lista1, lista2);
		System.out.println("interseccion: " + interseccion.toString());
		
		// EJERCICIO 4.4: implementar
		List<Integer> orden1 = ordenaListaAscendente(lista1);
		System.out.println("orden asc: " + orden1);
		
		// EJERCICIO 4.5: implementar
		List<Integer> orden2 = ordenaListaDescendente(lista2);
		System.out.println("orden desc: " + orden2);

		// EJERCICIO 4.6: implementar
		boolean b = tienenMismoContenido(lista1, lista2);
		System.out.println("mismo contenido: " + b);
		
	}

	private static void informacion(List<Integer> lista1, Integer numero) {
		// TODO: explicar salidas de los system out y sugerir alguna mejora a la implementacion
		
		int pares = 0;
		for (Integer n: lista1) {
			if (n % 2 == 0) {
				pares = pares + 1;
			}
		}
		
		// Imprime la cantidad de números pares en la lista.
		System.out.println("... " + pares);
		
		List<Integer> impares = new ArrayList<Integer>();
		for (Integer n: lista1) {
			if (n % 2 != 0) {
				impares.add(n);
			}
		}
		
		// Imprime los números impares de la lista.
		System.out.println("... " + impares.toString());
		
		int p = lista1.size() / 2;
		
		// Imprime el indice de la primer ocurrencia del número 5 (p = 10 / 2).
		System.out.println("... " + lista1.indexOf(p));
		
		int c = 0;
		for (Integer n: lista1) {
			if (n > numero) {
				c = c + 1;
			}
		}
		if (c > lista1.size() / 2) {
			// Imprime esto si la cantidad de números en la lista mayores a 10 es mayor a 
			// cinco (La mitad del total de números en la lista).
			System.out.println("...");
		} else if (c > 0) {
			// Imprime esto si la cantidad de números en la lista mayores a 10 es menor a cinco.
			System.out.println("...");
		} else {
			// Imprime esto si no hay números en la lista mayores a 10.
			System.out.println("...");
		}
		
		// Como mejora se podría realizar el recorrido de la lista una sola vez para descubrir pares e impares.
		// Como También para averiguar que números en la lista son mayores a 10.
		pares = 0;
		impares = new ArrayList<Integer>();
		c = 0;
		for (Integer n: lista1) {
			if (n % 2 == 0) {
				pares = pares + 1;
			}else {
				impares.add(n);
			}
			if (n > numero) {
				c = c + 1;
			}
		}
		System.out.println("Cantidad de Pares: " + pares);
		System.out.println("Los Impares Son: " + impares.toString());
		if (c > lista1.size() / 2) {
			System.out.println("Los números de la lista mayores a 10 son más de la mitad de la lista.");
		} else if (c > 0) {
			System.out.println("Los números de la lista mayores a 10 son menos de la mitad de la lista.");
		} else {
			System.out.println("No hay números en la lista mayores a 10.");
		}
	}

	/***
	 * @param lista1
	 * @param lista2
	 * 
	 * retornar una lista que contenga los elementos de ambas listas, sin elementos repetidos 
	 * 
	 */
	private static List<Integer> unionListas(List<Integer> lista1, List<Integer> lista2) {
		// TODO: corregir el metodo para que funcione correctamente 
		
		List<Integer> union = new ArrayList<Integer>();
		List<Integer> lista1SinDuplicados = new ArrayList<>(
			      new HashSet<>(lista1));
		
		union.addAll(lista1SinDuplicados);
		
		for (Integer m: lista2) {
			if (!union.contains(m)) {
				union.add(m);
			}
		}
		
		return union;
	}

	/***
	 * @param lista1
	 * @param lista2
	 * 
	 * retornar una lista que contenga los elementos que estan presentes en ambas listas, sin elementos repetidos 
	 * 
	 */
	private static List<Integer> interseccionListas(List<Integer> lista1, List<Integer> lista2) {
		List<Integer> coincidences = new ArrayList<Integer>();
		if(lista1.isEmpty() || lista2.isEmpty()){
			return coincidences;
	    }

	    Set<Integer> setCommon = new HashSet<>(lista1);
	    setCommon.retainAll(lista2);
	    coincidences = new ArrayList<Integer>(setCommon);
	    return coincidences;
	}

	/***
	 * @param lista1
	 * 
	 * retornar la lista recibida, ordenada en forma ascendente
	 * 
	 */
	private static List<Integer> ordenaListaAscendente(List<Integer> lista1) {
		// TODO:
		Collections.sort(lista1);
		return lista1;
	}

	/***
	 * @param lista2
	 * 
	 * retornar la lista recibida, ordenada en forma descendente
	 * 
	 */
	private static List<Integer> ordenaListaDescendente(List<Integer> lista2) {
		// TODO:
		Collections.sort(lista2);
		Collections.reverse(lista2);
		return lista2;
	}

	/***
	 * @param lista1
	 * @param lista2
	 * 
	 * devuelve true si contienen los mismos elementos
	 * NO se considera valido que esten en diferente orden
	 * NO se considera valido que la cantidad de repeticiones de los elementos sea diferente
	 * 
	 */
	private static boolean tienenMismoContenido(List<Integer> lista1, List<Integer> lista2) {
		// TODO:
		if(lista1.size() == lista2.size()) {
			int cant = lista1.size();
			for(int i=0; cant > i; i++) {
				if(lista1.get(i) != lista2.get(i)) {
					return false;
				}
			}
		}else {
			return false;
		}
		return true;
	}

}
