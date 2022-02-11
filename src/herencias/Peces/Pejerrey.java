package herencias.Peces;

public class Pejerrey extends Peces {

	public Pejerrey(int peso, int altura) {
		super(true, 1, 0, 1);
	}
	
	public void emitirRuido() {
		System.out.println("agluglu");
	}
	
	public void respirar() {
		System.out.println("Debajo del mar");
	}
	
	public void desplazarse(int metros) {
		System.out.println("Se mueve " + metros + " metros");
	}
	
}
