package com.contratacion.empleados;

public class Secretaria extends Empleado{
	public Secretaria(String pidEmpleado, String pnomEmpleado, String papellEmpleado, String ptelefono, String pemail) {
		this.idEmpleado = pidEmpleado;
		this.nomEmpleado = pnomEmpleado;
		this.apellEmpleado = papellEmpleado;
		this.telefono = ptelefono;
		this.email = pemail;
	}
	
	@Override
	public String codPuesto() {
		return "SC" + this.idEmpleado;
	}

	@Override
	public String nomPuesto() {
		return "Secretaría";
	}

	@Override
	public String departamento(){
		return "";
	}

	@Override
	public void encriptacion() throws Exception {
	}
}