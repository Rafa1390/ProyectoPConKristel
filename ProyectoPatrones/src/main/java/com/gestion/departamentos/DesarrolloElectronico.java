package com.gestion.departamentos;

import java.io.File;

import com.contratacion.empleados.Empleado;
import com.encriptacon.departamento.ManejoEncriptacion;

public class DesarrolloElectronico extends DecoradorEmpleado{
	Empleado empleado;
	private static ManejoEncriptacion encriptacion = new ManejoEncriptacion();
	
	public DesarrolloElectronico(Empleado pempleado) {
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
		return this.empleado.codPuesto() + "DE";
	}

	@Override
	public String nomPuesto() {
		return this.empleado.nomPuesto();
	}

	@Override
	public String departamento() throws Exception{
		encriptacion();
		return "Desarrollo Electrónico";
	}

	@Override
	public void encriptacion() throws Exception{
		String direccion = "C:/Users/rafab/Documents/Programación de software/007 Patrones/Proyecto Patrones/SegundoPrototipoProyecto/LlavesPublicas/";
		String nomDep = "DesarrolloElectronico";
		String archivo = nomDep + "public.key";
		String llave = direccion + archivo;
		File fichero = new File(llave);
		
		if(!(fichero.exists())) {
			encriptacion.crearLlave(nomDep);
		}
	}
}