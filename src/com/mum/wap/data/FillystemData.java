package com.mum.wap.data;

import java.util.ArrayList;
import java.util.List;

import model.Phone;

public class FillystemData {

	public static List<Phone> phones;

	public static void fillPhoneData() {

		phones = new ArrayList<>();

		Phone phone1 = new Phone("Samsung Galaxy S9 Active", "GSM / CDMA / HSPA / EVDO / LTE", "Samsung",
				"Not announced yet", "Rumored", "5.8 inches, 85.4 cm2",
				"1440 x 2960 pixels, 18.5:9 ratio (~568 ppi density)");

		Phone phone2 = new Phone("Samsung Galaxy Note9", "GSM / HSPA / LTE", "Samsung", "Not announced yet", "Rumored",
				"6.4 inches, 104.0 cm2", "1440 x 2960 pixels, 18.5:9 ratio (~514 ppi density)");

		Phone phone3 = new Phone("Apple iPhone X", "GSM / HSPA / LTE", "Apple", "2017, September",
				"Available. Released 2017, October", "5.8 inches, 84.4 cm2 (~82.9% screen-to-body ratio)",
				"1125 x 2436 pixels, 19.5:9 ratio (~458 ppi density)");
		
		phones.add(phone1);
		phones.add(phone2);
		phones.add(phone3);

	}
}
