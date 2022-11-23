package devoir3;

public class Plantae extends Vegetal {
	protected boolean cultiver = false;
	public Plantae (String type) {
		super(type, 35);
	}
	
	public void présente() {
		super.présente();
		String etat = (cultiver) ? " cultivable" : "cultivable";
		System.out.println("Je suis un végétal et je suis" + etat);
	}
	public void genre() {
		System.out.println("Je suis du genre Populus");
	}
}
