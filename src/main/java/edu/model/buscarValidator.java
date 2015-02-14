package edu.model;

import java.util.ArrayList;
import java.util.HashMap;

public class buscarValidator {
	
	public static HashMap<String, ArrayList<String>> userData = new HashMap<String, ArrayList<String>>();
	{
		userData.put("Centro", new ArrayList());
		userData.get("Centro").add("Sagrado Corazon");
		userData.get("Centro").add("Sagrada Familia");
		userData.get("Centro").add("Dolores");
		userData.put("Diamante", new ArrayList());
		userData.get("Diamante").add("Divino Niño");
		userData.put("Cañaveral", new ArrayList());
		userData.get("Cañaveral").add("Santa Maria");
	}

	public ArrayList<String> getNombreIglesias(String barrio){
		ArrayList<String> nombresIglesias = new ArrayList<String>();		
		return nombresIglesias = userData.get(barrio);
		
	}
	
	public boolean valide(String barrio, ArrayList<String> nombreIglesias){		
		ArrayList<String> iglesiasInDataBase = userData.get(barrio);
		if(nombreIglesias.equals(iglesiasInDataBase)){
			return true;	
		}
		return false;
	}

}
