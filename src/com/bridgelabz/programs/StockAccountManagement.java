package com.bridgelabz.programs;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class StockAccountManagement {

	public static void main(String[] args) throws ParseException {
		
		JSONParser parser = new JSONParser();
		try {
			FileReader reader = new FileReader("D://JSONStock.json");
			Object obj = parser.parse(reader);
			JSONObject jsonObject = (JSONObject) obj;
			System.out.println(jsonObject);
			JSONArray array = (JSONArray) jsonObject.get("listOfShare");
			int i;
			for (i = 0; i < array.size(); i++)
				;
			{

				JSONObject listOfItem = (JSONObject) array.get(i);
				String name = (String) listOfItem.get("name");
				int numberOfShare = (int) listOfItem.get("numberOfShare");
				double price = (double) listOfItem.get("price");

				double amount = ((numberOfShare) * (price));

				System.out.println("listofItems" + i + "is....");
				System.out.println("name:" + name);
				System.out.println(" numberOfShare:" + numberOfShare);
				System.out.println("price:" + price);
				System.out.println("amount:" + amount);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
