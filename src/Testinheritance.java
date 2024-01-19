
public class Testinheritance {

	public static void main(String[] args) {
		
		Animal myPet= new Animal(12, 23);
		System.out.println(myPet);
	
		Dog orion= new Dog(34, 4, "Orion", "Boxer", "07102000" );
	orion.setWeight(56);
	System.out.println(orion);
	
		Cat kai= new Cat(10, 0.5, "kai", 7);
		System.out.println(kai);
		
		Bird eagle = new Bird(2, 0.2, 2, "cannot");
	System.out.println(eagle);
	}

}
