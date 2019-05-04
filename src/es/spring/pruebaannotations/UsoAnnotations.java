package es.spring.pruebaannotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoAnnotations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Leer el xml de configuración
		
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// Pedir un bean al contenedor 
		
		Empleados David = contexto.getBean("ComercialExperimentado", Empleados.class);
		
		// Usar el bean
		
		System.out.println(David.getInforme()); 
		System.out.println(David.getTareas()); 
		
		// Cerrar el contexto
		
		contexto.close();

	}

}
