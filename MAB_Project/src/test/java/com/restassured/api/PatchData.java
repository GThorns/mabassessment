package com.restassured.api;

import static io.restassured.RestAssured.given;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class PatchData{

	@Test
	public void test2() {

		JSONObject request = new JSONObject();
		request.put("name", "morpheus");
		request.put("job", "zion resident");

		System.out.println(request);
		System.out.println(request.toString());
		

		given().
		body(request.toJSONString()).
		when().
		patch("https://reqres.in/api/users/2").
		then().statusCode(200);
		
		

	}

}
