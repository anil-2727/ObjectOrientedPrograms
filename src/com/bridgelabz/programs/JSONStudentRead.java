package com.bridgelabz.programs;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JSONStudentRead {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {

		// JSON parser object to parse read file
		JSONParser jsonParser = new JSONParser();

		try (FileReader reader = new FileReader("D://java practice//Student.json")) {
			// Read JSON file
			Object obj = jsonParser.parse(reader);

			JSONArray studentArray = (JSONArray) obj;
			System.out.println(studentArray);

			// Iterate over employee array
			// studentList.forEach( student -> parseStduentArray( (JSONObject)
			// student ) );

			for (int i = 0; i < studentArray.size(); i++) {
				JSONObject jsonObject = (JSONObject) studentArray.get(i);

				System.out.println("=====================::" + jsonObject.get("student1"));

				JSONObject jsonObject1 = (JSONObject) jsonObject.get("student1");
				String name = (String) jsonObject1.get("name");

				System.out.println("=====================::" + name);

			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

	private static void parseStduentArray(JSONObject student) {

		// Get Student object within list
		JSONObject studentObject = (JSONObject) student.get("student1");

		// Get Studnet first name
		String firstName = (String) studentObject.get("name");

		System.out.println("=======================" + firstName);
	}

}
