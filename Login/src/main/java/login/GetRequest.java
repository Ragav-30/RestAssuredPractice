package login;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GetRequest {

	public static void main(String[] args) {
 
 RestAssured.baseURI="https://www.ministryoftesting.com/";
 RequestSpecification requestspecification= RestAssured.given();
 Response response=requestspecification.request(Method.GET,"articles/websites-to-practice-testing");
 System.out.println(response.asPrettyString());
 System.out.println(response.getStatusLine());
	
	}
}
