package main;

import io.restassured.RestAssured;
import org.hamcrest.Matchers;

//http://www.thomas-bayer.com/sqlrest/
//http://www.thomas-bayer.com/sqlrest/CUSTOMER/
//http://www.thomas-bayer.com/sqlrest/CUSTOMER/3/

public class GetRequests {

	public GetRequests() {
		RestAssured.baseURI = "http://services.groupkt.com";
	}

	public void getAllCountry() {
		System.out.println(RestAssured.given().when().get("/country/get/all").asString());
	}

	public void hasCountry(String country) {
		RestAssured.given().when().get("/country/get/all").then().body("RestResponse.result.alpha3_code", Matchers.hasItem(country));
	}

}
