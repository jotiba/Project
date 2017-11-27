package com.jas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class CallApi {
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		URL uri=new URL("http://localhost:8085/Demo/webapi/GetEmp");
		HttpURLConnection con=(HttpURLConnection) uri.openConnection();
		
		con.setRequestMethod("GET");
		con.setRequestProperty("Accept", "application/json");
		
		System.out.println("hello");
		
		if(con.getResponseCode()==200) {
			BufferedReader br = new BufferedReader(new InputStreamReader(
					(con.getInputStream())));

				String output;
				System.out.println("Output from Server .... \n");
				while ((output = br.readLine()) != null) {
					System.out.println(output);
					Person p= new Person();
					Class<?> classType = Class.forName("com.jas.Person");
					
					//System.out.println(classType.getDeclaredFields("Person"));
					/*Gson gson = new Gson();
					MyObject = gson.fromJson(decodedString , MyObjectClass.class);
					*/
					
					
				}

				con.disconnect();
		}else {
			throw new RuntimeException("Failed : HTTP error code : "
					+ con.getResponseCode());
		}
		
		
		
	}
	

}
