package com.contratacion.empleados;

public class Supervisor extends Empleado{
	public Supervisor(String pidEmpleado, String pnomEmpleado, String papellEmpleado, String ptelefono, String pemail) {
		this.idEmpleado = pidEmpleado;
		this.nomEmpleado = pnomEmpleado;
		this.apellEmpleado = papellEmpleado;
		this.telefono = ptelefono;
		this.email = pemail;
	}
	
	@Override
	public String codPuesto() {
		return "SV" + this.idEmpleado;
	}

	@Override
	public String nomPuesto() {
		return "Supervisor";
	}

	@Override
	public String departamento(){
		return "";
	}

	@Override
	public void encriptacion() throws Exception {
	}
}