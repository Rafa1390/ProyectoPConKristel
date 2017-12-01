package com.cenfotec.tramites;

import java.util.Date;

import com.contratacion.empleados.Empleado;

public abstract class Tramite {
	
	protected CategoriaTramites categoria;
	Empleado autor;
	Empleado receptor;
	String mensaje;
	String estado;
	Date fecha;
	String asunto;

	public String getAsunto() {
		return asunto;
	}

	public void setAsunto(String asunto) {
		this.asunto = asunto;
	}

	public CategoriaTramites getTipoTramite() {
		return categoria;
	}

	public Empleado getAutor() {
		return autor;
	}

	public Empleado getReceptor() {
		return receptor;
	}

	public String getMensaje() {
		return mensaje;
	}

	public String getEstado() {
		return estado;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setTipoTramite(CategoriaTramites tipoTramite) {
		this.categoria = tipoTramite;
	}

	public void setAutor(Empleado autor) {
		this.autor = autor;
	}

	public void setReceptor(Empleado receptor) {
		this.receptor = receptor;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	@Override
	public String toString() {
		return " autor=" + autor + ", receptor=" + receptor + ", mensaje="
				+ mensaje + ", estado=" + estado + ", fecha=" + fecha + "]";
	}
	
	
	
	

}
