package ej1;

import java.util.ArrayList;

public class Inventario {
	private ArrayList<Mascotas> mascotas = new ArrayList<>();;

	public void vaciar() {
		mascotas.clear();

	}

//Creamos un metodo que añada las mascotas a la lista//
	public void insertarMascota(Mascotas a) {
		mascotas.add(a);

	}

	// Creamos un metodo que elimine a las mascotas por nombre de la lista//
	public void eliminarMascota(String nombrel) {
		mascotas.remove(nombrel);

	}

	// Creamos un metodo que imprima a las mascotas a la lista//
	public void imprimirTodos() {
		for (Mascotas mascotas2 : mascotas) {
			System.out.println(mascotas2.getNombrel());

		}

	}

	// Creamos un metodo que imprima a los perros de la lista//
	public void imprimirPerros() {
		for (Mascotas mascotas2 : mascotas) {
			if (mascotas2 instanceof Perro) {
				System.out.println(mascotas2.getNombrel());

			}
		}

	}

}
