package herencias.Mamifero;

import herencias.Mamiferos;

public class Elefante extends Mamiferos {
	
	public Elefante(int peso, int altura) {
		super(false, peso, 4, altura);//Mamifero(false)
		
	}
	
	public void emitirRuido() {
		System.out.println("Barritar");
	}
	
	public void respirar() {
		System.out.println("Usar pulmones");
	}
	
	public void desplazarse(int metros) {
		System.out.println("Muchos metros");
	}

}
