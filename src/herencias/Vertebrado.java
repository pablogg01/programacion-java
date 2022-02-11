package herencias;

public abstract class Vertebrado {

	private int peso;
	private int numeroPatas;
	private int altura;
	
	public Vertebrado( int peso, int numeroPatas, int altura ) {
		this.altura=altura;
		this.numeroPatas=numeroPatas;
		this.peso=peso;
	}
	
	
	
	abstract public void desplazarse(int metros);
	
	abstract public void respirar();
	
	abstract public void emitirRuido();
	
	
	

}
