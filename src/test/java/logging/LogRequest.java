package logging;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;

import io.restassured.RestAssured;

public class LogRequest {

	@BeforeClass
	public void setup() {
		RestAssured.baseURI="https://reqres.in/";
		RestAssured.basePath="api/unknown";
	}
	@Test
	public void test01() {
		System.out.println("----------------------------headers---------------------------------");
	given()
	.log().headers().when().get()
	.then().statusCode(200);
	
	}
	@Test
	public void test02() {  
		System.out.println("-------------param request is prit-----------------------------------");
		given()
		.param("name", "sumaiya")
		.log().params().when().get().then().statusCode(200);
		
	}
}
