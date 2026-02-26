package personajes;

public class Sanador extends Personaje{
	private int puntosMagia;
	private int puntosHabilidad;
	
	public Sanador(String nombre, double puntosVida, int movimiento, int edad, int nivel, int experiencia,
			int puntosMagia, int puntosHabilidad) {
		super(nombre, puntosVida, movimiento, edad, nivel, experiencia);
		this.puntosMagia = puntosMagia;
		this.puntosHabilidad = puntosHabilidad;
	}
	
	public String Curacion(Personaje p) {
		p.setPuntosVida(p.getPuntosVida() + ((p.getPuntosVida()/100)*30));
		this.puntosHabilidad -= 8;
		return this.nombre + " ha ❤️‍🩹curado❤️‍🩹 a " + p.getNombre();
	}
	
	public String Meditacion() {
		this.puntosHabilidad += 20;
		return this.nombre + " está meditando.";
	}
}
