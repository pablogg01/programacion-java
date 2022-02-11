package herencias;

public abstract class Mamiferos extends Vertebrado {

	private final boolean esOviparo;
	
	public Mamiferos(boolean esOviparo, int peso, int numeroPatas, int altura) {
		super(peso,numeroPatas,altura);
		this.esOviparo=esOviparo;
	}
	
	public boolean esOviparo() {
		return esOviparo;
	}
	
}
