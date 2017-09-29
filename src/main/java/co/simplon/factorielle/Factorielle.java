package co.simplon.factorielle;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * Factorielle
 */
public class Factorielle 
{
	static final Logger logger = LoggerFactory.getLogger(Factorielle.class);

	public Factorielle() {
		super();
	}

	public long calculer(long n) {
		logger.info("Passage dans la méthode calculer !");
		logger.debug("Passage dans la méthode calculer !");
		logger.warn("Passage dans la méthode calculer !");
		if (n > 1) {
			return n * calculer(n-1);
		} else if (n < 0) {
			throw new IllegalArgumentException();
		}
				
		return 1;
	}

}
