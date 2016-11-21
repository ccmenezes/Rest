package main;

import io.restassured.RestAssured;
import org.hamcrest.Matchers;

// http://services.groupkt.com/country/get/all
// http://services.groupkt.com/country/get/iso2code/DZ
// http://www.groupkt.com/post/c9b0ccb9/country-and-other-related-rest-webservices.htm
// http://www.groupkt.com/post/5926d648/free-restful-web-service-to-get-location-by-ip-address.htm
// http://www.groupkt.com/post/f2129b88/free-restful-web-services-to-consume-and-test.htm

public class GetRequests {

	public GetRequests() {
		RestAssured.baseURI = "http://services.groupkt.com";
	}

	public void getAllCountry(int quantityOfCountry) {
		// RestAssured.given().when().get("/country/get/all").then().body("RestResponse.result",
		// Matchers.hasSize(quantityOfCountry));

		RestAssured.given().when().get("/country/get/all").getBody().as(CountryResult[].class);
		
		//.then().body("RestResponse.result.name",
			//	Matchers.arrayWithSize(quantityOfCountry));
	}

	public void hasCountry(String country) {
		RestAssured.given().when().get("/country/get/all").then().body("RestResponse.result.alpha3_code",
				Matchers.hasItem(country));
	}

}
