package source;


import java.util.ArrayList; // import the ArrayList class


public class Panier {


	int nbMaxOrange;

	ArrayList<Orange> panierOranges; 
	
	public Panier(int nbMaxOrange) {
		this.nbMaxOrange = nbMaxOrange;
		this.panierOranges = new ArrayList<Orange>(nbMaxOrange);
	}

	
	public boolean estPlein() {
		return (panierOranges.size() == nbMaxOrange);
	}
	
	public boolean estVide() {
		return (panierOranges.size() == 0);
	}
	
	public String toString() {
		String log;
		log = "\nContenu du panier : ";
		for (int counter = 0; counter < panierOranges.size(); counter++) {
			log = log.concat("\n\nOrange " + counter + " : ");
			log = log.concat(panierOranges.get(counter).toString());  	
	     }
		
		return log;
	}
	
	public boolean equals(Panier panier) {
		boolean isEqual = true;
		
		if (panierOranges.size() != panier.panierOranges.size()) {
			isEqual = false;
		} else if (nbMaxOrange != panier.nbMaxOrange) {
			isEqual = false;
		} else {
		
			for (int counter = 0; counter < panierOranges.size(); counter++) {
				if (!(panierOranges.get(counter).equals(panier.panierOranges.get(counter)))) {
					isEqual = false;
					break;
				}
		     }
		}
		
		return isEqual;
	}
		
	public void ajouteOrange(Orange o) {
		panierOranges.add(o);
	}
	
	public void retire() {
		panierOranges.remove(panierOranges.size());
	}
	
	public double getPrix() {
		double prixTotal = 0;
		for (int counter = 0; counter < panierOranges.size(); counter++) {
			prixTotal += panierOranges.get(counter).getPrix();

		}
		return prixTotal;

	}
	
	public void boycotteOrigine(String origin) {
		for (int counter = 0; counter < panierOranges.size(); counter++) {
			if (panierOranges.get(counter).getOrigin().equals(origin)) {
				panierOranges.remove(counter);
			}
	     }
		
	}

}
