/**
 * Copyright (c) 2020 by fluxmeister. All rights reserved. 
 * vektorwebsolutions.com/determinator
 * 
 */
package restoran;

import lombok.Builder;
import lombok.ToString;

/**
 * @author fluxmeister
 *
 */
@Builder
@ToString
public  class Obrok {
	
	protected  String naziv;
	protected  double cena;
	/**
	 * @return the naziv
	 */
	public String getNaziv() {
		return naziv;
	}
	/**
	 * @param naziv the naziv to set
	 */
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	/**
	 * @return the cena
	 */
	public double getCena() {
		return cena;
	}
	/**
	 * @param cena the cena to set
	 */
	public void setCena(double cena) {
		this.cena = cena;
	}
	
	public abstract class ObrokBuilder{

		@Override
		public int hashCode() {
			// TODO Auto-generated method stub
			return super.hashCode();
		}

		@Override
		public boolean equals(Object obj) {
			// TODO Auto-generated method stub
			return super.equals(obj);
		}

		@Override
		protected Object clone() throws CloneNotSupportedException {
			// TODO Auto-generated method stub
			return super.clone();
		}

		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return super.toString();
		}

		@Override
		protected void finalize() throws Throwable {
			// TODO Auto-generated method stub
			super.finalize();
		}
		
		
		
	}
	
}
