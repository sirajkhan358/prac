import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.given;


public class QueryParam {
	@BeforeClass
	public void setup() {
		RestAssured.baseURI="https://reqres.in/";
		RestAssured.basePath="api/users";
	}
	@Test
	public void test() {
		given().
		queryParam("page", "2").
		when().get().then().statusCode(200).log().all();
	}
}
