package com.fabrica.empleo;

import com.contratacion.empleados.Disenno;
import com.contratacion.empleados.Empleado;
import com.contratacion.empleados.Gerente;
import com.contratacion.empleados.Programador;
import com.contratacion.empleados.Secretaria;
import com.contratacion.empleados.Supervisor;
import com.contratacion.empleados.Tecnico1;
import com.contratacion.empleados.TiposPuestos;
import com.contratacion.empleados.Vendedor;

public class FabricaPuestos {
	public static Empleado crearPuestos(TiposPuestos tiposPuestos, String pId, String pNom,
										String pApell, String pTel, String pEm) throws Exception{
		switch(tiposPuestos) {
		case Supervisor:
			return new Supervisor(pId, pNom, pApell, pTel, pEm);
		case Tecnico1:
			return new Tecnico1(pId, pNom, pApell, pTel, pEm);
		case Gerente:
			return new Gerente(pId, pNom, pApell, pTel, pEm);
		case Secretaria:
			return new Secretaria(pId, pNom, pApell, pTel, pEm);
		case Disenno:
			return new Disenno(pId, pNom, pApell, pTel, pEm);
		case Programador:
			return new Programador(pId, pNom, pApell, pTel, pEm);
		case Vendedor:
			return new Vendedor(pId, pNom, pApell, pTel, pEm);
		default:
			throw new Exception("Error, creando tipo desconocido de puesto");
		}
	}
}
