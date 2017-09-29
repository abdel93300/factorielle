package co.simplon.factorielle;

public class Log {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Factorielle f=new Factorielle();
		long resultat=f.calculer(0);
		System.out.println("Résultat de !0 est "+resultat);
		resultat=f.calculer(1);
		System.out.println("Résultat de !1 est "+resultat);
		resultat=f.calculer(2);
		System.out.println("Résultat de !2 est "+resultat);
	}

}
