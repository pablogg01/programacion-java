package herencias.Anfibios;

public class Renacuajo extends Anfibios {

	public Renacuajo(int peso, int altura) {
		super(true, peso, 0, altura);
	}
	
	public void respirar() {
		System.out.println("Respira en el agua");
	}
	
	public void desplazarse(int metros) {
		System.out.println("Se mueve " + metros + " metros");
	}
	
	public void emitirRuido() {
		System.out.println("Ta chiquito");
	}
}
