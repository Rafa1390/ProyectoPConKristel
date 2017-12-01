package com.contratacion.empleados;

public abstract class Empleado {
	String idEmpleado;
	String nomEmpleado;
	String apellEmpleado;
	String telefono;
	String email;
	
	public String getIdEmpleado() {
		return idEmpleado;
	}
	public String getNomEmpleado() {
		return nomEmpleado;
	}
	public String getApellEmpleado() {
		return apellEmpleado;
	}
	public String getTelefono() {
		return telefono;
	}
	public String getEmail() {
		return email;
	}
	
	public abstract String codPuesto();
	public abstract String nomPuesto();
	public abstract String departamento() throws Exception;
	public abstract void encriptacion() throws Exception;
}
