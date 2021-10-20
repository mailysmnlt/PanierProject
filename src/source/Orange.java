package source;

public class Orange {	
	
	double prix;
	String origin;
	
	public Orange(double prix, String origin) throws Exception {
		
		if (prix <= 0) {
			throw new Exception("Prix negatif");
		}
		
		this.prix = prix;
		this.origin = origin;
		
	}	
	
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}
	public String getOrigin() {
		return origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	
	
	public String toString() {
		String log;
		log = "\nPrix : " + prix;
		log = log.concat("\nOrigine : " + origin);
		return log;
	}
	
	public boolean equals(Orange orange) {
		return ( (Math.abs(prix - orange.prix) <= 0.000001)  && (origin.equals(orange.origin)) );	
		
	}

}
