package atelier02;
/**
 * 
 * @author didier
 *
 */
public class B {
	/**
	 * retourne la valeur n/2 si un entier n passé en paramètre est divisible
	 * par 13
	 * @param n entier 
	 * @return n/2 si divisible par 13 sinon n+2
	 */
	public static int divise(int n) {
		if (A.treize(n) == true)
				return n/2;
		else
				return n + 2;
	}
}
