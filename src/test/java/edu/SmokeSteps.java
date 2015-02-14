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

	@When("^doy clic en el boton ingresar al portal$")
	public void doy_clic_en_el_boton_de() throws Throwable {
		$(By.id("ingresar")).click();
	}
	
	@Then("^ingresa al portal \"([^\"]*)\"$")
	public void veo_el_mensaje(String mensaje) throws Throwable {
		$(By.id("buscador")).shouldHave(text(mensaje));
	}

	@When("^ingrese el barrio \"([^\"]*)\"$")
	public void ingrese_el_barrio(String barrio) throws Throwable {
		$(By.id("barrio")).setValue(barrio);
	}
	
	@When("^doy clic en el boton buscar$")
	public void hago_clic_en() throws Throwable {
		$(By.id("buscar")).click();
	}

	@Then("^debo ver la lista de iglesias de ese barrio$")
	public void debo_ver_la_lista_de_iglesias_de_ese_barrio(String iglesia) throws Throwable {
		$(By.id("iglesia")).shouldHave(text(iglesia));
	}


}
