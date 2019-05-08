package de.lette.converter;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import de.lette.models.Raum;

@FacesConverter("RaumConverter")
public class RaumConverter implements Converter<Raum>{

	@Override
	public Raum getAsObject(FacesContext context, UIComponent component, String string) {
		if(string.isBlank())
			return new Raum();
		
		char gebäude = string.charAt(0);
		
		short nummer;
		try {
			nummer = Short.parseShort(string.substring(1));
		} catch (NumberFormatException e) {
			nummer = -1;
		}
		
		Raum raum = new Raum();
		raum.setGebäude(gebäude);
		raum.setNummer(nummer);
		return raum;
	}

	@Override
	public String getAsString(FacesContext context, UIComponent component, Raum raum) {
		if(raum.getGebäude() == Character.MIN_VALUE && raum.getNummer() == 0)
			return "";
		else
			return raum.toString();
	}
	
}
