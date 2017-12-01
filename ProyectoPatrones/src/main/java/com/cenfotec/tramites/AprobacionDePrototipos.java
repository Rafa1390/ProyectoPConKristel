package com.cenfotec.tramites;


public class AprobacionDePrototipos extends Tramite{
     String nombrePrototipo;
     String detalleDePrototipo;
     float presupuesto;
     
 	public AprobacionDePrototipos() {

	}
      
	public AprobacionDePrototipos(String nombrePrototipo, String detalleDePrototipo, float presupuesto) {
		this.nombrePrototipo = nombrePrototipo;
		this.detalleDePrototipo = detalleDePrototipo;
		this.presupuesto = presupuesto;
	}

	public String getNombrePrototipo() {
		return nombrePrototipo;
	}

	public String getDetalleDePrototipo() {
		return detalleDePrototipo;
	}

	public float getPresupuesto() {
		return presupuesto;
	}

	public void setNombrePrototipo(String nombrePrototipo) {
		this.nombrePrototipo = nombrePrototipo;
	}

	public void setDetalleDePrototipo(String detalleDePrototipo) {
		this.detalleDePrototipo = detalleDePrototipo;
	}

	public void setPresupuesto(float presupuesto) {
		this.presupuesto = presupuesto;
	}
	
	
     
     
}
