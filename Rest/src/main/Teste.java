package main;

import io.restassured.RestAssured;

public class Teste {
	public void xpto() {

		System.out.println(RestAssured.given().when().get("http://www.thomas-bayer.com/sqlrest/").getBody().asString());
	}
}
