package com.bridgelabz.programs;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

public class JSONInventryManagment {
	public static void main(String[] args) {
		JSONParser parser = new JSONParser();
		try {
			Object object = parser.parse(new FileReader("D://JSONInventry"));
			JSONObject jsonObject = (JSONObject) object;
			System.out.println(jsonObject);
			JSONArray array = (JSONArray)jsonObject.get("listOfItem");
			//JSONArray itemList = (JSONArray) jsonObject.get("listOfItem");
		//	System.out.println(itemList);
			System.out.println(array);
			//Iterator iterator = itemList.iterator();
			Iterator iterator = array.iterator();
			long amount, totalamount = 0;
			while (iterator.hasNext()) {
				JSONObject jsonobj1 = (JSONObject) iterator.next();
				long w1 = (long) jsonobj1.get("weight");
				long p1 = (long) jsonobj1.get("price");

				amount = w1 * p1;
				System.out.println("amount of " + jsonobj1.get("name") + " = " + amount);
				totalamount = amount + totalamount;

			}
			System.out.println("total amount = " + totalamount);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}