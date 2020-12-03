package assert1;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class SingleAssert {
	@BeforeClass
	public void setup() {
		RestAssured.baseURI="https://reqres.in/";
		RestAssured.basePath="api/users?page=2";
	}
	
	@Test
	public void test() {
		given().when().get().then().body("per_page", equalTo(6)).log().all().statusCode(200);
	}	
}
