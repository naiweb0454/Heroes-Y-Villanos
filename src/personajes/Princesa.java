package personajes;

public class Princesa extends Personaje{

	//en el main hay que poner un método para saber el nombre del ganador
	
		public Princesa(String nombre, double puntosVida, int movimiento, int edad, int nivel, int experiencia) {
			super(nombre, puntosVida, movimiento, edad, nivel, experiencia);
		}
		
//		public void saludar(Personaje ganador) {
//			System.out.println("hola " + ganador.getNombre() + " soy la princesa " + this.nombre);
//		}
		
		public String saludar(Personaje p) {
			return "Hola " + p.getNombre() + " soy la princesa " + this.nombre;
		}
		
		public String darMedalla(Personaje p) {
			
//			System.out.println(this.nombre + " le entrega una medalla a " + ganador.getNombre());
			
			double energiaActual = p.getPuntosVida();
	        p.setPuntosVida(energiaActual + 20);
	        
	        return this.nombre + " le entrega una medalla a " + p.getNombre() + "\n" + 
	        "La energía de " + p.getNombre() + " ha aumentado a " + p.getPuntosVida();
		}
}
