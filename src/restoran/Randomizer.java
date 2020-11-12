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
public class Randomizer {
	
	public static int generate(int min, int max) {
		return min + (int)(Math.random() * ((max-min) + 1));
	}

}
