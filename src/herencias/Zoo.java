package herencias;

import java.util.ArrayList;

import herencias.Vertebrado;
import herencias.Mamifero.Gato;
import herencias.Reptiles.Anguila;
import herencias.Reptiles.Tortuga;

public class Zoo {
	
	private Vertebrado[] arrayVertebrados;
	
	private ArrayList<Vertebrado> listaVertebrado;
	
	private String ejemplo;

	
	public Zoo(){
		
		ejemploListaVertebrados();
		
	}
	
	public void ejemploListaVertebrados() {
	
		ejemplo= new String();
		listaVertebrado= new ArrayList<Vertebrado>();
		
		Gato unGato= new Gato("Jose", 10, 10);
		
		listaVertebrado.add(unGato);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Zoo z= new Zoo();
		
	}
	
}
