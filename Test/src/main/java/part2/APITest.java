package part2;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;

import org.junit.Assert;


public class APITest {

	String url = "https://jsonplaceholder.typicode.com/";

	public void getResponseBody() {

		// 1 GET
		
					given()
	                .contentType(ContentType.JSON)
	                .param("postId", "1")
	                .when()
	                .get(url + "comments")
	                .then()
	                .log().body().statusCode(200);

		
		
		// 2 POST

		String requestBody1 = "{\n" + "  \"userId\": \"1\",\n" + "  \"id\": \"501\",\n" + "  \"title\": \"test\" \n"
				+ "  \"body\": \"test\" \n}";

		Response response1 = given().header("Content-type", "application/json").and().body(requestBody1).when()
				.post(url + "posts").then().extract().response();

		 Assert.assertEquals(201, response1.statusCode());
		 
		 
		 

		// 3 PUT
		 
		String requestBody2 = "{\n" + "  \"userId\": \"1\",\n" + "  \"id\": \"1\",\n" + "  \"title\": \"test\" \n"
				+ "  \"body\": \"test\" \n}";

		Response response2 = given().header("Content-type", "application/json").and().body(requestBody1).when()
				.post(url + "posts/1").then().extract().response();

		 Assert.assertEquals(200, response1.statusCode());

	}

	public static void main(String... args)

	{

		new APITest().getResponseBody();

	}
}
