package es.springcore.animalia;

import org.springframework.stereotype.Component;

@Component("Perro")
public class Perro implements Animal{
	@Override
	public String getCategoria() {
		return "Doméstico";
	}
	@Override
	public String getEspecie() {
		return "Mamífero";
	}
}
