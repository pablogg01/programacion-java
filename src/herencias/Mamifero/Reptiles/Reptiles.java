package herencias.Mamifero.Reptiles;

import herencias.Vertebrado;

public abstract class Reptiles extends Vertebrado {

	private final boolean esOviparo;
	private final boolean sangreFria;
	private final boolean acuatico;
	
	public Reptiles(boolean esOviparo,boolean sangreFria, boolean acuatico, int peso, int numeroPatas, int altura) {
		
		super(peso,numeroPatas,altura);
		this.esOviparo=esOviparo;
		this.acuatico=acuatico;
		this.sangreFria=sangreFria;
	}
	
	public boolean sangreFria() {
		return sangreFria;
	}
	
	public boolean acuatico() {
		return acuatico;
	}
	
}
