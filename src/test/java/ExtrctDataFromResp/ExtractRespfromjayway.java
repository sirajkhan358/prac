package ExtrctDataFromResp;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.jayway.jsonpath.JsonPath;

import static io.restassured.RestAssured.given;

import java.util.Map;

import io.restassured.RestAssured;

public class ExtractRespfromjayway {
	static String resp;
	
	@BeforeClass
	public void setup() {
		RestAssured.baseURI="http://localhost";
		RestAssured.port=3030;
		resp=given().when().get("/products").asString();
	}
	
	@Test
	public void rootEleme() {
		
		Map<String, ?> map=JsonPath.read(resp, "$");
		System.out.println(map.toString());
	}
	
	@Test
	public void total() {
		
		int total=JsonPath.read(resp, "$.total");
		System.out.println(total);
	}
	
	@Test
	public void totalExtract() {
		
		int total=given().when().get().then()
				.extract().path("total");
		System.out.println(total);
	}
}
