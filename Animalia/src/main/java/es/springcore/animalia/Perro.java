package es.springcore.animalia;

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
