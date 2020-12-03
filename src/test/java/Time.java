import static io.restassured.RestAssured.given;

import java.util.concurrent.TimeUnit;

import org.json.JSONException;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Time {

	@BeforeClass
	public void setup() {
		RestAssured.baseURI="https://reqres.in/";
		RestAssured.basePath="api/users?page=2";
	}
	
	@Test
	public void test() throws JSONException {
		long response=given().when().get().timeIn(TimeUnit.SECONDS);
		System.out.println(response);
		// System.out.println(response.body());
	       
	}

}
