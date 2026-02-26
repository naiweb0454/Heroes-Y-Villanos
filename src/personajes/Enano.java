package personajes;

public class Enano extends Personaje {

	public Enano(String nombre, double puntosVida, int movimiento, int edad, int nivel, int experiencia) {
		super(nombre, puntosVida, movimiento, edad, nivel, experiencia);
	}
	
	public String asusta(Personaje p) {
		p.setMovimiento(p.getMovimiento()-10);
		p.setPuntosVida(p.getPuntosVida()-10);
		return this.nombre + " ha asustado a " + p.nombre;
	}



}
