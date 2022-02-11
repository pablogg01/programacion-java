package herencias.Aves;

public abstract class Voladoras extends Aves {

	private int tamanioPico;
	
	public Voladoras(String colorAlas, int peso, int numeroPatas, int altura) {
		super(colorAlas, true, peso, numeroPatas, altura);
		this.tamanioPico=tamanioPico;
	}
	
	public int tamanioPico() {
		return tamanioPico;
	}
	
	}


