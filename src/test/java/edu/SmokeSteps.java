package edu;

import com.codeborne.selenide.Selenide;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;


public class SmokeSteps {

	@Given("^que ingreso a la pagina web de las iglesias$")
	public void que_ingreso_a_la_pagina_web_de_las_iglesias() throws Throwable {
		Selenide.open("http://localhost:4567/");
	}
	
	@Then("^veo el mensaje \"([^\"]*)\"$")
	public void veo_el_mensaje(String arg1) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    throw new PendingException();
	}

	@When("^doy clic en el boton de \"([^\"]*)\"$")
	public void doy_clic_en_el_boton_de(String clicIngresar) throws Throwable {
		$(By.id(clicIngresar)).click();
	}


	@Then("^ingresa al portal$")
	public void ingresa_al_portal() throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    throw new PendingException();
	}

	@Then("^se lista la información de la iglesia$")
	public void se_lista_la_información_de_la_iglesia() throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    throw new PendingException();
	}


}
