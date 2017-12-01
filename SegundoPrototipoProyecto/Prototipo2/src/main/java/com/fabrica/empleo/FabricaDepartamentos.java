package com.fabrica.empleo;

import com.contratacion.empleados.Empleado;
import com.gestion.departamentos.Administracion;
import com.gestion.departamentos.DecoradorEmpleado;
import com.gestion.departamentos.DesarrolloElectronico;
import com.gestion.departamentos.SoporTecnico;
import com.gestion.departamentos.TiposDepartamentos;
import com.gestion.departamentos.Ventas;

public class FabricaDepartamentos {
	public static DecoradorEmpleado crearDepartamento(TiposDepartamentos tiposDepartamentos,
													  Empleado empleado) throws Exception{
		switch(tiposDepartamentos) {
		case SoporteTecnico:
			return new SoporTecnico(empleado);
		case Administracion:
			return new Administracion(empleado);
		case DesarrolloElectronico:
			return new DesarrolloElectronico(empleado);
		case Ventas:
			return new Ventas(empleado);
		default:
			throw new Exception("Error, creando tipo desconocido de departamento");
		}
	}
}
