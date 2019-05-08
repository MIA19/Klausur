package de.lette.beans;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import de.lette.models.Raum;

@SessionScoped
@ManagedBean(name = "listBean")
public class ListBean {

	private List<Raum> raumliste;
	private Raum neuerRaum;
	
	/**
	 * inits the fields 
	 */
	public ListBean() {
		raumliste = new ArrayList<>();
		neuerRaum = new Raum();
	}
	
	/**
	 * @return the raumliste
	 */
	public List<Raum> getRaumliste() {
		return raumliste;
	}
	
	/**
	 * @param raumliste the raumliste to set
	 */
	public void setRaumliste(List<Raum> raumliste) {
		this.raumliste = raumliste;
	}
	
	/**
	 * @return the neuerRaum
	 */
	public Raum getNeuerRaum() {
		return neuerRaum;
	}
	
	/**
	 * @param neuerRaum the neuerRaum to set
	 */
	public void setNeuerRaum(Raum neuerRaum) {
		this.neuerRaum = neuerRaum;
	}
	
	public void submit()
	{
		this.raumliste.add(neuerRaum);
		this.neuerRaum = new Raum();
	}
	
}
