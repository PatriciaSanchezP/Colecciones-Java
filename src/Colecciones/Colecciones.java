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
		
		
		
		//Arreglo de habitaciones de un hotel
		String[] habitaciones = new String[10];
		
		//Asigno valores a cada índice
		habitaciones[0] = "101";
		habitaciones[1] = "102";
		habitaciones[2] = "103";
		habitaciones[3] = "104";
		habitaciones[4] = "105";
		habitaciones[5] = "106";
		habitaciones[6] = "107";

		
		
		/* habitaciones[10] = "111"; Si tratamos de acceder a un elemnto más allá de los elementos declarados al principio, tendremos una excepción que solo veremos cuando se ejecute el programa */
		
		//Cuandp imprimimos un elemento que no está definido dentro del arreglo, veremos un null. Esto pasa porque para Java es preferible tener un elemento nulo que uno indefinido.
		System.out.println(habitaciones[8]);
		
		// en caso de querer usar un for each para imprimir los elementos, solo se imprimirán 7 elementos. Solo itera sobre los elementos existentes.
		
		for(String habitacionTemporal : habitaciones) {
			System.out.println(habitacionTemporal);
		}
		
	}

}


/*

Colecciones


- Arrays

Un array es una estructura de datos linea que contiene elementos del mismo tipo. La longitud de un array se establece al momento de crearlo y no puede cambiar. No cuenta con metodos adicionales para agregar o eliminar elementos. Los elementos estan almacenados de forma contigua en memoria, y se puede acceder a ellos a traves de un indice. Sus principales caracteristicas son:

    1. Tamanio fijo.
    2. Acceso rapido.
    3. Coste elevado para insertar o eliminar elementos. 



*/