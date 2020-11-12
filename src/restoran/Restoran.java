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

		Obrok obrok = Obrok.builder().cena(35).build();
		
		System.out.println(obrok.toString());
		
	}

}
