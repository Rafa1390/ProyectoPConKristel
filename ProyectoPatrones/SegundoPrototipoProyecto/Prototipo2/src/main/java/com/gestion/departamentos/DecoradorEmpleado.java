package com.gestion.departamentos;

import com.contratacion.empleados.Empleado;

public abstract class DecoradorEmpleado extends Empleado{
	@Override
	public abstract String getIdEmpleado();
	@Override
	public abstract String getNomEmpleado();
	@Override
	public abstract String getApellEmpleado();
	@Override
	public abstract String getTelefono();
	@Override
	public abstract String getEmail();
}
