package com.mum.wap.service;

import java.util.List;

import com.mum.wap.dao.PhoneDao;

import model.Phone;

public class PhoneService {

	PhoneDao phoneDao = new PhoneDao();
	public List<Phone> getPhonesSearchResult(String searchKeyWord) {
		
		return null;
	}
	
	public List<Phone> getAllPhoneForBrand(String brand) throws Exception {
		
		return phoneDao.getAllPhoneForBrand(brand);
	}
}
