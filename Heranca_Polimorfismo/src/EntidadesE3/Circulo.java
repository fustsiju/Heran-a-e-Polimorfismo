package EntidadesE3;

import entidadeE3.enums.Cores;

public class Circulo extends Forma {
	private Double raio;
	final Double PI = 3.14159;

	public Circulo() {
		super();
	}

	public Circulo(Cores cores, Double raio) {
		super(cores);
		this.raio = raio;
	}

	public Double getRaio() {
		return raio;
	}

	public void setRaio(Double raio) {
		this.raio = raio;
	}

	@Override
	public double area() {
		return (raio * raio) * PI;
	}

}
