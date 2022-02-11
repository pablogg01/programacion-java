package herencias.Aves;

import herencias.Vertebrado;

public abstract class Aves extends Vertebrado {

	private String colorAlas;
	private boolean vuela;
	
	public Aves(String colorAlas, boolean vuela ,int peso, int numeroPatas, int altura) {
		
		super(peso,numeroPatas,altura);
		this.colorAlas=colorAlas;
		this.vuela=vuela;
	}
	
	public String colorAlas() {
		return colorAlas;
	}
	
	
}
