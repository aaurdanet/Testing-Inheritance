public class Animal extends Object {
	private int weight;
	private double height;
	
	public Animal(int weight,  double height) {
		setWeight(weight);
		setHeight(height);
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	public String toString() {
		String result;
		result = " I'm an animal and my weight and height are: " + weight +", "+ height;
		return result;
		
	}
}
