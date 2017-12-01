package com.contratacion.empleados;

public class Tecnico1 extends Empleado{
	public Tecnico1(String pidEmpleado, String pnomEmpleado, String papellEmpleado, String ptelefono, String pemail) {
		this.idEmpleado = pidEmpleado;
		this.nomEmpleado = pnomEmpleado;
		this.apellEmpleado = papellEmpleado;
		this.telefono = ptelefono;
		this.email = pemail;
	}
	
	@Override
	public String codPuesto() {
		return "T1" + this.idEmpleado;
	}

	@Override
	public String nomPuesto() {
		return "Técnico 1";
	}

	@Override
	public String departamento(){
		return "";
	}

	@Override
	public void encriptacion() throws Exception {
	}
}
