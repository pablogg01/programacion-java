package herencias.Aves;

public abstract class NoVoladoras extends Aves {
	
	private int tamanioAlas;
	
	public NoVoladoras(int tamanioAlas, String colorAlas, int peso, int numeroPatas, int altura) {
		super(colorAlas, false, peso, numeroPatas, altura);
		this.tamanioAlas=tamanioAlas;
	}
	
	public int tamanioAlas() {
		return tamanioAlas;
	}

}
