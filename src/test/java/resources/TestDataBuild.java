package resources;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import pojo.AddPlace;
import pojo.LocationValues;

public class TestDataBuild {
	
	public AddPlace addPlace(String Address, String Language , String Name, String Website, String place_id) {
		AddPlace p=new AddPlace();
		//p.setAccuracy(Accuracy);
		p.setAddress(Address);
		p.setLanguage(Language);
		p.setName(Name);
		p.setWebsite(Website);
		LocationValues l=new LocationValues();
		l.setLat(-38.383494);
		l.setLng(33.427362);
		p.setLocation(l);
		p.setPlace_id(place_id);

		
		
		List<String> myList=new ArrayList<String>();
		myList.add("shoe park");
		myList.add("shop");
		
		p.setTypes(myList);
		return p;
		
	}
	public String deletePlacePayload(String place_id) {
		return "{\r\n"
				+ "    \"place_id\":\""+place_id+"\"\r\n"
				+ "}";
	
		//public static void main(String[] args) throws StreamReadException, DatabindException, IOException {
			// TODO Auto-generated method stub
	//ObjectMapper objectMapper=new ObjectMapper();
	//Map<String, Object> placeid =objectMapper.readValue(new File("C:\\Users\\priya\\OneDrive\\Documents\\placeid.json"),
			//new TypeReference<Map<String,Object>>() {});
	//System.out.println(placeid.get("place_id"));

		
	}}


