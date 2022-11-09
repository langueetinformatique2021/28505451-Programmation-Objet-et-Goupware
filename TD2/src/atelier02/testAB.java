package atelier02;
/**
 * Développer un ensemble de classes:
 * une classe exécutable testAB et deux autres non exécutables A et B.
 * A contient la méthode treize retournant la valeur true si un entier n%13 = 0 sinon false
 * B contient la méthode divise retournant la valeur n/2 si n%13 sinon n+2
 * @author didier
 *
 */
public class testAB {
	/**
	 * 
	 * @param args le mot clé Public dans public class sert à définir les droits d'accès des autres classes
	 * @param args le mot clé Public dans public static permet l'éxécution du programme. Il est obligatoire. 
	 */
	public static void main (String args [])
	{
		System.out.println(A.treize(10));
		System.out.println(A.treize(27));
		System.out.println(B.divise(10));
		System.out.println(B.divise(27));
	}
}
