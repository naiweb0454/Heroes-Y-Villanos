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

	public void esquivar() {
		this.movimiento += 15;
		this.experiencia += 1;
		System.out.println(this.nombre + " se vuelve más ágil!");
	}

	//	public int getMovimiento() {
	//


	public void rayoMagico(Personajes o) {
		Random rand = new Random();
		boolean exito = rand.nextBoolean(); // true o false aleatorio

		if (exito) {
			int daño = 20; //generamos un valor para daño
			o.setPuntosVida(o.getPuntosVida() - daño); //cogemos los puntos de vida y le restamos el daño (20)
			this.experiencia += 5;// esto suma experiencia de 5
			System.out.println(this.nombre + " lanza un rayo mágico y quita " + daño + " de vida a " + o.getNombre());
		} else {
			System.out.println(this.nombre + " intentó lanzar el rayo mágico, pero falló!");
		}
	}


	//return movimiento;
}



