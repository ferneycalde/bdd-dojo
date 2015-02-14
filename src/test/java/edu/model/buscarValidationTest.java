package edu.model;

import org.junit.Assert;
import org.junit.Test;

public class buscarValidationTest {
	
	@Test
	public void deberiaMostrarLaIglesiaDivinoNiñoCuantoIngresemosElBarrioCentro(){
		//arrange
		buscarValidator buscarValidator = new buscarValidator();
		
		//act
		boolean result = buscarValidator.valide("Divino Niño", "Centro");
		
		//assert
		Assert.assertEquals(true, result);
	}

}
