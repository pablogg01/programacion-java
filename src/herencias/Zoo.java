package herencias;

import herencias.Vertebrado;
import herencias.Mamifero.Reptiles.Anguila;
import herencias.Mamifero.Reptiles.Tortuga;

public class Zoo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vertebrado a= new Anguila(10, 10);
		
		a.emitirRuido();
		
		Vertebrado t = new Tortuga(2, 2);

		t.emitirRuido();
	}
	
}
