package com.contratacion.empleados;

public class Gerente extends Empleado{
	public Gerente(String pidEmpleado, String pnomEmpleado, String papellEmpleado, String ptelefono, String pemail) {
		this.idEmpleado = pidEmpleado;
		this.nomEmpleado = pnomEmpleado;
		this.apellEmpleado = papellEmpleado;
		this.telefono = ptelefono;
		this.email = pemail;
	}
	
	@Override
	public String codPuesto() {
		return "GR" + this.idEmpleado;
	}

	@Override
	public String nomPuesto() {
		return "Gerente";
	}

	@Override
	public String departamento(){
		return "";
	}

	@Override
	public void encriptacion() throws Exception {
	}
}