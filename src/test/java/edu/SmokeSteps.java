package edu;

import com.codeborne.selenide.Selenide;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;


public class SmokeSteps {

	@Given("^que ingreso a la pagina web de las iglesias$")
	public void que_ingreso_a_la_pagina_web_de_las_iglesias() throws Throwable {
		Selenide.open("http://localhost:4567/");
	}

	@Then("^veo el mensaje \"([^\"]*)\"$")
	public void veo_el_mensaje(String message) throws Throwable {
		$(By.id("welcome")).shouldHave(text(message));
	}

}
