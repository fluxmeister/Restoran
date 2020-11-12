/**
 * Copyright (c) 2020 by fluxmeister. All rights reserved. 
 * vektorwebsolutions.com/determinator
 * 
 */
package restoran;

import java.util.ArrayList;

/**
 * @author fluxmeister
 *
 */
public class Sto {
	
	public int brojStola;
	private boolean placenPrethodniRacun;
	private ArrayList<Porudzbina> porudzbine;
	
	
	
	public boolean makeOrder() throws Exception {
		if (placenPrethodniRacun) {
			System.out.println("Možete naručiti.");
			return true;
		} else {
			throw new Exception("Nije moguće izdati novu porudžbinu jer prethodna nije plaćena.");
		}
		
	}


	/**
	 * @return the porudzbine
	 */
	public ArrayList<Porudzbina> getPorudzbine() {
		return porudzbine;
	}


	/**
	 * @param porudzbine the porudzbine to set
	 */
	public void setPorudzbine(ArrayList<Porudzbina> porudzbine) {
		this.porudzbine = porudzbine;
	}
	
}
