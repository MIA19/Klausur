package de.lette.models;

public class Raum {
	
	private char geb�ude;
	private short nummer;
	
	public Raum() {
	}
	
	/**
	 * @return the geb�ude
	 */
	public char getGeb�ude() {
		return geb�ude;
	}
	/**
	 * @param geb�ude the geb�ude to set
	 */
	public void setGeb�ude(char geb�ude) {
		this.geb�ude = geb�ude;
	}
	/**
	 * @return the nummer
	 */
	public short getNummer() {
		return nummer;
	}
	/**
	 * @param nummer the nummer to set
	 */
	public void setNummer(short nummer) {
		this.nummer = nummer;
	}
	
	@Override
	public String toString() {
		return "" + this.geb�ude + this.nummer;
	}
	
}
