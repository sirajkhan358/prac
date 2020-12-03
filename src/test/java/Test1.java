import org.json.JSONException;
import org.json.JSONObject;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class Test1 {
	
	@BeforeClass
	public void setup() {
		RestAssured.baseURI="https://reqres.in/";
		RestAssured.basePath="api/users?page=2";
	}
	
	@Test
	public void test() throws JSONException {
		Response response=given().when().get().thenReturn();
		// System.out.println(response.body());
	        System.out.println("---------------------------");
	        System.out.println(response.getBody().asString());
	}

}
