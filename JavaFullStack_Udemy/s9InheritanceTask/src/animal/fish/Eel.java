package animal.fish;

public class Eel extends Fish{
	
	private String releaseElectricCharge;

	public Eel() {
		super();
		this.releaseElectricCharge = "Releases ElectricCharge";
	}

	public String showInfo() {
		return "Eel [releaseElectricCharge=" + releaseElectricCharge + ", liveInWater=" + liveInWater + ", hasGills="
				+ hasGills + ", height=" + height + ", weight=" + weight + ", animalType=" + animalType + ", bloodType="
				+ bloodType + "]";
	}

	
}
