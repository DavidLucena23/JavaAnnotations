package es.spring.pruebaannotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("es.spring.pruebaannotations")
public class EmpleadosConfig {

	//Definir el bean para InformeFinancieroDtoCompras
	
	@Bean
	public CreacionInformeFinanciero informeFinancieroDtoCompras() {
		
		
		return new InformeFinancieroDtoCompras();
	}
	
	
	
	//Definir el bean para DirecrtorFinanciero e inyectar dependencias.
	
	@Bean
	public Empleados directorFinanciero() {
		
		return new DirectorFinanciero(informeFinancieroDtoCompras());
	}
	
}
