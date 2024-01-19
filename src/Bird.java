
public class Bird extends Animal{
	private String fly;
	private double wingSpan;

	public Bird(int weight, double height, double wingSpan, String fly) {
		super(weight, height);
		setFly(fly);
		setWingSpan(wingSpan);	
		
	}

	public String getFly() {
		return fly;
	}

	public void setFly(String fly) {
		this.fly = fly;
	}

	public double getWingSpan() {
		return wingSpan;
	}

	public void setWingSpan(double wingSpan) {
		this.wingSpan = wingSpan;
	}



public String toString() {
	String result;
	 result = "Bird: I "+ fly + " fly and my wingSpan is "+ wingSpan+" feet \n"+ super.toString();
	return result;
}




}
