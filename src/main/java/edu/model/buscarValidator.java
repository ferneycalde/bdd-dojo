package edu.model;

import java.util.HashMap;

public class buscarValidator {
	
	public static HashMap<String, String> userData = new HashMap<String, String>();
	{
		userData.put("Sagrado Corazon", "Centro");
		userData.put("Divino Niño", "Diamante");
		userData.put("Santa Maria", "Cañaveral");
	}

	
	public boolean valide(String iglesia, String barrio){
		String passwordInDataBase = userData.get(iglesia);
		if(barrio.equals(passwordInDataBase)){
			return true;	
		}
		return false;
	}

}
