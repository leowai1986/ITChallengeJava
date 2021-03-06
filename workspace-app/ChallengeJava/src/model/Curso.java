package model;

public class Curso {
	
	private int identificador;
	private Carrera carrera;
	private String nombre;
	private String descripcion;
	private int cupomax;
	private int a�o;
	
	public Curso() {
		this.carrera = new Carrera();
		this.nombre = "Nombre Curso";
		this.descripcion = "Descripci�n Curso";
		this.cupomax = 10;
		this.a�o = 2019;
	}

	public Curso(Carrera carrera, String nombre, String descripcion, int cupomax, int a�o) {
		this.carrera = carrera;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.cupomax = cupomax;
		this.a�o = a�o;
	}
	
	public int getIdentificador() {
		return identificador;
	}
	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}
	public Carrera getCarrera() {
		return carrera;
	}
	public void setCarrera(Carrera carrera) {
		this.carrera = carrera;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public int getCupomax() {
		return cupomax;
	}
	public void setCupomax(int cupomax) {
		this.cupomax = cupomax;
	}
	public int getA�o() {
		return a�o;
	}
	public void setA�o(int a�o) {
		this.a�o = a�o;
	}
	
	
	
}
