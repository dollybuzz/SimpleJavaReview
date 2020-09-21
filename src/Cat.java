
public class Cat extends Animal {

	public Cat() {}
	
	public String makeSound() {
		return "Meow";
	}

	public static void main(String[] args) {
		Animal fluffy = new Cat();
		
		Animal[] theAnimals = new Animal[10];
		
		theAnimals[0] = fluffy;
		
		System.out.println("Fluffy says " + theAnimals[0].makeSound());
		
		speakAnimal(fluffy); //from Animal class

	}

}
