package source;

public class main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		Panier panier1 = new Panier(10);
		Orange o1 = new Orange(5,"France");
		Orange o2 = new Orange(6,"Espagne");
		panier1.ajouteOrange(o1);
		panier1.ajouteOrange(o2);
		String log = panier1.toString();
		System.out.println(log);
		
		Panier b = new Panier(10);
		b.ajouteOrange(new Orange(0.80, "France"));
		b.ajouteOrange(new Orange(0.80, "Espagne"));
		b.ajouteOrange(new Orange(0.90, "Floride"));
		b.boycotteOrigine("France");
		log = b.toString();
		System.out.println(log);

	}

}
