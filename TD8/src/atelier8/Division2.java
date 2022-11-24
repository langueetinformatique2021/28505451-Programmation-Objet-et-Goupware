package atelier8;
/*
 * capture de l'exception avec try-catch 
 */
public class Division2 {
	public static void main (String args []) {division();}
	public static void division() throws ArithmeticException
	{
		try /**surveille l'exception*/
		{
			int i = 1000;
			int j;
			do {i--; j = 1 / i;} while (true);
		} catch (ArithmeticException e) /** intercepte l'exception en question*/
		{
			System.out.println(e.getMessage()); /** afficher le message ArithmeticException*/
		}
	}
}
