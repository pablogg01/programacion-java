package herencias.Peces;

public class Tiburon extends Peces{

	public Tiburon(int peso, int altura) {
		super(false, peso, 0, altura);
		
	}
	
	public void emitirRuido() {
		System.out.println("agluglu");
	}
	
	public void respirar() {
		System.out.println("No puede parar de moverse");
	}
	
	public void desplazarse(int metros) {
		System.out.println("Se mueve " + metros + " metros");
	}

	
	
}
