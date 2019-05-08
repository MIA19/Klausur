package de.lette.validator;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

import de.lette.models.Raum;

@FacesValidator("RaumValidator")
public class RaumValidator implements Validator<Raum>{

	@Override
	public void validate(FacesContext context, UIComponent component, Raum raum) throws ValidatorException {
		if(raum.getGebäude() == Character.MIN_VALUE && raum.getNummer() == 0)
			throw new ValidatorException(new FacesMessage("Input leer"));
		else if(raum.getGebäude() != 'A' && raum.getGebäude() != 'N')
			throw new ValidatorException(new FacesMessage("Raum falsch (A oder N)"));
		else if (raum.getNummer() == -1)
			throw new ValidatorException(new FacesMessage("Raumnummer ist keine Nummer"));
		else if (raum.getNummer() < 100)
			throw new ValidatorException(new FacesMessage("Raumnummer ist zu kurz (3 stellig)"));
		else if (raum.getNummer() > 999)
			throw new ValidatorException(new FacesMessage("Raumnummer ist zu lang (3 stellig)"));
	}

}
