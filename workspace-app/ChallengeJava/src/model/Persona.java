package model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Persona {

	private TipoDoc tipoDoc;
	private int nroDoc;
	private String nombre;
	private String apellido;
	private Date fechaNacimiento;
	private String direccion;

	public Persona() {
		this.tipoDoc = TipoDoc.DNI;
		this.nroDoc = 99999999;
		this.nombre = "John";
		this.apellido = "Doe";
		this.fechaNacimiento = new Date();
		this.direccion = "Dorrego 1122";
	}
	
	public Persona(TipoDoc tipoDoc, int nroDoc, String nombre, String apellido, Date fechaNacimiento, String direccion) {
		this.tipoDoc = tipoDoc;
		this.nroDoc = nroDoc;
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaNacimiento = fechaNacimiento;
		this.direccion = direccion;
	}
	
	@Override
	public String toString() {
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		String dateString = format.format(fechaNacimiento);
		return "Tipo de Documento: " + tipoDoc + ", N�mero de Documento: " + nroDoc + ", Nombre: " + nombre + ", "
				+ "Apellido: " + apellido + ", Fecha de Nacimineto: " + dateString + ", Direcci�n: " + direccion + ",";
	}

	public TipoDoc getTipoDoc() {
		return tipoDoc;
	}

	public void setTipoDoc(TipoDoc tipoDoc) {
		this.tipoDoc = tipoDoc;
	}

	public int getNroDoc() {
		return nroDoc;
	}

	public void setNroDoc(int nroDoc) {
		this.nroDoc = nroDoc;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	
	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

}

