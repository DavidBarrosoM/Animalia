package es.springcore.animalia;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Leer la clase de configuracion
		AnnotationConfigApplicationContext contexto = new AnnotationConfigApplicationContext(AnimalesConfig.class);
		
		//Pedir los beans
		Animal Luna = contexto.getBean("Perro",Animal.class);
		System.out.println(Luna.getCategoria());
		contexto.close();
	}

}
