package co.simplon.factorielle;

/**
 * Factorielle
 */
public class Factorielle 
{
	public Factorielle() {
		super();
	}

	public long calculer(long n) {
		if (n > 1) {
			System.out.println("Valeur de n>1 : "+n); 
			return n * calculer(n-1);
		} else if (n < 0) {
			throw new IllegalArgumentException();
		}
		System.out.println("Valeur de n<=1 : "+n);  
		
		return 1;
	}

}
