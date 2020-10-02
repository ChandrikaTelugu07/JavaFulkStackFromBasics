package com.main;

import com.Laptop.Laptop;
import com.OtherComponentsOfLaptop.GraphicsCard;
import com.OtherComponentsOfLaptop.Processor;

public class Composition {

	public static void main(String[] args) {
		//Laptop lap = new Laptop();
		//System.out.println(lap.getProcessor());
		//get get particular property
		
		//System.out.println(lap.getProcessor().getFrequency());
		
		Processor processor = new Processor("intel", "7200u", 7, 4, 4, "6 MB", "2.5 GHz", "2.5 GHz", "3.1 GHz");
		GraphicsCard graphicsCard = new GraphicsCard("NVidia", 1050, "4 GB");
		
		Laptop gamingLaptop = new Laptop(17f, processor, "DDR4", "2 TB", graphicsCard, null, "backlit");
		System.out.println(gamingLaptop);
		
		gamingLaptop.gamingMode();
		System.out.println("Gaming Mode On");
		System.out.println("Current Frequency: " +gamingLaptop.getProcessor().getFrequency());
		
	}

}
