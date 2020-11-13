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
public class Restoran {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		/* Using builder to get the object in a single line of code and
		 * without any incosistent state of arguments management issues
		 */
		
		Obrok obrok1 = new Obrok.ObrokBuilder("Pljeskavica", 300).build();
		
		System.out.println(obrok1);
		
		
		Obrok obrok2 = new Obrok.ObrokBuilder("Gurmanska pljeska", 500).build();
		
		System.out.println(obrok2);
	}

}
