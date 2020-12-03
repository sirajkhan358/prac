package paypal;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

public class BaseClass {

	static String accesstoken;
	public static final String client_id="AQul0dBOuwf8XJno4DDN5eBjq3h0JAil5SN_2FaY9t0_hdM3odNntRVBKLn9i1kP3YkX2sRotTMIDVCt";
	public static final String client_secret="EMGTNZCtSIM89bZ9OOjGLGggFFdtUf84wiA0pA12L7JyKUpQMEmIaiYnIm2aHL0bHMFpfFGlXFX00nQ2";
	
	
	@BeforeClass
	public void access() {
		accesstoken=given().param("grant_type", "client_credentials")
		.auth()
		.preemptive().basic(client_id, client_secret)
		.when()
		.post("https://api-m.sandbox.paypal.com/v1/oauth2/token").then().log().all().extract().path("access_token");
	
	}
	
}
