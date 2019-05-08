package de.lette.models;

public class Raum {
	
	private char gebäude;
	private short nummer;
	
	public Raum() {
	}
	
	/**
	 * @return the gebäude
	 */
	public char getGebäude() {
		return gebäude;
	}
	/**
	 * @param gebäude the gebäude to set
	 */
	public void setGebäude(char gebäude) {
		this.gebäude = gebäude;
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
		return "" + this.gebäude + this.nummer;
	}
	
}
