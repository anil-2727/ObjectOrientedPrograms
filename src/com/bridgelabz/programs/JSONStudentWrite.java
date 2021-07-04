package com.bridgelabz.programs;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JSONStudentWrite {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {

		// Student-1

		JSONObject studentDetails = new JSONObject();

		// JSONObject class creates a json object,
		// provides a put function to insert the details into json object
		studentDetails.put("name", "Mahi");
		studentDetails.put("department", "B.E");
		studentDetails.put("branch", "C.S.E");
		studentDetails.put("year", 3);

		/*
		 * {
		 * 
		 * "name" : "Ms Dhoni", "department":"B.E", "branch":"C.S.E", "year" :3
		 * 
		 * 
		 * }
		 */

		JSONObject studentObject1 = new JSONObject();
		studentObject1.put("student1", studentDetails);

		/*
		 * "student1" : {
		 * 
		 * "name" : "Ms Dhoni", "department":"B.E", "branch":"C.S.E", "year" :3
		 * 
		 * 
		 * }
		 */

		// Student-2
		JSONObject studentDetails2 = new JSONObject();

		studentDetails2.put("name", "akhil Sharma");
		studentDetails2.put("department", "B.E");
		studentDetails2.put("branch", "C.S.E");
		studentDetails2.put("year", 4);

		JSONObject studentObject2 = new JSONObject();
		studentObject2.put("student1", studentDetails2);

		// Add to StudentArray
		JSONArray StudentArray = new JSONArray();

		// This is a JSON Array StudentArray ,
		// It creates an array and then add the values in it

		StudentArray.add(studentObject1);
		StudentArray.add(studentObject2);

		/*
		 * [
		 * 
		 * "student1" : {
		 * 
		 * "name" : "Ms Dhoni", "department":"B.E", "branch":"C.S.E", "year" :3
		 * 
		 * 
		 * } ,
		 * 
		 * "student1" : {
		 * 
		 * "name" : "Ms Dhoni", "department":"B.E", "branch":"C.S.E", "year" :3
		 * 
		 * 
		 * } ]
		 * 
		 * 
		 */

		try (FileWriter file = new FileWriter("D://java practice//Student.json")) {
			// File Writer creates a file in write mode at the given location
			file.write(StudentArray.toJSONString());

			// write function is use to write in file,
			// here we write the Json object in the file
			file.flush();

		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("----------------Data added to Json File SuccessFully --------------------------");
		// to print our JSon object
	}

}
