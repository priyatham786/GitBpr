package stepdefnitions;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;
import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.testng.annotations.BeforeTest;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
//import pojo.AddPlace;
import pojo.LocationValues;
import pojo.payload;
import resources.APIResources;
import resources.TestDataBuild;
import resources.Utils;

public class StepDefnition extends Utils {
	RequestSpecification res;
	Response response;
	RequestSpecification Res;
	String expectedName;
	TestDataBuild TDB=new TestDataBuild();
	
	@Given("Add place API with {string} {string} {string} {string} {string}")
	public void add_place_api_with(String Address, String Language , String Name, String Website, String place_id) throws IOException {
	//ResponseSpecification resspec =new ResponseSpecBuilder().expectStatusCode(200).expectContentType(ContentType.JSON).build();

		
	res=given().spec(requestSpecification()).body(TDB.addPlace(Address,Language,Name,Website,place_id));
	    // Write code here that turns the phrase above into concrete actions
	}

	@When("User calls {string} with {string} http request")
	public void user_calls_with_Post_http_request(String resource, String method) throws Throwable {

	APIResources resourceAPI=	APIResources.valueOf(resource);
	System.out.println(resourceAPI.getResource());
		ResponseSpecification resspec =new ResponseSpecBuilder().expectStatusCode(200).expectContentType(ContentType.JSON).build();
		
	response=res.when().post("/maps/api/place/add/json").then().spec(resspec).extract().response();
		//response=(Response) res.when().post("/maps/api/place/add/json").then().spec(resspec).body(payload.addPlacePayload(place_id), null);
//String responseString=response.asString();
//System.out.println(responseString);
	    // Write code here that turns the phrase above into concrete actions
	}

	//private void responseSpecification() {

		// TODO Auto-generated method stu
		//return null;
//	}

	@Then("^the API call is success with status code (\\d+)$")
	public void the_API_call_is_success_with_status_code(int arg1) throws Throwable {
		assertEquals(response.getStatusCode(),200);
	    // Write code here that turns the phrase above into concrete actions
	}

	//@Then("status in {string} {string} is ok")
	//public void status_in_is_ok(String keyvalue, String Expectedvalue)
	@Then("status in responsebody  is ok")
	public void status_in_responsebody_is_ok()
	{
		//assertEquals(getJsonPath(response,keyvalue),Expectedvalue);
	    // Write code here that turns the phrase above into concrete actions
	//}
		

}
	
	//@Then("verify place_id created maps to {string} using Getplaceapi")
	@Then("verify place_id created maps to {string} using {string}")
	//public void verify_place_id_created_maps_to_using_getplaceapi(String resource) throws Throwable {
		public void verify_place_id_created_maps_to_using(String expectedName, String resource) throws Throwable {
		//place_id=js.get("place_id");
		String place_id=(String) getJsonPath(response,"place_id");

		given().baseUri("https://rahulshettyacademy.com").queryParam("place_id", place_id).
				when().post("/maps/api/place/get/json").then().assertThat().statusCode(200);
		//user_calls_with_Post_http_request(resource,"GET");
		user_calls_with_Post_http_request(resource,"GET");
		String actualName=getJsonPath(response,"name");	
		//assertEquals(actualName,expectedName) ;
	}

	

	

}
