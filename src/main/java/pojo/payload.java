package pojo;

import io.cucumber.cienvironment.internal.com.eclipsesource.json.JsonObject;

public class payload {
	
	

	private static final JsonObject inputJson = null;
	public static String AddUser() {
		// TODO Auto-generated method stub
		return "{\r\n"
				+ "    \"name\": \"HHH\",\r\n"
				+ "    \"job\": \"Stephen\",\r\n"
				+ "    \"age\":\"35\",\r\n"
				+ "    \"sex\":\"male\",\r\n"
				+ "    \"place\":\"city\"\r\n"
				+ "}";
	}
	
	public static String UserDetails() {
		
		return"{\r\n"
				+ "    \"UserDetails\":{\r\n"
				+ "    \"name\": \"HHH\",\r\n"
				+ "    \"job\": \"Stephen\",\r\n"
				+ "    \"age\":\"35\",\r\n"
				+ "    \"sex\":\"male\",\r\n"
				+ "    \"place\":\"Australia\",\r\n"
				+ "    \"address\":\"3/6 gat colony, NSW-6545\"\r\n"
				+ "},\r\n"
				+ "\r\n"
				+ "  \"AcademicDetails\" :{\r\n"
				+ "      \"course\":\"Master of information Systems\"\r\n"
				+ "  },\r\n"
				+ "  \"ProjectDetails\":{\r\n"
				+ "      \"name of project\": \"SMI-Safety\"\r\n"
				+ "  }\r\n"
				+ "   }\r\n"
				+ "\r\n"
				+ "";
	}
		public static String AddBook(String isbn, String aisle ) {
			String payload="{\r\n"
					+ "\r\n"
					+ "\"name\":\"Technical book\",\r\n"
					+ "\"isbn\":\""+isbn+"\",\r\n"
					+ "\"aisle\":\""+aisle+"\",\r\n"
					+ "\"author\":\"Greesham\"\r\n"
					+ "}";
			return payload;
		
			
					
		}
		public static String RequestLogin() {
			return "{\r\n"
					+ "    \"userEmail\": \"priyatham.bommareddy@gmail.com\",\r\n"
					+ "    \"userPassword\": \"Premam@550\"\r\n"
					+ "}";
		}
		
		public static String addPlacePayload(String name) {
			return "{\r\n"
					+ "  \"location\": {\r\n"
					+ "    \"lat\": -38.383494,\r\n"
					+ "    \"lng\": 33.427362\r\n"
					+ "  },\r\n"
					+ "  \"accuracy\": 50,\r\n"
					+ "  \"name\": \"Frontline house\",\r\n"
					+ "  \"phone_number\": \"(+91) 983 893 3937\",\r\n"
					+ "  \"address\": \"29, side layout, cohen 09\",\r\n"
					+ "  \"types\": [\r\n"
					+ "    \"shoe park\",\r\n"
					+ "    \"shop\"\r\n"
					+ "  ],\r\n"
					+ "  \"website\": \"http://google.com\",\r\n"
					+ "  \"language\": \"French-IN\"\r\n"
					+ "}\r\n"
					+ " \r\n"
					+ "}";
		}
		
		public static String deletePlacePayload(String place_id) {
		return "{\r\n"
				+ "    \"place_id\":\""+place_id+"\"\r\n"
				+ "}\r\n"
				+ "}";
		}
		
}
				
	


