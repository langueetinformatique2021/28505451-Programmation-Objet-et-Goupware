package conditions;
public class minimum {
	public static void main (String args []) {
		int p1 = 10;
		int p2 = 9;
		int p3 = -1;
		int p4 = 4;
		int p5 = 8;
		
		if (p1 < p2) {
			if (p3 < p1)
					p4 = p3;
			else
					p4 = p1;
		}
		else {
			if (p1 > p3)
					p4 = p3;
			else
					p4 = p2;
		}
		System.out.println(p4);
	}
}