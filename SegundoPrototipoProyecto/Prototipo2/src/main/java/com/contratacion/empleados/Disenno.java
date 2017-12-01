package com.contratacion.empleados;

public class Disenno extends Empleado{
	public Disenno(String pidEmpleado, String pnomEmpleado, String papellEmpleado, String ptelefono, String pemail) {
		this.idEmpleado = pidEmpleado;
		this.nomEmpleado = pnomEmpleado;
		this.apellEmpleado = papellEmpleado;
		this.telefono = ptelefono;
		this.email = pemail;
	}
	
	@Override
	public String codPuesto() {
		return "DN" + this.idEmpleado;
	}

	@Override
	public String nomPuesto() {
		return "Diseño";
	}

	@Override
	public String departamento(){
		return "";
	}

	@Override
	public void encriptacion() throws Exception {
	}
}
