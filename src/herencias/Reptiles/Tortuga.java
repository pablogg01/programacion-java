package herencias.Reptiles;

public class Tortuga extends Reptiles {

	public Tortuga(int peso, int altura) {
		
		super(true, true, true, peso, 4, altura);
		
	}
	
	public void emitirRuido() {
		System.out.println("agluglu");
	}
	
	public void respirar() {
		System.out.println("Si");
	}
	
	public void desplazarse(int metros) {
		System.out.println("Camina lento y nada a su ritmo");
	}

	
}
