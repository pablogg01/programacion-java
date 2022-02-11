package herencias.Anfibios;

public class Rana extends Anfibios {

	public Rana(int peso, int altura) {
		
		super(false, peso, 4, altura);
		
	}
	
	public void emitirRuido() {
		System.out.println("croak");
	}
	
	public void desplazarse(int metros) {
		System.out.println("Salta como mucho");
	}
	
	public void respirar() {
		System.out.println("Respira en la tierra");
	}
	
}
