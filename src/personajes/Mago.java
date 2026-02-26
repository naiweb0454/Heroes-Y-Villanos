package personajes;
import java.util.Random;

public class Mago extends Personaje{


	private int inteligencia;
	private int creatividad;
	public Mago(String nombre, double puntosVida, int movimiento, int edad, int nivel, int experiencia) {
		super(nombre, puntosVida, movimiento, edad, nivel, experiencia);
		this.inteligencia = 100;
		this.creatividad = 100;


	}


	//polimorfismo del metodo atacar
	@Override
	public String atacar(Personaje p) {
		hechizo(p);
		return this.nombre + " ha atacado a " + p.nombre;
	}


	//establecemos el metodo
	public void hechizo (Personaje p) {

		//o.setMovimiento(o.getMovimento()-10);
		//this.experiencia +=2;
		p.setMovimiento(p.getMovimiento()-10);
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


	public void rayoMagico(Personaje p) {
		Random rand = new Random();
		boolean exito = rand.nextBoolean(); // true o false aleatorio

		if (exito) {
			int daño = 20; //generamos un valor para daño
			p.setPuntosVida(p.getPuntosVida() - daño); //cogemos los puntos de vida y le restamos el daño (20)
			this.experiencia += 5;// esto suma experiencia de 5
			System.out.println(this.nombre + " lanza un rayo mágico y quita " + daño + " de vida a " + p.getNombre());
		} else {
			System.out.println(this.nombre + " intentó lanzar el rayo mágico, pero falló!");
		}
	}


	//return movimiento;
}
