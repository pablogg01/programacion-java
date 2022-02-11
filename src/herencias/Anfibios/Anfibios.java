package herencias.Anfibios;

import herencias.Vertebrado;

public abstract class Anfibios extends Vertebrado {

	private final boolean esJoven;
	
	public Anfibios(boolean esJoven, int peso, int numeroPatas, int altura) {
		super(peso, numeroPatas, altura);
		this.esJoven=esJoven;
	}
	
	public boolean esJoven() {
		return esJoven;
	}
	
}
