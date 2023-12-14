package pojo;

import java.io.File;
import java.io.IOException;
import java.util.Map;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class UpdateJsonwithoutPojo {

	public static void main(String[] args) throws StreamReadException, DatabindException, IOException {
		// TODO Auto-generated method stub
ObjectMapper objectMapper=new ObjectMapper();
Map<String, Object> placeid =objectMapper.readValue(new File("C:\\Users\\priya\\OneDrive\\Documents\\placeid.json"),
		new TypeReference<Map<String,Object>>() {});
System.out.println(placeid.get("place_id"));

	}

}
