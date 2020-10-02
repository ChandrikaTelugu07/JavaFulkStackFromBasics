package com.polymorphism;

import com.phone.Nokia;
import com.phone.Phone;
import com.phone.Sumsung;

public class Polymorphism {

	public static void main(String[] args) {
		/*
		Phone phn = new Phone("Nokia 3310");
		System.out.println(phn.getModel());
		phn.features();
		
		Sumsung sum = new Sumsung("Note8");
		System.out.println(sum.getModel());
		sum.features();
		
		//call the feature method of super class(Phone)
		Phone nokia = new Nokia("nokia 3310");
		System.out.println(nokia.getModel());
		nokia.features();
				
		//Can do it when we have is relationshop(sumsung is a phone)
		Phone note8 = new Sumsung("Note 8");
		System.out.println(note8.getModel());
		note8.features();*/
		
		
		//without static for phone method
		Phone nokia = new Polymorphism().phone(1);
		System.out.println(nokia.getModel());
		nokia.features();
		
		/*//with static
		Phone nokia = phone(1);
		*/
				
		//Can do it when we have is relationshop(sumsung is a phone)
		Phone note8 = new Polymorphism().phone(2);
		System.out.println(note8.getModel());
		note8.features();
		
	}
	
	public Phone phone(int dailyDriver) {
		switch(dailyDriver) {
			case 1 : return new Nokia("3310");
			case 2: return new Sumsung("Note 8");
		}
		return null;
	}

}
