package es.spring.pruebaannotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("ComercialExperimentado")
// @Scope ("prototype")
public class ComercialExperimentado implements Empleados {
	
	@Autowired
	@Qualifier("informeFinancieroTrim4") // beean id que debe utilizar
	private CreacionInformeFinanciero nuevoInforme;
	
	
	public ComercialExperimentado() {
		
	}
	
	//Ejecución de codigo despues de creación del Bean
	@PostConstruct
	public void ejecutaDespuesCreacion() {
		System.out.println("Ejecutado tras la creación del Bean");
	}
	
	// Ejecucion de codigo despues de apagado de contenedor Spring
	@PreDestroy
	public void ejecutaAntesDestruccion() {
		System.out.println("Ejecutado antes de la destrucción del Bean");
	}
	
	/*@Autowired
	public ComercialExperimentado(CreacionInformeFinanciero nuevoInforme) {
		this.nuevoInforme = nuevoInforme;
	}
	
	@Autowired
	public void setNuevoInforme(CreacionInformeFinanciero nuevoInforme) {
		this.nuevoInforme = nuevoInforme;
	}*/
	

	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "Vender, vender y vender más!";
	}




	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		// return "Informe generado por el comercial";
		
		return nuevoInforme.getInformeFinanciero();
	}

}
