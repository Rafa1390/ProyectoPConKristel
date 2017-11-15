package com.prueba.prototipo;
import java.io.*;

import com.contratacion.empleados.Supervisor;
import com.gestion.departamentos.SoporTecnico;

public class PruebaPrototipo {
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static PrintStream out = System.out;
	
	public static void main(String[] args)throws java.io.IOException {
		/*Primero se debe realizar una fabrica en donde se debe
		 * instancie el objeto que va a ser el puesto del empleado,
		 * preguntandole al cliente en que puesto va a ser cotratado
		 * el empleado.*/
		
		/*Luego de preguntar por el puesto, se pregunta en que departamento
		 * va a trabajar y asi recibir la instancia de este*/
		
		//El gestor deberia recibir la instancia del objeto del puesto deseado
		String idEmpleado, nomEmpleado, apellEmpleado, telefono, email;
		
		out.println("Digite el id del empleado");
		idEmpleado = in.readLine();
		out.println("Digite el nombre del empleado");
		nomEmpleado = in.readLine();
		out.println("Digite el apellido del empleado");
		apellEmpleado = in.readLine();
		out.println("Digite el telefono del empleado");
		telefono = in.readLine();
		out.println("Digite el email del empleado");
		email = in.readLine();
		
		/*Los datos se deben mandar al gestor*/
		
		Supervisor empleado = new Supervisor(idEmpleado, nomEmpleado, apellEmpleado, telefono, email);
		SoporTecnico contratado = new SoporTecnico(empleado);
		
		//La variable contratado se almacenaría en un arreglo
		
		out.println("Id: " + contratado.getIdEmpleado() + "\n" +
					"Nombre: " + contratado.getNomEmpleado() + "\n" +
					"Apellido: " + contratado.getApellEmpleado() + "\n" +
					"Telefono: " + contratado.getTelefono() + "\n" +
					"Email: " + contratado.getEmail() + "\n" +
					"Codigo del puesto: " + contratado.codPuesto() + "\n" +
					"Nombre del puesto: " + contratado.nomPuesto() + "\n" +
					"Nombre del departamento: " + contratado.departamento());
		
		/*Si se desea cambiar el puesto o el departamento del empleado, se extraen los datos 
		 * personales del empleado, se elimina el objeto y los datos personales se almacenan
		 * en un nuevo objeto del puesto deseado y del departamento deseado*/
	}

}
