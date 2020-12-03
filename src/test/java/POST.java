import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class POST {
	
	@BeforeClass
	public void setup() {
		RestAssured.baseURI="https://reqres.in/";
		RestAssured.basePath="api/users";
	}
	
	@Test
	public void Post() {
		String payload="{\"name\":\"somy\",\"job\":\"kha\"}";
		given()
		.contentType(ContentType.JSON)
		.when()
		.body(payload)
		.post()
		.then()
		.statusCode(201).log().all();
	}

}
