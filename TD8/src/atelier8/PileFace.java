package atelier8;
/**
 * classe de simulation pile ou face en utilisant la classe Aleat
 * @author didier
 *
 */
public class PileFace {
	public static void main (String args []) 
	{
		Aleat pileface = new Aleat(2);
		int pile = 0;
		int face = 0;
		int i;
		int tire;
		for (i = 0; i < 1000; i++) {tire = pileface.get();
		System.out.print(tire);
		if (tire==1) {pile++;} else {face++;}
		System.out.println();
		System.out.println(pile + "piles et " + face + "faces");
		}
	}
	
}
