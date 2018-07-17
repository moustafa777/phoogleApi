package com.mum.wap.dao;

import java.util.List;

import com.mum.wap.data.FillystemData;

import model.Phone;

public class CartDao {

	public void addToCart(String deviceName) throws Exception {

		
		List<Phone>phones = FillystemData.getPhones();
		for(Phone phone : phones) {
			
			System.out.println(deviceName.toString());
			if(phone.getDeviceName().equals(deviceName)) {
				FillystemData.addPhoneToCart(phone);
				break;
			}
				
				
		}
	}
}
