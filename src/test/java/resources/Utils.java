package resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Properties;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
public class Utils {
	RequestSpecification req;
	Response response;
	String place_id;
	JsonPath js;
	

	public RequestSpecification requestSpecification() throws IOException {
	PrintStream log=new PrintStream(new FileOutputStream("logging.txt"));
	RestAssured.baseURI="https://rahulshettyacademy.com";

	req=new RequestSpecBuilder().setBaseUri(getGlobalvalue("baseUrl")).
			addQueryParam("key", "qaclick123").
		addFilter(RequestLoggingFilter.logRequestTo(log)).
		addFilter(ResponseLoggingFilter.logResponseTo(log)).

			setContentType(ContentType.JSON).build();
			
			
	return req;
}
	public static String getGlobalvalue(String key) throws IOException {
		Properties p=new Properties();
		FileInputStream fis=new FileInputStream("C:\\Users\\priya\\Java\\ApiFramework\\src\\test\\java\\resources\\global.properties");
		p.load(fis);
		return p.getProperty(key);
	}
	public static String getJsonPath(Response response, String  key) {
		String res=response.asString();
		 JsonPath js=new JsonPath(res);
		 return js.get(key);
	}
}