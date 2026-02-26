package personajes;

public class Guerrero extends Personaje{

	private double puntosAtaque;
	private int destreza;
	
	public Guerrero(String nombre, double puntosVida, int movimiento, int edad, int nivel, int experiencia,
			double puntosAtaque, int destreza) {
		super(nombre, puntosVida, movimiento, edad, nivel, experiencia);
		this.puntosAtaque = puntosAtaque;
		this.destreza = destreza;
	}

	@Override
	public String atacar(Personaje p) {
		p.setPuntosVida(p.getPuntosVida()-10);
		this.puntosVida +=10;
		return this.nombre + " ha atacado a " + p.nombre;
	}

	@Override
	public String toString() {
//		return "Guerrero [puntosAtaque=" + puntosAtaque + ", destreza=" + destreza + ", nombre=" + nombre
//				+ ", puntosVida=" + puntosVida + ", movimiento=" + movimiento + ", edad=" + edad + ", nivel=" + nivel
//				+ ", experiencia=" + experiencia + "]";
		return "Guerrero " + super.toString()	
		+ "\t Ataque: " + this.puntosAtaque + "\n"
		+ "\t Destreza: " + this.destreza + "\n";
	}
	
	
	
	
}
