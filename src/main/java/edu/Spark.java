package edu;

import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;

import java.util.HashMap;
import java.util.Map;

import edu.model.buscarValidator;
import static spark.Spark.get;
import static spark.Spark.post;

public class Spark {

    public static void main(String[] args) {
    	
    	get("/listar", (request, response) -> {
        	//String iglesia = request.queryParams("iglesia");
        	Map<String, String> iglesia = new HashMap<String, String>();
        	iglesia.put("Sagrado Corazon", "Centro");
    		iglesia.put("Divino Niño", "Diamante");
    		iglesia.put("Santa Maria", "Cañaveral");
        	//String barrio = request.queryParams("barrio");
        	
 //       	buscarValidator buscarValidator = new buscarValidator();  	
        	
            Map<String, Object> model = new HashMap<>();

            model.put("buscador", "LISTADO DE IGLESIA POR BARRIO");
            model.put("nombreIglesia", iglesia);
           // model.put("barrio", barrio);
            return new ModelAndView(model, "listar.wm");
            
        }, new VelocityTemplateEngine());
    	
    	post("/buscar",(request, response) -> {

         	buscarValidator buscarValidator = new buscarValidator();  	
        	 Map<String, Object> model = new HashMap<>();
            model.put("buscador", "BUSCAR IGLESIA POR BARRIO");
//            model.put("barrio", "" + barrio);
            return new ModelAndView(model, "buscar.wm");
    	}, new VelocityTemplateEngine());
    	
    	get("/", (request, response) -> {
            Map<String, Object> model = new HashMap<>();
            model.put("portal", "PORTAL DE IGLESIAS");
            model.put("welcome", "BIENVENIDOS");
            return new ModelAndView(model, "index.wm");
        }, new VelocityTemplateEngine());

      
        
    } 
   


}
