package herencias.Reptiles;

public class Anguila extends Reptiles {

	public Anguila(int peso, int altura) {
		super(true, true, true, 6, 0, 2);
	}
	
	public void emitirRuido() {
		System.out.println("shhhhhhhhhhhhhhh");
	}
	
	public void respirar() {
		System.out.println("Si");
	}
	
	public void desplazarse(int metros) {
		System.out.println("Nada rapido");
	}

	
	
}
