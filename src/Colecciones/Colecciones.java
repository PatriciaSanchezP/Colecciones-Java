package Colecciones;

import java.util.Set; //papá
import java.util.HashSet; //hijo

public class Colecciones {

	public static void main(String[] args) {
		
		// Declarando mi primer arreglo de Java []
		// Primero el tipo de dato que voy a almacenar, después el nombre de mi arreglo y por último instancio mi arreglo
		
		String[] listaCompras = new String[] {"leche", "pan", "frutas"};
		
		System.out.println(listaCompras);
		
		//forEach para imprimir cada elemento de mi lista de compras
		
		//Para nuestros datos del tipo String que se almaccenan en una variable temporal llamada ProductoTemporal, que se está llenando de un arreglo llamado listaCompras, vas a imprimir ese productoTemporal
		for(String productoTemporal : listaCompras) {
			System.out.println(productoTemporal);
		}
		
		
		
	}

}


/*
 Colecciones
 
 
 	- Arrays
 	Un array es una estructura de datos línea que contiene elementos del mismo tipo. Los elementos están almacenados de forma contígua en memoria, y se puede acceder a ellos a través de un índice. Sus principales características son:
 	
 	1. Tamaño fijo.
 	2. Acceso rápido.
 	3. Coste elevado para insertar o eliminar elementos.


*/