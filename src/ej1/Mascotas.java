package ej1;

public abstract class Mascotas {
	protected String nombrel;
	protected int edad;
	protected String estado;
	protected String fechaNacimiento;

	// Creamos un constructor que inizialice los atributos
	public Mascotas(String nombrel, int edad, String estado, String fechaNacimiento) {
		this.nombrel = nombrel;
		this.edad = edad;
		this.estado = estado;
		this.fechaNacimiento = fechaNacimiento;
	}

//Creamos un metodo que nos devuelva el estado y el nombre
	public String getNombrel() {
		return nombrel;
	}

	public String getEstado() {
		return estado;
	}

}
