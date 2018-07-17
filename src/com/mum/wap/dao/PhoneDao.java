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
	
	}
	
}
