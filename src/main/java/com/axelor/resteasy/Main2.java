package com.axelor.resteasy;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Main2 {
	public static void main(String args[]) throws org.json.simple.parser.ParseException {
		 JSONParser parser = new JSONParser();

	        try {         
	            URL oracle = new URL("http://localhost:8081/my-erp/rest/login/getalluser"); // URL to Parse
	            URLConnection yc = oracle.openConnection();
	            BufferedReader in = new BufferedReader(new InputStreamReader(yc.getInputStream()));
	            
	            String inputLine;
	            while ((inputLine = in.readLine()) != null) {               
	                JSONArray a = (JSONArray) parser.parse(inputLine);
	                
	                // Loop through each item
	                for (Object o : a) {
	                    JSONObject tutorials = (JSONObject) o;

	                    Long id = (Long) tutorials.get("uid");
	                    System.out.println("Post ID : " + id);

	                    String email = (String) tutorials.get("email");
	                    System.out.println("Post email : " + email);

	                    System.out.println("\n");
	                }
	            }
	            in.close();
	        } catch (FileNotFoundException e) {
	            e.printStackTrace();
	        } catch (IOException e) {
	            e.printStackTrace();
	        } catch (ParseException e) {
	            e.printStackTrace();
	        }   

    }
	
}
