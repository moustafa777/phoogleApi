package com.mum.wap.service;

import com.mum.wap.dao.CartDao;

public class CartService {

	private CartDao cartDao = new CartDao();
	public void addToCart(String deviceName) throws Exception {
		
		cartDao.addToCart( deviceName);
	}
}
