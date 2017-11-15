package com.gestion.departamentos;

import com.contratacion.empleados.Empleado;

public class SoporTecnico extends DecoradorEmpleado{
	Empleado empleado;
	
	public SoporTecnico(Empleado pempleado) {
		this.empleado = pempleado;
	}

	@Override
	public String getIdEmpleado() {
		return this.empleado.getIdEmpleado();
	}

	@Override
	public String getNomEmpleado() {
		return this.empleado.getNomEmpleado();
	}

	@Override
	public String getApellEmpleado() {
		return this.empleado.getApellEmpleado();
	}

	@Override
	public String getTelefono() {
		return this.empleado.getTelefono();
	}

	@Override
	public String getEmail() {
		return this.empleado.getEmail();
	}

	@Override
	public String codPuesto() {
		return this.empleado.codPuesto() + "ST";
	}

	@Override
	public String nomPuesto() {
		return this.empleado.nomPuesto() + " del departamento de Soporte Tecnico";
	}

	@Override
	public String departamento() {
		return "Soporte Tecnico";
	}

}
