/**
 * Copyright (c) 2020 by fluxmeister. All rights reserved. 
 * vektorwebsolutions.com/determinator
 * 
 */
package restoran;

import java.util.ArrayList;
import java.util.Date;

/**
 * @author fluxmeister
 *
 */
public class Porudzbina {

	protected int brojStola;
	protected int orderID;
	protected ArrayList poruceno;
	private Date date;
	/**
	 * @return the brojStola
	 */
	public int getBrojStola() {
		return brojStola;
	}
	/**
	 * @param brojStola the brojStola to set
	 */
	public void setBrojStola(int brojStola) {
		this.brojStola = brojStola;
	}
	/**
	 * @return the orderID
	 */
	public int getOrderID() {
		return orderID;
	}
	/**
	 * @param orderID the orderID to set
	 */
	public void setOrderID(int orderID) {
		this.orderID = orderID;
	}
	/**
	 * @return the poruceno
	 */
	public ArrayList getPoruceno() {
		return poruceno;
	}
	/**
	 * @param poruceno the poruceno to set
	 */
	public void setPoruceno(ArrayList poruceno) {
		this.poruceno = poruceno;
	}
	/**
	 * @return the date
	 */
	public Date getDate() {
		return date;
	}
	/**
	 * @param date the date to set
	 */
	public void setDate(Date date) {
		this.date = date;
	}
	
	

}
