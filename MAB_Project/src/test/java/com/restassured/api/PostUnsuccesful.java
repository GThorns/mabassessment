package com.restassured.api;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class PostUnsuccesful {
	@Test
	public void test2() {

		JSONObject request = new JSONObject();
		request.put("email", "peter@klaven\"");

		System.out.println(request);
		System.out.println(request.toString());

		given().
		body(request.toJSONString()).
		when().
		post("https://reqres.in/api/login").
		then().statusCode(400);
		
		

	}}