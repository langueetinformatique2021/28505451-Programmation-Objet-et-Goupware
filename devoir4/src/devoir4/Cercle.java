package devoir4;
/**
 * 
 * classe cercle qui implémente la classe comparable
 */
public class Cercle extends FigureMetrique implements Comparable<Cercle>{
	public Cercle(String couleur) {
		super(couleur);
	}
	/**
	 * @param x : coordonnée x
	 * @param y : coordonnée y
	 * @param r : rayon 
	 */
	private double x;
	private double y;
	private double r;
	
	public double getRayon()
	{
		return r;}
	
	public int CompareTo(Cercle C) {
		return (int) (this.getRayon()-C.getRayon());}
	
	
	public double circonference() {return 2*Math.PI*this.r;}
	public float perimetre() {return (float) circonference();}
	public float surface() {return (float) (Math.PI*this.r*this.r);}
	
	public double getY() {return y;}
	public double getR() {return r;}
	public double setX() {
		return x = x;}
	public double setY(double y) {
		return y = y;}
	public double setR(double r) {
		return r = r;}
	/**
	 * comparer
	 */
	public void comparer (Cercle C) {
		String chaine;
		if (this.CompareTo(C)>0) {
			chaine = "Ce cercle est plus grand";}
		if (this.CompareTo(C) == 0) { chaine = "Cercles de même rayon";}
		else {chaine = "Ce cercle est plus petit";}
		System.out.println(chaine);
	}
}
