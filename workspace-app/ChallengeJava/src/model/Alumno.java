package model;

public class Alumno {
	
	private int identificador;
	private Persona persona;
	private int legajo;

	public Alumno() {
		this.persona = new Persona();
		this.legajo = 999999;
	}
	
	public Alumno(Persona persona, int legajo) {
		this.persona = persona;
		this.legajo = legajo;
	}

	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	public int getLegajo() {
		return legajo;
	}

	public void setLegajo(int legajo) {
		this.legajo = legajo;
	}

	public int getIdentificador() {
		return identificador;
	}

	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}
}