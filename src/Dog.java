
public class Dog extends Animal {
private String name;
private String breed;
private String DOB;

public Dog(int weight, double height, String name, String breed, String DOB) {
	super(weight, height);

	setName(name);
	setBreed(breed);
	setDOB(DOB);
}


public String getBreed() {
	return breed;
}


public void setBreed(String breed) {
	this.breed = breed;
}


public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}

public String getDOB() {
    String result = "" + DOB.charAt(0) + DOB.charAt(1);
    result += "/" + DOB.charAt(2) + DOB.charAt(3);

    // Assuming the year is the substring starting from position 4
    String year = DOB.substring(4);
    result += "/" + year;

    return result;
}

public void setDOB(String dOB) {
    DOB = dOB;
}


public String toString() {
	String result; 
	result ="Dog: My name is " + name +" I am a " + breed +" and I was born on "+ getDOB() + "\n" + super.toString();
	
	
	
	return result;
	
}
}
