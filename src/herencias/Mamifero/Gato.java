package herencias.Mamifero;

import herencias.Mamiferos;

public class Gato extends  Mamiferos {
	private String nombre;

	
	public Gato(String nombre,int peso, int altura) {
		super(false,peso,4,altura);
		this.nombre=nombre;
		
		
	}
	
	public void emitirRuido() {
		System.out.println("Miau");
	}
	
	public void respirar() {
		System.out.println("Si");
	}
	
	public void desplazarse(int metros) {
		System.out.println("Como un cristo");
	}
	
}
