package main;

import io.restassured.RestAssured;
//http://www.thomas-bayer.com/sqlrest/
//http://www.thomas-bayer.com/sqlrest/CUSTOMER/
//http://www.thomas-bayer.com/sqlrest/CUSTOMER/3/
public class Teste {
	public void xpto() {

		System.out.println(RestAssured.given().when().get("http://www.thomas-bayer.com/sqlrest/").getBody().asString());
	}
}
