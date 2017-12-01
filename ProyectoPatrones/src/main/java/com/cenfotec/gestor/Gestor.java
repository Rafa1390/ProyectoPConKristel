package com.cenfotec.gestor;

import java.util.ArrayList;
import java.util.Date;

import com.cenfotec.tramites.CategoriaTramites;
import com.cenfotec.tramites.Tramite;
import com.contratacion.empleados.Empleado;
import com.contratacion.empleados.TiposPuestos;
import com.encriptacon.departamento.ManejoEncriptacion;
import com.fabrica.empleo.FabricaDepartamentos;
import com.fabrica.empleo.FabricaPuestos;
import com.fabrica.tramites.FabricaTramites;
import com.gestion.departamentos.DecoradorEmpleado;
import com.gestion.departamentos.TiposDepartamentos;

public class Gestor {
	
	ArrayList<Empleado> empleados = new ArrayList<Empleado>();
	ArrayList<Tramite> tramites = new ArrayList<Tramite>();
	
	Tramite devolverTramite (int opc) throws Exception {
		Tramite nuevoTramite;
		nuevoTramite = FabricaTramites.crearTramite(CategoriaTramites.values()[opc -1]);
		return nuevoTramite;
	}
	
	void ingresarTramite(Empleado autor, Empleado receptor, String mensaje, 
			             String estado, Date fecha ,String asunto, int tipo) throws Exception {
		
		Tramite nuevoTramite = devolverTramite(tipo);
		nuevoTramite.setAutor(autor);
		nuevoTramite.setReceptor(receptor);
		nuevoTramite.setMensaje(mensaje);
		nuevoTramite.setEstado(estado);
		nuevoTramite.setFecha(fecha);
		nuevoTramite.setAsunto(asunto);	
		
	}
	
	void encriptarMensaje(Tramite nuevoTramite, String llave) throws Exception {
		ManejoEncriptacion manejoEncriptacion = new ManejoEncriptacion();
		manejoEncriptacion.encriptarMensaje(nuevoTramite,llave);
	}
	
	void desencriptarMensaje(Tramite tramiteLeer, String llave) throws Exception {
		ManejoEncriptacion manejoEncriptacion = new ManejoEncriptacion();
		manejoEncriptacion.desencriptarMensaje(tramiteLeer,llave);
	}
	
	Empleado ingresarEmpleado(String idEmpleado, String nomEmpleado,String apellEmpleado,
			                  String telefono,String email, int tipo) throws Exception {
		Empleado nuevoEmpleado = FabricaPuestos.crearPuestos(TiposPuestos.values()[tipo -1],idEmpleado, 
				nomEmpleado, apellEmpleado, telefono, email);
		return nuevoEmpleado;
		
	}
	
	void agregarEmpleadoALista(Empleado nuevoEmpleado) {
		empleados.add(nuevoEmpleado);
	}
	
	void agregarTramiteALista(Tramite nuevoTramite) {
		tramites.add(nuevoTramite);
	}
	
	boolean buscarEmpleado(String ced) {
		boolean encontrado = false;
		
		for(Empleado empleadoActual : empleados) {
			if(empleadoActual.getIdEmpleado().equals(ced)) {
				encontrado = true;
			}
		}
		
		return encontrado;
	}
	ArrayList<Tramite> buscarTramitesRecibidos(String ced){
		
		for() {
			
		}
		return tramites;
		
	}
	void decoradorEmp(int opcD, Empleado nuevoEmpleado) throws Exception {
		
    DecoradorEmpleado contratado = FabricaDepartamentos.crearDepartamento
				   (TiposDepartamentos.values()[opcD -1], nuevoEmpleado);

	}
}
