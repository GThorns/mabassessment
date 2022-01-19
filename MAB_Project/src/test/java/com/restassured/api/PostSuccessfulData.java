package com.restassured.api;

import static io.restassured.RestAssured.given;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class PostSuccessfulData {
	@Test
	public void test2() {

		JSONObject request = new JSONObject();
		request.put("email", "eve.holt@reqres.in");
		request.put("password", "cityslicka");

		System.out.println(request.toJSONString());

		Response response = given().
		body(request.toJSONString()).
		when().
		post("https://reqres.in/api/login");
		//then().statusCode(200);
		
		System.out.println(response.asString());
		

	}}