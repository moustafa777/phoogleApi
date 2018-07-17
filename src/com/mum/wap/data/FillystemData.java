package com.mum.wap.data;

import java.util.ArrayList;
import java.util.List;

import model.Phone;

public class FillystemData {

	public static List<Phone> phones = new ArrayList<>();;
	public static List<Phone> cardItems = new ArrayList<>();

	public static void fillPhoneData() {

		phones = new ArrayList<>();

		Phone phone1 = new Phone("samsung galaxy S9 active", "GSM / CDMA / HSPA / EVDO / LTE", "samsung",
				"Not announced yet", "Rumored", "5.8 inches, 85.4 cm2",
				"1440 x 2960 pixels, 18.5:9 ratio (~568 ppi density)",500, "https://www.sprint.com/content/dam/sprint/commerce/devices/samsung/samsung_galaxy_s8_active/gray/devicenb_650x900.png/jcr:content/renditions/cq5dam.thumbnail.290.370.png");

		Phone phone2 = new Phone("Samsung Galaxy Note9", "GSM / HSPA / LTE", "samsung", "Not announced yet", "Rumored",
				"6.4 inches, 104.0 cm2", "1440 x 2960 pixels, 18.5:9 ratio (~514 ppi density)",600, "https://ss7.vzw.com/is/image/VerizonWireless/Great_Black_VZW?$png8alpha256$&hei=410");

		Phone phone3 = new Phone("Apple iPhone X", "GSM / HSPA / LTE", "apple", "2017, September",
				"Available. Released 2017, October", "5.8 inches, 84.4 cm2 (~82.9% screen-to-body ratio)",
				"1125 x 2436 pixels, 19.5:9 ratio (~458 ppi density)",700, "https://pisces.bbystatic.com/image2/BestBuy_US/images/products/6009/6009792_sd.jpg;maxHeight=640;maxWidth=550");
		
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
