/**
 * Copyright (c) 2020 by fluxmeister. All rights reserved. 
 * vektorwebsolutions.com/determinator
 * 
 */
package restoran;


/**
 * @author fluxmeister
 *
 */
public  class Obrok {
	
	/* Obrok class has only getter methods and no public constructor.
	 * The only way to get an Obrok object is through the ObrokBuilder class.
	 */
	
	private  String naziv;
	private  double cena;
	
	private Obrok(ObrokBuilder builder) {
		this.naziv = builder.naziv;
		this.cena = builder.cena;
	}
	
	public String getNaziv() {
		return naziv;
	}
	
	public double getCena() {
		return cena;
	}
	
	//Builder (inner static) Class
	//should have a public constructor with all the required attributes as parameters.
	public static class ObrokBuilder{

		// required attributes
		private  String naziv;
		private  double cena;
		
		// there is no optional attributes in this example
		/*Builder class should have methods 
		 * to set the optional parameters and 
		 * it should return the same Builder object after setting the optional attributes.
		 */
		
		public ObrokBuilder (String naziv, double cena) {
			this.naziv = naziv;
			this.cena = cena;
		}
		
		/* The final step is to provide a build() method in the builder class 
		 * that will return the Object needed by client program. 
		 * For this we need to have a private constructor in the Class with Builder class as argument.
		 */
		public Obrok build() {
			return new Obrok(this);
		}
		
	}
	
	/* Notice that Obrok class has only getter methods and no public constructor.
	 * So the only way to get an Obrok object is through the ObrokBuilder class.
	 */
	
}
