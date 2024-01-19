Animal Hierarchy Java Program

This Java program demonstrates the use of inheritance and polymorphism to model an animal hierarchy. The program includes classes for generic animals (Animal), dogs (Dog), cats (Cat), and birds (Bird). Each class extends the Animal class, which provides a common base for all animals.
Classes
Animal

The Animal class represents a generic animal and includes attributes such as age, weight, and height. It provides a parameterized constructor and a toString method for displaying information about the animal.

java

public class Animal {
    // Attributes and methods...
}

Dog

The Dog class extends Animal and adds specific attributes like name, breed, and date of birth. It includes a parameterized constructor and overrides the toString method to display dog-specific information. The getDOB and setDOB methods handle the date of birth in a formatted manner.

java

public class Dog extends Animal {
    // Attributes, methods, and overridden toString...
}

Cat

The Cat class extends Animal and adds specific attributes like name and lives remaining. It includes a parameterized constructor and overrides the toString method to display cat-specific information.

java

public class Cat extends Animal {
    // Attributes, methods, and overridden toString...
}

Bird

The Bird class extends Animal and adds specific attributes like the number of wings and flying ability. It includes a parameterized constructor and overrides the toString method to display bird-specific information.

java

public class Bird extends Animal {
    // Attributes, methods, and overridden toString...
}

Testinheritance

The Testinheritance class contains the main method, creating instances of Animal, Dog, Cat, and Bird to showcase inheritance and polymorphism. It demonstrates how objects of derived classes can be used interchangeably with the base class.

java

public class Testinheritance {
    public static void main(String[] args) {
        // Creating instances of Animal, Dog, Cat, and Bird...
    }
}

How to Run

    Ensure you have a Java development environment set up.

    Compile the code using a Java compiler:

    bash

javac Testinheritance.java

Run the compiled program:

bash

    java Testinheritance

    View the output that demonstrates the characteristics of various animals in the hierarchy.

Feel free to modify the code or extend it to explore additional features or animal types. If you have any questions or need further assistance, please don't hesitate to ask!
# Testing-Inheritance
