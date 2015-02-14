package edu.model;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;

public class buscarValidationTest {
	@Test
	public void deberiaMostrar(){
		//arrange
		buscarValidator buscarValidator = new buscarValidator();
		ArrayList<String> listaIglesias = new ArrayList<String>();
		listaIglesias.add("Sagrado Corazon");
		listaIglesias.add("Sagrada Familia");
		listaIglesias.add("Dolores");
		
		//act
		boolean result = buscarValidator.valide("Centro", listaIglesias);
		
		//assert
		Assert.assertEquals(true, result);
	}
	
}
