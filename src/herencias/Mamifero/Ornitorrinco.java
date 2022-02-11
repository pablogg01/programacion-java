package herencias.Mamifero;

import herencias.Mamiferos;

public class Ornitorrinco extends Mamiferos {

	public Ornitorrinco(int peso, int altura) {
		
		super(true,peso,4,altura);
		
	}
	
	public void emitirRuido() {
		System.out.println("GGRRGRGRGRGRRGRGRRG");
	}
	
	public void respirar() {
		System.out.println("Si");
	}
	
	public void desplazarse(int metros) {
		System.out.println("Maldito perry");
	}
	
}
