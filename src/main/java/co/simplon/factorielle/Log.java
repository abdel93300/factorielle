package co.simplon.factorielle;

import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Log {

	 private static Logger log = LoggerFactory.getLogger(Log.class);
	 
	public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, IllegalArgumentException
	   {
		System.out.println("\n\nBegin\n");
	      log.info("hello info");
	      log.warn("warning  1 !!!");
	      
	      
		Factorielle f=new Factorielle();
		log.info("Calcul du factoriel de 0");
		long resultat=f.calculer(0);
		log.info("Calcul du factoriel de 1");
		resultat=f.calculer(1);
		log.info("Calcul du factoriel de 2");
		resultat=f.calculer(2);
		log.info("Calcul du factoriel de -1");
		resultat=f.calculer(2);
		
	   
	      log.warn("Warning 2 !!!");
	      log.info("goodbye info");
	      System.out.println("\nEnd");
	   }

}
