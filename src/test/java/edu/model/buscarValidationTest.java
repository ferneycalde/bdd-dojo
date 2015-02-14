package edu.model;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;

public class buscarValidationTest {
	
	@Test
	public void alBuscarBarrioCentroDeberiaMostrarLasIglesiasDelCentro(){
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
	
	@Test
	public void alBuscarBarrioDiamanteDeberiaMostrarLasIglesiasDelDiamante(){
		//arrange
		buscarValidator buscarValidator = new buscarValidator();
		ArrayList<String> listaIglesias = new ArrayList<String>();
		listaIglesias.add("Divino Niño");
		listaIglesias.add("Corazon de Jesus");
		
		//act
		boolean result = buscarValidator.valide("Diamante", listaIglesias);
		
		//assert
		Assert.assertEquals(true, result);
	}
	
	@Test
	public void alBuscarBarrioCentroNoDeberiaMostrarmeLasIglesiasDelDiamante(){
		//arrange
		buscarValidator buscarValidator = new buscarValidator();
		ArrayList<String> listaIglesias = new ArrayList<String>();
		listaIglesias.add("Divino Niño");
		listaIglesias.add("Corazon de Jesus");
		
		//act
		boolean result = buscarValidator.valide("Centro", listaIglesias);
		
		//assert
		Assert.assertEquals(false, result);
	}
	
}
