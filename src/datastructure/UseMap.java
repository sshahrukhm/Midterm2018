package datastructure;

import javax.swing.text.html.HTMLDocument;
import java.util.*;


public class UseMap {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Map that includes storing and retrieving elements.
		 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 */
		List<String>BangladeshCity = new ArrayList<String>();
		BangladeshCity.add("Dhaka");
		BangladeshCity.add("Chittagong");
		BangladeshCity.add("Comilla");

		List<String>UnitedStatesCity = new ArrayList<String>();
		UnitedStatesCity.add("New York");
		UnitedStatesCity.add("Florida");
		UnitedStatesCity.add("California");


		List<String>AustraliaCity = new ArrayList<String>();
		AustraliaCity.add("Sydney");
		AustraliaCity.add("Melbourne");
		AustraliaCity.add("Perth");

		Map<String,List<String>> listofCities=new HashMap<String,List<String>>();
		listofCities.put("Cities of Bangladesh",BangladeshCity);
		listofCities.put("States of USA",UnitedStatesCity);
		listofCities.put("Cities of Australia",AustraliaCity);

		Iterator it=listofCities.entrySet().iterator();

		while(it.hasNext()){
			System.out.println(it.next());
		}

		for(Map.Entry<String,List<String>> cityInfo:listofCities.entrySet()){
			System.out.println("Cities of different countries :"+cityInfo.getKey()+"--->"+cityInfo.getValue());
		}
		/*
		 * Demonstrate how to use Map that includes storing and retrieving elements.
		 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 */

	}
}

