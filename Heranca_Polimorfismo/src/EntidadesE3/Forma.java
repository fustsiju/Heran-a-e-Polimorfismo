package EntidadesE3;

import entidadeE3.enums.Cores;

public abstract class Forma {
	private Cores cores;

	public Forma() {

	}

	public Forma(Cores cores) {
		this.cores = cores;
	}

	public Cores getCores() {
		return cores;
	}

	public void setCores(Cores cores) {
		this.cores = cores;
	}

	public abstract double area();
}
