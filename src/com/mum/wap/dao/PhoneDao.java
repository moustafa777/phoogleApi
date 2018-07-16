package com.mum.wap.dao;


import java.util.ArrayList;
import java.util.List;

import com.mum.wap.data.FillystemData;

import model.Phone;

public class PhoneDao {

	public List<Phone> getAllPhoneForBrand(String brand) throws Exception {
			 
		List<Phone> phones = new ArrayList<>();
		for(Phone phone : FillystemData.phones) {
			
			if(brand.contains(phone.getBrand())) {
				
				phones.add(phone);
			}
			
		}
		 return phones;
		
/*		URL url = new URL("https://fonoapi.freshpixl.com/v1/getlatest");
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		conn.setDoOutput(true);
		conn.setRequestMethod("POST");
		conn.setRequestProperty("brand", brand);
		conn.setRequestProperty("token", "64abed472ad1fb124ef8795557952077f51c538873c2a440");
		conn.setRequestProperty("Content-Type", "application/json");

		//String input = "{\"brand\":samsung}";

		//OutputStream os = conn.getOutputStream();
		//getClass().os.write(input.getBytes());
		//os.flush();

		if (conn.getResponseCode() != HttpURLConnection.HTTP_CREATED) {
			throw new RuntimeException("Failed : HTTP error code : "
				+ conn.getResponseCode());
		}

		BufferedReader br = new BufferedReader(new InputStreamReader(
				(conn.getInputStream())));

		String output;
		System.out.println("Output from Server .... \n");
		while ((output = br.readLine()) != null) {
			System.out.println(output);
		}

		conn.disconnect();*/
	}
	
}
