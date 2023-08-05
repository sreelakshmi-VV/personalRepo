package Basics;

import org.json.JSONObject;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Test1 {

	public static void main(String[] args) 
	{
		int x=10;
		int y=20;
		int z=30;
		x=x*y*z;
		y=x/(y*z);
		System.out.println(y);
		z=x/(y*z);
		System.out.println(z);
		x=x/(y*z);
		System.out.println(x+" "+y);
		

	}

}
