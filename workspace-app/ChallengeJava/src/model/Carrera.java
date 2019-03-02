package model;

import java.util.Date;

public class Carrera {
	private int identificador;
	private String nombre;
	private String descripcion;
	private Date fechaDesde;
	private Date fechaHasta;
	
	public Carrera() {
		this.nombre = "Nombre Carrera";
		this.descripcion = "Descripcion Carrera";
		this.fechaDesde = new Date();
		this.fechaHasta = null;
	}
	
	public Carrera(String nombre, String descripcion, Date fechaDesde, Date fechaHasta) {
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.fechaDesde = fechaDesde;
		this.fechaHasta = fechaHasta;
	}
	
	public int getIdentificador() {
		return identificador;
	}
	public void setIdentificador(int identificador) {
		this.identificador = identificador;
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
	public Date getFechaDesde() {
		return fechaDesde;
	}
	public void setFechaDesde(Date fechaDesde) {
		this.fechaDesde = fechaDesde;
	}
	public Date getFechaHasta() {
		return fechaHasta;
	}
	public void setFechaHasta(Date fechaHasta) {
		this.fechaHasta = fechaHasta;
	}
	
	
}
