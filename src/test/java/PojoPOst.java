import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class PojoPOst {
	@BeforeClass
	public void setup() {
		RestAssured.baseURI="https://reqres.in/";
		RestAssured.basePath="api/users";
	}
	@Test
	public void Post() {
		POJO p=new POJO();
		p.setName("sumaiya");
		p.setJob("tester");
		given()
		.contentType(ContentType.JSON)
		.body(p)
		.post()
		.then().statusCode(201).log().all();
	}

}
