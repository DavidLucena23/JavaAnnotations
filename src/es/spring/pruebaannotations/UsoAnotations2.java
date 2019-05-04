package es.spring.pruebaannotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoAnotations2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// Leer el xml de configuración
		
		// ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// Leer el class de configuración
			
			AnnotationConfigApplicationContext contexto = new AnnotationConfigApplicationContext(EmpleadosConfig.class);
		
		// Pedir dos beans al contenedor 
		
			/*Empleados empleado1 = contexto.getBean("directorFinanciero", Empleados.class);
			
			
			System.out.println(empleado1.getTareas());
			System.out.println(empleado1.getInforme());*/
			
			DirectorFinanciero empleado1 = contexto.getBean("directorFinanciero", DirectorFinanciero.class);
			
			System.out.println("Email del director financiero: " + empleado1.getEmail());
			System.out.println("Nombre de la empresa: " + empleado1.getNombreEmpresa());
		
		// Cerrar el contexto
		
		contexto.close();

	}

}
