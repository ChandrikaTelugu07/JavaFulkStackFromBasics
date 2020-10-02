package com.Laptop;

import com.OtherComponentsOfLaptop.GraphicsCard;
import com.OtherComponentsOfLaptop.Processor;

public class Laptop {
	private float screen;
	private Processor processor;
	private String ram;
	private String hardDrive;
	private GraphicsCard graphicsCard;
	private String opticalDrive;
	private String keyBoard;
	
	public Laptop() {
		this.screen = 15.6f;
		this.processor = new Processor();
		this.ram = "DDR4";
		this.hardDrive = "2 TB";
		this.graphicsCard = new GraphicsCard();
		this.opticalDrive = "Multi Layer";
		this.keyBoard = "Backlit";
	}

	public Laptop(float screen, Processor processor, String ram, String hardDrive, GraphicsCard graphicsCard,
			String opticalDrive, String keyBoard) {
		super();
		this.screen = screen;
		this.processor = processor;
		this.ram = ram;
		this.hardDrive = hardDrive;
		this.graphicsCard = graphicsCard;
		this.opticalDrive = opticalDrive;
		this.keyBoard = keyBoard;
	}

	@Override
	public String toString() {
		return "Laptop [screen=" + screen + ", processor=" + processor + ", ram=" + ram + ", hardDrive=" + hardDrive
				+ ", graphicsCard=" + graphicsCard + ", opticalDrive=" + opticalDrive + ", keyBoard=" + keyBoard + "]";
	}

	public Processor getProcessor() {
		return processor;
	}

	public float getScreen() {
		return screen;
	}

	public String getRam() {
		return ram;
	}

	public String getHardDrive() {
		return hardDrive;
	}

	public GraphicsCard getGraphicsCard() {
		return graphicsCard;
	}

	public String getOpticalDrive() {
		return opticalDrive;
	}

	public String getKeyBoard() {
		return keyBoard;
	}
	
	public String gamingMode() {
		processor.setFrequency(processor.getMaxFrequency());
		return "Success";
	}
	
}