
public class Dog extends Animal {
	
	public Dog() {}
	
	public String makeSound() { //excluding this declaration would default to the Animal class declaration "Grrr"
		return "Woof";
	}

	
	public static void main(String[] args) {
		Animal fido = new Dog();
		
		//Animal[] theAnimals = new Animal[5];
		
		//theAnimals[0] = fido;
		
		System.out.println("Fido says " + fido.makeSound());
		
		
		speakAnimal(fido); //from Animal class

	}
}

