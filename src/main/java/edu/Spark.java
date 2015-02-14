package edu;

import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;

import java.util.HashMap;
import java.util.Map;

import static spark.Spark.get;
import static spark.Spark.post;

public class Spark {

    public static void main(String[] args) {
    	
    	get("/", (request, response) -> {
            Map<String, Object> model = new HashMap<>();
            model.put("portal", "PORTAL DE IGLESIAS");
            model.put("welcome", "BIENVENIDOS");
            return new ModelAndView(model, "index.wm");
        }, new VelocityTemplateEngine());

      post("/buscar", (request, response) -> {
        	
        	String Iglesia = request.queryParams("iglesia");
        	
 //       	buscarValidator buscarValidator = new buscarValidator();  	
        	
            Map<String, Object> model = new HashMap<>();

            model.put("buscador", "BUSCAR IGLESIA POR BARRIO");

            return new ModelAndView(model, "buscar.wm");
        }, new VelocityTemplateEngine());
        
    }


}
