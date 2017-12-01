package com.fabrica.tramites;

import com.cenfotec.tramites.AprobacionDePrototipos;
import com.cenfotec.tramites.CategoriaTramites;
import com.cenfotec.tramites.EvaluacionDeVentas;
import com.cenfotec.tramites.InspeccionDePuestos;
import com.cenfotec.tramites.Tramite;

public class FabricaTramites {
	
	public static Tramite crearTramite(CategoriaTramites TipoTramites)throws Exception {
		
		if(CategoriaTramites.AprobacionDePrototipos.equals(TipoTramites)) {
			return new AprobacionDePrototipos();
		}
		if(CategoriaTramites.EvaluacionDeVentas.equals(TipoTramites)) {
			return new EvaluacionDeVentas();
		}
		if(CategoriaTramites.InspeccionDePuestos.equals(TipoTramites)) {
			return new InspeccionDePuestos();
		}
		 
		throw new Exception("Error creando un tramite");
	}

}
