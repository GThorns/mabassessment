package com.restassured.api;

import static io.restassured.RestAssured.given;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class PutData {

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
		put("https://reqres.in/api/users/2").
		then().statusCode(200);

	}

}