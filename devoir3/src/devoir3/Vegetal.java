package devoir3;
public abstract class Vegetal {
	private String espèce;
	private int nb_espèces = 0;
	
	public Vegetal (String type, int espèces) {
		espèce = type;
		nb_espèces = espèces;
	}
	
	public void présente() {
		System.out.println("Je suis un représentant de l'espèce " + espèce + " j'ai " + nb_espèces + " espèces");
		
	}
	/** genre de l'espèce */
	public abstract void genre();
}