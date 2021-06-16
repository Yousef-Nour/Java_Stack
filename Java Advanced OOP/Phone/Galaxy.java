public class Galaxy extends Phone implements Ringable{
	//Constructor
	public Galaxy(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
		super(versionNumber, batteryPercentage, carrier, ringTone);
	}
	
	
	
	@Override
	public String ring() {
		return "Start "+this.getRingTone()+" Tone";
	}
	@Override
	public String unlock() {
		return "Unlock "+this.getClass().toString()+this.toString();
	}
    @Override
	public void displayInfo() {
		System.out.println(this.getVersionNumber());
		System.out.println(this.getBatteryPercentage());
		System.out.println(this.getCarrier());
		System.out.println(this.getRingTone());
	}
}