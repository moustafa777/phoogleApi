package com.mum.wap.data;

import java.util.ArrayList;
import java.util.List;

import model.Phone;

public class FillystemData {

	public static List<Phone> phones = new ArrayList<>();;
	public static List<Phone> cardItems = new ArrayList<>();

	public static void fillPhoneData() {

		phones = new ArrayList<>();

		Phone phone1 = new Phone("Samsung Galaxy S9 Active", "GSM / CDMA / HSPA / EVDO / LTE", "Samsung",
				"Not announced yet", "Rumored", "5.8 inches, 85.4 cm2",
				"1440 x 2960 pixels, 18.5:9 ratio (~568 ppi density)",500);

		Phone phone2 = new Phone("Samsung Galaxy Note9", "GSM / HSPA / LTE", "Samsung", "Not announced yet", "Rumored",
				"6.4 inches, 104.0 cm2", "1440 x 2960 pixels, 18.5:9 ratio (~514 ppi density)",600);

		Phone phone3 = new Phone("Apple iPhone X", "GSM / HSPA / LTE", "Apple", "2017, September",
				"Available. Released 2017, October", "5.8 inches, 84.4 cm2 (~82.9% screen-to-body ratio)",
				"1125 x 2436 pixels, 19.5:9 ratio (~458 ppi density)",700);
		
		phones.add(phone1);
		phones.add(phone2);
		phones.add(phone3);

	}

	public static void addPhoneToCart(Phone phone) {
		
		cardItems.add(phone);
	}
	public static List<Phone> getPhones() {
		return phones;
	}

	public static void setPhones(List<Phone> phones) {
		FillystemData.phones = phones;
	}

	public static List<Phone> getCardItems() {
		return cardItems;
	}

	public static void setCardItems(List<Phone> cardItems) {
		FillystemData.cardItems = cardItems;
	}
	
	
}
