import java.util.Scanner;

public class Cat extends Animal {
	private int lives;
	private String name;

	public Cat(int weight, double height, String name, int lives) {
		super(weight, height);

		setName(name);
		setLives(lives);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLives() {
		return lives;
	}

	public void setLives(int lives) {
		Scanner input = new Scanner(System.in);
		boolean invalid = true;

		do {
			if (lives > 9) {
				System.out.println("Cats can only have up to 9 lives; please try again");
				lives = input.nextInt();
				invalid = true;
			} else
				invalid = false;
		} while (invalid);
		this.lives = lives;
	}

	public String toString() {
		String result;
		result = "Cat: name is " + name + " and I have " + lives + " lives \n" + super.toString();
		return result;
	}
}