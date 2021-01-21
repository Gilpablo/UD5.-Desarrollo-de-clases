package Ejercicio;

public class Modulo {

	private String nombre;
	private String codigo;
	private int num_horas;
	
	
	public Modulo(String nombre, String codigo, int num_horas) {
	
		this.nombre = nombre;
		this.codigo = codigo;
		this.num_horas = num_horas;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getCodigo() {
		return codigo;
	}


	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}


	public int getNum_horas() {
		return num_horas;
	}


	public void setNum_horas(int num_horas) {
		this.num_horas = num_horas;
	}


	@Override
	public String toString() {
		return "Modulo [nombre=" + nombre + ", codigo=" + codigo + ", num_horas=" + num_horas + "]";
	}
	
	
	
	
}
