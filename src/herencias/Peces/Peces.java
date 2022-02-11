package herencias.Peces;

import herencias.Vertebrado;

public abstract class Peces extends Vertebrado {

	
	private final boolean tieneEscamas; 
	
	public Peces(boolean tieneEscamas ,int peso, int numeroPatas, int altura) {
		super(peso, numeroPatas, altura);
		this.tieneEscamas=tieneEscamas;
	}

	
	private boolean tieneEscamas() {
		return tieneEscamas;
	}
}
