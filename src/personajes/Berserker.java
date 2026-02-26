package personajes;

public class Berserker extends Personaje{

	public Berserker(String nombre, double puntosVida, int movimiento, int edad, int nivel, int experiencia) {
		super(nombre, puntosVida, movimiento, edad, nivel, experiencia);
	}
	
	@Override
	public String atacar (Personaje p) {
		if(this.puntosVida <= (35)) {
			p.setPuntosVida(p.getPuntosVida()-30);
			this.puntosVida -= 5;
		}
		else {
			p.setPuntosVida(p.getPuntosVida()-5);
		}
		
		return this.nombre + " ha atacado a " + p.nombre;
	}
	
	
	@Override
	public String toString() {
		return "Berserker " + super.toString();
	}
	
}