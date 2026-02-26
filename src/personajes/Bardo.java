package personajes;

public class Bardo extends Personaje{
 
	private int puntosHechizo;
	private int carisma; 
	
	public Bardo(String nombre, double puntosVida, int movimiento, int edad, int nivel, int experiencia,
			int puntosHechizo, int carisma) {
		super(nombre, puntosVida, movimiento, edad, nivel, experiencia);
		this.carisma= carisma;
		this.puntosHechizo = puntosHechizo;
	} 
	
	public String dormir(Personaje p){
		p.setMovimiento(p.getMovimiento()-100);
		this.puntosHechizo -=1;
		return this.nombre + " ha dormido a " + p.nombre;
	}
		
	
	public String despertar(Personaje p) {
		p.setMovimiento(p.getMovimiento()+10);
		this.puntosHechizo -=2;	
		return this.nombre + " ha despertado a " + p.nombre;
	}

	public String melodíaCurativa (Personaje p) {
		p.setPuntosVida(getPuntosVida() +15);
		this.puntosVida +=15;
		this.puntosHechizo -=2;
		return this.nombre + " ha tocado una melodía armoniosa que ha curado a " + p.nombre;		
	}
	
	
	
	@Override
	public String toString() {
		return "Bardo" + super.toString() + "\t Carisma: " + this.carisma + "\n" +
		"\t Hechizo: " + this.puntosHechizo + "\n";
	}
	
	
	
	
	

		
		
		
}