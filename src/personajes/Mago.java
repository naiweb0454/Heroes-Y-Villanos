package personajes;
import java.util.Random;

public class Mago extends Personajes{


	private int inteligencia;
	private int creatividad;
	public Mago(String nombre, double puntosVida, int movimiento, int edad, int nivel, int experiencia) {
		super(nombre, puntosVida, movimiento, edad, nivel, experiencia, puntosVida);
		this.inteligencia = 100;
		this.creatividad = 100;


	}


	//polimorfismo del metodo atacar
	@Override
	public void atacar(Personajes o) {
		hechizo(o);
	}


	//establecemos el metodo
	public void hechizo (Personajes o) {

		//o.setMovimiento(o.getMovimento()-10);
		//this.experiencia +=2;
		o.setMovimiento(o.getMovimiento()-10);
		this.experiencia += 2;
		//}
	}




	


	//return movimiento;
}



