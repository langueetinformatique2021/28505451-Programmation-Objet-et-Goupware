package devoir1;
/**
 * obtenir la médiane de p1, p2, p3, p4, p5 dans p6
 * @author didier
 */
public class condition4
{
	/**
	 * @param args Définition d'une méthode main   
	 */
	public static void main (String args [])
	{
		int p1 = 10;
		int p2 = 9;
		int p3 = -1;
		int p4 = 4;
		int p5 = 8;
		int p6 = 0;
		
		
		if (p2 < p1) {
			if (p3 < p1)
				if (p5 > p4)
						p6 = p5;
				else
						p6 = p3;
		}
		
		else {
			if (p5 < p1)
					p6 = p4;
			else
					p6 = p2;
		}
		System.out.println(p6); 
	}
}