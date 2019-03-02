package ejercicios;

public class Alumno {
	
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
	
	

}
