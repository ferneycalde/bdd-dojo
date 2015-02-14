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

       /* post("/login", (request, response) -> {
        	
        	String usuario = request.queryParams("usuario");
        	String password = request.queryParams("password");
        	
        	loginValidator loginValidator = new loginValidator();  	
        	
            Map<String, Object> model = new HashMap<>();
            if(loginValidator.valide(usuario, password)){
            model.put("saludo", "Bienvenido a Ananzon, " + usuario);
            }
            return new ModelAndView(model, "login.wm");
        }, new VelocityTemplateEngine());
        */
    }


}
